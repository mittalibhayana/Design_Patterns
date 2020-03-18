package corejava;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person>{


	@Override
	public int compare(Person o1, Person o2) {
		if(o1.getlName().equals(o2.getlName())) {
			return 1;
		}
		return 0;
	}
	
	

}
