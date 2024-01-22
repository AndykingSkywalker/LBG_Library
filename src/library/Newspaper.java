package library;

public class Newspaper extends Item {

	private boolean hasCrossword;

	public Newspaper(String title, String dateOfPublishing, int numOfPages, boolean hasCrossword) {
		super(title, dateOfPublishing, numOfPages);
		this.hasCrossword = hasCrossword;
	}

	public Newspaper() {
		super();
	}

	public boolean isHasCrossword() {
		return hasCrossword;
	}

	public void setHasCrossword(boolean hasCrossword) {
		this.hasCrossword = hasCrossword;
	}

	@Override
	public int compareTo(Item o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
