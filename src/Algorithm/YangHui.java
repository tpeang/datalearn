/**
 * 题目：打印出杨辉三角形（要求打印出10行如下图） 
1.程序分析： 
     1
    1 1
   1 2 1
  1 3 3 1
 1 4 6 4 1
1 5 10 10 5 1
 1.程序分析： 1 1 1 1 2 1 1 3 3 1 1 4 6 4 1 1 5 10 10 5 1
 现在打印出的格式不是很好看。

 */
package Algorithm;

import java.util.Scanner;

/**
 * @author Ian
 * @date 2016年5月11日下午4:17:26
 */
public class YangHui {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请输入行数：");
		Scanner sc = new Scanner(System.in);
		int line = sc.nextInt();
		int[] a = new int[line];
		for (int i = 0; i < line; i++) {
			a[i] = 1;
		}
		if (line == 1) {
			System.out.println(1);
		} else if (line == 2) {
			System.out.println(1);
			System.out.println(1 + "\t" + 1);
		} else {
			System.out.println(1);
			System.out.println(1 + "\t" + 1);
			for (int i = 1; i < line - 1; i++) {
				for (int j = i; j >= 1; j--) {
					a[j] = a[j] + a[j - 1];
				}
				for (int k = 0; k < i + 2; k++) {
					System.out.print(a[k] + "\t");
				}
				System.out.println();
			}
		}

	}

}
