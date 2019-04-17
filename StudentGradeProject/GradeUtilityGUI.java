import java.awt.BorderLayout;
import java.awt.Dimension;
import java.io.File;
import javax.swing.*;
import javax.swing.table.TableColumnModel;

public class GradeUtilityGUI {

	public static void main(String[] args) {
		
		final int WINDOW_WIDTH = 850;
		final int WINDOW_HEIGHT = 500;
		Student[] studentArray = new Student[31];
		
		File file = new File(".\\student_grades_input.txt");
		
		//Set up the window for the application.
		JFrame window = new JFrame();
		window.setTitle("Student Grades");
		window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		//Set up panels.
		JPanel studentGrades = new JPanel();
		JPanel gradeAggregation = new JPanel();
		
		JLabel label = new JLabel("        Student Grade Report");
		
		
		studentArray = StudentArrayUtility.getStudentArray(file);
		System.out.println(studentArray[1].getName());
		
		String[] columnNames = {"Name",
								"HW1", 
								"HW2", 
								"H3", 
								"Midterm", 
								"Project", 
								"Final", 
								"Overall Grade", 
								"Letter Grade"};
		
		Object[][] data = new Object[30][10];
		
		for(int i = 0; i < data.length; i++) {
			for(int j = 0; j < 10; j++) {
				data[i][j] = studentArray[i].getProperty(j);
			}
		}
		
		
		JTable table = new JTable(data, columnNames);
		TableColumnModel columnModel = table.getColumnModel();
		columnModel.getColumn(0).setPreferredWidth(200);
		columnModel.getColumn(1).setPreferredWidth(75);
		columnModel.getColumn(2).setPreferredWidth(75);
		columnModel.getColumn(3).setPreferredWidth(75);
		columnModel.getColumn(4).setPreferredWidth(100);
		columnModel.getColumn(5).setPreferredWidth(100);
		columnModel.getColumn(6).setPreferredWidth(100);
		columnModel.getColumn(7).setPreferredWidth(100);
		columnModel.getColumn(8).setPreferredWidth(100);

		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setPreferredSize(new Dimension(800, 400));
		//studentGrades.add(table);
		studentGrades.add(scrollPane);
		
		JLabel gradeLabel = new JLabel(String.format("Total --- "
				+ " A: %d "
				+ "  B: %d "
				+ "  C: %d "
				+ "  D: %d "
				+ "  F: %d "
				,Student.getAs(), Student.getBs(),Student.getCs(), Student.getDs(), Student.getFs()));
		gradeAggregation.add(gradeLabel);
		
		window.add(label, BorderLayout.PAGE_START);
		window.add(studentGrades, BorderLayout.CENTER);
		window.add(gradeAggregation, BorderLayout.SOUTH);
		window.setVisible(true);
	}
}
