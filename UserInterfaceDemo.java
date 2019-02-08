import javax.swing.JFrame;

public class UserInterfaceDemo {
	public static void main(String[] args) {
		
		UserInterface ui = new UserInterface();
		ui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ui.setSize(350, 75);
		ui.setLocationRelativeTo(null);
		ui.setVisible(true);
		
		EmployeeUserInterface eui = new EmployeeUserInterface();
		eui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		eui.setSize(300, 200);
		eui.setLocationRelativeTo(null);
		eui.setVisible(false);
		
		ManagerUserInterface mui = new ManagerUserInterface();
		mui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mui.setSize(300, 200);
		mui.setLocationRelativeTo(null);
		mui.setVisible(false);
		
		while(ui.getStateFlag() == 'd') {
			ui.setVisible(true);
			if(ui.getStateFlag() == 'e') {
				ui.setVisible(false);
				eui.setVisible(true);
				break;
			}
			if(ui.getStateFlag() == 'm') {
				ui.setVisible(false);
				mui.setVisible(true);
			}
			
		}
	}
}
