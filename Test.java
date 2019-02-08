
public class Test {
		public static void main(String args[]){
		Manager m = new Manager("John Doe", "Department Head", 100000.0, 54,
		31, "PhD", 5000.0);
		Employee e1 = new Employee("Jane Doe", "Resource Analyst", 75000.0,
		41);
		Employee e2 = new Employee("Jim Doe", "Engineer", 85000.0, 45);
		System.out.println("Name : " + m.getName());
		System.out.println("Title : " + m.getTitle());
		System.out.println("Age : " + m.getAge());
		System.out.println("Years of Experience : " +
		m.getExperience());
		System.out.println("Highest Degree Earned : " + m.getDegree());
		System.out.println("Salary : " + m.getSalary());
		System.out.println("Promotion Bonus : " + m.getBonus());
		m.raiseSalary(10);
		System.out.println("Salary Raised!");
		System.out.println("New Salary : " + m.getSalary());
		System.out.println("\n");
		System.out.println("Name : " + e1.getName());
		System.out.println("Title : " + e1.getTitle());
		System.out.println("Age : " + e1.getAge());
		System.out.println("Salary : " + e1.getSalary());
		e1.raiseSalary(10);
		System.out.println("Salary Raised");
		System.out.println("New Salary : " + e1.getSalary());
		System.out.println("\n");
		System.out.println("Name : " + e2.getName());
		System.out.println("Title : " + e2.getTitle());
		System.out.println("Age : " + e2.getAge());
		System.out.println("Salary : " + e2.getSalary());
		e2.raiseSalary(10,1);
		System.out.println("Salary Raised");
		System.out.println("New Salary : " + e2.getSalary());
}
}
