package fr.iutvalence.info.m3105.stackmachine;

import java.io.IOException;

public interface IoInterface {

	public abstract void displayRuntimeError(String string);

	public abstract void displayProgramTermination();

	public abstract int read() throws IOException;

	public abstract void write(int op);

}