import java.util.Scanner;

public class chapter1_5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("나이를 입력하세요 >> ");
		int age = scanner.nextInt();
		int red = age / 10;
        int blue = (age % 10) / 5;
        int yellow = (age % 5);

        
        int total = red + blue + yellow;

        
        System.out.println("빨간 초 " + red + "개, 파란 초 " + blue + "개, 노란 초 " + yellow + "개.");
        System.out.println("총 " + total + "개가 필요합니다.");

        scanner.close();
	}

}
