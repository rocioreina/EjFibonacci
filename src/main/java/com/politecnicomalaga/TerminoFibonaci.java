package java.com.politecnicomalaga;

public class TerminoFibonaci {
	public int calcular(int termino){
		int fib[] = new int[30];
		fib[0] = 1;
		fib[1] = 1;
		for (int i = 2; i<=termino-1; i++)
			fib[i] = fib[i-1] + fib[i-2];
		return fib[termino-1];
	}
}
