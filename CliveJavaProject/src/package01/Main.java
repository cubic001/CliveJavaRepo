package package01;

public class Main {

	public static void main(String[] args) {
		
//		Student s1 = new Student();
//		s1.name = "Clive";
//		s1.age = 15;
//		s1.introduce();
//		s1.count(s1.age);
		
		
		// 8 primitive types: int, long, short, double, float, boolean, byte, char
		int number = 10;

		// AYStudent is a custom type, which is a Class
		AYStudent student1 = new AYStudent();
		student1.name = "Clive";
		student1.age = 16;
		student1.score = 99.3;
		
		AYStudent student2 = new AYStudent();
		student2.name = "John";
		student2.age = 16;
		student2.score = 82.6;
		
//		student2.schoolName = "A.Y. Jackson High School";
		AYStudent.schoolName = "A.Y. Jackson High School";
		
		
		student1.introduce();
		student2.introduce();
		
		// either ways we can grant the award.
		student1.grantPrincipalAward();
//		AYStudent.principalAwardWinner = student1;
		
		AYStudent.getSchoolIntroduction();

	}

}
