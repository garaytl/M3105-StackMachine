package fr.iutvalence.info.m3105.stackmachine;

public class Machine
{
	private CPUInterface cpu;
	private Memory programMemory;
	private StackInterface expStack;
	private StackInterface callStack;
	private IoInterface ioSystem;

	public Machine(CPUInterface cpu, MemoryInterface programMemory, StackInterface expStack, StackInterface callStack, IoInterface ioSystem)
	{
		super();
		this.cpu = cpu;
		this.cpu.wireToProgramMemory(programMemory);
		this.cpu.wireToExpStack(expStack);
		this.cpu.wireToCallStack(callStack);
		this.cpu.wireToIoSubsystem(ioSystem);
	}

	public void loadProgram(Program program) 
	{
		int currentAddress = this.programMemory.getStartAddress();

		for (int instructionNumber = 0; instructionNumber < program.getInstructionCount(); instructionNumber++)
		{
			Instruction instruction = program.getInstructionAt(instructionNumber);
			this.programMemory.write(currentAddress, instruction.getOpCode());
			currentAddress++;
			int[] instructionParams = instruction.getParams();
			if (instructionParams != null)
			{
				for (int instructionParam : instructionParams)
				{
					this.programMemory.write(currentAddress, instructionParam);
					currentAddress++;
				}
			}
		}
	}

	public void executeProgram(int address)
	{
		cpu.clearStacks();
		cpu.setPC(address);
		cpu.run();
		System.out.println("(end of program execution)");
	}

}
