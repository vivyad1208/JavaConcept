package polymorphism;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/** Base-Interface */
@FunctionalInterface
interface LaunchPad {
	Boolean launch();
}

/** Base-Interface */
@FunctionalInterface
interface Ship{
	void sails();
}

/** Mixin-Functional-Interface */
@FunctionalInterface
interface AircraftCarrier extends LaunchPad,Ship {
	default void sails() {
		System.out.println("It sails on water.");
	}

	static <T,U> AircraftCarrier producingAircraftCarrier(Function<? super T, ? extends U> f) {
		return () -> {
			return (Boolean) f.apply(null);
		};
	}
}

public class MixinsDemo {

	public static void main(String[] args) {
		MixinsDemo mixin = new MixinsDemo();
		List<String> list = mixin.list;
		System.out.println("Aircraft Before Launch: "+list);

		AircraftCarrier aircraftCarrier;
		// aircraftCarrier = () -> { list.remove(0); return true;};		// This Line works.
		aircraftCarrier = AircraftCarrier.producingAircraftCarrier(mixin::remove);

		//String strPlane = "Plane-1";
		if(aircraftCarrier.launch())
			System.out.println("Aircraft After Launch: "+list);
	}

	List<String> list = new ArrayList<>(Arrays.asList("Plane-1","Plane-2","Plane-3","Plane-4"));

	public Boolean remove() {
		if(list.isEmpty())
			return false;
		list.remove(0);
		return true;
	}

	public Boolean remove(Object o) {
		if(list.isEmpty())
			return false;
		list.remove(0);
		return true;
	}
}
