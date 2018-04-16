package com.lei.classicAlgorithms;

import java.util.Arrays;

public class Bubble {
	static int count = 0;
	public static void main(String[] args) {
		int[] a = {1,2,5,3,8,7,6,10,100,99,33};
		System.out.println(Arrays.toString(a));
		bubble3(a);
		System.out.println(Arrays.toString(a));
		System.out.println(count);
	}
	public static void swap(int[] a, int i, int j) {
		int tmp = a[i];
		a[i] = a[j];
		a[j] = tmp;
	}
	
	public static void bubble(int[] a) {		
		for(int i=0;i<a.length;i++) {
			for(int j=1;j<a.length-i;j++) {
				count++;
				if(a[j-1]>a[j]) {
					swap(a,j-1,j);
				}
			}
		}
	}
	
	public static void bubble2(int[] a) {
		int n = a.length;
		int k = n;
		boolean flag = true;
		while(flag) {
			flag = false;
			for(int i=1;i<k;i++) {
				count++;
				if(a[i-1] > a[i]) {
					swap(a, i-1, i);
					flag = true;
				}
			}
			k--;
		}
	}
	
	public static void bubble3(int[] a) {
		int n = a.length;
		int flag = n;
		int k = n;
		while(flag>0) {
			k = flag;
			flag = 0;
			for(int i=1;i<k;i++) {
				count++;
				if(a[i-1] > a[i]) {
					swap(a, i-1, i);
					flag = i;
				}
			}
		}
	}
}










