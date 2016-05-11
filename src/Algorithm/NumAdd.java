/**
 * 
 */
package Algorithm;

import java.util.Scanner;

/**
 * @author Ian
 * @date 2016年5月11日上午10:19:32
 *       题目：求s=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。例如2+22+222+2222+22222(此时共有5个数相加
 *       )， 几个数相加有键盘控制。 1.程序分析：关键是计算出每一项的值。
 */
public class NumAdd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入数字0-9：");
		int num = sc.nextInt();
		System.out.println("请输入数字重复次数：");
		int count = sc.nextInt();
		System.out.println("个数；" + count + ";数字：" + num);
		int sum = 0;

		for (int i = count; i > 0; i--) {
			sum += i * num * Math.pow(10, (count - i));
		}
		System.out.println("sum=" + sum);
		/*
		 * int suns = 0; for (int i = 1; i <= count; i++) { sum += num *
		 * Math.pow(10, (i - 1)); suns += sum; System.out.println(sum); }
		 * System.out.println(suns);
		 */
	}

}
