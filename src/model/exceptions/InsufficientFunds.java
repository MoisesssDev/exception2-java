package model.exceptions;

public class InsufficientFunds extends Exception{
	private static final long serialVersionUID = 1L;

	public InsufficientFunds(String msg) {
		super(msg);
	}
}
