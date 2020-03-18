package corejava;
import java.util.Date;

public final class Immutability {

	private final int id;
	private final String name;
	private final Age age;
	private final Date dateObj;
	final int arr[] = {1,2,3};
	int[] arr2= {1,3,4};

	public Immutability(int id, String name, Age age, Date date) throws CloneNotSupportedException {
		this.id = id;
		this.name = name;
		Age cloneAge = new Age();
		cloneAge.setAge(age.getAge());
		this.age = cloneAge;
		this.dateObj = new Date(date.getTime());
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Age getAge() {
		Age cloneAge = new Age();
		cloneAge.setAge(this.age.getAge());
		return cloneAge;
	}

	public Date getDateObj() {
		return new Date(this.dateObj.getTime());
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		Age age = new Age();
		age.setAge(1);
		
		Immutability obj = new Immutability(1, "test", age, new Date());
		System.out.println(obj.getDateObj());
		obj.getAge().setAge(2);
		obj.getDateObj().setDate(10);
		System.out.println(obj.getDateObj());
	}
}

class Age {

	private int number;

	public void setAge(int age) {
		this.number = age;
	}

	public int getAge() {
		return number;
	}
}
