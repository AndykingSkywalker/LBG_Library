package library;

public abstract class Item implements Comparable<Item> {

	private String title;

	private String dateOfPublishing;

	private int numOfPages;

	private int id;

	private static int count = 1;

	public Item() {
		super();
		this.id = count++;
	}

	public Item(String title, String dateOfPublishing, int numOfPages) {
		super();
		this.id = count++;
		this.title = title;
		this.dateOfPublishing = dateOfPublishing;
		this.numOfPages = numOfPages;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDateOfPublishing() {
		return dateOfPublishing;
	}

	public void setDateOfPublishing(String dateOfPublishing) {
		this.dateOfPublishing = dateOfPublishing;
	}

	public int getNumOfPages() {
		return numOfPages;
	}

	public void setNumOfPages(int numOfPages) {
		this.numOfPages = numOfPages;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Item [title=" + title + ", dateOfPublishing=" + dateOfPublishing + ", numOfPages=" + numOfPages
				+ ", id=" + id + "]";
	}

}
