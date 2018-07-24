package coll;

import java.util.List;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;

class IteratorImpl<E> implements Iterator<E>,Enumeration<E>, Iterable<E> {

	private final List<E> list ;

	public static void main(String[] args) {

		IteratorImpl<Integer> itr = new IteratorImpl<>(new Integer[]{23,4,5,6});
		// itr.for

		// Iterable -> Using Iterator
		for (Object obj : itr)
			System.out.println(obj);
		// Iterator
		/*while(itr.hasNext())
			System.out.println(itr.next());
		// Enumeration
		while(itr.hasMoreElements())
			System.out.println(itr.nextElement());*/
	}

	public IteratorImpl(E[] arr) {
		if(arr==null || arr.length==0)
			throw new NullPointerException();
		list = new LinkedList<>();
		for (E u : arr)
			list.add(u);
	}

	@Override
	public boolean hasNext() {
		return !list.isEmpty();
	}

	@Override
	public E next() {
		if(list.isEmpty())
			throw new NullPointerException();
		return (E)list.remove(0);
	}

	@Override
	public boolean hasMoreElements() {
		return hasNext();
	}

	@Override
	public E nextElement() {
		return next();
	}

	@Override
	public Iterator<E> iterator() {
		return this;
	}

}
