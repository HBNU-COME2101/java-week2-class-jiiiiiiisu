import java.util.Scanner;

public class chatper1_4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("여행지 >> ");
		String destination = scanner.nextLine();

        System.out.print("인원수 >> ");
        int people = scanner.nextInt();

        System.out.print("숙박일 >> ");
        int nights = scanner.nextInt();

        System.out.print("1인당 항공료 >> ");
        int airfare = scanner.nextInt();

        System.out.print("1방 숙박비 >> ");
        int roomCost = scanner.nextInt();

        
        int rooms = (people + 1) / 2;

        
        int totalCost = (people * airfare) + (rooms * roomCost * nights);

        
        System.out.println(people + "명의 " + destination + " " + nights + "박 " + (nights + 1) + "일 여행에는 "
                           + rooms + "개 방이 필요하며 경비는 " + totalCost + "원입니다.");

        scanner.close();

	}

}
