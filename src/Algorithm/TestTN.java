/**
 * 
 */
package Algorithm;

/**
 * @author Ian
 * @date 2016年5月11日上午10:22:43
 * 题目：有1、2、3、4个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？
 *       1.程序分析：可填在百位、十位、个位的数字都是1、2、3、4。 组成所有的排列后再去 掉不满足条件的排列。
 */
public class TestTN {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0, b = 0, c = 0;
		int count = 1;
		for (a = 1; a < 5; a++) {
			for (b = 1; b < 5; b++) {
				for (c = 1; c < 5; c++) {
					if (a != b && a != c && b != c) {
						System.out.println("NO." + count + ":" + a + " " + b
								+ " " + c);
						count++;
					}
				}
			}
		}
	}

}
