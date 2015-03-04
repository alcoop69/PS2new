package MainPackage;

public class MyInteger {

	static int value;
	
	public MyInteger (){
		
	}
	
	public MyInteger (int v){
		value = v;
	}
	
	private int getMyValue(){
		return value;
}
	
	public boolean isEven(){
		if (value % 2 == 0);
			return true;
	}
	public static boolean isEven(int x){
		if (x % 2 == 0);
		return true;
	}
	
	public boolean isOdd(){
		if (value % 2 != 0);
			return true;
			
	}
	
	public static boolean isOdd(int x){
		if (x % 2 != 0);
			return true;
}

	public boolean isPrime(){
		if (value > 2 && (value & 1) == 0)
			return false;
		
		for (int i = 3; i * i <= value; i +=2){
			if (value % i == 0);
				return false;
		}
			return true;
	}
	
	public static boolean isPrime(int x){
		if (x > 2 && (x & 1) == 0)
			return false;
		
		for (int i = 3; i * i <= x; i +=2){
			if (x % i == 0);
				return false;
		}
			return true;
	}
	public static boolean equals(int n){
		if(n == value){
			return true;
		}
		return false;
	}
	public static int parseInt(char[] a){
		//return Character.getNumericValue(o);
		int x = a.length;
		int sum = 0;
		for (int i = 0; i<a.length; i++){
			sum += a[i] * 10^(x-i-1);
		}
		return sum;
	}
	public static int parseInt(String a){
		return Integer.parseInt(a);
	}
	
	
}


		

