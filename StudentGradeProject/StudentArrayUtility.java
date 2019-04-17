import java.io.File;
import java.util.Scanner;

public class StudentArrayUtility {
	
	public static Student[] getStudentArray(File file) {
		Student[] studentArray = new Student[31];
		//Logic for constructing studentArray.
				try {
					Scanner read = new Scanner(file);
					String name, HW1, HW2, HW3, midterm, project, finalGrade;
					Student student;
					
					int i = 0;
					
					while(read.hasNext()) {
						
						
						String line = read.nextLine();
						String[] columnValues = line.split(",");
						
						name = columnValues[0];
						HW1 = columnValues[1];
						HW2 = columnValues[2];
						HW3 = columnValues[3];
						midterm = columnValues[4];
						project = columnValues[5];
						finalGrade = columnValues[6];
						
						student = new Student(name, HW1, HW2, HW3, midterm, project, finalGrade);
						//String[] studentInfo = {student.getName(), student.getHW1(), student.getHW3(), student.getMidterm(), student.getProject(), student.getFinalGrade()};
						studentArray[i] = student;
					
						i++;
					}

					read.close();
				}
				
				catch(Exception e) {
					e.printStackTrace();
				}	
				return studentArray;
	}
}
