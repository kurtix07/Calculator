package Calculator;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.*;

public class calculatorFrame {

	public static void createWindow() {
	JFrame frame = new JFrame("Adam's first Calculator");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	JLabel textLabel = new JLabel("Adam's first Calculator", SwingConstants.CENTER);
	textLabel.setPreferredSize(new Dimension(300, 100));
	frame.getContentPane().add(textLabel, BorderLayout.CENTER);
	frame.setLocationRelativeTo(null);
	frame.pack();
	frame.setVisible(true);
	}
	public static void main(String [] args){
		createWindow();
	}
}