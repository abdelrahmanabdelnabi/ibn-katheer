package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddMenuPane extends JPanel {

	/**
	 * Create the panel.
	 */
	private JFrame callingFrame;
	
	public AddMenuPane(JFrame frame) {
		callingFrame = frame;
		
		setLayout(null);
		
		JButton btnNewStudent = new JButton("New Student");
		btnNewStudent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				callingFrame.setContentPane(new AddMenuPane(callingFrame));
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

}
