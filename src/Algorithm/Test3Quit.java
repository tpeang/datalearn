/**
 *  题目：有n个人围成一圈，顺序排号。从第一个人开始报数（从1到3报数），
 *  凡报到3的人退出圈子， 问最后留下 的是原来第几号的那位。
 */
package Algorithm;

import java.util.Scanner;

/**
 * @author Ian
 * @date 2016年5月11日下午4:16:52
 */
public class Test3Quit {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入n：");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int i = 0;
		int t = 0;
		while (n > 1) {
			if (a[i] == 0) {
				t++;
				if (t == 3) {
					t = 0;
					a[i] = 1;
					n--;
				}
			}
			i++;
			if (i == a.length) {
				i = 0;
			}
		}
		for (int j = 0; j < a.length; j++) {
			if (a[j] != 1) {
				System.out.println(j + 1);
			}
		}

	}

}
