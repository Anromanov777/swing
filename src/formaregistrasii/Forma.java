package formaregistrasii;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import javax.swing.*;
import javax.swing.event.*;
/*
 * Created by JFormDesigner on Wed Aug 14 21:31:33 MSK 2024
 */



/**
 * @author Андрей
 */
public class Forma extends JPanel {
	JFrame frame;

	public Forma() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		initComponents();
		frame.add(this);
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}

	private void comboBox1(ActionEvent e) {
		JComboBox<String> s = new JComboBox<>();
		s.getSelectedItem();
		String hj = "";
		hj = (String) ((JComboBox<?>) e.getSource()).getSelectedItem();
		if (hj.equals("Повар")) {
			panel1.setVisible(false);
			panel2.setVisible(true);
			revalidate();
		} else {
			panel1.setVisible(true);
			panel2.setVisible(false);
			revalidate();
		}
	}

	private void checkBox3(ActionEvent e) {
		textField5.setEditable(checkBox3.isSelected());
		comboBox3.setEnabled(!checkBox3.isSelected());
	}

	private void checkBox5(ActionEvent e) {
		textField8.setEditable(checkBox5.isSelected());
	}

	private void checkBox6(ActionEvent e) {
		textField9.setEditable(checkBox6.isSelected());
	}

	private void button1(ActionEvent e) {
		String[]mas={
				"Фамилия: "+textField1.getText(),
				"Имя: "+textField2.getText(),
				"Отчество: "+textField3.getText(),
				"Номер телефона: "+textField4.getText(),
				"Желаемая должность: "+comboBoxDolshnost.getSelectedItem(),
				"Наличие мед.книжки: "+(checkBox1.isSelected()?"Есть":"Нет"),
				"Пол: "+(radioButton1.isSelected()?"Мужской":radioButton2.isSelected()?"Женский":" Не выбран"),
				"Возраст: "+spinner1.getValue()

		};
		ArrayList<String> list = new ArrayList<>(Arrays.asList(mas));

		if (Objects.equals(comboBoxDolshnost.getSelectedItem(), "Повар")){
			String[]mas1={
					"Желаемый график: "+(comboBox3.isEnabled()?comboBox3.getSelectedItem():textField5.getText()),
					"Краткий рассказ: "+textArea2.getText(),
					"Компетенции: "+list2.getSelectedValuesList(),
					"Желаемая зарплата: "+slider2.getValue()
			};
			list.addAll(Arrays.asList(mas1));
		}else if (Objects.equals(comboBoxDolshnost.getSelectedItem(), "Курьер")){
			String[]mas1={
					"Наличие авто: "+(radioButton5.isSelected()?"Есть":"Нет"),
					"Возраст авто: "+spinner2.getValue(),
					"Желаемый график: "+(comboBox2.isEnabled()?comboBox2.getSelectedItem():textField8.getText()),
					"Опыт работы в доставке: "+(checkBox6.isSelected()?"в "+textField9.getText():"Нет")
			};
			list.addAll(Arrays.asList(mas1));
		}else list.add("Кандидат не выбрал дожность");

		JOptionPane.showConfirmDialog(null,list.toArray(),"Результат",JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE);
	}




	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
		label1 = new JLabel();
		label2 = new JLabel();
		textField1 = new JTextField();
		label3 = new JLabel();
		textField2 = new JTextField();
		label4 = new JLabel();
		textField3 = new JTextField();
		label9 = new JLabel();
		textField4 = new JTextField();
		label5 = new JLabel();
		comboBoxDolshnost = new JComboBox<>();
		label6 = new JLabel();
		checkBox1 = new JCheckBox();
		label7 = new JLabel();
		radioButton1 = new JRadioButton();
		radioButton2 = new JRadioButton();
		label8 = new JLabel();
		spinner1 = new JSpinner();
		label11 = new JLabel();
		panel2 = new JPanel();
		label16 = new JLabel();
		comboBox3 = new JComboBox<>();
		checkBox3 = new JCheckBox();
		textField5 = new JTextField();
		label14 = new JLabel();
		scrollPane2 = new JScrollPane();
		textArea2 = new JTextArea();
		label17 = new JLabel();
		list2 = new JList<>();
		label18 = new JLabel();
		slider2 = new JSlider();
		panel1 = new JPanel();
		label10 = new JLabel();
		radioButton5 = new JRadioButton();
		radioButton6 = new JRadioButton();
		label13 = new JLabel();
		spinner2 = new JSpinner();
		label12 = new JLabel();
		comboBox2 = new JComboBox<>();
		checkBox5 = new JCheckBox();
		textField8 = new JTextField();
		label23 = new JLabel();
		checkBox6 = new JCheckBox();
		textField9 = new JTextField();
		button1 = new JButton();

		//======== this ========
		setPreferredSize(new Dimension(1000, 1200));
		setLayout(new GridBagLayout());
		((GridBagLayout) getLayout()).columnWidths = new int[]{0, 0, 0, 0, 0, 0};
		((GridBagLayout) getLayout()).rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		((GridBagLayout) getLayout()).columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};
		((GridBagLayout) getLayout()).rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};

		//---- label1 ----
		label1.setText("\u0420\u0435\u0433\u0438\u0441\u0442\u0440\u0430\u0446\u0438\u044f \u043a\u0430\u043d\u0434\u0438\u0434\u0430\u0442\u0430 \u043d\u0430 \u0434\u043e\u043b\u0436\u043d\u043e\u0441\u0442\u044c");
		label1.setFont(new Font("Segoe UI", Font.PLAIN, 26));
		add(label1, new GridBagConstraints(0, 0, 5, 1, 1.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.VERTICAL,
				new Insets(60, 30, 35, 30), 0, 0));

		//---- label2 ----
		label2.setText("\u0424\u0430\u043c\u0438\u043b\u0438\u044f");
		label2.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		add(label2, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
				GridBagConstraints.EAST, GridBagConstraints.VERTICAL,
				new Insets(0, 30, 5, 5), 0, 0));
		add(textField1, new GridBagConstraints(1, 1, 4, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 30, 5, 30), 0, 0));

		//---- label3 ----
		label3.setText("\u0418\u043c\u044f");
		label3.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		add(label3, new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0,
				GridBagConstraints.EAST, GridBagConstraints.NONE,
				new Insets(0, 0, 5, 5), 0, 0));
		add(textField2, new GridBagConstraints(1, 2, 4, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 30, 5, 30), 0, 0));

		//---- label4 ----
		label4.setText("\u041e\u0442\u0447\u0435\u0441\u0442\u0432\u043e");
		label4.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		add(label4, new GridBagConstraints(0, 3, 1, 1, 0.0, 0.0,
				GridBagConstraints.EAST, GridBagConstraints.NONE,
				new Insets(0, 0, 5, 5), 0, 0));
		add(textField3, new GridBagConstraints(1, 3, 4, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 30, 5, 30), 0, 0));

		//---- label9 ----
		label9.setText("\u041d\u043e\u043c\u0435\u0440 \u0442\u0435\u043b\u0435\u0444\u043e\u043d\u0430");
		label9.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		add(label9, new GridBagConstraints(0, 4, 1, 1, 0.0, 0.0,
				GridBagConstraints.EAST, GridBagConstraints.VERTICAL,
				new Insets(30, 30, 5, 5), 0, 0));

		//---- textField4 ----
		textField4.setMinimumSize(new Dimension(64, 33));
		textField4.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		add(textField4, new GridBagConstraints(1, 4, 4, 1, 0.0, 0.0,
				GridBagConstraints.SOUTH, GridBagConstraints.HORIZONTAL,
				new Insets(0, 30, 5, 30), 0, 0));

		//---- label5 ----
		label5.setText("\u0416\u0435\u043b\u0430\u0435\u043c\u0430\u044f \u0434\u043e\u043b\u0436\u043d\u043e\u0441\u0442\u044c");
		label5.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		add(label5, new GridBagConstraints(0, 5, 1, 1, 0.0, 0.0,
				GridBagConstraints.EAST, GridBagConstraints.VERTICAL,
				new Insets(10, 30, 5, 5), 0, 0));

		//---- comboBoxDolshnost ----
		comboBoxDolshnost.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		comboBoxDolshnost.setPreferredSize(null);
		comboBoxDolshnost.setModel(new DefaultComboBoxModel<>(new String[]{
				"\u041f\u043e\u0432\u0430\u0440",
				"\u041a\u0443\u0440\u044c\u0435\u0440"
		}));
		comboBoxDolshnost.setSelectedIndex(-1);
		comboBoxDolshnost.setMinimumSize(new Dimension(111, 28));
		comboBoxDolshnost.setEditable(true);
		comboBoxDolshnost.addActionListener(e -> comboBox1(e));
		add(comboBoxDolshnost, new GridBagConstraints(1, 5, 4, 1, 1.0, 0.0,
				GridBagConstraints.SOUTHWEST, GridBagConstraints.NONE,
				new Insets(0, 30, 5, 0), 0, 0));

		//---- label6 ----
		label6.setText("\u041d\u0430\u043b\u0438\u0447\u0438\u0435 \u043c\u0435\u0434\u043a\u043d\u0438\u0436\u043a\u0438");
		label6.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		add(label6, new GridBagConstraints(0, 6, 1, 1, 0.0, 0.0,
				GridBagConstraints.EAST, GridBagConstraints.VERTICAL,
				new Insets(10, 0, 5, 5), 0, 0));

		//---- checkBox1 ----
		checkBox1.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		add(checkBox1, new GridBagConstraints(1, 6, 1, 1, 0.0, 0.0,
				GridBagConstraints.SOUTH, GridBagConstraints.HORIZONTAL,
				new Insets(0, 30, 5, 5), 0, 0));

		//---- label7 ----
		label7.setText("\u041f\u043e\u043b");
		label7.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		add(label7, new GridBagConstraints(0, 7, 1, 1, 0.0, 0.0,
				GridBagConstraints.EAST, GridBagConstraints.VERTICAL,
				new Insets(10, 0, 5, 5), 0, 0));

		//---- radioButton1 ----
		radioButton1.setText("\u041c");
		radioButton1.setFocusable(false);
		radioButton1.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		add(radioButton1, new GridBagConstraints(1, 7, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 30, 5, 5), 0, 0));

		//---- radioButton2 ----
		radioButton2.setText("\u0416");
		radioButton2.setFocusable(false);
		radioButton2.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		add(radioButton2, new GridBagConstraints(2, 7, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

		//---- label8 ----
		label8.setText("\u0412\u043e\u0437\u0440\u0430\u0441\u0442");
		label8.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		add(label8, new GridBagConstraints(0, 8, 1, 1, 0.0, 0.0,
				GridBagConstraints.EAST, GridBagConstraints.VERTICAL,
				new Insets(10, 0, 5, 5), 0, 0));

		//---- spinner1 ----
		spinner1.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		add(spinner1, new GridBagConstraints(1, 8, 2, 1, 0.0, 0.0,
				GridBagConstraints.SOUTH, GridBagConstraints.HORIZONTAL,
				new Insets(0, 30, 5, 5), 0, 0));

		//---- label11 ----
		label11.setText("\u0414\u043e\u043f\u043e\u043b\u043d\u0438\u0442\u0435\u043b\u044c\u043d\u0430\u044f \u0438\u043d\u0444\u043e\u0440\u043c\u0430\u0446\u0438\u044f");
		label11.setFont(new Font("Segoe UI", Font.PLAIN, 24));
		label11.setVerticalAlignment(SwingConstants.TOP);
		add(label11, new GridBagConstraints(0, 9, 5, 1, 1.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.VERTICAL,
				new Insets(30, 0, 35, 0), 0, 0));

		//======== panel2 ========
		{
			panel2.setVisible(false);
			panel2.setPreferredSize(new Dimension(1000, 100));
			panel2.setLayout(new GridBagLayout());
			((GridBagLayout) panel2.getLayout()).rowHeights = new int[]{0, 0, 0, 0, 0};
			((GridBagLayout) panel2.getLayout()).rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0E-4};

			//---- label16 ----
			label16.setText("\u0416\u0435\u043b\u0430\u0435\u043c\u044b\u0439 \u0433\u0440\u0430\u0444\u0438\u043a");
			label16.setFont(new Font("Segoe UI", Font.PLAIN, 16));
			panel2.add(label16, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.BOTH,
					new Insets(0, 30, 5, 5), 0, 0));

			//---- comboBox3 ----
			comboBox3.setFont(new Font("Segoe UI", Font.PLAIN, 16));
			comboBox3.setMaximumRowCount(22);
			comboBox3.setModel(new DefaultComboBoxModel<>(new String[]{
					"2 \u0447\u0435\u0440\u0435\u0437 2",
					"\u041f\u043e\u0434\u0440\u0430\u0431\u043e\u0442\u043a\u0430",
					"\u0412 \u0432\u044b\u0445\u043e\u0434\u043d\u044b\u0435"
			}));
			comboBox3.setEditable(true);
			panel2.add(comboBox3, new GridBagConstraints(1, 0, 2, 1, 0.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.BOTH,
					new Insets(0, 30, 5, 5), 0, 0));

			//---- checkBox3 ----
			checkBox3.setText("\u0421\u0432\u043e\u0439 \u043e\u0442\u0432\u0435\u0442");
			checkBox3.addActionListener(e -> checkBox3(e));
			checkBox3.setFont(new Font("Segoe UI", Font.PLAIN, 16));
			panel2.add(checkBox3, new GridBagConstraints(3, 0, 1, 1, 0.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.BOTH,
					new Insets(0, 20, 5, 5), 0, 0));

			//---- textField5 ----
			//textField5.setEnabled(true);
			textField5.setEditable(false);
			textField5.setFont(new Font("Segoe UI", Font.PLAIN, 16));
			panel2.add(textField5, new GridBagConstraints(4, 0, 11, 1, 0.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.BOTH,
					new Insets(0, 20, 5, 30), 0, 0));

			//---- label14 ----
			label14.setText("<html>\u0420\u0430\u0441\u0441\u043a\u0430\u0436\u0438\u0442\u0435 \u043e \u0441\u0432\u043e\u0438\u0445 \u0443\u0441\u043f\u0435\u0445\u0430\u0445<br> \u043d\u0430 \u043f\u0440\u0435\u0436\u043d\u0435\u043c \u043c\u0435\u0441\u0442\u0435 \u0440\u0430\u0431\u043e\u0442\u044b");
			label14.setFont(new Font("Segoe UI", Font.PLAIN, 16));
			label14.setHorizontalAlignment(SwingConstants.TRAILING);
			panel2.add(label14, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
					new Insets(0, 30, 5, 5), 0, 0));

			//======== scrollPane2 ========
			{

				//---- textArea2 ----
				textArea2.setRows(4);
				textArea2.setFont(new Font("Segoe UI", Font.PLAIN, 20));
				textArea2.setLineWrap(true);
				textArea2.setPreferredSize(new Dimension(662, 10));
				scrollPane2.setViewportView(textArea2);
			}
			panel2.add(scrollPane2, new GridBagConstraints(1, 1, 14, 1, 0.0, 1.0,
					GridBagConstraints.CENTER, GridBagConstraints.BOTH,
					new Insets(30, 30, 5, 30), 0, 0));

			//---- label17 ----
			label17.setText("\u041a\u043e\u043c\u043f\u0435\u0442\u0435\u043d\u0446\u0438\u0438");
			label17.setFont(new Font("Segoe UI", Font.PLAIN, 16));
			label17.setHorizontalAlignment(SwingConstants.TRAILING);
			panel2.add(label17, new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.BOTH,
					new Insets(0, 30, 5, 5), 0, 0));

			//---- list2 ----
			list2.setFont(new Font("Segoe UI", Font.PLAIN, 16));
			list2.setSelectionModel(new DefaultListSelectionModel() {
				@Override
				public void setSelectionInterval(int index0, int index1) {
					if (list2.isSelectedIndex(index0)) {
						list2.removeSelectionInterval(index0, index1);
					} else {
						list2.addSelectionInterval(index0, index1);
					}
				}
			});
			list2.setModel(new AbstractListModel<String>() {
				String[] values = {
						"\u042f\u043f\u043e\u043d\u0441\u043a\u0430\u044f \u043a\u0443\u0445\u043d\u044f",
						"\u0418\u0442\u0430\u043b\u044c\u044f\u043d\u0441\u043a\u0430\u044f \u043a\u0443\u0445\u043d\u044f",
						"\u0420\u0443\u0441\u0441\u043a\u0430\u044f \u043a\u0443\u0445\u043d\u044f",
						"\u0422\u0430\u0442\u0430\u0440\u0441\u043a\u0430\u044f \u043a\u0443\u0445\u043d\u044f"
				};

				@Override
				public int getSize() {
					return values.length;
				}

				@Override
				public String getElementAt(int i) {
					return values[i];
				}
			});
			list2.setToolTipText("\u041c\u043e\u0436\u043d\u043e \u0432\u044b\u0431\u0440\u0430\u0442\u044c \u043d\u0435\u0441\u043a\u043e\u043b\u044c\u043a\u043e \u043a\u043e\u043c\u043f\u0435\u0442\u0435\u043d\u0446\u0438\u0439,");
			panel2.add(list2, new GridBagConstraints(1, 2, 3, 1, 0.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.BOTH,
					new Insets(0, 30, 5, 5), 0, 0));

			//---- label18 ----
			label18.setText("\u0416\u0435\u043b\u0430\u0435\u043c\u0430\u044f \u0437\u0430\u0440\u043f\u043b\u0430\u0442\u0430");
			label18.setFont(new Font("Segoe UI", Font.PLAIN, 16));
			label18.setHorizontalAlignment(SwingConstants.TRAILING);
			panel2.add(label18, new GridBagConstraints(0, 3, 1, 1, 0.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
					new Insets(0, 30, 0, 5), 0, 0));

			//---- slider2 ----
			slider2.setFont(new Font("Segoe UI", Font.PLAIN, 16));
			slider2.setValue(40);
			slider2.setMajorTickSpacing(10);
			slider2.setMinimum(20);
			slider2.setMinorTickSpacing(5);
			slider2.setPaintTicks(true);
			slider2.setPaintLabels(true);
			panel2.add(slider2, new GridBagConstraints(1, 3, 14, 1, 1.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
					new Insets(20, 30, 0, 30), 0, 0));
		}
		add(panel2, new GridBagConstraints(0, 10, 5, 1, 0.0, 1.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 0), 0, 0));

		//======== panel1 ========
		{
			panel1.setPreferredSize(new Dimension(1000, 200));
			panel1.setFont(new Font("Segoe UI", Font.PLAIN, 16));
			panel1.setMinimumSize(new Dimension(654, 0));
			panel1.setVisible(false);
			panel1.setLayout(new GridBagLayout());
			((GridBagLayout) panel1.getLayout()).columnWidths = new int[]{0, 0, 0, 0, 0, 0};
			((GridBagLayout) panel1.getLayout()).rowHeights = new int[]{0, 0, 0, 0};
			((GridBagLayout) panel1.getLayout()).columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};
			((GridBagLayout) panel1.getLayout()).rowWeights = new double[]{0.0, 0.0, 0.0, 1.0E-4};

			//---- label10 ----
			label10.setText("\u041d\u0430\u043b\u0438\u0447\u0438\u0435 \u0430\u0432\u0442\u043e");
			label10.setFont(new Font("Segoe UI", Font.PLAIN, 16));
			panel1.add(label10, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.BOTH,
					new Insets(0, 30, 10, 5), 0, 0));

			//---- radioButton5 ----
			radioButton5.setText("\u0415\u0441\u0442\u044c");
			radioButton5.setFocusable(false);
			radioButton5.setFont(new Font("Segoe UI", Font.PLAIN, 16));
			panel1.add(radioButton5, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.BOTH,
					new Insets(0, 30, 10, 5), 0, 0));

			//---- radioButton6 ----
			radioButton6.setText("\u041d\u0435\u0442");
			radioButton6.setFocusable(false);
			radioButton6.setFont(new Font("Segoe UI", Font.PLAIN, 16));
			panel1.add(radioButton6, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.BOTH,
					new Insets(0, 10, 10, 5), 0, 0));

			//---- label13 ----
			label13.setText("\u0412\u043e\u0437\u0440\u0430\u0441\u0442 \u0430\u0432\u0442\u043e");
			label13.setFont(new Font("Segoe UI", Font.PLAIN, 16));
			panel1.add(label13, new GridBagConstraints(3, 0, 1, 1, 0.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.BOTH,
					new Insets(0, 10, 10, 5), 0, 0));

			//---- spinner2 ----
			spinner2.setMinimumSize(new Dimension(60, 22));
			spinner2.setFont(new Font("Segoe UI", Font.PLAIN, 16));
			spinner2.setPreferredSize(new Dimension(60, 22));
			panel1.add(spinner2, new GridBagConstraints(4, 0, 1, 1, 0.0, 0.0,
					GridBagConstraints.WEST, GridBagConstraints.VERTICAL,
					new Insets(0, 10, 10, 0), 0, 0));

			//---- label12 ----
			label12.setText("\u0416\u0435\u043b\u0430\u0435\u043c\u044b\u0439 \u0433\u0440\u0430\u0444\u0438\u043a");
			label12.setFont(new Font("Segoe UI", Font.PLAIN, 16));
			panel1.add(label12, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.BOTH,
					new Insets(0, 30, 10, 5), 0, 0));

			//---- comboBox2 ----
			comboBox2.setFont(new Font("Segoe UI", Font.PLAIN, 16));
			comboBox2.setModel(new DefaultComboBoxModel<>(new String[]{
					"2 \u0447\u0435\u0440\u0435\u0437 2",
					"\u0412\u0435\u0447\u0435\u0440",
					"\u0412\u044b\u0445\u043e\u0434\u043d\u044b\u0435",
					"\u0415\u0436\u0435\u0434\u043d\u0435\u0432\u043d\u043e"
			}));
			comboBox2.setEditable(true);
			comboBox2.setPreferredSize(new Dimension(123, 28));
			panel1.add(comboBox2, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0,
					GridBagConstraints.WEST, GridBagConstraints.NONE,
					new Insets(0, 30, 10, 5), 0, 0));

			//---- checkBox5 ----
			checkBox5.setText("\u0421\u0432\u043e\u0439 \u043e\u0442\u0432\u0435\u0442");
			checkBox5.setFont(new Font("Segoe UI", Font.PLAIN, 16));
			checkBox5.addActionListener(e -> checkBox5(e));
			panel1.add(checkBox5, new GridBagConstraints(2, 1, 1, 1, 0.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.BOTH,
					new Insets(0, 10, 10, 5), 0, 0));

			//---- textField8 ----
			textField8.setFont(new Font("Segoe UI", Font.PLAIN, 16));
			textField8.setEditable(false);
			panel1.add(textField8, new GridBagConstraints(3, 1, 2, 1, 1.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.BOTH,
					new Insets(0, 10, 10, 30), 0, 0));

			//---- label23 ----
			label23.setText("<html>\u041e\u043f\u044b\u0442 \u0440\u0430\u0431\u043e\u0442\u044b \u0432 \u0434\u043e\u0441\u0442\u0430\u0432\u043a\u0435<br> \u0433\u043e\u0442\u043e\u0432\u043e\u0439 \u0435\u0434\u044b");
			label23.setFont(new Font("Segoe UI", Font.PLAIN, 16));
			panel1.add(label23, new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0,
					GridBagConstraints.EAST, GridBagConstraints.VERTICAL,
					new Insets(0, 30, 0, 5), 0, 0));

			//---- checkBox6 ----
			checkBox6.setText("\u0415\u0441\u0442\u044c");
			checkBox6.setFont(new Font("Segoe UI", Font.PLAIN, 16));
			checkBox6.addActionListener(e -> checkBox6(e));
			panel1.add(checkBox6, new GridBagConstraints(1, 2, 1, 1, 0.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.BOTH,
					new Insets(0, 30, 0, 5), 0, 0));

			//---- textField9 ----
			textField9.setFont(new Font("Segoe UI", Font.PLAIN, 16));
			textField9.setToolTipText("\u041c\u0435\u0441\u0442\u043e \u0440\u0430\u0431\u043e\u0442\u044b \u0434\u043e\u0441\u0442\u0430\u0432\u043a\u0438");
			textField9.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
			textField9.setEditable(false);
			panel1.add(textField9, new GridBagConstraints(2, 2, 3, 1, 0.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
					new Insets(0, 10, 0, 30), 0, 0));
		}
		add(panel1, new GridBagConstraints(0, 12, 5, 1, 1.0, 0.5,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 0), 0, 0));

		//---- button1 ----
		button1.setText("\u0421\u043e\u0445\u0440\u0430\u043d\u0438\u0442\u044c");
		button1.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		button1.setFocusable(false);
		button1.setPreferredSize(new Dimension(150, 40));
		button1.setMinimumSize(new Dimension(127, 40));
		button1.setMaximumSize(new Dimension(127, 100));
		button1.addActionListener(e -> button1(e));
		add(button1, new GridBagConstraints(0, 13, 5, 1, 0.0, 1.0,
				GridBagConstraints.NORTH, GridBagConstraints.NONE,
				new Insets(0, 0, 5, 0), 0, 0));

		//---- buttonGroup1 ----
		ButtonGroup buttonGroup1 = new ButtonGroup();
		buttonGroup1.add(radioButton1);
		buttonGroup1.add(radioButton2);
		// JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on

		ButtonGroup buttonGroup2 = new ButtonGroup();
		buttonGroup2.add(radioButton5);
		buttonGroup2.add(radioButton6);
	}



	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
	private JLabel label1;
	private JLabel label2;
	private JTextField textField1;
	private JLabel label3;
	private JTextField textField2;
	private JLabel label4;
	private JTextField textField3;
	private JLabel label9;
	private JTextField textField4;
	private JLabel label5;
	private JComboBox<String> comboBoxDolshnost;
	private JLabel label6;
	private JCheckBox checkBox1;
	private JLabel label7;
	private JRadioButton radioButton1;
	private JRadioButton radioButton2;
	private JLabel label8;
	private JSpinner spinner1;
	private JLabel label11;
	private JPanel panel2;
	private JLabel label16;
	private JComboBox<String> comboBox3;
	private JCheckBox checkBox3;
	private JTextField textField5;
	private JLabel label14;
	private JScrollPane scrollPane2;
	private JTextArea textArea2;
	private JLabel label17;
	private JList<String> list2;
	private JLabel label18;
	private JSlider slider2;
	private JPanel panel1;
	private JLabel label10;
	private JRadioButton radioButton5;
	private JRadioButton radioButton6;
	private JLabel label13;
	private JSpinner spinner2;
	private JLabel label12;
	private JComboBox<String> comboBox2;
	private JCheckBox checkBox5;
	private JTextField textField8;
	private JLabel label23;
	private JCheckBox checkBox6;
	private JTextField textField9;
	private JButton button1;
	// JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on



