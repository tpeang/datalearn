/**
 * 题目：一个偶数总能表示为两个素数之和。
 */
package Algorithm;

import java.util.Scanner;

/**
 * @author Ian
 * @date 2016年5月11日下午4:20:53
 */
public class TestEven {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入一个偶数：");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int j = 0;
		int num2 = 0;
		int flag = 0;
		int tag = 0;
		int temp = 0;
		if (num % 2 != 0 || num == 0) {
			System.out.println("输入数据错误！");
		} else {
			for (int i = 3; i < num; i++) {
				j = (int) Math.sqrt(i);
				for (int k = 2; k <= j; k++) {
					if (i % k == 0) {
						flag = 1;
					}
				}
				if (flag == 0) {
					num2 = num - i;
					temp = (int) Math.sqrt(num2);
					for (int k = 2; k <= temp; k++) {
						if (num2 % k == 0) {
							tag = 1;
						}
					}
					if (tag == 0 && num2 >= 3) {
						System.out.println(num + "=" + i + "+" + num2);
					}
					tag = 0;
				}
				flag = 0;
			}
		}

	}

}
