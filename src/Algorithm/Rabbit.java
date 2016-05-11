/**
 * 小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少？ 1.程序分析：
 *       兔子的规律为数列1,1,2,3,5,8,13,21....
 */
package Algorithm;

/**
 * @author Ian
 * @date 2016年5月11日上午10:13:20 
 * 
 */
public class Rabbit {
	public static final int MONTH = 15;
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long f1 = 1l, f2 = 1l;
		long f;
		System.out.println("start");
		for (int i = 3; i < MONTH; i++) {
			f = f1 + f2;
			f1 = f2;
			f2 = f;
			System.out.println("第" + i + "个月的兔子对数：" + f2);
		}
		for (int i = 3; i < MONTH; i++) {
			System.out.println("第" + i + "个月的兔子对数：" + fib(i));
		}
	}
	public static int fib(int month) {
		if (month == 1 || month == 2)
			return 1;
		else
			return fib(month - 1) + fib(month - 2);
	}

}
