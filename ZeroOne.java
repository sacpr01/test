package com.pratiksha;

public class ZeroOne {

	public static void main(String[] args) {
		int arr[] = { 1, 1, 0, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1 };
		int len = arr.length;
		int count = 0;
		int index=0, max = 0;
		boolean flag = false;
		for (int i = 0; i < len; i++) {
			if (arr[i] == 1 && !flag) {
				count++;
			}
			if (arr[i] == 0 && !flag) {
				count++;
				flag = !flag;

				if (max < count) {
					max = count;
					index = i;
				}
			} else {
				while (arr[i] != 1)
					i++;
				flag = !flag;
				i--;
			}

		}
		System.out.println(index);
	}

}
