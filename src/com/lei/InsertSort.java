package com.lei;

import java.util.Arrays;

public class InsertSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {3,1,2,5,7,8,6,9};
		System.out.println(Arrays.toString(a));
		insert(a);
		System.out.println(Arrays.toString(a));
	}
	
	public static void insert(int[] a) {
		int n = a.length;
		for(int i=1;i<n;i++) {
			if(a[i]<a[i-1]) {
				int tmp = a[i];
				int j = 0;
				for(j=i-1;j>=0 && a[j]>tmp;j--) {
					a[j+1] = a[j];
				}
				a[j+1] = tmp;
			}
		}
	}

}
