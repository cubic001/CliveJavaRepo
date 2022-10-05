package package01;

public class AYStudent {
	
	String name;	// non-static (instance) variable
	int age;		// non-static (instance) variable
	double score;
	static String schoolName = "AY Jackson HS";
	static AYStudent principalAwardWinner = null;
	
	// static method
	static void getSchoolIntroduction() {
//		return "This is " + schoolName + ", there is a student whose name is " + name; // cannot access non-static field "name"
		System.out.println("This is " + schoolName + 
				". This year's Principal Award winner goes " + 
				principalAwardWinner.name +
				", who has achieved the term average of " + principalAwardWinner.score);
		
	}
	
	void grantPrincipalAward() {
		principalAwardWinner = this;
	}
	
	// non-static (instance) method
	void introduce() {
		System.out.println( "My name is " + name + ", and I'm " + age + " years old.");
		System.out.println("I am a student from " + schoolName);
	}
	
	// non-static (instance) method
	void count(int n) {
		int i = 0;	// local variable
		while (i < n) {
			System.out.println(i++);
		}
	}
	
	// non-static (instance) method
	int sum(int n) {
		int total = 0;	// local variable
		for (int i = 0; i <= n; i ++) {
			total += i;
		}
		return total;
	}

}
