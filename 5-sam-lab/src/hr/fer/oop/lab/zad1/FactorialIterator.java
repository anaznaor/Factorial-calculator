package hr.fer.oop.lab.zad1;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class FactorialIterator implements Iterator<Integer>{
	private int number;
	private int index = 0;
	
	public FactorialIterator(int number) {
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
			int generatedNumber = 1;
			if(index == 0) {
				index++;
				return 1;
			}	
			for(int i = 1; i <= index; i++) {
				generatedNumber *= i;
			}
			index++;
			return generatedNumber;
		}
		else
			throw new NoSuchElementException("No more numbers.");
	}
}
