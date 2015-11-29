/*
 * Arrays.java
 */


public class Arrays {

	public static void main (String args[]) {

        int value = 7;  // creates a value

        int[] values;   // creates a reference

        values = new int[4];

        values[0] = 1;
        values[1] = 10;
        values[2] = 11;
        values[3] = 100;
        // values[3] = 101;    // doesn't crash at compiling, but at running!

        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }

        int[] numbers = {1, 1, 2, 3, 5, 8, 13, 21};

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

	}
}
