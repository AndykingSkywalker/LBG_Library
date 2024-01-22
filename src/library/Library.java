package library;

import java.util.ArrayList;

public class Library {

	private ArrayList<Item> items = new ArrayList<>();
	private ArrayList<Person> people = new ArrayList<>();

	public void addToLibrary(Item item) {
		items.add(item);
	}

	public boolean removeById(int id) {
		for (Item item : this.items) {
			if (item.getId() == id) {
				this.items.remove(item);
				return true;
			}
		}
		return false;
	}

	public boolean checkInById(int id) {
		for (Item item : this.items) {
			if (item.getId() == id) {
				return item.setCheckedIn(true);
			}
		}
		return false;
	}

	public boolean checkoutById(int id) {
		for (Item item : this.items) {
			if (item.getId() == id) {
				return item.setCheckedIn(false);
			}
		}
		return true;
	}

	public boolean amendById(int id, String title, String dateOfPublishing, int numOfPages) {
		for (Item item : this.items) {
			if (item.getId() == id) {
				item.setTitle(title);
				item.setDateOfPublishing(dateOfPublishing);
				item.setNumOfPages(numOfPages);
				return true;
			}
		}
		return false;
	}

	public boolean amendPersonById(int id, String name, int age, String favouriteGenre) {
		for (Person person : this.people) {
			if (person.getId() == id) {
				person.setName(name);
				person.setAge(age);
				person.setFavouriteGenre(favouriteGenre);
				return true;
			}
		}
		return false;
	}

	public void addPersonToLibrary(Person person) {
		people.add(person);
	}

	public boolean removePersonById(int id) {
		for (Person person : this.people) {
			if (person.getId() == id) {
				this.people.remove(person);
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "items=" + items + " people=" + people + "]";
	}

}
