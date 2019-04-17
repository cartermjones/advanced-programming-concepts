
public class Student {

	private String name;
	private String HW1, HW2, HW3, midterm, project, finalGrade;
	private static int A, B, C, D, F;
	
	public Student(String name, String HW1, String HW2, String HW3, String midterm,  String project,  String finalGrade) {
		this.name = name;
		this.HW1 = HW1;
		this.HW2 = HW2;
		this.HW3 = HW3;
		this.midterm = midterm;
		this.project = project;
		this.finalGrade = finalGrade;
	}
	
	public String getName() {
		return name;
	}
	
	public String getHW1() {
		return HW1;
	}
	
	public String getHW2() {
		return HW2;
	}
	
	public String getHW3() {
		return HW3;
	}
	
	public String getMidterm() {
		return midterm;
	}
	
	public String getProject() {
		return project;
	}
	
	public String getFinalGrade() {
		return finalGrade;
	}
	
	public String getProperty(int j) {
		String value = new String();
		
		switch(j) {
			case 0:
				value = name;
				break;
			case 1:
				value = HW1;
				break;
			case 2:
				value = HW2;
				break;
			case 3:
				value = HW3;
				break;
			case 4: 
				value = midterm;
				break;
			case 5:
				value = project;
				break;
			case 6:
				value = finalGrade;
				break;
			case 7:
				value = String.valueOf(Math.round(getFinalNumericalGrade()));
				break;
			case 8:
				value = String.valueOf(getLetterGrade(getFinalNumericalGrade()));
				break;
			default:
				value = "Bazinga";
				break;
		}
		
		return value;
	}
	
	public double getFinalNumericalGrade() {
		
		double final_numerical_grade = 0.45 * ((Integer.parseInt(HW1)+Integer.parseInt(HW2)+Integer.parseInt(HW3))/3) + 0.25*Integer.parseInt(project) + 0.30*((Integer.parseInt(midterm)+Integer.parseInt(finalGrade))/2);
		return final_numerical_grade;
	}
	
	public static int getAs() {
		return A;
	}
	
	public static int getBs() {
		return B;
	}
	
	public static int getCs() {
		return C;
	}
	
	public static int getDs() {
		return D;
	}
	
	public static int getFs() {
		return F;
	}
	
	public char getLetterGrade(double numericalGrade) {
		if(numericalGrade >= 90) {
			A++;
			return 'A';
		} else if(numericalGrade >= 80) {
			B++;
			return 'B';
		} else if(numericalGrade >= 70) {
			C++;
			return 'C';
		} else if(numericalGrade >= 60) {
			D++;
			return 'D';
		} else {
			F++;
			return 'F';
		}
	}
}
