
//import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;
//import java.util.Random;

@SuppressWarnings("serial")
public class JClock extends JFrame {

	JLabel display = new JLabel(new SimpleDateFormat("HH:mm:ss").format(new Date()));
	
	//Timer timer = new Timer(1000,this);
	
	JClock(){
		
	
		setTitle("JClock");
		setSize(375,150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLocationRelativeTo(null);
		
		ImageIcon icon = new ImageIcon("C://Users//Eric//Desktop//Programs//CS245_JavaSwingGUI//JClock.png");
		setIconImage(icon.getImage());
		
		add(display);
		display.setHorizontalAlignment(SwingConstants.CENTER);
		
		display.setFont(new Font("Courier", display.getFont().getStyle(), 80));
		getContentPane().setBackground(Color.GREEN);
		display.setForeground(Color.red);
		pack();
		
		new Timer(1000, ae-> {
			display.setText(new SimpleDateFormat("HH:mm:ss").format(new Date()));
		}).start();
		
		
		
	}
	


	public static void main(String[] args){
		SwingUtilities.invokeLater(()->
		new JClock());
	}
	
	
	
}
