import javax.swing.JFrame;

/**
 * 
 * @author Carter Jones
 *	UserInterfaceDemo houses the main class for this exercise. 
 *	
 */
public class UserInterfaceDemo {
	public static void main(String[] args) {
		
		//We construct a UserInterface object, set its size, and set its visibility to 'true'.
		UserInterface ui = new UserInterface();
		ui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ui.setSize(350, 75);
		ui.setLocationRelativeTo(null);
		ui.setVisible(true);
		
		//We construct an EmployeeUserInterface object, set its size, and set its visibility to 'false'.
		EmployeeUserInterface eui = new EmployeeUserInterface();
		eui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		eui.setSize(300, 200);
		eui.setLocationRelativeTo(null);
		eui.setVisible(false);
		
		//We construct a ManagerUserInterface object, set its size, and set its visibility to 'false'.
		ManagerUserInterface mui = new ManagerUserInterface();
		mui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mui.setSize(300, 200);
		mui.setLocationRelativeTo(null);
		mui.setVisible(false);
		
		//This while-loop is used to checking state.
		//Upon clicking one of the checkboxes, the stateFlag of ui will change.
		//This will trigger a change in visibility, with the ui no longer being displayed
		//while the appropriate UI for employees or managers is rendered visible.
		while(ui.getStateFlag() == 'd') {
			ui.setVisible(true);
			
			if(ui.getStateFlag() == 'e') {
				ui.setVisible(false);
				eui.setVisible(true);
			}
			
			if(ui.getStateFlag() == 'm') {
				ui.setVisible(false);
				mui.setVisible(true);
			}
		}
	}
}
