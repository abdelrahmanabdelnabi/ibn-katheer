package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddMenuPanel extends JPanel {

	private MenuPanelListener menuPanelListener;
	
	/**
	 * Create the panel.
	 */
	
	public AddMenuPanel() {
		setLayout(null);

		JButton btnNewStudent = new JButton("New Student");
		btnNewStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuPanelEvent ev = new MenuPanelEvent(this, "new student");
				
				if(menuPanelListener != null){
					menuPanelListener.menuEventOccurred(ev);
				}
			}
		});
		btnNewStudent.setBounds(160, 60, 130, 23);
		add(btnNewStudent);

		JButton btnNewProfessor = new JButton("New Professor");
		btnNewProfessor.setBounds(160, 110, 130, 23);
		add(btnNewProfessor);

		JButton btnNewDepartment = new JButton("New Department");
		btnNewDepartment.setBounds(160, 160, 130, 23);
		add(btnNewDepartment);

		JButton btnNewCourse = new JButton("New Course");
		btnNewCourse.setBounds(160, 210, 130, 23);
		add(btnNewCourse);

	}
	
	public void setMenuPanelListener(MenuPanelListener listener){
		this.menuPanelListener = listener;
	}
}
