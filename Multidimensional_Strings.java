/*
 * Multidimensional_Strings.java
 */


public class Multidimensional_Strings {

	public static void main (String args[]) {

    // one-dimensional array
    int[] values = {3, 24, 12};
    System.out.println(values[2]);

    System.out.println(values[values.length - 1]);

    System.out.println("\nthis is new:\n");

    int[][] grid = {
        {3, 24, 12},
        {1, 2, 3, 4, 8, 111},
        {999}
        };

    for (int i = 0; i < grid.length; i++) {
            System.out.println(grid[i][0]);
    }

    String[][] texts = new String[2][3];

    texts[0][1] = "hi there!";
    System.out.println(texts[0][1]);

	}
}
