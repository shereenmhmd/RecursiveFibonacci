import java.util.HashMap;

public class RecursiveFibonacci {

	static private HashMap<Integer, Integer> cache = new HashMap<Integer, Integer>();

	public static void main(String[] args) {
		// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584,
		// 4181, 6765, 10946,
		System.out.println("fibonacci of 10 = " + febRecursion(10));
		System.out.println("fibonacci of 7 = " + febRecursion(7));
		System.out.println("fibonacci of 7 " + febRecursion(5));

	}

	static int febRecursion(int n) {
		Integer result;
		if (cache.containsKey(n)) {
			return cache.get(n);

		}

		if (n == 1 || n == 2)
			return 1;
		else {
			result = febRecursion(n - 1) + febRecursion(n - 2);
			cache.put(n, result);
		}
		return result;
	}

}
