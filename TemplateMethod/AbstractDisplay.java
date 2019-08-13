package TemplateMethod;

public abstract class AbstractDisplay {
	// 抽象メソッド　具体的な処理はサブクラス
	public abstract void open();
	public abstract void print();
	public abstract void close();

	public final void display() {
		open();
		for(int i = 0; i < 5; i++) {
			print();
		}
		close();
	}
}
