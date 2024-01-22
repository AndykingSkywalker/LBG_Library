package library;

public class Person implements Comparable<Person> {

	private String name;

	private int age;

	private String favouriteGenre;

	private int id;

	private static int count = 1;

	public Person() {
		super();
		this.id = count++;
	}

	public Person(String name, int age, String favouriteGenre) {
		super();
		this.id = count++;
		this.name = name;
		this.age = age;
		this.favouriteGenre = favouriteGenre;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFavouriteGenre() {
		return favouriteGenre;
	}

	public void setFavouriteGenre(String favouriteGenre) {
		this.favouriteGenre = favouriteGenre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", favouriteGenre=" + favouriteGenre + ", id=" + id + "]";
	}

	@Override
	public int compareTo(Person o) {
		if (id < o.getId()) {
			return +1;
		} else if (id > o.getId()) {
			return -1;
		} else {
			return 0;
		}
	}

}
