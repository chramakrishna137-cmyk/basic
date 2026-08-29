package basic;

public class NumberUtil {
	boolean isPositive(int a){
		if (a>0) {
			return true;
		}
		else {
			return false;
		}
	}
	boolean isEven(int a) {
		if (a%2==0) {
			return true;
		}
		else {
			return false;
		}
	}
	boolean isPrime(int a) {
		int factorCount=0;
		for(int i=1;i<=a;i++) {
			if(a%i==0) {
				factorCount=factorCount+1;
			}
		}
		if (factorCount==2) {
			return true;
		}
		else {
			return false;
		}
	}

}
