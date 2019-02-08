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
	private JLabel calculatedRaise;
	
	//Constructor method
	public EmployeeUserInterface() {
		super("Employee");
		setLayout(new GridLayout(6, 3));
		
		employeeName = new JLabel("Name");
		nameField = new JTextField("Name", 20);
		
		employeeTitle = new JLabel("Title");
		titleField = new JTextField("Title", 20);
		
		employeeAge = new JLabel("Age");
		ageField = new JTextField("Age", 20);
		
		employeeSalary = new JLabel("Salary");
		salaryField = new JTextField("Salary", 20);
		
		raisePercent = new JLabel("Raise %");
		percentField = new JTextField("Raise %", 20);
		
		calculate = new JButton("Calculate");
		calculatedRaise = new JLabel(" ");
		
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
		add(calculatedRaise);
		
	}

	//Event handler method - will need to generate Employee object for calculation
	//Will include error handling... perhaps seperate method?
	private class HandlerClass implements ItemListener{
		public void itemStateChanged(ItemEvent event) {
		
		}
	}
	
	
}
