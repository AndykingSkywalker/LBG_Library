package library;

import java.util.ArrayList;
import java.util.List;

public class Library {

	private ArrayList<Item> items = new ArrayList<>();

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

	@Override
	public String toString() {
		return "items=" + items + "]";
	}

}
