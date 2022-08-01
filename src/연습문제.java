import java.util.Scanner;

public class 연습문제 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("계산하실 초 : "); 
		int su=sc.nextInt();
		sc.nextLine();
		
		int hour=su/3600;
		int sec=su%3600;
		
		int min=sec/60;
		sec=sec%60;
		
		System.out.print(su+"초는"+hour+"시간"+min+"분"+sec+"초 입니다.");
	}
}
