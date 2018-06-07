package cn.com.taiji.lambda;

public class Lanbda {
	public static void main(String[] args) {

		double d1 = intergrate(x -> x, 10, 100, 10000);
		System.out.println(d1);
		double d2 = intergrate(x -> x * x, 10, 100, 1000);
		System.out.println(d2);
		double d3 = intergrate(x -> Math.pow(x, 3), 10, 100, 10000);
		System.out.println(d3);
		double d4 = intergrate(Math::sin, 10, 100, 1000);
		System.out.println(d4);
	}

	public static double intergrate(Intergrable func, double a, double b, int numSlices) {

		if (numSlices < 1)
			numSlices = 1;
		double delta = (b - a) / numSlices;
		double start = a + delta / 2.0;
		double sum = 0.0;
		for (int i = 0; i < numSlices; i++) {
			sum += delta * func.eveal(start + delta * i);
		}

		return sum;

	}
}
