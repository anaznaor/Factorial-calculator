package hr.fer.oop.lab.zad5;

import java.util.Iterator;
import java.util.*;
import java.util.NoSuchElementException;

public class FibonacciIterator implements Iterator<Integer>{

	private int number;
	private int index = 0;
	private List<Integer> numbers = new LinkedList<>();
	
	public FibonacciIterator(int number) {
		if(number < 0)
			throw new IllegalArgumentException("Number must be positive!");
		this.number = number;
	}

	@Override
	public boolean hasNext() {
		return index < number;
	}

	@Override
	public Integer next() {
		if(hasNext()) {
			if(index == 0) {
				numbers.add(0);
				index++;
				return 0;
			}
			else if(index == 1) {
				numbers.add(1);
				index++;
				return 1;
			}
			else {
				int f1 = numbers.get(index - 2);
				int f2 = numbers.get(index - 1);
				numbers.add(f1 + f2);
				index++;
				return f1 + f2;
			}
		}
		else
			throw new NoSuchElementException("No more numbers.");
	}

}
