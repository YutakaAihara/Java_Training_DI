import java.util.Random;
import java.util.Scanner;

public class guess_number {
	public static void main(String[] args) {
		Integer answer = new Random().nextInt(10) +1;
		Integer count = 0;
		
		while (true) {
			System.out.print("私が持っている数字はいくつでしょうか？ ");
			Integer guess = new Scanner(System.in).nextInt();
			count++;
			
			if (answer == guess) {
				System.out.println("大正解！ " + count + " 回で正解できました！");
				break;
			}else if (answer > guess) {
				System.out.println("もっと大きい数字です！");
			} else {
				System.out.println("もっと小さい数字です！");
			}
		}
	}
}
