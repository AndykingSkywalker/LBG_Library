package library;

public abstract class Item implements Comparable<Item> {

	private String title;

	private String dateOfPublishing;

	private int numOfPages;

	private int id;

	private boolean checkedIn;

	private static int count = 1;

	public Item() {
		super();
		this.id = count++;
		this.checkedIn = true;
	}

	public Item(String title, String dateOfPublishing, int numOfPages) {
		super();
		this.id = count++;
		this.title = title;
		this.dateOfPublishing = dateOfPublishing;
		this.numOfPages = numOfPages;
		this.checkedIn = true;
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

	public boolean isCheckedIn() {
		return checkedIn;
	}

	public boolean setCheckedIn(boolean checkedIn) {
		return this.checkedIn = checkedIn;
	}

	public boolean checkingOut() {
		return this.checkedIn = false;
	}

	public boolean checkingIn() {
		return this.checkedIn = true;
	}

	@Override
	public String toString() {
		return "Item [title=" + title + ", dateOfPublishing=" + dateOfPublishing + ", numOfPages=" + numOfPages
				+ ", id=" + id + ", checkedIn=" + checkedIn + "]";
	}

}
