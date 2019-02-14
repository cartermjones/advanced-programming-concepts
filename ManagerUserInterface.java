import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ManagerUserInterface extends JFrame {
	//JLabel and JTextField for Name
	private JLabel managerName;
	private JTextField nameField;
	
	//JLabel and JTextField for Title
	private JLabel managerTitle;
	private JTextField titleField;
	
	//JLabel and JTextField for Age
	private JLabel managerAge;
	private JTextField ageField;
	
	//JLabel and JTextField for Years of Experience
	private JLabel yearsOfExperience;
	private JTextField xpField;
	
	//JLabel and JTextField for Highest Degree Earned (HDE)
	private JLabel hde;
	private JTextField hdeField;
	
	//JLabel and JTextField for Salary
	private JLabel managerSalary;
	private JTextField salaryField;
	
	//JLabel and JTextField for Promotion Bonus (Bonus)
	private JLabel bonus;
	private JTextField bonusField;
	
	//JLabel and JTextField for Percent
	private JLabel raisePercent;
	private JTextField percentField;
	
	//JButton for starting calculation and JLabel for displaying raise
	private JButton calculate;
	
	//Variables for handling input from JTextFields
	private String name;
	private String title;
	private String age;
	private String xp;
	private String highestDegree;
	private String salary;
	private String bon; //bonus
	private String percent;
	private String showRaise;
	
	//This set of variables is for casting and storing the numeric data types 
	//necessary for constructing an Employee object
	private int numAge;
	private int numXp;
	private double numSalary;
	private double numBonus;
	private int numPercent;
	
	//JFrame needed for our calculation pop-up
	final JFrame parent = new JFrame();
		
	//Constructor method
	public ManagerUserInterface() {
		super("Manager");
		setLayout(new GridLayout(9, 3));

		//Here we'll set up the appropriate JLabels and JTextFields.
		managerName = new JLabel("Name");
		nameField = new JTextField(20);
		
		managerTitle = new JLabel("Title");
		titleField = new JTextField(20);
		
		managerAge = new JLabel("Age");
		ageField = new JTextField(20);
		
		yearsOfExperience = new JLabel("Years of Experience");
		xpField = new JTextField(2);
		
		hde = new JLabel("Highest Degree Earned");
		hdeField = new JTextField(5);
		
		managerSalary = new JLabel("Salary");
		salaryField = new JTextField(20);
		
		bonus = new JLabel("Promotion Bonus");
		bonusField = new JTextField(15);
		
		raisePercent = new JLabel("Raise %");
		percentField = new JTextField(20);
		
		//Then we'll build our JButton.
		calculate = new JButton("Calculate");
		
		//And now we'll add it all to the JFrame!
		add(managerName);
		add(nameField);
		add(managerTitle);
		add(titleField);
		add(managerAge);
		add(ageField);
		add(yearsOfExperience);
		add(xpField);
		add(hde);
		add(hdeField);
		add(managerSalary);
		add(salaryField);
		add(bonus);
		add(bonusField);
		add(raisePercent);
		add(percentField);
		add(calculate);
			
		/**
		 * And here we implement the logic for the calculate button.
		 * When a user clicks the button, it will dynamically create a Manager object with data from the text fields.
			It will then use that new Manager's raiseSalary() method to generate a raised salary, which will be stored and displayed 
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
				xp = xpField.getText();
				highestDegree = hdeField.getText();
				bon = bonusField.getText();
				numBonus = Double.parseDouble(bon);
				percent = percentField.getText();
				numPercent = Integer.parseInt(percent);
				
				Manager manager = new Manager(name, title, numSalary, numAge, numXp, highestDegree, numBonus);
				showRaise = "Salary Raised! " + Double.toString(manager.raiseSalary(numPercent));
				JOptionPane.showMessageDialog(parent, showRaise);
				}
				catch(Exception exception) {
					JOptionPane.showMessageDialog(null, "Error: One or more of your fields is formatted incorrectly and/or missing. Try again.");
				}
			}
		});
	}
}
