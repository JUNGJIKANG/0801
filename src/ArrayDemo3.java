
public class ArrayDemo3 {
	public static void main(String[] args) {
		//배열의 초기값
		//정수형 (정수형은 0을 초기화)
//		int []array=new int[4];
//		for(int i=0; i<array.length; i++) {
//			System.out.print("array["+i+"]="+array[i]+"\t");
//		}
		
//		//실수형 (실수형은 0.0으로 초기화)
//		double[]array=new double[4];
//		for(int i=0; i<array.length; i++) {
//		System.out.print("array["+i+"]="+array[i]+"\t");
//	}
		
		//문자형 (문자형의 초기값은 null값, '\0', '\u0000'
//		char[]array=new char[4];
//		for(int i=0; i<array.length; i++) {
//		System.out.print("array["+i+"]="+array[i]+"\t");
//	}
		//불린형 : false가 초기값
//		boolean[]array=new boolean[4];
//		for(int i=0; i<array.length; i++) {
//		System.out.print("array["+i+"]="+array[i]+"\t");
//	}
		//참조형 : 모든 참조형은 null번지로 초기화가 된다.
		String[]array=new String[4];
		for(int i=0; i<array.length; i++) {
		System.out.print("array["+i+"]="+array[i]+"\t");
	}
	}
}
