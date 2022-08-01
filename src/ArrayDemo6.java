import java.util.Scanner;
// 주석 처리 된 내용은 Student Class로 이동되었음
public class ArrayDemo6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Student jikang=new Student();
		System.out.print("Name : "); jikang.name=sc.nextLine();
		System.out.print("Hakbun : "); jikang.hakbun=sc.nextLine();
		System.out.print("Korean : "); jikang.kor=sc.nextInt(); 
		System.out.print("English : "); jikang.eng=sc.nextInt();
		System.out.print("Math : "); jikang.mat=sc.nextInt();

		jikang.calcTot();
//		jikang.tot=jikang.kor+jikang.eng+jikang.mat;
		jikang.calcAvg();
//		jikang.avg=jikang.tot/3.;
		jikang.calcGrade();
//		jikang.grade=(jikang.avg<=100&&jikang.avg>=90)?'A':
//						(jikang.avg>=80)?'B':
//							(jikang.avg>=70)?'C':
//								(jikang.avg>=60)?'D':'F';
		
		jikang.display();
//		System.out.printf("%s(%s)\t%d\t%d\t%d\t%d\t%.2f\t%c\n", 
//				jikang.name,jikang.hakbun,jikang.kor,jikang.eng,jikang.mat,jikang.tot,jikang.avg,jikang.grade);
	}
}
