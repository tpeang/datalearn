/**
 * 题目：给一个不多于5位的正整数，要求：一、求它是几位数，二、逆序打印出各位数字。
 */
package Algorithm;

import java.util.Scanner;

/**
 * @author Ian
 * @date 2016年5月11日上午11:03:11
 *
 */
public class TestNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入一个正整数：");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] a = new int[5];
		int b = 0;
		int n = 0;
		for (int i = 4; i >= 0; i--) {
			b = (int) Math.pow(10, i);
			if (num / b != 0 && i >= n) {
				n = i + 1; // 位数=最高位+1
			}
			a[i] = num / b;
			num = num - a[i] * b;
		}
		System.out.println("位数：" + n);
		for (int j = 0; j < n; j++) {
			if (a[j] != -1) {
				System.out.print(a[j] + "\t");
			}
		}
		System.out.println("");
		// test();
	}
	//另一种简单方法
    /*
    public static void test(){
        System.out.println("请输入一个正整数：");
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        int numLength = num.length();
        System.out.println("位数："+numLength);
        for(int i = numLength-1; i>=0;i--){
            System.out.print(num.charAt(i)+"\t");
        }
    }
    */


}
