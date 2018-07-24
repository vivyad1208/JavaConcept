package coll;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Filling {

	static AtomicInteger atomicInt = new AtomicInteger(0);

	public static void main(String[] args) {
		Supplier<String> supplier = () -> UUID.randomUUID().toString();
		List<String> list = Stream.generate(supplier).limit(100).collect(Collectors.toList());
		for (String string : list) {
			System.out.println(Integer.valueOf(String.valueOf(atomicInt.incrementAndGet()))+" -> "+string);
		}
	}
}
