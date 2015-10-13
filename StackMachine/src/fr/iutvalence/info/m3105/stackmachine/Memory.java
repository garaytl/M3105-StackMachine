package fr.iutvalence.info.m3105.stackmachine;

public class Memory implements MemoryInterface 
{
	private final int startAddress;
	
	private final int  endAddress;

	public Memory(int startAddress, int endAddress) 
	{
		this.startAddress = startAddress;
		this.endAddress = endAddress;
	}

	public int getStartAddress() {
		return startAddress;
	}

	public int getEndAddress() {
		return endAddress;
	}

	/* (non-Javadoc)
	 * @see fr.iutvalence.info.m3105.stackmachine.MemoryInterface#write(int, int)
	 */
	@Override
	public void write(int currentAddress, int opCode) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}
