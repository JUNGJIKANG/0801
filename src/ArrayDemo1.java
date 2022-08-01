
public class ArrayDemo1 {
	public static void main(String[] args) {
		Student []array; //배열 선언
		array=new Student[3]; //배열 생성
		array [0]=new Student(); //배열에 학생을 생성
		array [0].name = "정지강";
		array [0].age = 26;
		
		array [1]=new Student(); 
		array[1].name="Mount";
		array[1].age=52;

		array [2]=new Student(); 
		array[2].name="Lewandovski";
		array[2].age=98;
		
		for(int i=0; i<3; i++) {
			System.out.printf("이름=%s, 나이=%d\n",array[i].name,array[i].age);
		}
		//평균나이
//		int sum=array[0].age+array[1].age+array[2].age;
		int sum=0;
		for(int i=0; i<3; i++) {
			sum+=array[i].age;
		}
		System.out.println(sum/3);
	}
}
