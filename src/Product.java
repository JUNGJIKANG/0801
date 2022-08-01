//멤버 변수와 멤버 메소드는 반드시 주소로 접근한다.
// 주소는 반드시 new할 때 생성된다.
public class Product {
	String name, color; //멤버변수, 인스턴스 변수
	int price;
	
	void display() { //멤버변수
		System.out.printf("이름=%s,\t가격=%d,\t색상=%s\n",name,price,color);
	}
}
