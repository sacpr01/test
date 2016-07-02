package com.pratiksha;

public class RemoveDup {

	public static void main(String[] args) {
		String s="azxxxzy";
		char ss[]=s.toCharArray();
		char resArray[]=new char[ss.length];
		String res=removeDup(ss,ss.length,resArray);	
		System.out.println(res);
     
		
	}
	
	public static String removeDup(char ss[],int n,char ra[]){
		
		int i,k=0;
		for(i=1;i<n;i++){
			if(ss[i-1]!=ss[i]){
				ra[k++]=ss[i-1];
			}else{
				while(i<n && ss[i-1]==ss[i])
					i++;
			}
		}
		ra[k++]=ss[i-1];
		if(k!=n-1){
			char temp[]=new char[String.valueOf(ra).trim().toCharArray().length];
			String res=removeDup(String.valueOf(ra).trim().toCharArray(),k,temp);
			return res;
		}
		else return String.valueOf(ra);
		
	}

}
