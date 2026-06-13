import javax.swing.BorderFactory;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;
public class MiPanel extends JPanel{

    public MiPanel(){
        setBorder(BorderFactory.createLineBorder(Color.black));
    }
    public Dimension getPreferredSize(){
        return new Dimension(250, 200);
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawString("Este es un ejemplo", 10, 20);
    }
}
