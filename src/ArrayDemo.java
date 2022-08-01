
public class ArrayDemo {
	public static void main(String[] args) {
//		int []array; //[]가 생기는 순간 주소변수 선언. 배열의 선언
//		array=new int[4]; //배열의 생성, 방 4개를 만들겠다는 의미.
//		array[0]=6;
//		array[1]=9;
//		array[2]=12;
//		array[3]=15; //할당(Assignmnet)
//
//		for(int i=0; i<4; i++) {
//			System.out.print("array의["+i+"]="+array[i]+"\t");
//		}
//		
//		System.out.println(array[3]);
		
//		double []weights; //선언(declation)
//		weights=new double[] {56.8, 48.5, 68.2}; //생성 및 할당(방의 수를 주지 않는다)
//		for(int i=0; i<3; i++) {
//			System.out.printf("array의[%d]=%.2f\t",i,weights[i]);
//		}

		char []grades= {'A', 'B', 'C', 'A'}; //생성 및 할당 한번에, 줄을 바꾸면 안된다.
		int i=0;
		while(i<4) {
			System.out.print("grades의 ["+i+"]의 값은"+grades[i]+"\t");
			i++;
		}
		
	}
}
