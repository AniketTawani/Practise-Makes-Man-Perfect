package TwoPointersAlgo;

public class Triplet {
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
			
		}return false;
	}
}
