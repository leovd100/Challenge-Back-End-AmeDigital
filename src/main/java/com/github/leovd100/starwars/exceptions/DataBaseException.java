package com.github.leovd100.starwars.exceptions;

public class DataBaseException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;
	
	public DataBaseException(String msg) {
		super(msg);
	}
	
}
