package com.pratiksha;

import java.util.Comparator;

import com.pratiksha.FirstNonRepeating.Count;

public class Compa implements Comparator{

	@Override
	public int compare(Object arg0, Object arg1) {
		Count i1 = (Count)arg0;
		Count i2 = (Count)arg1;
		return i1.index - i2.index;
	}
	
}