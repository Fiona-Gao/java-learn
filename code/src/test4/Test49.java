package test4;

public class Test49 {
	
	public static void main(String[] args) {
		Fibonacci fibon = new Fibonacci();
		int[] fib = fibon.generateF(10);
		for(int i = 0; i < 10; i++){
			System.out.println(fib[i]);
		}

	}

}

class Fibonacci{
	public int[] generateF(int i){
		int[] fib = new int[i];
		fib[0] = 1;
		fib[1] = 1;
		for(int j = 2; j < i; j++){
			fib[j] = fib[j-1] + fib[j-2];
		}
		return fib;		
	}
}