
public class Array연습문제1 {
	public static void main(String[] args) {
		int[]array={10,50,44,56,29,30,9,48,84,92};
		int[]original=array;
		
		for(int su:original) {
			System.out.print(su+"\t");
		}
		System.out.println();
		int sum=0, max=array[0], min=array[0];
		for(int i=0; i<array.length; i++) {
			sum+=array[i];
			if(max<array[i]) max=array[i];
			if(min>array[i]) min=array[i];
		}		
		System.out.print("원본=");
		for(int su:original) {
			System.out.print(su+"\t");
		}
		System.out.println();
		System.out.println("합계="+sum);
		System.out.println("평균="+(double)(sum/array.length));
		System.out.println("최대값="+max);
		System.out.println("최소값="+min);
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