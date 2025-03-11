import java.util.Scanner;

public class chapter1_6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        
        System.out.print("(x1, y1), (x2, y2)의 좌표 입력 >> ");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();
        scanner.close();

        
        int left = Math.min(x1, x2);
        int right = Math.max(x1, x2);
        int top = Math.min(y1, y2);
        int bottom = Math.max(y1, y2);

        
        if (left >= 10 && right <= 200 && top >= 10 && bottom <= 300) {
            System.out.printf("(%d,%d), (%d, %d) 사각형은 (10, 10) (200, 300) 사각형에 포함된다.%n",
                    x1, y1, x2, y2);
        } else {
            System.out.printf("(%d,%d), (%d, %d) 사각형은 (10, 10) (200, 300) 사각형에 포함되지 않는다.%n",
                    x1, y1, x2, y2);
        }
	}

}
