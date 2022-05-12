package calculator;

public class Operations {
	private int result;
	
	public void sum(int value1, int value2) {
		this.result = value1 + value2;
	}
	
	public void subtraction(int value1, int value2) {
		this.result = value1 - value2;
	}
	
	public void multiplication(int value1, int value2) {
		this.result = value1 * value2;
	}
	
	public void division(int value1, int value2) {
		this.result = value1 / value2;
	}
	
	public int result() {
		return this.result;
	}
}
