package dataLearn;

import java.util.Scanner;

public class Algorithm51 {
	public static final int MONTH = 15;
	public static int NUM = 198;

	public static int s1 = 56;
	public static int s2 = 64;

	// 兔子问题
	public static void rabbit() {
		/**
		 * 兔子问题 斐波那契数列求值
		 * 
		 * @author tonylp 题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，
		 *         小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少？ 1.程序分析：
		 *         兔子的规律为数列1,1,2,3,5,8,13,21....
		 */
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

	// 水仙花
	public static void daffodils() {
		/**
		 * 题目：打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，其各位数字立方和等于该数本身。
		 * 例如：153是一个"水仙花数"，因为153=1的三次方＋5的三次方＋3的三次方。
		 * 1.程序分析：利用for循环控制100-999个数，每个数分解出个位，十位，百位。
		 * 
		 */
		int i, j, k, h, data1;
		for (i = 100; i < 1000; i++) {
			j = i / 100;
			k = i % 100 / 10;
			h = i % 100 % 10;
			data1 = j * j * j + k * k * k + h * h * h;
			if (data1 == i) {
				System.out.println(data1);
			}
		}
		/*
		 * int a, b, c; int data; for (int ii = 100; ii < 999; ii++) { a = ii /
		 * 100; b = (ii - 100 * a) / 10; c = ii - 100 * a - 10 * b; data = a * a
		 * * a + b * b * b + c * c * c; if (data == ii) {
		 * System.out.println(data); } }
		 */

	}

	// 任意整数分解
	public static void resolveNum() {
		// TODO Auto-generated method stub
		/**
		 * 任意整数分解 题目：将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5。
		 * 程序分析：对n进行分解质因数，应先找到一个最小的质数k，然后按下述步骤完成：
		 * (1)如果这个质数恰等于n，则说明分解质因数的过程已经结束，打印出即可。
		 * (2)如果n>k，但n能被k整除，则应打印出k的值，并用n除以k的商,作为新的正整数你n,重复执行第一步。
		 * (3)如果n不能被k整除，则用k+1作为k的值,重复执行第一步。
		 * 
		 */
		int num = NUM;
		int k = 2;
		while (num > k) {
			if (num % k == 0) {
				System.out.print(k + "*");
				num = num / k;
			} else {
				k++;
			}
		}
		System.out.println(k);
	}

	public static void ComonDivisor() {
		// TODO Auto-generated constructor stub
		/**
		 * 题目：输入两个正整数m和n，求其最大公约数和最小公倍数。 1.程序分析：利用辗除法。
		 * 
		 * @author tonylp
		 */

		int a = s1, b = s2;

		if (a < b) {
			int temp = a;
			a = b;
			b = temp;
		}
		while (b != 0) {
			int t = a % b;
			a = b;
			b = t;
		}
		System.out.println("最大公约数：" + a);
		System.out.println("最大公倍数：" + s1 * s2 / a);
	}

	// 测试字符
	public static void strIdentify() {
		/**
		 * 题目：输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。 1.程序分析：利用while语句,条件为输入的字符不为'\n'.
		 * 
		 */
		int abcCount = 0;
		int spaceCount = 0;
		int numCount = 0;
		int otherCount = 0;
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (Character.isDigit(ch[i])) {
				numCount++;
			} else if (Character.isSpaceChar(ch[i])) {
				spaceCount++;
			} else if (Character.isLetter(ch[i])) {
				abcCount++;
			} else {
				otherCount++;
			}
		}
		System.out.println("字母个数" + abcCount);
		System.out.println("数字个数" + numCount);
		System.out.println("空格个数" + spaceCount);
		System.out.println("其他字符个数" + otherCount);
	}

	public static void numAdd() {
		/**
		 * 题目：求s=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。例如2+22+222+2222+22222(此时共有5个数相加
		 * )， 几个数相加有键盘控制。 1.程序分析：关键是计算出每一项的值。
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入数字0-9：");
		int num = sc.nextInt();
		System.out.println("请输入数字重复次数：");
		int count = sc.nextInt();
		System.out.println("个数；" + count + ";数字：" + num);
		int sum = 0;

		for (int i = count; i > 0; i--) {
			sum += i * num * Math.pow(10, (count - i));
		}
		System.out.println("sum=" + sum);
		/*
		 * int suns = 0; for (int i = 1; i <= count; i++) { sum += num *
		 * Math.pow(10, (i - 1)); suns += sum; System.out.println(sum); }
		 * System.out.println(suns);
		 */
	}

