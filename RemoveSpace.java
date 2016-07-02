package com.pratiksha;

public class RemoveSpace {

	public static void main(String[] args) {
		String s = "g  eeks   for ge  eeks  ";
		char c[]=s.toCharArray();
		int len = c.length;
		StringBuffer ss = new StringBuffer();
		int count=0;
		for(int i=0;i<len;i++){
			if(c[i]!=' '){
				//ss.append(c[i]);
				c[count++]=c[i];
			}
		}
		String sss =String.valueOf(c,0, count);
		System.out.println(sss);

	}

}
