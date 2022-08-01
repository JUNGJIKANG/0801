import java.util.Scanner;

public class 배열연습문제 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("넣으실 금액을 입력해주십시오 : ");
		int money=sc.nextInt();


//		int []array=new int[10];
		int []array = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
//		System.out.println("방 갯수 :"+array.length);
//		int mok=money/50000;
//		int na=money%50000;
//		mok=na/10000;
//		na=na%10000;
//		mok=na/5000;
//		na%5000;
		for(int i=0; i<array.length; i++) {
			int mok=money/array[i]; //몫
			int na=money%array[i]; //나머지
			System.out.println(array[i]+"원권:"+mok);
			money=na;
		}
		
		//배열을 2개, 값을 할당.
	}
}
