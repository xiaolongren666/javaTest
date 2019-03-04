/**
 * 
 */
package ink.xlr.iframe;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
*@Author:小龙人
*@File Name:LoginFrame.java
*@Created Time:2019年2月22日下午8:02:44
*@Introduce Function:登陆窗口
*/
public class LoginFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginFrame frame = new LoginFrame();
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
	public LoginFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 603, 418);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblip = new JLabel("服务器IP：");
		lblip.setHorizontalAlignment(SwingConstants.RIGHT);
		lblip.setBounds(42, 59, 119, 21);
		contentPane.add(lblip);
		
		textField = new JTextField();
		textField.setBounds(176, 56, 310, 27);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel label = new JLabel("服务器端口:");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setBounds(35, 148, 126, 21);
		contentPane.add(label);
		
		textField_1 = new JTextField();
		textField_1.setBounds(176, 145, 186, 27);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel label_1 = new JLabel("昵称：");
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		label_1.setBounds(80, 222, 81, 21);
		contentPane.add(label_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(176, 219, 186, 27);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JButton button = new JButton("关   闭");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setBounds(80, 285, 123, 29);
		contentPane.add(button);
		
		JButton button_1 = new JButton("登   陆");
		button_1.setBounds(338, 285, 123, 29);
		contentPane.add(button_1);
		
		
		// 设置窗体居中
		this.setLocationRelativeTo(null);
		// 设置标题
		this.setTitle("登陆聊天器");
	}
}
