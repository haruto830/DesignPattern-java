package TemplateMethod;

public class StringDisplay extends AbstractDisplay{
	private String string;
	private int length;

	public StringDisplay(String string) {
		this.string = string;
		this.length = string.getBytes().length;
	}

	public void open() {
		printLine();
	}

	public void print() {
		System.out.println("|" + string + "|");
	}

	public void close() {
		printLine();
	}

	private void printLine() {
		System.out.print("+");

		for(int i = 0; i < length; i++) {
			System.out.print("-");
		}

		System.out.println("+");
	}

}
