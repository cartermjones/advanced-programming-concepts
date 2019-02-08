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
	private JLabel calculatedRaise;
		
	//Constructor method
	public ManagerUserInterface() {
		super("Manager");
		setLayout(new GridLayout(9, 3));

		managerName = new JLabel("Name");
		nameField = new JTextField("Name", 20);
		
		managerTitle = new JLabel("Title");
		titleField = new JTextField("Title", 20);
		
		managerAge = new JLabel("Age");
		ageField = new JTextField("Age", 20);
		
		yearsOfExperience = new JLabel("Years of Experience");
		xpField = new JTextField("Years of Experience", 2);
		
		hde = new JLabel("Highest Degree Earned");
		hdeField = new JTextField("Highest Degree Earned", 5);
		
		managerSalary = new JLabel("Salary");
		salaryField = new JTextField("Salary", 20);
		
		bonus = new JLabel("Promotion Bonus");
		bonusField = new JTextField("Promotion Bonus", 15);
		
		raisePercent = new JLabel("Raise %");
		percentField = new JTextField("Raise %", 20);
		
		calculate = new JButton("Calculate");
		calculatedRaise = new JLabel(" ");
		
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
		add(calculatedRaise);
			
			
	}

	//Event handler method - will need to generate Manager object for calculation
	//Will include error handling... perhaps seperate method?	
	private class HandlerClass implements ItemListener{
		public void itemStateChanged(ItemEvent event) {
			
		}
	}
}
