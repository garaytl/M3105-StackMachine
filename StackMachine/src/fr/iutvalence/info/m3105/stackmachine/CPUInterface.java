package fr.iutvalence.info.m3105.stackmachine;

public interface CPUInterface {

	public abstract void run();

	public abstract void wireToProgramMemory(MemoryInterface programMemory);

	public abstract void wireToExpStack(StackInterface expStack);

	public abstract void wireToCallStack(StackInterface callStack);

	public abstract void wireToIoSubsystem(IoInterface ioSystem);

	public abstract void clearStacks();

	public abstract void setPC(int address);

}