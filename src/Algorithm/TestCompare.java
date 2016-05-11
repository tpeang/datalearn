/**
 * 
 */
package Algorithm;

import java.util.Scanner;

/**
 * @author Ian
 * @date 2016年5月11日上午10:25:23 
 * 题目：输入三个整数x,y,z，请把这三个数由小到大输出。
 *       1.程序分析：我们想办法把最小的数放到x上， 先将x与y进行比较，如果x>y则将x与y的值进行交换，
 *       然后再用x与z进行比较，如果x>z则将x与z的值进行交换，这样能使x最小。
 */
public class TestCompare {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入第一个数：");
		int x = sc.nextInt();
		System.out.println("请输入第二个数：");
		int y = sc.nextInt();
		System.out.println("请输入第三个数：");
		int z = sc.nextInt();
		int temp;
		if (x > y) {
			temp = x;
			x = y;
			y = temp;
		}
		if (x > z) {
			temp = x;
			x = z;
			z = temp;
		}
		if (y > z) {
			temp = y;
			y = z;
			z = temp;
			;
		}
		System.out.println(x + "<" + y + "<" + z);
	}

}
