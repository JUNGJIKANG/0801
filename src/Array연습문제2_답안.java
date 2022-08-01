
public class Array연습문제2_답안 {
	public static void main(String[] args) {
		int[]array={10,50,44,56,29,30,9,48,84,92};
		
		System.out.println("<출력>");
		System.out.println("배열원본=");
//		for(int su:array){
		System.out.println("내림차순 =");
//		}
		
		for(int i=0; i<array.length-1; i++) {
			for(int j=0; j<array.length-1; j++) {
				if(array[j]>array[j+1]) {
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
				System.out.print("오름차순=");
				for(int su:array) {
					System.out.printf("%d\t",su);
				}
			}
		}
		System.out.println("합계 =");
		System.out.println("평균 =");
		System.out.println("최대값 =");
		System.out.println("최소값 =");
	}
}



//전달받은 int형 배열에 대해 출력, 합계, 평균, 최대값, 최소값을 구하는 프로그램을 작성하기
//배열={10.50.44.56.29.30.9.48.84.92}
//배열원본=10.50.44.56.29.30.9.48.84.92
//내림차순 =
//오름차순 =
//합계=452
//평균=45.2
//최대값=92
//최소값=9