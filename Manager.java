
public class Manager extends Employee {
	
	private int yearsWorked;
	private String highestDegree;
	private double promotionBonus;
	
	public Manager(String name, String title, double salary, int age, int experience, String degree, double bonus) {
		super(name, title, salary, age);
		yearsWorked = experience;
		highestDegree = degree;
		promotionBonus = bonus;
	}
	
	public int getExperience() {
		return yearsWorked;
	}
	
	public String getDegree() {
		return highestDegree;
	}
	
	public double getBonus() {
		return promotionBonus;
	}
	
	public void raiseSalary(int percent) {
		mySalary = mySalary + 0.95 * percent * 0.01 * mySalary + promotionBonus;
	}
}