	public static void wanShu() {
		/**
		 * 题目：一个数如果恰好等于它的因子之和，这个数就称为"完数"。 例如6=1＋2＋3.编程 找出1000以内的所有完数。
		 * 
		 */
		int k = 2;
		int num = 0;
		int temp = 1;
		int j = 0;
		for (num = 1; num <= 1000; num++) {
			k = 2;
			temp = 1;
			j = num;
			while (j >= k) {
				if (j % k == 0) {
					temp += k;
					j = j / k;
				} else {
					k++;
				}
			}
			if (temp == num) {
				System.out.println(temp);
			}

		}
	}

	public static void testBall() {
		/**
		 * 题目：一球从100米高度自由落下，每次落地后反跳回原高度的一半； 再落下，求它在第10次落地时，共经过多少米？第10次反弹多高？
		 */
		double a = 100;
		double sum = 100;
		for (int i = 2; i <= 10; i++) {
			a = a * 0.5;
			sum += a * 2;
		}
		System.out.println("a=" + a);
		System.out.println("sum=" + sum);
	}

	public static void testTN() {
		/**
		 * 题目：有1、2、3、4个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？
		 * 1.程序分析：可填在百位、十位、个位的数字都是1、2、3、4。 组成所有的排列后再去 掉不满足条件的排列。
		 *
		 */

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

	public static void moneyAward() {
		/**
		 * 题目：企业发放的奖金根据利润提成。 利润(I)低于或等于10万元时，奖金可提10%；
		 * 利润高于10万元，低于20万元时，低于10万元的部分按10%提成，
		 * 高于10万元的部分，可可提成7.5%；20万到40万之间时，高于20万元的部分，可提成5%；
		 * 40万到60万之间时高于40万元的部分，可提成3%； 60万到100万之间时，高于60万元的部分，可提成1.5%，
		 * 高于100万元时，超过100万元的部分按1%提成，从键盘输入当月利润I，求应发放奖金总数？
		 * 1.程序分析：请利用数轴来分界，定位。注意定义时需把奖金定义成长整型。
		 *
		 */

		double rate1 = 0.1, rate2 = 0.075, rate3 = 0.05, rate4 = 0.03, rate5 = 0.014, rate6 = 0.01;
		long reward = 0;
		System.out.println("请输入利润：");
		Scanner sc = new Scanner(System.in);
		long money = sc.nextLong();
		if (money >= 0 && money <= 100000) {
			reward = (long) (money * rate1);
		} else if (money <= 200000) {
			reward = (long) (100000 * rate1 + (money - 100000) * rate2);
		} else if (money <= 400000) {
			reward = (long) (100000 * rate1 + 100000 * rate2 + (money - 200000)
					* rate3);
		} else if (money <= 600000) {
			reward = (long) (10000 * rate1 + 100000 * rate2 + 200000 * rate3 + (money - 400000)
					* rate4);
		} else if (money <= 1000000) {
			reward = (long) (10000 * rate1 + 100000 * rate2 + 200000 * rate3
					+ 200000 * rate4 + (money - 6000000) * rate5);
		} else {
			reward = (long) (10000 * rate1 + 100000 * rate2 + 200000 * rate3
					+ 200000 * rate4 + 400000 * rate5 + (money - 1000000)
					* rate6);
		}
		System.out.println("奖金为：" + reward);
	}
	
	public static void testDay(){
		/**
		 * 题目：输入某年某月某日，判断这一天是这一年的第几天？ 1.程序分析：以3月5日为例，应该先把前两个月的加起来， 然后再加上5天即本年的第几天，
		 * 特殊情况，闰年且输入月份大于3时需考虑多加一天。
		 * 
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("请输入年：");
		int year = sc.nextInt();
		System.out.println("请输入月：");
		int month = sc.nextInt();
		System.out.println("请输入日：");
		int day = sc.nextInt();
		int[] n = {31,28,31,30,31,30,31,30,31,30,31,30};
		if(year%400==0||(year%4==0&&year%100!=0)){
			n[1]=29;
		}
		//System.out.println(n[1]);
		int date=0;
		for(int i =0;i<month-1;i++){
			date+=n[i];
		}
		date  +=day;
		System.out.println(date);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// rabbit();
		// ComonDivisor();
		// daffodils();
		// resolveNum();
		// strIdentify();
		// numAdd();
		// wanShu();
		// testBall();
//		testTN();
		//moneyAward();
		testDay();
	}

}
