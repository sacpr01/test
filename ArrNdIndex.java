package com.pratiksha;

public class ArrNdIndex {


	public static void main(String[] args) {
		int arr[]={50, 40, 70, 60, 90};
		int index[]={3,  0,  4,  1,  2};
		int len = arr.length;
		for(int i=0;i<len;i++){
			while(index[i]!=i){
				int in=index[i];
				int ar=arr[i];
				arr[i]=arr[in];
				index[i]=index[in];
				arr[in]=ar;
				index[in]=in;
			}
		}
		for(int i=0;i<len;i++){
			System.out.println(arr[i]+"  "+index[i]);
		}

	}

}
