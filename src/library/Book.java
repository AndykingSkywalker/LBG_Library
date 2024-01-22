package library;

public class Book extends Item {

	private boolean hasPictures;

	public Book(String title, String dateOfPublishing, int numOfPages, boolean hasPictures) {
		super(title, dateOfPublishing, numOfPages);
		this.hasPictures = hasPictures;
	}

	public Book() {
		super();
	}

	public boolean isHasPictures() {
		return hasPictures;
	}

	public void setHasPictures(boolean hasPictures) {
		this.hasPictures = hasPictures;
	}

}
