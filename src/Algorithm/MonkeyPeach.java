/**
 * 题目：海滩上有一堆桃子，五只猴子来分。第一只猴子把这堆桃子凭据分为五份，多了一个，这只猴子把多的一
 * 个扔入海中，拿走了一份。第二只猴子把剩下的桃子又平均分成五份，又多了一个，它同样把多的一个扔入海中 ，
 * 拿走了一份，第三、第四、第五只猴子都是这样做的，问海滩上原来最少有多少个桃子？
 */
package Algorithm;

/**
 * @author Ian
 * @date 2016年5月11日下午4:19:49
 */
public class MonkeyPeach {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int monkey = 0;
		int a = getPeach(monkey);
		System.out.println(a);

	}

	public static int getPeach(int monkey) {
		if (monkey < 5) {
			return (getPeach(monkey + 1) * 5 + 1);
		} else {
			return 1;
		}
	}

}
