/**
 * 
 */
package Algorithm;

/**
 * @author Ian
 * @date 2016年5月11日上午10:27:31 
 * 题目：猴子吃桃问题：猴子第一天摘下若干个桃子，当即吃了一半，还不瘾，又多吃了一个
 *       第二天早上又将剩下的桃子吃掉一半，又多吃了一个
 *       。以后每天早上都吃了前一天剩下的一半零一个。到第10天早上想再吃时，见只剩下一个桃子了。求第一天共摘了多少。
 *       1.程序分析：采取逆向思维的方法，从后往前推断。
 */
public class LingXing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 3, 6, 8, 6, 3, 1 };
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < arr[i]; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		for (int i = 4; i < arr.length; i++) {
			for (int j = arr[i]; j < 8; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < arr[i]; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
