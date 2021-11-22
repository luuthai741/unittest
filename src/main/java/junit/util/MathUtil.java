package junit.util;

public class MathUtil {
	private MathUtil() {
		throw new UnsupportedOperationException("Cannot create instance");
	}

	public static int divide(int a, int b) {
		if (a == 0 || b == 0) {
			throw new IllegalArgumentException("Cannot divide zero number");
		}
		if (a > b) {
			return a / b;
		}
		return b / a;
	}

	public static int sum(int a, int b) {
		return b + a;
	}

	public static int ucln(int a, int b) {
		if (a == 0) {
			return b;
		}
		if (b == 0) {
			return a;
		}
		if (a == b) {
			return a;
		}
		if (a > b) {
			return ucln(b, a % b);
		}
		return ucln(a, b % a);
	}

	public static int fibonaci(int n) {
		if (n <= 1) {
			return n;
		}
		return fibonaci(n - 1) + fibonaci(n - 2);
	}

	public static boolean checkGreaterThan(int a, int b) {
		return a > b;
	}
}
