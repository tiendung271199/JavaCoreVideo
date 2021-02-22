package javacore.enums;

public class Enums3 {	
	public static void main(String[] args) {
		for (Page page : Page.values()) {
			System.out.println(page.getPageId() + " - " + page.getPageTitle() + " - " + page.getPageURL());
		}
	}
	
}