public class forma extends JPanel {
	public forma() {
		initComponents();
	}

	private void comboBox1(ActionEvent e) {
		// TODO add your code here
	}

	private void slider2StateChanged(ChangeEvent e) {
		// TODO add your code here
	}

	private void checkBox5(ActionEvent e) {
		// TODO add your code here
	}

	private void checkBox6(ActionEvent e) {
		// TODO add your code here
	}

	private void button1(ActionEvent e) {
		// TODO add your code here
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
		label1 = new JLabel();
		label2 = new JLabel();
		textField1 = new JTextField();
		label3 = new JLabel();
		textField2 = new JTextField();
		label4 = new JLabel();
		textField3 = new JTextField();
		label9 = new JLabel();
		textField4 = new JTextField();
		label5 = new JLabel();
		comboBoxDolshnost = new JComboBox<>();
		label6 = new JLabel();
		checkBox1 = new JCheckBox();
		label7 = new JLabel();
		radioButton1 = new JRadioButton();
		radioButton2 = new JRadioButton();
		label8 = new JLabel();
		spinner1 = new JSpinner();
		label11 = new JLabel();
		panel2 = new JPanel();
		label16 = new JLabel();
		comboBox3 = new JComboBox<>();
		checkBox3 = new JCheckBox();
		textField5 = new JTextField();
		label14 = new JLabel();
		scrollPane2 = new JScrollPane();
		textArea2 = new JTextArea();
		label17 = new JLabel();
		list2 = new JList<>();
		label18 = new JLabel();
		slider2 = new JSlider();
		panel1 = new JPanel();
		label10 = new JLabel();
		radioButton5 = new JRadioButton();
		radioButton6 = new JRadioButton();
		label13 = new JLabel();
		spinner2 = new JSpinner();
		label12 = new JLabel();
		comboBox2 = new JComboBox<>();
		checkBox5 = new JCheckBox();
		textField8 = new JTextField();
		label23 = new JLabel();
		checkBox6 = new JCheckBox();
		textField9 = new JTextField();
		button1 = new JButton();

		//======== this ========
		setPreferredSize(new Dimension(1000, 1200));
		setLayout(new GridBagLayout());
		((GridBagLayout)getLayout()).columnWidths = new int[] {0, 0, 0, 0, 0, 0};
		((GridBagLayout)getLayout()).rowHeights = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		((GridBagLayout)getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};
		((GridBagLayout)getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};

		//---- label1 ----
		label1.setText("\u0420\u0435\u0433\u0438\u0441\u0442\u0440\u0430\u0446\u0438\u044f \u043a\u0430\u043d\u0434\u0438\u0434\u0430\u0442\u0430 \u043d\u0430 \u0434\u043e\u043b\u0436\u043d\u043e\u0441\u0442\u044c");
		label1.setFont(new Font("Segoe UI", Font.PLAIN, 26));
		add(label1, new GridBagConstraints(0, 0, 5, 1, 1.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.VERTICAL,
			new Insets(60, 30, 35, 30), 0, 0));

		//---- label2 ----
		label2.setText("\u0424\u0430\u043c\u0438\u043b\u0438\u044f");
		label2.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		add(label2, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
			GridBagConstraints.EAST, GridBagConstraints.VERTICAL,
			new Insets(0, 30, 5, 5), 0, 0));
		add(textField1, new GridBagConstraints(1, 1, 4, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 30, 5, 30), 0, 0));

		//---- label3 ----
		label3.setText("\u0418\u043c\u044f");
		label3.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		add(label3, new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0,
			GridBagConstraints.EAST, GridBagConstraints.NONE,
			new Insets(0, 0, 5, 5), 0, 0));
		add(textField2, new GridBagConstraints(1, 2, 4, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 30, 5, 30), 0, 0));

		//---- label4 ----
		label4.setText("\u041e\u0442\u0447\u0435\u0441\u0442\u0432\u043e");
		label4.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		add(label4, new GridBagConstraints(0, 3, 1, 1, 0.0, 0.0,
			GridBagConstraints.EAST, GridBagConstraints.NONE,
			new Insets(0, 0, 5, 5), 0, 0));
		add(textField3, new GridBagConstraints(1, 3, 4, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 30, 5, 30), 0, 0));

		//---- label9 ----
		label9.setText("\u041d\u043e\u043c\u0435\u0440 \u0442\u0435\u043b\u0435\u0444\u043e\u043d\u0430");
		label9.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		add(label9, new GridBagConstraints(0, 4, 1, 1, 0.0, 0.0,
			GridBagConstraints.EAST, GridBagConstraints.VERTICAL,
			new Insets(30, 30, 5, 5), 0, 0));

		//---- textField4 ----
		textField4.setMinimumSize(new Dimension(64, 33));
		textField4.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		add(textField4, new GridBagConstraints(1, 4, 4, 1, 0.0, 0.0,
			GridBagConstraints.SOUTH, GridBagConstraints.HORIZONTAL,
			new Insets(0, 30, 5, 30), 0, 0));

		//---- label5 ----
		label5.setText("\u0416\u0435\u043b\u0430\u0435\u043c\u0430\u044f \u0434\u043e\u043b\u0436\u043d\u043e\u0441\u0442\u044c");
		label5.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		add(label5, new GridBagConstraints(0, 5, 1, 1, 0.0, 0.0,
			GridBagConstraints.EAST, GridBagConstraints.VERTICAL,
			new Insets(10, 30, 5, 5), 0, 0));

		//---- comboBoxDolshnost ----
		comboBoxDolshnost.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		comboBoxDolshnost.setPreferredSize(null);
		comboBoxDolshnost.setModel(new DefaultComboBoxModel<>(new String[] {
			"\u041f\u043e\u0432\u0430\u0440",
			"\u041a\u0443\u0440\u044c\u0435\u0440"
		}));
		comboBoxDolshnost.setSelectedIndex(-1);
		comboBoxDolshnost.setMinimumSize(new Dimension(111, 28));
		comboBoxDolshnost.setEditable(true);
		comboBoxDolshnost.addActionListener(e -> comboBox1(e));
		add(comboBoxDolshnost, new GridBagConstraints(1, 5, 4, 1, 1.0, 0.0,
			GridBagConstraints.SOUTHWEST, GridBagConstraints.NONE,
			new Insets(0, 30, 5, 0), 0, 0));

		//---- label6 ----
		label6.setText("\u041d\u0430\u043b\u0438\u0447\u0438\u0435 \u043c\u0435\u0434\u043a\u043d\u0438\u0436\u043a\u0438");
		label6.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		add(label6, new GridBagConstraints(0, 6, 1, 1, 0.0, 0.0,
			GridBagConstraints.EAST, GridBagConstraints.VERTICAL,
			new Insets(10, 0, 5, 5), 0, 0));

		//---- checkBox1 ----
		checkBox1.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		add(checkBox1, new GridBagConstraints(1, 6, 1, 1, 0.0, 0.0,
			GridBagConstraints.SOUTH, GridBagConstraints.HORIZONTAL,
			new Insets(0, 30, 5, 5), 0, 0));

		//---- label7 ----
		label7.setText("\u041f\u043e\u043b");
		label7.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		add(label7, new GridBagConstraints(0, 7, 1, 1, 0.0, 0.0,
			GridBagConstraints.EAST, GridBagConstraints.VERTICAL,
			new Insets(10, 0, 5, 5), 0, 0));

		//---- radioButton1 ----
		radioButton1.setText("\u041c\u043a");
		radioButton1.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		radioButton1.setFocusable(false);
		add(radioButton1, new GridBagConstraints(1, 7, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 30, 5, 5), 0, 0));

		//---- radioButton2 ----
		radioButton2.setText("\u0416");
		radioButton2.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		radioButton2.setFocusable(false);
		add(radioButton2, new GridBagConstraints(2, 7, 1, 1, 0.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 5), 0, 0));

		//---- label8 ----
		label8.setText("\u0412\u043e\u0437\u0440\u0430\u0441\u0442");
		label8.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		add(label8, new GridBagConstraints(0, 8, 1, 1, 0.0, 0.0,
			GridBagConstraints.EAST, GridBagConstraints.VERTICAL,
			new Insets(10, 0, 5, 5), 0, 0));

		//---- spinner1 ----
		spinner1.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		add(spinner1, new GridBagConstraints(1, 8, 2, 1, 0.0, 0.0,
			GridBagConstraints.SOUTH, GridBagConstraints.HORIZONTAL,
			new Insets(0, 30, 5, 5), 0, 0));

		//---- label11 ----
		label11.setText("\u0414\u043e\u043f\u043e\u043b\u043d\u0438\u0442\u0435\u043b\u044c\u043d\u0430\u044f \u0438\u043d\u0444\u043e\u0440\u043c\u0430\u0446\u0438\u044f");
		label11.setFont(new Font("Segoe UI", Font.PLAIN, 24));
		label11.setVerticalAlignment(SwingConstants.TOP);
		add(label11, new GridBagConstraints(0, 9, 5, 1, 1.0, 0.0,
			GridBagConstraints.CENTER, GridBagConstraints.VERTICAL,
			new Insets(30, 0, 35, 0), 0, 0));

		//======== panel2 ========
		{
			panel2.setPreferredSize(new Dimension(1000, 100));
			panel2.setVisible(false);
			panel2.setLayout(new GridBagLayout());
			((GridBagLayout)panel2.getLayout()).rowHeights = new int[] {0, 0, 0, 0, 0};
			((GridBagLayout)panel2.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 1.0E-4};

			//---- label16 ----
			label16.setText("\u0416\u0435\u043b\u0430\u0435\u043c\u044b\u0439 \u0433\u0440\u0430\u0444\u0438\u043a");
			label16.setFont(new Font("Segoe UI", Font.PLAIN, 16));
			panel2.add(label16, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 30, 5, 5), 0, 0));

			//---- comboBox3 ----
			comboBox3.setFont(new Font("Segoe UI", Font.PLAIN, 16));
			comboBox3.setMaximumRowCount(22);
			comboBox3.setModel(new DefaultComboBoxModel<>(new String[] {
				"2 \u0447\u0435\u0440\u0435\u0437 2",
				"\u041f\u043e\u0434\u0440\u0430\u0431\u043e\u0442\u043a\u0430",
				"\u0412 \u0432\u044b\u0445\u043e\u0434\u043d\u044b\u0435"
			}));
			comboBox3.setEditable(true);
			panel2.add(comboBox3, new GridBagConstraints(1, 0, 2, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 30, 5, 5), 0, 0));

			//---- checkBox3 ----
			checkBox3.setText("\u0421\u0432\u043e\u0439 \u043e\u0442\u0432\u0435\u0442");
			checkBox3.setFont(new Font("Segoe UI", Font.PLAIN, 16));
			panel2.add(checkBox3, new GridBagConstraints(3, 0, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 20, 5, 5), 0, 0));

			//---- textField5 ----
			textField5.setEnabled(false);
			textField5.setFont(new Font("Segoe UI", Font.PLAIN, 16));
			textField5.setEditable(false);
			panel2.add(textField5, new GridBagConstraints(4, 0, 11, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 20, 5, 30), 0, 0));

			//---- label14 ----
			label14.setText("<html>\u0420\u0430\u0441\u0441\u043a\u0430\u0436\u0438\u0442\u0435 \u043e \u0441\u0432\u043e\u0438\u0445 \u0443\u0441\u043f\u0435\u0445\u0430\u0445<br> \u043d\u0430 \u043f\u0440\u0435\u0436\u043d\u0435\u043c \u043c\u0435\u0441\u0442\u0435 \u0440\u0430\u0431\u043e\u0442\u044b");
			label14.setFont(new Font("Segoe UI", Font.PLAIN, 16));
			label14.setHorizontalAlignment(SwingConstants.TRAILING);
			panel2.add(label14, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
				new Insets(0, 30, 5, 5), 0, 0));

			//======== scrollPane2 ========
			{

				//---- textArea2 ----
				textArea2.setRows(4);
				textArea2.setFont(new Font("Segoe UI", Font.PLAIN, 20));
				textArea2.setLineWrap(true);
				textArea2.setPreferredSize(new Dimension(662, 10));
				scrollPane2.setViewportView(textArea2);
			}
			panel2.add(scrollPane2, new GridBagConstraints(1, 1, 14, 1, 0.0, 1.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(30, 30, 5, 30), 0, 0));

			//---- label17 ----
			label17.setText("\u041a\u043e\u043c\u043f\u0435\u0442\u0435\u043d\u0446\u0438\u0438");
			label17.setFont(new Font("Segoe UI", Font.PLAIN, 16));
			label17.setHorizontalAlignment(SwingConstants.TRAILING);
			panel2.add(label17, new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 30, 5, 5), 0, 0));

			//---- list2 ----
			list2.setFont(new Font("Segoe UI", Font.PLAIN, 16));
			list2.setModel(new AbstractListModel<String>() {
				String[] values = {
					"\u042f\u043f\u043e\u043d\u0441\u043a\u0430\u044f \u043a\u0443\u0445\u043d\u044f",
					"\u0418\u0442\u0430\u043b\u044c\u044f\u043d\u0441\u043a\u0430\u044f \u043a\u0443\u0445\u043d\u044f",
					"\u0420\u0443\u0441\u0441\u043a\u0430\u044f \u043a\u0443\u0445\u043d\u044f",
					"\u0422\u0430\u0442\u0430\u0440\u0441\u043a\u0430\u044f \u043a\u0443\u0445\u043d\u044f"
				};
				@Override
				public int getSize() { return values.length; }
				@Override
				public String getElementAt(int i) { return values[i]; }
			});
			list2.setToolTipText("\u041c\u043e\u0436\u043d\u043e \u0432\u044b\u0431\u0440\u0430\u0442\u044c \u043d\u0435\u0441\u043a\u043e\u043b\u044c\u043a\u043e \u043a\u043e\u043c\u043f\u0435\u0442\u0435\u043d\u0446\u0438\u0439,");
			panel2.add(list2, new GridBagConstraints(1, 2, 3, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 30, 5, 5), 0, 0));

			//---- label18 ----
			label18.setText("\u0416\u0435\u043b\u0430\u0435\u043c\u0430\u044f \u0437\u0430\u0440\u043f\u043b\u0430\u0442\u0430");
			label18.setFont(new Font("Segoe UI", Font.PLAIN, 16));
			label18.setHorizontalAlignment(SwingConstants.TRAILING);
			panel2.add(label18, new GridBagConstraints(0, 3, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
				new Insets(0, 30, 0, 5), 0, 0));

			//---- slider2 ----
			slider2.setFont(new Font("Segoe UI", Font.PLAIN, 16));
			slider2.setMajorTickSpacing(10);
			slider2.setMinimum(20);
			slider2.setMinorTickSpacing(5);
			slider2.setPaintTicks(true);
			slider2.setPaintLabels(true);
			slider2.setVisible(false);
			slider2.addChangeListener(e -> slider2StateChanged(e));
			panel2.add(slider2, new GridBagConstraints(1, 3, 14, 1, 1.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
				new Insets(20, 30, 0, 30), 0, 0));
		}
		add(panel2, new GridBagConstraints(0, 10, 5, 1, 0.0, 1.0,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 0), 0, 0));

		//======== panel1 ========
		{
			panel1.setPreferredSize(new Dimension(1000, 200));
			panel1.setFont(new Font("Segoe UI", Font.PLAIN, 16));
			panel1.setMinimumSize(new Dimension(654, 0));
			panel1.setLayout(new GridBagLayout());
			((GridBagLayout)panel1.getLayout()).columnWidths = new int[] {0, 0, 0, 0, 0, 0};
			((GridBagLayout)panel1.getLayout()).rowHeights = new int[] {0, 0, 0, 0};
			((GridBagLayout)panel1.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};
			((GridBagLayout)panel1.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 1.0E-4};

			//---- label10 ----
			label10.setText("\u041d\u0430\u043b\u0438\u0447\u0438\u0435 \u0430\u0432\u0442\u043e");
			label10.setFont(new Font("Segoe UI", Font.PLAIN, 16));
			panel1.add(label10, new GridBagConstraints(0, 0, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 30, 10, 5), 0, 0));

			//---- radioButton5 ----
			radioButton5.setText("\u0415\u0441\u0442\u044c");
			radioButton5.setFont(new Font("Segoe UI", Font.PLAIN, 16));
			radioButton5.setFocusable(false);
			panel1.add(radioButton5, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 30, 10, 5), 0, 0));

			//---- radioButton6 ----
			radioButton6.setText("\u041d\u0435\u0442");
			radioButton6.setFont(new Font("Segoe UI", Font.PLAIN, 16));
			radioButton6.setFocusable(false);
			panel1.add(radioButton6, new GridBagConstraints(2, 0, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 10, 10, 5), 0, 0));

			//---- label13 ----
			label13.setText("\u0412\u043e\u0437\u0440\u0430\u0441\u0442 \u0430\u0432\u0442\u043e");
			label13.setFont(new Font("Segoe UI", Font.PLAIN, 16));
			panel1.add(label13, new GridBagConstraints(3, 0, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 10, 10, 5), 0, 0));

			//---- spinner2 ----
			spinner2.setMinimumSize(new Dimension(60, 22));
			spinner2.setPreferredSize(new Dimension(60, 22));
			spinner2.setFont(new Font("Segoe UI", Font.PLAIN, 16));
			panel1.add(spinner2, new GridBagConstraints(4, 0, 1, 1, 0.0, 0.0,
				GridBagConstraints.WEST, GridBagConstraints.VERTICAL,
				new Insets(0, 10, 10, 0), 0, 0));

			//---- label12 ----
			label12.setText("\u0416\u0435\u043b\u0430\u0435\u043c\u044b\u0439 \u0433\u0440\u0430\u0444\u0438\u043a");
			label12.setFont(new Font("Segoe UI", Font.PLAIN, 16));
			panel1.add(label12, new GridBagConstraints(0, 1, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 30, 10, 5), 0, 0));

			//---- comboBox2 ----
			comboBox2.setFont(new Font("Segoe UI", Font.PLAIN, 16));
			comboBox2.setModel(new DefaultComboBoxModel<>(new String[] {
				"2 \u0447\u0435\u0440\u0435\u0437 2",
				"\u0412\u0435\u0447\u0435\u0440",
				"\u0412\u044b\u0445\u043e\u0434\u043d\u044b\u0435",
				"\u0415\u0436\u0435\u0434\u043d\u0435\u0432\u043d\u043e"
			}));
			comboBox2.setEditable(true);
			comboBox2.setPreferredSize(new Dimension(123, 28));
			panel1.add(comboBox2, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0,
				GridBagConstraints.WEST, GridBagConstraints.NONE,
				new Insets(0, 30, 10, 5), 0, 0));

			//---- checkBox5 ----
			checkBox5.setText("\u0421\u0432\u043e\u0439 \u043e\u0442\u0432\u0435\u0442");
			checkBox5.setFont(new Font("Segoe UI", Font.PLAIN, 16));
			checkBox5.addActionListener(e -> checkBox5(e));
			panel1.add(checkBox5, new GridBagConstraints(2, 1, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 10, 10, 5), 0, 0));

			//---- textField8 ----
			textField8.setFont(new Font("Segoe UI", Font.PLAIN, 16));
			textField8.setEditable(false);
			panel1.add(textField8, new GridBagConstraints(3, 1, 2, 1, 1.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 10, 10, 30), 0, 0));

			//---- label23 ----
			label23.setText("<html>\u041e\u043f\u044b\u0442 \u0440\u0430\u0431\u043e\u0442\u044b \u0432 \u0434\u043e\u0441\u0442\u0430\u0432\u043a\u0435<br> \u0433\u043e\u0442\u043e\u0432\u043e\u0439 \u0435\u0434\u044b");
			label23.setFont(new Font("Segoe UI", Font.PLAIN, 16));
			panel1.add(label23, new GridBagConstraints(0, 2, 1, 1, 0.0, 0.0,
				GridBagConstraints.EAST, GridBagConstraints.VERTICAL,
				new Insets(0, 30, 0, 5), 0, 0));

			//---- checkBox6 ----
			checkBox6.setText("\u0415\u0441\u0442\u044c");
			checkBox6.setFont(new Font("Segoe UI", Font.PLAIN, 16));
			checkBox6.addActionListener(e -> checkBox6(e));
			panel1.add(checkBox6, new GridBagConstraints(1, 2, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 30, 0, 5), 0, 0));

			//---- textField9 ----
			textField9.setFont(new Font("Segoe UI", Font.PLAIN, 16));
			textField9.setToolTipText("\u041c\u0435\u0441\u0442\u043e \u0440\u0430\u0431\u043e\u0442\u044b \u0434\u043e\u0441\u0442\u0430\u0432\u043a\u0438");
			textField9.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
			textField9.setEditable(false);
			panel1.add(textField9, new GridBagConstraints(2, 2, 3, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.HORIZONTAL,
				new Insets(0, 10, 0, 30), 0, 0));
		}
		add(panel1, new GridBagConstraints(0, 12, 5, 1, 1.0, 0.5,
			GridBagConstraints.CENTER, GridBagConstraints.BOTH,
			new Insets(0, 0, 5, 0), 0, 0));

		//---- button1 ----
		button1.setText("\u0421\u043e\u0445\u0440\u0430\u043d\u0438\u0442\u044c");
		button1.setFont(new Font("Segoe UI", Font.PLAIN, 20));
		button1.setFocusable(false);
		button1.setPreferredSize(new Dimension(150, 40));
		button1.setMinimumSize(new Dimension(127, 40));
		button1.setMaximumSize(new Dimension(127, 100));
		button1.addActionListener(e -> button1(e));
		add(button1, new GridBagConstraints(0, 13, 5, 1, 0.0, 1.0,
			GridBagConstraints.NORTH, GridBagConstraints.NONE,
			new Insets(0, 0, 5, 0), 0, 0));

		//---- buttonGroup1 ----
		ButtonGroup buttonGroup1 = new ButtonGroup();
		buttonGroup1.add(radioButton1);
		buttonGroup1.add(radioButton2);

		//---- buttonGroup2 ----
		ButtonGroup buttonGroup2 = new ButtonGroup();
		buttonGroup2.add(radioButton5);
		buttonGroup2.add(radioButton6);
		// JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
	private JLabel label1;
	private JLabel label2;
	private JTextField textField1;
	private JLabel label3;
	private JTextField textField2;
	private JLabel label4;
	private JTextField textField3;
	private JLabel label9;
	private JTextField textField4;
	private JLabel label5;
	private JComboBox<String> comboBoxDolshnost;
	private JLabel label6;
	private JCheckBox checkBox1;
	private JLabel label7;
	private JRadioButton radioButton1;
	private JRadioButton radioButton2;
	private JLabel label8;
	private JSpinner spinner1;
	private JLabel label11;
	private JPanel panel2;
	private JLabel label16;
	private JComboBox<String> comboBox3;
	private JCheckBox checkBox3;
	private JTextField textField5;
	private JLabel label14;
	private JScrollPane scrollPane2;
	private JTextArea textArea2;
	private JLabel label17;
	private JList<String> list2;
	private JLabel label18;
	private JSlider slider2;
	private JPanel panel1;
	private JLabel label10;
	private JRadioButton radioButton5;
	private JRadioButton radioButton6;
	private JLabel label13;
	private JSpinner spinner2;
	private JLabel label12;
	private JComboBox<String> comboBox2;
	private JCheckBox checkBox5;
	private JTextField textField8;
	private JLabel label23;
	private JCheckBox checkBox6;
	private JTextField textField9;
	private JButton button1;
	// JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
}


