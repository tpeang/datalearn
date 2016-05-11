/**
 * 题目：输入两个正整数m和n，求其最大公约数和最小公倍数。 1.程序分析：利用辗除法。
 */
package Algorithm;

/**
 * @author Ian
 * @date 2016年5月11日上午10:17:41 
 * 
 */
public class ComonDivisor {
	public static int s1 = 56;
	public static int s2 = 64;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = s1, b = s2;

		if (a < b) {
			int temp = a;
			a = b;
			b = temp;
		}
		while (b != 0) {
			int t = a % b;
			a = b;
			b = t;
		}
		System.out.println("最大公约数：" + a);
		System.out.println("最大公倍数：" + s1 * s2 / a);
	}

}
