package library;

import java.util.ArrayList;
import java.util.List;

public class Library {

	private ArrayList<Item> items = new ArrayList<>();
	private ArrayList<Person> people = new ArrayList<>();

	public void addToLibrary(Item item) {
		items.add(item);
	}

	public void removeFromLibrary(Item item) {
		items.remove(item);
	}

	public boolean removeById(int id) {
		List<Item> toRemove = new ArrayList<Item>();
		for (Item item : this.items) {
			if (item.getId() == id) {
				toRemove.add(item);
			}
		}
		return this.items.removeAll(toRemove);
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

	public void removePersonFromLibrary(Person person) {
		people.remove(person);
	}

	public boolean removePersonById(int id) {
		List<Person> toRemove = new ArrayList<Person>();
		for (Person person : this.people) {
			if (person.getId() == id) {
				toRemove.add(person);
			}
		}
		return this.people.removeAll(toRemove);
	}

	@Override
	public String toString() {
		return "items=" + items + " people=" + people + "]";
	}

}
