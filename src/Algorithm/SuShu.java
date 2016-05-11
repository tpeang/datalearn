/**
 *  题目：求100之内的素数 
 */
package Algorithm;

/**
 * @author Ian
 * @date 2016年5月11日上午11:12:00
 */
public class SuShu {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 2; i < 100; i++) {
			for (int k = 2; k <= i; k++) {
				if (i % k == 0 && i != k) {
					break;
				}
				if (i % k == 0 && i == k) {
					System.out.println(i);
				}
			}
		}
//		int j = 0;
//		int flag = 0;
//		for (int i = 2; i < 100; i++) {
//			j = (int) (Math.sqrt(i));
//			for (int k = 2; k <= j; k++) {
//				if (i % k == 0) {
//					flag = 1;
//				}
//			}
//			if (flag == 0) {
//				System.out.println(i);
//			}
//			flag = 0;
//		}

	}

}
