package metoda.trapezow;

public class MetodaApp {

	public static void main(String[] args) {
		double n=0;
		for(String arg : args) {
			n = Integer.parseInt(arg);
		}
		double startTime = System.nanoTime();
		metodaTrapezow(1, 14, n);
		double endTime = System.nanoTime();
		
		double duration = (endTime - startTime) / 1000000;
		System.out.println(duration + "ms");
		
	}
	
	public static double f(double x) {
		return Math.pow(x, 3) + 2*x - 1; 
	}
	public static double metodaTrapezow(double xp,double xk,double n) {
		double dx;
		double s = 0;
		dx = (xk-xp)/n;
		for(int i = 1; i < n; i++) {
			s += f(xp+i*dx);
		}
		return s = (s + (f(xp)+f(xk))/2)*dx;
	}

}
