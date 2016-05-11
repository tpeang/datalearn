/**
 *  题目：一球从100米高度自由落下，每次落地后反跳回原高度的一半；
 *     再落下，求它在第10次落地时，共经过多少米？第10次反弹多高？
 */
package Algorithm;

/**
 * @author Ian
 * @date 2016年5月11日上午10:21:11 
 */
public class TestBall {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 100;
		double sum = 100;
		for (int i = 2; i <= 10; i++) {
			a = a * 0.5;
			sum += a * 2;
		}
		System.out.println("a=" + a);
		System.out.println("sum=" + sum);
	}

}
