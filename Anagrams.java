package com.pratiksha;

import java.util.Arrays;
import java.util.Comparator;

public class Anagrams {


	public static void main(String[] args) {
		String wordArr[]={"cat", "dog", "tac", "god", "act"};
		int n = wordArr.length;
		getAnagrams(wordArr,n);

	}
	public static void getAnagrams(String wordArr[],int size){
		DupArray duparr[]=createDupArray(wordArr,size);
		//Arrays.sort(duparr, new Comp());
		Arrays.sort(duparr, new Comparator<DupArray>() {
		    public int compare(DupArray o1, DupArray o2) {
		    	String s1=String.valueOf(o1.str);
				String s2=String.valueOf(o2.str);
		        return s2.compareTo(s1);
		    }
		});
		for(int i=0;i<size;i++){
			int index = duparr[i].index;
			System.out.println(wordArr[index]);
		}
			
		
		
	}

	public static DupArray[] createDupArray(String wordArr[],int size){
		DupArray duparr[] = new DupArray[size];
		//duparr.size = size;
		//duparr.array= new Word[size];
		for(int i=0;i<size;i++){
			duparr[i].index=i;
			char temp[]=wordArr[i].toCharArray();
			Arrays.sort(temp);
			duparr[i].str=temp;
		}
//		for(int i=0;i<size;i++){
//			System.out.println(duparr[i].index+"   "+duparr[i].str);
//		}
		return duparr;
	}

}



