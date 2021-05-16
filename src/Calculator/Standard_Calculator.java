package Calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Standard_Calculator {
	
	double firstnum;
	double secondnum;
	double result;
	String operations;

	private JFrame frmStandardCalculator;
	private JTextField txtDisplay;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Standard_Calculator window = new Standard_Calculator();
					window.frmStandardCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Standard_Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmStandardCalculator = new JFrame();
		frmStandardCalculator.setTitle("Standard Calculator");
		frmStandardCalculator.getContentPane().setFont(new Font("Dialog", Font.BOLD, 5));
		frmStandardCalculator.setBounds(100, 100, 235, 333);
		frmStandardCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmStandardCalculator.getContentPane().setLayout(null);
		
		txtDisplay = new JTextField();
		txtDisplay.setBounds(10, 28, 200, 41);
		frmStandardCalculator.getContentPane().add(txtDisplay);
		txtDisplay.setColumns(10);
		///////////////*********ROW_1*********
		JButton Btn7 = new JButton("7");
		Btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				String EnterNumber = txtDisplay.getText()+Btn7.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		Btn7.setFont(new Font("Tahoma", Font.BOLD, 19));
		Btn7.setBounds(10, 80, 50, 50);
		frmStandardCalculator.getContentPane().add(Btn7);
		
		JButton Btn8 = new JButton("8");
		Btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String EnterNumber = txtDisplay.getText()+Btn8.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		Btn8.setFont(new Font("Tahoma", Font.BOLD, 19));
		Btn8.setBounds(60, 80, 50, 50);
		frmStandardCalculator.getContentPane().add(Btn8);
		
		JButton Btn9 = new JButton("9");
		Btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				String EnterNumber = txtDisplay.getText()+Btn9.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		Btn9.setFont(new Font("Tahoma", Font.BOLD, 19));
		Btn9.setBounds(110, 80, 50, 50);
		frmStandardCalculator.getContentPane().add(Btn9);
		
		JButton BtnDiv = new JButton("/");
		BtnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				firstnum=Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations="/";
			}
		});
		BtnDiv.setFont(new Font("Tahoma", Font.BOLD, 19));
		BtnDiv.setBounds(160, 80, 50, 50);
		frmStandardCalculator.getContentPane().add(BtnDiv);
		
		///////////////*********ROW_2*********
		JButton Btn4 = new JButton("4");
		Btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				String EnterNumber = txtDisplay.getText()+Btn4.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		Btn4.setFont(new Font("Tahoma", Font.BOLD, 19));
		Btn4.setBounds(10, 130, 50, 50);
		frmStandardCalculator.getContentPane().add(Btn4);
	
		JButton Btn5 = new JButton("5");
		Btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String EnterNumber = txtDisplay.getText()+Btn5.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		Btn5.setFont(new Font("Tahoma", Font.BOLD, 19));
		Btn5.setBounds(60, 130, 50, 50);
		frmStandardCalculator.getContentPane().add(Btn5);
	
		JButton Btn6 = new JButton("6");
		Btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				String EnterNumber = txtDisplay.getText()+Btn6.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		Btn6.setFont(new Font("Tahoma", Font.BOLD, 19));
		Btn6.setBounds(110, 130, 50, 50);
		frmStandardCalculator.getContentPane().add(Btn6);
	
		JButton BtnMul = new JButton("*");
		BtnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				firstnum=Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations="*";
			}
		});
		BtnMul.setFont(new Font("Tahoma", Font.BOLD, 19));
		BtnMul.setBounds(160, 130, 50, 50);
		frmStandardCalculator.getContentPane().add(BtnMul);
		
		///////////////*********ROW_3*********
		JButton Btn1 = new JButton("1");
		Btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				String EnterNumber = txtDisplay.getText()+Btn1.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		Btn1.setFont(new Font("Tahoma", Font.BOLD, 19));
		Btn1.setBounds(10, 180, 50, 50);
		frmStandardCalculator.getContentPane().add(Btn1);
	
		JButton Btn2 = new JButton("2");
		Btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String EnterNumber = txtDisplay.getText()+Btn2.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		Btn2.setFont(new Font("Tahoma", Font.BOLD, 19));
		Btn2.setBounds(60, 180, 50, 50);
		frmStandardCalculator.getContentPane().add(Btn2);
	
		JButton Btn3 = new JButton("3");
		Btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				String EnterNumber = txtDisplay.getText()+Btn3.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		Btn3.setFont(new Font("Tahoma", Font.BOLD, 19));
		Btn3.setBounds(110, 180, 50, 50);
		frmStandardCalculator.getContentPane().add(Btn3);
	
		JButton BtnSub = new JButton("-");
		BtnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				firstnum=Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations="-";
			}
		});
		BtnSub.setFont(new Font("Tahoma", Font.BOLD, 19));
		BtnSub.setBounds(160, 180, 50, 50);
		frmStandardCalculator.getContentPane().add(BtnSub);
	
		///////////////*********ROW_4*********
		JButton Btn0 = new JButton("0");
		Btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				String EnterNumber = txtDisplay.getText()+Btn0.getText();
				txtDisplay.setText(EnterNumber);
			}
		});
		Btn0.setFont(new Font("Tahoma", Font.BOLD, 19));
		Btn0.setBounds(10, 230, 50, 50);
		frmStandardCalculator.getContentPane().add(Btn0);

		JButton BtnDot = new JButton(".");
		BtnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				firstnum=Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations=".";
			}
		});
		BtnDot.setFont(new Font("Tahoma", Font.BOLD, 19));
		BtnDot.setBounds(60, 230, 50, 50);
		frmStandardCalculator.getContentPane().add(BtnDot);

		JButton BtnAdd = new JButton("+");
		BtnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				firstnum=Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations="+";
			}
		});
		BtnAdd.setFont(new Font("Tahoma", Font.BOLD, 19));
		BtnAdd.setBounds(110, 230, 50, 50);
		frmStandardCalculator.getContentPane().add(BtnAdd);

		JButton BtnEql = new JButton("=");
		BtnEql.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String answer;
				secondnum=Double.parseDouble(txtDisplay.getText());
				if(operations=="+")
				{
					result=firstnum+secondnum;
					answer=String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				else if(operations=="-")
				{
					result=firstnum-secondnum;
					answer=String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				else if(operations=="*")
				{
					result=firstnum*secondnum;
					answer=String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				else if(operations=="/")
				{
					result=firstnum/secondnum;
					answer=String.format("%.2f", result);
					txtDisplay.setText(answer);
				}
				
				else
				{
					txtDisplay.setText("WRONG INPUT");
				}
			}
			});
		BtnEql.setFont(new Font("Tahoma", Font.BOLD, 19));
		BtnEql.setBounds(160, 230, 50, 50);
		frmStandardCalculator.getContentPane().add(BtnEql);
		
		
	}
}
