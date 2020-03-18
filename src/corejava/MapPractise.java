package corejava;

import java.util.HashMap;
import java.util.Map;

public class MapPractise {

	public MapPractise() {
		System.out.println("helo");
	}

	public static void main(String[] args) {
		HashMap<Employee, Integer> map = new HashMap<>();
		map.put(new Employee("mitali", "test"), 1);
		map.put(new Employee("mitali2", "test"), 1);
		map.put(new Employee("mitali", "test"), 1);
		for (Map.Entry<Employee, Integer> m : map.entrySet()) {
//		/System.out.println(m);
		}

		System.out.println(map.get(new Employee("mitali", "test")));
	}

}

class Employee {
	String name;
	private String testVal;

	public Employee(String name, String test) {
		this.name = name;
		this.testVal = test;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTestVal() {
		return testVal;
	}

	public void setTestVal(String testVal) {
		this.testVal = testVal;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((testVal == null) ? 0 : testVal.hashCode());

		// return 1;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		/*
		 * if (this == obj) return true; if (obj == null) return false; if (getClass()
		 * != obj.getClass()) return false; Employee other = (Employee) obj; if (name ==
		 * null) { if (other.name != null) return false; } else if
		 * (!name.equals(other.name)) return false; if (testVal == null) { if
		 * (other.testVal != null) return false; } else if
		 * (!testVal.equals(other.testVal)) return false; return true;
		 */
		return false;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", testVal=" + testVal + "]";
	}

}
