package designpatterns;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class java8Features {

	
	public static void main(String[] args) {
		List<String> list = Arrays.asList("mittali","himanshu","makkar");
		List<Integer> numList = Arrays.asList(1,2,3,4,5,6,7,8);
		System.out.println(numList.stream().filter(x->x%2==0).reduce(0,(ans,i)->ans+i));
		list.stream().forEach(s->System.out.println(s));
		List<String> newList = list.stream().filter(s->s.contains("mittali")).collect(Collectors.toList());
		System.out.println(newList.size());
		
	}
}
