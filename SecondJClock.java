import java.awt.*;

import javax.swing.*;
import java.util.Date;
import java.text.SimpleDateFormat;

							
@SuppressWarnings("serial")
public class SecondJClock extends JFrame{

	public SecondJClock(){
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLocationRelativeTo(null);
		
		JLabel clk = new JLabel(new SimpleDateFormat("HH:mm:ss").format(new Date()));
		
		setIconImage(new ImageIcon("C://Users//Eric//Desktop//Programs//CS245_JavaSwingGUI//JClock.png").getImage());
		
		getContentPane().setBackground(Color.blue);
		clk.setForeground(Color.red);
		clk.setFont(new Font(clk.getFont().getFontName(), clk.getFont().getStyle(), 100));
		
		add(clk);
		
		new Timer(1000, ae-> {
			clk.setText(new SimpleDateFormat("HH:mm:ss").format(new Date()));
		}).start();
		
		
		
		pack();
		
		
	}
	
	
	public static void main(String[] args){
		SwingUtilities.invokeLater(() -> 
		new SecondJClock());
	}
}
