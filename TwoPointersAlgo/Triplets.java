package TwoPointersAlgo;

import java.util.Scanner;

public class Triplets {
	public boolean sumOfTriplet(int a[], int n1) {
		for(int k=0;k<=n1-2;k++) {
			if(sumOfTwo(a,-a[k],k++))return true;
		}
		return false;
	}
	
	public boolean sumOfTwo(int b[],int x,int i) {
		int j = b.length-1;
		while(i<j) {
			
			if(b[i]+b[j] < x) {
				i++;
			}else if(b[i]+b[j]>x){
				j--;
			}else {
				return true;
			}
			
		}return false;}

	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the testcases: ");
		int t = sc.nextInt();
		while(t>0){
			System.out.println("Enter the size of Array: ");
			int n = sc.nextInt();
			int[] arr = new int[n];
			System.out.println("Enter the array: ");
			for(int j=0;j<n;j++) {
//				System.out.println("Enter the array: ");
				arr[j]=sc.nextInt();
			}
			Triplets t1 = new Triplets();
			if(t1.sumOfTriplet(arr,n)) {
				System.out.println("1");
			}else {
				System.out.println("0");
			}
			t--;
		}
	}
}