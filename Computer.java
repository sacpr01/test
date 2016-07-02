package com.pratiksha;

public class Computer {

	
	public static void main(String[] args) {
		int n=1;
		String s="ABCBCADEED";
		int result=runCustomerSimulation(n,s);
		System.out.println("result is"+result);

	}
	public static int runCustomerSimulation(int n, String s){
		int res=0;
		int count=n;;
		char visited[]=new char[256];
		for(int i=0;i<visited.length;i++)
			visited[i]='0';
		char ss[]=s.toCharArray();
		for(int i=0;i<ss.length;i++){
			
			if(count>0){
				if(visited[ss[i]]=='0'){
					count--;
					visited[ss[i]]='1';
				}else{
					count++;
					visited[ss[i]]='0';
				}
				
			}
			else {
				if(visited[ss[i]]=='0'){
					res++;
					i++;
				}else{
					visited[ss[i]]='0';
					count++;
				}
			
			}
			
		}
		return res;
	}

}
