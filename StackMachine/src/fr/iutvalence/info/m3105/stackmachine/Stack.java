package fr.iutvalence.info.m3105.stackmachine;

public class Stack implements StackInterface {
	
	private final int size;
	private final int wordSize;
	private final int[] memoryCell ;
	
	/* (non-Javadoc)
	 * @see fr.iutvalence.info.m3105.stackmachine.StackInterface#clear()
	 */
	@Override
	public void clear()
	{
		
	}
	/* (non-Javadoc)
	 * @see fr.iutvalence.info.m3105.stackmachine.StackInterface#pop()
	 */
	@Override
	public void pop()
	{
		
	}
	/* (non-Javadoc)
	 * @see fr.iutvalence.info.m3105.stackmachine.StackInterface#push()
	 */
	@Override
	public void push()
	{
		
	}

	public Stack(int size, int wordSize, int[] memoryCell) 
	{
		this.size = size;
		this.wordSize = wordSize;
		this.memoryCell = memoryCell;
	}
	public int getSize() 
	{
		return this.size;
	}
	
}
