package tekstoviiredaktor;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/*
 * Created by JFormDesigner on Sat Aug 17 10:47:34 MSK 2024
 */



/**
 * @author Андрей
 */
public class Txtred extends JPanel {
	public Txtred() {
		JFrame frame=new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		initComponents();
		frame.add(this);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	private void button1(ActionEvent e) {
		// TODO add your code here
	}

	private void button2(ActionEvent e) {
		// TODO add your code here
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
		button1 = new JButton();
		label1 = new JLabel();
		button2 = new JButton();
		button3 = new JButton();
		scrollPane1 = new JScrollPane();
		textArea1 = new JTextArea();

		//======== this ========
		setPreferredSize(new Dimension(1000, 600));
		setLayout(new GridBagLayout());
		((GridBagLayout)getLayout()).rowHeights = new int[] {0, 0, 0, 0};
		((GridBagLayout)getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 1.0E-4};

		//---- button1 ----
		button1.setText("\u041e\u0442\u043a\u0440\u044b\u0442\u044c");
		button1.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		button1.setFocusable(false);
		button1.setMaximumSize(new Dimension(133, 33));
		button1.setMinimumSize(new Dimension(133, 33));
		button1.setPreferredSize(new Dimension(145, 40));
		button1.addActionListener(e -> button1(e));
		add(button1, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
			GridBagConstraints.WEST, GridBagConstraints.VERTICAL,
			new Insets(40, 20, 5, 5), 0, 0));

		//---- label1 ----
		label1.setText("text");
		label1.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		add(label1, new GridBagConstraints(1, 0, 1, 1, 1.0, 0.0,
			GridBagConstraints.SOUTHWEST, GridBagConstraints.NONE,
			new Insets(0, 20, 12, 5), 0, 0));

		//---- button2 ----
		button2.setText("\u0421\u043e\u0445\u0440\u0430\u043d\u0438\u0442\u044c");
		button2.setPreferredSize(new Dimension(145, 40));
		button2.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		button2.setFocusable(false);
		button2.addActionListener(e -> button2(e));
		add(button2, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0,
			GridBagConstraints.SOUTH, GridBagConstraints.HORIZONTAL,
			new Insets(0, 0, 5, 25), 0, 0));

		//---- button3 ----
		button3.setText("\u0421\u043e\u0445\u0440\u0430\u043d\u0438\u0442\u044c \u043a\u0430\u043a");
		button3.setPreferredSize(new Dimension(145, 40));
		button3.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		button3.setFocusable(false);
		button3.addActionListener(e -> button2(e));
		add(button3, new GridBagConstraints(3, 0, 1, 1, 0.0, 0.0,
			GridBagConstraints.SOUTH, GridBagConstraints.HORIZONTAL,
			new Insets(0, 0, 5, 20), 0, 0));

		//======== scrollPane1 ========
		{

			//---- textArea1 ----
			textArea1.setFont(new Font("Segoe UI", Font.PLAIN, 16));
			textArea1.setLineWrap(true);
			textArea1.setWrapStyleWord(true);
			scrollPane1.setViewportView(textArea1);
		}
		add(scrollPane1, new GridBagConstraints(0, 1, 4, 2, 1.0, 1.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(15, 20, 20, 20), 0, 0));
		// JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
	private JButton button1;
	private JLabel label1;
	private JButton button2;
	private JButton button3;
	private JScrollPane scrollPane1;
	private JTextArea textArea1;
	// JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
