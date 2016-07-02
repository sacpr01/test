package com.pratiksha;

import java.util.Comparator;

public class Comp implements Comparator {

	

	@Override
	public int compare(Object o1, Object o2) {
		DupArray d1=(DupArray)o1;
		DupArray d2=(DupArray)o2;
		String s1=String.valueOf(d1.str);
		String s2=String.valueOf(d2.str);
		return s1.compareTo(s2);
		
	}
	
	

}
