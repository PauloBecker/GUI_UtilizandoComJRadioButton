import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingUtilities;

public class Tela implements ActionListener {
	
	JLabel label;
	
	public Tela() {

		JFrame frame = new JFrame("Título");
		frame.setSize(400, 300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JRadioButton radioButton1 = new JRadioButton("Facebook");
		radioButton1.setActionCommand("Facebook");
		radioButton1.addActionListener(this);
			
		JRadioButton radioButton2 = new JRadioButton("Instagram");
		radioButton2.setActionCommand("Instagram");
		radioButton2.addActionListener(this);
		
		ButtonGroup group = new ButtonGroup();
		
		group.add(radioButton1);
		group.add(radioButton2);
	
		JPanel panel1 = new JPanel(new GridLayout(0,1));
			
		panel1.add(radioButton1);
		panel1.add(radioButton2);
		
		JPanel panel = new JPanel();
		
		panel.add(panel1);
		
		frame.add(panel,BorderLayout.EAST);
		
		label = new JLabel();
		
		frame.add(label, BorderLayout.CENTER);
		
	}
	
	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {

				new Tela();
				
			}
		});
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		String img = e.getActionCommand();
		label.setIcon(new ImageIcon("img/"+img.toLowerCase()+".png"));
	}

}
