import java.awt.*;
import javax.swing.*;
/*
 * Created by JFormDesigner on Tue Aug 13 20:14:54 MSK 2024
 */



/**
 * @author Андрей
 */
public class Rtt  {

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
		panel1 = new JPanel();
		label1 = new JLabel();
		label2 = new JLabel();
		textField1 = new JTextField();
		label3 = new JLabel();
		textField2 = new JTextField();
		label4 = new JLabel();
		textField3 = new JTextField();

		//======== panel1 ========
		{
			panel1.setPreferredSize(new Dimension(1000, 1200));
			panel1.setLayout(new GridBagLayout());
			((GridBagLayout)panel1.getLayout()).rowHeights = new int[] {0, 0, 0, 0, 0};
			((GridBagLayout)panel1.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 1.0E-4};

			//---- label1 ----
			label1.setText("\u0420\u0435\u0433\u0438\u0441\u0442\u0440\u0430\u0446\u0438\u044f \u043d\u043e\u0432\u043e\u0433\u043e \u0441\u043e\u0442\u0440\u0443\u0434\u043d\u0438\u043a\u0430");
			label1.setFont(new Font(Font.SERIF, Font.PLAIN, 36));
			panel1.add(label1, new GridBagConstraints(0, 0, 35, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.VERTICAL,
				new Insets(30, 30, 35, 0), 0, 0));

			//---- label2 ----
			label2.setText("\u0424\u0430\u043c\u0438\u043b\u0438\u044f");
			label2.setFont(new Font("Segoe UI", Font.PLAIN, 20));
			panel1.add(label2, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
			panel1.add(textField1, new GridBagConstraints(1, 1, GridBagConstraints.REMAINDER, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 30, 5, 5), 0, 0));

			//---- label3 ----
			label3.setText("\u0418\u043c\u044f");
			label3.setFont(new Font("Segoe UI", Font.PLAIN, 20));
			panel1.add(label3, new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
			panel1.add(textField2, new GridBagConstraints(1, 2, 31, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 30, 5, 5), 0, 0));

			//---- label4 ----
			label4.setText("\u041e\u0442\u0447\u0435\u0441\u0442\u0432\u043e");
			label4.setFont(new Font("Segoe UI", Font.PLAIN, 20));
			panel1.add(label4, new GridBagConstraints(0, 3, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 5), 0, 0));
			panel1.add(textField3, new GridBagConstraints(1, 3, 31, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 30, 0, 5), 0, 0));
		}
		// JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
	private JPanel panel1;
	private JLabel label1;
	private JLabel label2;
	private JTextField textField1;
	private JLabel label3;
	private JTextField textField2;
	private JLabel label4;
	private JTextField textField3;
	// JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
