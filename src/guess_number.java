import java.util.Scanner;

public class guess_number {
	public static void main(String[] args) {
		System.out.print("私が持っている数字はいくつでしょうか？ ");
		Integer guess = new Scanner(System.in).nextInt();
		
		System.out.println("あなたの予想: " + guess);
	}
}
