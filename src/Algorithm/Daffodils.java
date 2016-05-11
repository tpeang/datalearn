/**
 *  题目：打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，其各位数字立方和等于该数本身。
 *       例如：153是一个"水仙花数"，因为153=1的三次方＋5的三次方＋3的三次方。
 *       1.程序分析：利用for循环控制100-999个数，每个数分解出个位，十位，百位。

 */
package Algorithm;

/**
 * @author Ian
 * @date 2016年5月11日上午10:14:48 
 */
public class Daffodils {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j, k, h, data1;
		for (i = 100; i < 1000; i++) {
			j = i / 100;
			k = i % 100 / 10;
			h = i % 100 % 10;
			data1 = j * j * j + k * k * k + h * h * h;
			if (data1 == i) {
				System.out.println(data1);
			}
		}
		/*
		 * int a, b, c; int data; for (int ii = 100; ii < 999; ii++) { a = ii /
		 * 100; b = (ii - 100 * a) / 10; c = ii - 100 * a - 10 * b; data = a * a
		 * * a + b * b * b + c * c * c; if (data == ii) {
		 * System.out.println(data); } }
		 */
	}

}
