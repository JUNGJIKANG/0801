//소팅 알고리즘
import java.util.Scanner;

public class ArrayDemo9 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		double []original= {78.2, 56.9, 43.5};
//		double []target= {172.8, 185.4, 162.9, 153.2};
//		
//		target[0]=original[1]; //값복사
//		target=original; //배열의 복사는 주소복사이다.
		
		//값복사 상호변경
//		int original=5, target=9;
//		System.out.println("Befor Swapping");
//		System.out.printf("original=%d, target=%d\n",original,target);
//
//		int temp=original; original=target; target=temp; //값복사
//		System.out.println("After Swapping");
//		System.out.printf("original=%d, target=%d\n",original,target);
		
		//주소복사 상호변경
//		Product pencil=new Product();
//		pencil.name="연필"; pencil.price=1200; pencil.color="검정";
//		Product mouse=new Product();
//		mouse.name="마우스"; mouse.price=5000; mouse.color="흰색";
//		System.out.println("Before Swapping");
//		pencil.display(); mouse.display();
//		
//		Product temp=pencil; pencil=mouse; mouse=temp;
//		System.out.println("After Swapping");
//		pencil.display(); mouse.display();
		
		//Burbble Sorting
		int[]original= {4,6,2,3,5,2,5,8,6,7,9,8,5};
		System.out.println("Before Sorting");
		for(int su:original) {
			System.out.printf("%d\t",su);
		}
		for(int i=0; i<original.length-1; i++) {
			for(int j=0; j<original.length-1; j++) {
				if(original[j]>original[j+1]) {
					int temp=original[j];
					original[j]=original[j+1];
					original[j+1]=temp;
				}
				System.out.println();
				System.out.println("After Sorting");
				for(int su:original) {
					System.out.printf("%d\t",su);
				}
			}
		}
	}
}
