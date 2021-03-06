/**
 * 
 */
package ink.xlr.test;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Scanner;
import java.awt.event.ActionEvent;

/**
*@Author:小龙人
*@File Name:GuessJFrame.java
*@Created Time:2019年3月21日下午2:31:52
*@Introduce Function:TODO
*/
public class GuessJFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private static GuessJFrame frame; 
	//创建Random类变量
	Random ran = new Random();
	int ranNumber = ran.nextInt(100)+1;
	int up = 100;
	int down = 0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new GuessJFrame();
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
	public GuessJFrame() {
		setTitle("猜数游戏");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(74, 82, 277, 27);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String message = guessNumber(Integer.parseInt(textField.getText()));
				JOptionPane.showMessageDialog(null, message);
				if("恭喜你，猜对了!\n游戏结束！".equals(message)) {
					System.exit(0);
				} 
			}
		});
		btnNewButton.setBounds(140, 144, 123, 29);
		contentPane.add(btnNewButton);
	}
	
	public String guessNumber(int number) {
		String message = "";
			if(number>ranNumber) {
				up = number;
				message = "猜错了！在[" + down + "-" + up + "]范围内猜数！";
			}else if(number<ranNumber) {
				down = number;
				message = "猜错了！在[" + down + "-" + up + "]范围内猜数！";
			}else {
				message = "恭喜你，猜对了!\n游戏结束！";
			}
		return message;
	}
}
