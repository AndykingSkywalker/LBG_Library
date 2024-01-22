package library;

public class App {
	public static void main(String[] args) {

//		ArrayList<Item> items = new ArrayList<>();
//
//		items.add(new Book("Harry Potter", "26-06-1997", 223, false));
//		items.add(new Newspaper("Metro", "22-01-2024", 40, true));
		Magazine myMagazine = (new Magazine("Kerrang", "11-03-2012", 50, true));

//
		System.out.println(myMagazine);

		myMagazine.checkingOut();

		System.out.println(myMagazine);

		myMagazine.setTitle("Hello");
		myMagazine.checkingIn();

		System.out.println(myMagazine);

		Library myLibrary = new Library();

		myLibrary.addToLibrary(new Book("Harry Potter", "26-06-1997", 223, false));
		myLibrary.addToLibrary(new Newspaper("Metro", "22-01-2024", 40, true));
		myLibrary.addToLibrary(new Magazine("Kerrang", "11-03-2012", 50, true));

		System.out.println("myLibrary: " + myLibrary);

		myLibrary.removeFromLibrary(new Magazine("Kerrang", "11-03-2012", 50, true));

		myLibrary.removeById(3);

		System.out.println("myLibrary: " + myLibrary);

	}
}
