import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class UserInterface extends JFrame{
	
	private JLabel textField;
	private JCheckBox employeeBox;
	private JCheckBox managerBox;
	protected char stateFlag = 'd';
	
	public UserInterface() {
		super("Employee and Manager");
		setLayout(new FlowLayout());
		
		textField = new JLabel("Select a Category");
		
		add(textField);
		
		employeeBox = new JCheckBox("Employee");
		managerBox = new JCheckBox("Manager");
		add(employeeBox);
		add(managerBox);
		
		HandlerClass handler = new HandlerClass();
		
		employeeBox.addItemListener(handler);
		managerBox.addItemListener(handler);
		
	}
	
	private class HandlerClass implements ItemListener{
		public void itemStateChanged(ItemEvent event) {
			String text = new String();
			
			if(managerBox.isSelected() && employeeBox.isSelected()) {
				text = "Cannot Select Both";
			} else if(managerBox.isSelected()) {
				text = "Manager is selected";
				stateFlag = 'm';
			} else if(employeeBox.isSelected()) {
				text = "Employee is selected";
				stateFlag = 'e';
			} else {
				text = "Select a category.";
			}
			
			textField.setText(text);
		}
	}
	
	public char getStateFlag() {
		return stateFlag;
	}
}
