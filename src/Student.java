
public class Student {
	String name, hakbun; //멤버변수, instance
	int kor, eng, mat, tot;
	double avg;
	char grade;
	
	void calcTot() { //멤버
		tot=kor+eng+mat;
	}
	void calcAvg() {//멤버
		avg=tot/3.;
	}
	void calcGrade() {//멤버
		grade=(avg<=100&&avg>=90)?'A':
			(avg>=80)?'B':
				(avg>=70)?'C':
					(avg>=60)?'D':'F';

	}
	void display() {
		System.out.printf("%s(%s)\t%d\t%d\t%d\t%d\t%.2f\t%c\n", 
				name,hakbun,kor,eng,mat,tot,avg,grade);
	}
}
