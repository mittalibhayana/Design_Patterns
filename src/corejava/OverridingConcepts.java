package corejava;

public class OverridingConcepts {
public void methoda(int a) {
	System.out.println("bingo");
}

public void methoda() {
	
}
}


class B extends OverridingConcepts{
	
	public void methoda(int x)  {
		System.out.println("bazooka");
	}
}