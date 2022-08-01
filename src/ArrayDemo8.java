import java.util.Scanner;

public class ArrayDemo8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("제품의 갯수를 입력하세요 : ");	int count=sc.nextInt(); sc.nextLine();
		
		Product[]array=new Product[count];
		for(Product P:array) {
			P=new Product();
			System.out.print("이름은 무엇인가요 : "); P.name=sc.nextLine();
			System.out.print("가격은 얼마인가요 : "); P.price=sc.nextInt(); sc.nextLine();
			System.out.print("색상은 무엇인가요 : "); P.color=sc.nextLine();
			P.display();
		}
	}
}
