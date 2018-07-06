package feature8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
public class ConsumerDemo {

	public static void main(String[] args) {
		Comparator<Computer> comparator;

		Computer c1 = new Computer(2015, "White", 450);
		Computer c2 = new Computer(2009, "Black", 100);
		Computer c3 = new Computer(2014, "Black", 400);

		ArrayList<Computer> list = new ArrayList<>(Arrays.asList(c1, c2, c3));
		list.forEach(System.out::println);

		// 1st Way
		// comparator = (Computer cl1, Computer cl2) -> cl1.getAge().compareTo(cl2.getAge());

		// 2st Way
		// comparator = (cl1, cl2) -> cl1.getAge().compareTo(cl2.getAge());

		// 3rd Way
		comparator = Comparator.comparing(Computer::getAge);


		Collections.sort(list, comparator);
		list.forEach(System.out::println);
	}

	public static class Computer {
		int age, price;
		String color;

		public Computer(int year, String color, int price) {
			this.age = 2017-year;
			this.color = color;
			this.price = price;
		}
	
		public Integer getAge() {
			return age;
		}

		public String toString() {
			return "Age:"+age+"-years, Color:"+color+", Price:"+price+"$";
		}
	}
}
