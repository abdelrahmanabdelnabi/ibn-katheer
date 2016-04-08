package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Frame extends JFrame {

	private JPanel mainMenuPane;
	private AddMenuPanel addMenuPane = new AddMenuPanel();
	private JPanel newStudentPanel = new NewStudentPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame frame = new Frame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Frame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 600);
		mainMenuPane = new JPanel();
		mainMenuPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(mainMenuPane);
		mainMenuPane.setLayout(null);

		JButton addBtn = new JButton("Add");
		
		addBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addMenuPane.setBorder(new EmptyBorder(5, 5, 5, 5));
				setContentPane(addMenuPane);
				addMenuPane.setVisible(true);
				repaint();
				printAll(getGraphics());
			}
		});
		addMenuPane.setMenuPanelListener(new MenuPanelListener() {
			@Override
			public void menuEventOccurred(MenuPanelEvent e) {
				// TODO replace current panel with new student panel
				//removeAll();
				revalidate();
				setContentPane(newStudentPanel);
				newStudentPanel.setVisible(true);
				revalidate();
			}
		});
		addBtn.setBounds(100, 62, 120, 23);
		mainMenuPane.add(addBtn);

		JButton editBtn = new JButton("Edit");
		editBtn.setBounds(100, 96, 120, 23);
		mainMenuPane.add(editBtn);

		JButton deleteBtn = new JButton("Delete");
		deleteBtn.setBounds(100, 130, 120, 23);
		mainMenuPane.add(deleteBtn);

		JButton searchBtn = new JButton("Search");
		searchBtn.setBounds(100, 164, 120, 23);
		mainMenuPane.add(searchBtn);

		JLabel lblAlexandriaUniversitySystem = new JLabel(
				"Alexandria University System");
		lblAlexandriaUniversitySystem
				.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblAlexandriaUniversitySystem.setBounds(79, 11, 250, 18);
		mainMenuPane.add(lblAlexandriaUniversitySystem);
	}
	
	

}
