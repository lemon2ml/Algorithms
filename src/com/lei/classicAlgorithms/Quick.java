package com.lei.classicAlgorithms;

import java.util.Arrays;

public class Quick {
	public static void main(String[] args) {
		int[] a = {1,2,5,3,8,7,6,10};
		System.out.println(Arrays.toString(a));
		quick(a, 0, a.length-1);
		System.out.println(Arrays.toString(a));
	}

	public static void quick(int[] a, int l, int r) {
		if(l<r) {
			int i = l, j = r, x = a[l];
			while(i<j) {
				while(i<j && a[j] >= x) j--;
				if(i<j) a[i++] = a[j];
				
				while(i<j && a[i] <= x) i++;
				if(i<j) a[j--] = a[i];
				
			}
		a[i] = x;
		quick(a, l, i-1);
		quick(a, i+1, r);
		}
	}
}
