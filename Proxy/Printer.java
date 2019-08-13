package Proxy;

public class Printer implements Printable {
	private String name;

	public Printer() {
		heavyJob("Printerインスタンスを生成中");
	}
	public Printer(String name) {
		this.name = name;
		heavyJob("Printerインスタンス(" + name + ")を生成中");
	}
	public String getPrinterName() {
		return name;
	}
	public void setPrinterName(String name) {
		this.name = name;
	}
	public void print(String string) {
		System.out.println("=== " + name + " ===");
		System.out.println(string);
	}
	private void heavyJob(String msg) {
		System.out.print(msg);
		for(int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.print(".");
		}
		System.out.println("完了。");
	}
}
