package fibaco;

public class Array_demmo {

	public static void main(String[] args) {

		int[] a = { 6,3,10, 20, 100, 40, 50, 60, 110, 80, 90 };
    
		int j=6;
		int max = a[j];
		int length = a.length - 1;
		System.out.println(length);
		for (int i = 0; i < a.length; i++) {

			if (a[i] > max) {
				max = a[i];

			}

		}
		System.out.println(max);

	}

}
