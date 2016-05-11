/**
 * 
 */
package Algorithm;

/**
 * @author Ian
 * @date 2016年5月11日上午9:58:45
 *       题目：有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13...求出这个数列的前20项之和。
 *       1.程序分析：请抓住分子与分母的变化规律。
 */
public class TestAdd2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[20];
		int[] b = new int[20];
		double sum = 0.0;
		a[0] = 2;
		a[1] = 3;
		b[0] = 1;
		b[1] = 2;
		for (int i = 2; i < a.length; i++) {
			a[i] = a[i - 1] + a[i - 2];
			b[i] = b[i - 1] + b[i - 2];
		}
		for (int j = 0; j < 20; j++) {
			sum += a[j] / b[j];
		}
		System.out.println(sum);
	}
}
