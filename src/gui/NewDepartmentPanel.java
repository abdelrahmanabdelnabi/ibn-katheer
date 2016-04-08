package gui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class NewDepartmentPanel extends JPanel {
	private JTextField dptNameField;
	private JLabel titleLabel;
	private NewDepartmentListener listener;

	/**
	 * Create the panel.
	 */
	public NewDepartmentPanel() {
		setBackground(Color.YELLOW);
		setLayout(null);
		
		titleLabel = new JLabel("New Department Info");
		titleLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		titleLabel.setBounds(140, 24, 147, 22);
		add(titleLabel);
		
		JLabel dptNameLbl = new JLabel("Department Name");
		dptNameLbl.setBounds(20, 63, 100, 20);
		add(dptNameLbl);
		
		dptNameField = new JTextField();
		dptNameField.setBounds(140, 63, 147, 20);
		add(dptNameField);
		dptNameField.setColumns(10);

		// TODO add a courses list and an option to add existing courses to this department
	}
	
	public void setEventListener(NewDepartmentListener listener){
		this.listener = listener;
	}
}
