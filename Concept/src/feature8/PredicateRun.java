package feature8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateRun {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(0,1,2,3,4,5,6,7,8,9);
		PredicateDemo predicateDemo = new PredicateDemo();
		System.out.println("All numbers: "+predicateDemo.testPredicate(x->true, list));
		System.out.println("Odd numbers: "+predicateDemo.testPredicate(x->(x&1)==1, list));
		System.out.println("Even numbers: "+predicateDemo.testPredicate(x->(x&1)==0, list));
	}
}

class PredicateDemo {

	public List<Integer> testPredicate(Predicate<Integer> p, List<Integer> list) {
		List<Integer> predicateList = new ArrayList<>();
		for(Integer i : list)
			if(p.test(i))
				predicateList.add(i);
		return predicateList;
	}
}