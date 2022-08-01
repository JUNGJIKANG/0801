
public class ArrayDemo4 {
	public static void main(String[] args) {
		Product []array=new Product[3];
		for(int i=0; i<array.length; i++) {
			array[i]=new Product();
		}
			array[0].name="pencil"; array[0].price=1000; array[0].color="black"; 
			array[1].name="mouse"; array[1].price=5000; array[1].color="White";
			array[2].name="keyboard"; array[2].price=12000; array[2].color="yellow";
			for(int i=0; i<array.length; i++) {
				System.out.println((i+1)+"번 째 상품 설명");
				System.out.println("name : "+array[i].name);
				System.out.println("price : "+array[i].price);
				System.out.println("color : "+array[i].color);
			}
	}
}
