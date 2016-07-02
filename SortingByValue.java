package com.pratiksha;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class SortingByValue {


	public static void main(String[] args) {
		String str = "aaaabbbcc";
		char arr[] = str.toCharArray();
		int len = str.length();
		int dist = 2;
		Map<Character , Integer> mp = new HashMap <Character , Integer>();
		for(int i = 0 ; i < len ; i++){
			if(mp.containsKey(arr[i])){
				int c = mp.get(arr[i])+1;
				mp.put(arr[i], c);
			}
			else 
				mp.put(arr[i],1);
		}
		Map<Character , Integer> map = sortByValue(mp);
		char result[] = new char[len];
		List<Map.Entry<Character , Integer>> list = new LinkedList<Map.Entry<Character , Integer>>( map.entrySet() );
		for(int i=0;i<len;i++){
			Map.Entry<Character , Integer> entry = list.get(0);
			char cc = entry.getKey();
			int val = entry.getValue();
			int x =0;
			while(val>0 && i + x*dist < len && result[i + x*dist] == 0){
				
				  result[i + x*dist] = cc;
                 x++;
				val--;
					
			}
			if(val > 0){
				System.out.println("not possible");
				break;
			}
			map.remove(cc);
			
		}

	}

	public static  Map<Character , Integer>  sortByValue(Map<Character , Integer> mp){
		List<Map.Entry<Character , Integer>> list = new LinkedList<Map.Entry<Character , Integer>>( mp.entrySet() );
	        Collections.sort( list, new Comparator<Map.Entry<Character , Integer>>()
	        {
	            public int compare( Map.Entry<Character , Integer> o1, Map.Entry<Character , Integer> o2 )
	            {
	                //return (o1.getValue()).compareTo( o2.getValue() );
	            	return o2.getValue()- o1.getValue();
	            }
	        } );

	        Map<Character , Integer> result = new HashMap<Character , Integer>();
	        for (Map.Entry<Character , Integer> entry : list)
	        {
	            result.put( entry.getKey(), entry.getValue() );
	        }
	        return result;
	}
 
}
