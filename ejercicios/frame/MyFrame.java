import java.awt.Color;
import javax.swing.*;
public class MyFrame extends JFrame{
	MyFrame(){
		// GUI window to add components to
               
                this.setTitle("This is the title");
                this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                this.setResizable(false);
                this.setSize(420, 420);
                ImageIcon image = new ImageIcon("215904197.jpeg");
                this.setIconImage(image.getImage());
                this.getContentPane().setBackground(new Color(123,200,90));
                this.setVisible(true);

	}	
}
