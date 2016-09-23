package base;

public class MyInteger {
	private int iValue;

	public MyInteger(int iValue) {
		super();
		this.iValue = iValue;
	}

	public int getiValue() {
		return iValue;
	}

	public boolean isEven() {
		if (iValue % 2 == 0) {
			return true;
		}
		return false;
	}


	public boolean isOdd() {
		if (iValue % 2 != 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isPrime() {
		int divisor = 2;
		for (divisor = 2; divisor <= iValue / 2; divisor++) {
			if (iValue % divisor == 0) {
				return false;
			} 
		}
		return true;
	}

	public static boolean isEven(int a) {
		if (a % 2 == 0) {
			return true;
		} else {
			return false;
		}

	}

	public static boolean isOdd(int a) {
		if (a % 2 != 0) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isPrime(int a) {
		int divisor = 2;
		for (divisor = 2; divisor <= a / 2; divisor++) {
			if (a % divisor == 0) {
				
				return false;
			} 
		}
		return true;
	}

	public static boolean isEven(MyInteger a) {
		
		return a.isEven();
	}

	public static boolean isOdd(MyInteger a) {
		return a.isOdd();
	}

	public static boolean isPrime(MyInteger a) {
		return a.isPrime();
	}

	public boolean equals(int a){
		if(iValue == a){
			return true;
		}
		else{
			return false;
		}	
	}

	public boolean equals(MyInteger a){
		return a.equals(iValue);
	}
	
	
}
