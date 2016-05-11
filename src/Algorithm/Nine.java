/**
 *  题目：输出9*9口诀。 1.程序分析：分行与列考虑，共9行9列，i控制行，j控制列。
 */
package Algorithm;

/**
 * @author Ian
 * @date 2016年5月11日上午10:26:12 
 *
 */
public class Nine {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
			}
			System.out.println();
		}
	}

}
