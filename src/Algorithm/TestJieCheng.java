/**
 *  题目：求1+2!+3!+...+20!的和 
 * 1.程序分析：此程序只是把累加变成了累乘。
 */
package Algorithm;

/**
 * @author Ian
 * @date 2016年5月11日上午10:32:46
 */
public class TestJieCheng {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;
		int data = 1;
		for (int i = 1; i <= 20; i++) {
			data = data * i;
			sum += data;
		}
		System.out.println(sum);

	}

}
