package com.pratiksha;

public class RemoveDuplicates {

	public static void main(String[] args) {
	    String str       = "geeksforgeeks";
	    String mask_str  = "maskfo";
	    char s[] = str.toCharArray();
	    char mask[] = mask_str.toCharArray();
	    
	    removeDirtyBits(s,mask);

	}
	public static void removeDirtyBits(char s[], char mask[]){
		boolean count[]=new boolean[256];
		for(int i=0;i<mask.length;i++){
			count[mask[i]]=true;
		}
		removeDirtyBitsUtil(count,s);
	}
	public static void removeDirtyBitsUtil(boolean count[] , char s[]){
		int res=0;
		for(int i=0;i<s.length;i++){
			if(count[s[i]]){
				
			}
			else{
				s[res++] = s[i];
			}
			
		}
		
		System.out.println(String.valueOf(s, 0, res));
	}

}
