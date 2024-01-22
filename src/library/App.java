package library;

public class App {
	public static void main(String[] args) {
		// created new magazine and person
		Magazine myMagazine = (new Magazine("Kerrang", "11-03-2012", 50, true));
		Person myPerson = (new Person("Andrew", 27, "Horror"));

		System.out.println(myMagazine);
		System.out.println(myPerson);

		myMagazine.checkingOut();

		System.out.println(myMagazine);

		myMagazine.setTitle("Hello");
		myMagazine.checkingIn();

		System.out.println(myMagazine);
		System.out.println(myPerson);
		// created new library
		Library myLibrary = new Library();

		myLibrary.addToLibrary(new Book("Harry Potter", "26-06-1997", 223, false));
		myLibrary.addToLibrary(new Newspaper("Metro", "22-01-2024", 40, true));
		myLibrary.addToLibrary(new Magazine("Kerrang", "11-03-2012", 50, true));
		myLibrary.addPersonToLibrary(new Person("Andrew", 27, "Horror"));
		myLibrary.addPersonToLibrary(new Person("John", 38, "Fantasy"));
		myLibrary.addPersonToLibrary(new Person("Rebecca", 25, "Romance"));

		System.out.println("myLibrary: " + myLibrary);

		myLibrary.removeFromLibrary(new Magazine("Kerrang", "11-03-2012", 50, true));
		myLibrary.removePersonFromLibrary(new Person("Andrew", 27, "Horror"));
		myLibrary.removePersonById(1);
		myLibrary.removeById(3);
		myLibrary.checkoutById(2);
		myLibrary.amendById(2, "Dracula", "26-04-1897", 418);

		System.out.println("myLibrary: " + myLibrary);

	}
}
