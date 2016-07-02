package com.pratiksha;

import java.util.Arrays;
import java.util.Comparator;

public class FirstNonRepeating {

	public static void main(String[] args) {
		String s = "GEEKSFORGEEKS";
		Count count[] = new Count[256];
		for(int i=0;i<s.length();i++){
			count[s.charAt(i)-'0'].c++;
			if(count[s.charAt(i)-'0'].c==1)
				count[s.charAt(i)-'0'].index = i;
			else
				count[s.charAt(i)-'0'].index = s.length();
			
		
		}
		//Arrays.sort(count, new Compa());
		Arrays.sort(count, new Comparator<Count>() {
		    public int compare(Count o1, Count o2) {
		        return o2.index - o1.index;
		    }
		});

//		for(int i =0;i<256;i++){
//			if(count[i].c == 1){
//				System.out.println(count[i].c);
//				break;
//			}
//		}
		if(count[0].c==1){
			int index = count[0].index;
			System.out.println(s.charAt(index));
		}
        
	}
	
	
class Count{
	int index;
	int c;
}

}
