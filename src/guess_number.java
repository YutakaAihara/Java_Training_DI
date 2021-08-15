import java.util.Scanner;

public class guess_number {
	public static void main(String[] args) {
		Integer answer = 6;
		
		System.out.print("私が持っている数字はいくつでしょうか？ ");
		Integer guess = new Scanner(System.in).nextInt();
		
		if (answer == guess) {
			System.out.println("大正解！");
		} else {
			System.out.println("残念でしたww");
		}
	}
}
