package library;

import java.util.ArrayList;

public class App {
	public static void main(String[] args) {

		ArrayList<Item> items = new ArrayList<>();

		items.add(new Book("Harry Potter", "26-06-1997", 223, false));
		items.add(new Newspaper("Metro", "22-01-2024", 40, true));
		items.add(new Magazine("Kerrang", "11-03-2012", 50, true));

		System.out.println(items);

	}
}
