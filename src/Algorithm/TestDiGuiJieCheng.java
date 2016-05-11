/**
 *  题目：利用递归方法求5! 1.程序分析：递归公式：fn=fn_1*4!
 */
package Algorithm;

/**
 * @author Ian
 * @date 2016年5月11日上午10:44:10 
 */
public class TestDiGuiJieCheng {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = jieCheng(5);
		System.out.println(sum);

	}

	public static int jieCheng(int n) {
		if (n > 0)
			return jieCheng(n - 1) * n;
		else
			return 1;
	}
}
