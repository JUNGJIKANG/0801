import java.util.Scanner;

public class ArrayDemo2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
//		int []array=new int[4];
//		for(int i=0; i<3; i++) {
//			System.out.print(i+"번 째 방의 값 : ");
//			array[i]=sc.nextInt();
//		}
////			System.out.print(array); //입력하면 나오는 값 : [I@45c8e616 이것으로 보아 array는 주소가 들어있다는 것을 확인.
//		for(int i=0; i<3; i++) {
//			System.out.printf("array[%d]=%d\t",i,array[i]);
//		}
		Student []array=new Student[2]; //주소가 없어서 null번지로 출력 됨.
		for(int i=0; i<2; i++) {
			System.out.printf("array["+i+"]="+array[i]+"\t\n");
		}
		System.out.println("---------------------");
		array[0]=new Student();
		array[1]=new Student();
//		for(int i=0; i<2; i++) {
//			System.out.printf("array["+i+"]="+array[i]+"\t\n");
//		}
		for(int i=0; i<2; i++) {
			System.out.print(i+"번 째 학생의 이름:"); array[i].name=sc.nextLine();
			System.out.print(i+"번 째 학생의 나이:"); array[i].age=sc.nextInt();
			sc.nextLine();
		}
			for(int j=0; j<2; j++) {
				System.out.print("array["+j+"]의 이름은 : "+array[j].name+"\t");
				System.out.println("array["+j+"]의 나이는 : "+array[j].age);
			}
	}
}
