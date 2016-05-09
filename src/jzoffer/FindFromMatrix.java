package jzoffer;

import org.junit.Test;

public class FindFromMatrix {

	private static int[][] sample = new int[][] { { 1, 2, 8, 9 },
			{ 2, 4, 9, 12 }, { 4, 7, 10, 13 }, { 6, 8, 11, 15 } };

	public static void printSample() {
		for (int i = 0; i < sample.length; i++) {
			for (int j = 0; j < sample[i].length; j++) {
				System.out.print(sample[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static boolean getValuefromMatrix(int[][] sample, int rows,
			int columns, int num) {
		boolean found = false;
		if (sample != null && rows > 0 && columns > 0) {
			int row = 0;
			int column = columns - 1;
			while (row < rows && column >= 0) {
				int tempValue = sample[row][column];
				if (num > tempValue) {
					++row;
				} else if (num < tempValue) {
					--column;
				} else {
					found = true;
					break;
				}
			}
		}

		return found;
	}

	@Test
	public void test() {
		printSample();
		System.out.println(getValuefromMatrix(sample, 4, 4, 7));
	}

	public static void main(String[] args) {
		printSample();
		System.out.println(getValuefromMatrix(sample, 4, 4, 7));

	}
}