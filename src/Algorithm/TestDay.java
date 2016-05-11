/**
 * 
 */
package Algorithm;

import java.util.Scanner;

/**
 * @author Ian
 * @date 2016年5月11日上午10:24:30 
 * 题目：输入某年某月某日，判断这一天是这一年的第几天？
 *       1.程序分析：以3月5日为例，应该先把前两个月的加起来， 然后再加上5天即本年的第几天， 特殊情况，闰年且输入月份大于3时需考虑多加一天。
 */
public class TestDay {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入年：");
		int year = sc.nextInt();
		System.out.println("请输入月：");
		int month = sc.nextInt();
		System.out.println("请输入日：");
		int day = sc.nextInt();
		int[] n = { 31, 28, 31, 30, 31, 30, 31, 30, 31, 30, 31, 30 };
		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
			n[1] = 29;
		}
		// System.out.println(n[1]);
		int date = 0;
		for (int i = 0; i < month - 1; i++) {
			date += n[i];
		}
		date += day;
		System.out.println(date);
	}

}
