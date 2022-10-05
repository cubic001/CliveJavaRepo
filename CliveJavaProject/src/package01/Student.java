package package01;

public class Student {
	
	String name;	// non-static (instance) variable
	int age;		// non-static (instance) variable
	
	// non-static (instance) method
	void introduce() {
		System.out.println( "My name is " + name + ", and I'm " + age + " years old.");
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
