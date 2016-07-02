package com.pratiksha;

public class Interleaving {

	public static void main(String[] args) {
		char c1[]={'a','b','e'};
		char c2[]={'c','d'};
		int l=c1.length+c2.length;
		char res[]=new char[l];
		
		isInterleaved(c1,c2,l,0,0,0,res);
		

	}
	public static void isInterleaved(char c1[],char c2[],int len,int i,int j,int k,char res[]){
		if(k==len){
			System.out.println(res);
			return;
		}
		if(i<c1.length){
			res[k]=c1[i];
			isInterleaved(c1,c2,len,i+1,j,k+1,res);
		}
		if(j<c2.length){
			res[k]=c2[j];
			isInterleaved(c1,c2,len,i,j+1,k+1,res);
		}
	}

}
