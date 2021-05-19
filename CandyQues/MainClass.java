package CandyQues;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number of students int he class");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i =0; i<n; i++) {
			arr[i] = sc.nextInt();
		}
		
		minamt(n,arr);

	}
	
	public static void minamt(int n, int a[]) {
		for(int i=0;i<n;i++) {
			int[] c = new int[n];
			Arrays.fill(c,1);
			
			for(int j=0;i<n-2;i++) {
				if(a[j+1]>a[j]) {
					c[j+1]=c[j]+1;
				}
			}
			for(int k=n-2;k>=0;k--) {
				if(a[k]>a[k+1]) {
					c[k] = Math.max(a[k+1]+1, a[k]);
				}
			}
		}
		int sum =0;
		for(int i=0;i<n;i++) {
			sum = sum +a[i];
		}
		
		System.out.println(sum);
	}
}