package Facade;

import Facade.pagemaker.PageMaker;

public class Main {

	public static void main(String[] args) {
		PageMaker.makeWelcomePage("hyuki@hyuki.com", "./Facade/welcome.html");
	}
}
