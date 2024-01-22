package library;

public class Magazine extends Item {

	private boolean comesWithPoster;

	public Magazine(String title, String dateOfPublishing, int numOfPages, boolean comesWithPoster) {
		super(title, dateOfPublishing, numOfPages);
		this.comesWithPoster = comesWithPoster;
	}

	public Magazine() {
		super();
	}

	public boolean isComesWithPoster() {
		return comesWithPoster;
	}

	public void setComesWithPoster(boolean comesWithPoster) {
		this.comesWithPoster = comesWithPoster;
	}

}
