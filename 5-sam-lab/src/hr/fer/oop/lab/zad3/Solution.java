package hr.fer.oop.lab.zad3;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Predicate;

public class Solution {

    public static Predicate<List<List<Integer>>> allDigitsMatch(double exemplar){
        return new Predicate<List<List<Integer>>>(){
        	String theValue = String.valueOf(exemplar);
        	
        	int beforeDot = (int) exemplar % 10;
        	String afterDot = theValue.substring(theValue.indexOf(".") + 1);
        	
			@Override
			public boolean test(List<List<Integer>> t) {
				int i = 0;
				for(List<Integer> list : t) {
					if(list.get(0) == 0) {
						if(list.get(1) != beforeDot)
							return false;
					}
					else {
						i = list.get(0);
						if(i < afterDot.length()) {
							String x = Character.toString(afterDot.charAt(i - 1));
							int number = Integer.parseInt(x);
							if(number != list.get(1))
								return false;
						}
					}
				}
				return true;
			}
        };
    }
    
    
    public static Predicate<List<List<Integer>>> allDigitsDefined(){
        return new Predicate<List<List<Integer>>>() {

			@Override
			public boolean test(List<List<Integer>> t) {
				Set<Integer> positions = new TreeSet<>();
				for(List<Integer> list : t) {
					positions.add(list.get(0));
				}
				for(int i = 0; i <= t.size() - 1; i++) {
					if(!positions.contains(i))
						return false;
				}
				return true;
			}
        	
        };
    }

}
