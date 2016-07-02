package com.pratiksha;

public class PhoneDigits {

	static String numOnDigits[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	public static void main(String[] args) {
		
		int num[]={2,3,4};
		printCombo(num);
	}
    public static void printCombo(int num[]){
    	char res[] = new char[num.length+1];
    	printComboUtil(res,num,num.length,0);
    }
    public static void printComboUtil(char res[],int num[],int n,int l){
  
    	if(l==n){
    		System.out.println(res);
    		return;
    	}
    	for(int i=0;i<numOnDigits[num[l]].length();i++){
    		res[l]=numOnDigits[num[l]].charAt(i);
    		printComboUtil(res,num,n,l+1);
    		if(num[l]==0||num[l]==1)
    			return;
    	}
    }
}
