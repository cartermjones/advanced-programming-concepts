import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class EmployeeUserInterface extends JFrame {
	
	//JLabel and JTextField for Name
	private JLabel employeeName;
	private JTextField nameField;
	
	//JLabel and JTextField for Title
	private JLabel employeeTitle;
	private JTextField titleField;
	
	//JLabel and JTextField for Age
	private JLabel employeeAge;
	private JTextField ageField;
	
	//JLabel and JTextField for Salary
	private JLabel employeeSalary;
	private JTextField salaryField;
	
	//JLabel and JTextField for Percent
	private JLabel raisePercent;
	private JTextField percentField;
	
	//JButton for starting calculation and JLabel for displaying raise
	private JButton calculate;
	
	//Variables for handling input from JTextFields
	private String name;
	private String title;
	private String age;
	private String salary;
	private String percent;
	private String showRaise;
	
	//This set of variables is for casting and storing the numeric data types 
	//necessary for constructing an Employee object
	private int numAge;
	private double numSalary;
	private int numPercent;
	
	//JFrame needed for our calculation pop-up
	final JFrame parent = new JFrame();
	
	//Constructor method
	public EmployeeUserInterface() {
		//Set up our frame and layout
		super("Employee");
		setLayout(new GridLayout(6, 3));
		
		//Here we the define the JLabels and JTextFields that we'll need
		employeeName = new JLabel("Name");
		nameField = new JTextField(20);
		
		employeeTitle = new JLabel("Title");
		titleField = new JTextField(20);
		
		employeeAge = new JLabel("Age");
		ageField = new JTextField(20);
		
		employeeSalary = new JLabel("Salary");
		salaryField = new JTextField(20);
		
		raisePercent = new JLabel("Raise %");
		percentField = new JTextField(20);
		
		//Here we define the JButton we'll need
		calculate = new JButton("Calculate");

		//And now we add everything to the frame!
		add(employeeName);
		add(nameField);
		add(employeeTitle);
		add(titleField);
		add(employeeAge);
		add(ageField);
		add(employeeSalary);
		add(salaryField);
		add(raisePercent);
		add(percentField);
		add(calculate);
		
		/**
		 * And here we implement the logic for the calculate button.
		 * When a user clicks the button, it will dynamically create an Employee object with data from the text fields.
			It will then use that new Employee's raiseSalary() method to generate a raised salary, which will be stored and displayed 
			in a JOptionPane.
			This logic is nested in a fairly standard try/catch block that will output a warning message 
			in the event that one of the input fields is improperly formatted or missing altogether.
		 */
		
		calculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
				name = nameField.getText();
				title = titleField.getText();
				salary = salaryField.getText();
				numSalary = Double.parseDouble(salary);
				age = ageField.getText();
				numAge = Integer.parseInt(age);
				percent = percentField.getText();
				numPercent = Integer.parseInt(percent);
				
				
					Employee employee = new Employee(name, title, numSalary, numAge);
					showRaise = "Salary Raised! " + Double.toString(employee.raiseSalary(numPercent));
					JOptionPane.showMessageDialog(parent, showRaise);
				}
				
				catch (Exception exception) {
					JOptionPane.showMessageDialog(null, "Error: One or more of your fields is formatted incorrectly and/or missing. Try again.");
				}
			}
		});
		
	}
	
}
	
