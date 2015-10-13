package fr.iutvalence.info.m3105.stackmachine;

public class Instruction 
{

	private final int OpCode;
	
	private final int[] param;

	public Instruction(int codeCPU, int[] parameter) 
	{
		this.OpCode = codeCPU;
		this.param = parameter;
	}

	public int getOpCode() 
	{
		return OpCode;
	}

	public int[] getParams() {
		return param;
	}

	




	
	
	
		

}
