import javax.swing.BorderFactory;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseMotionAdapter;
public class MiPanel extends JPanel{
    
    private int squareX = 50;
    private int squareY = 50;
    private int squareW = 20;
    private int squareH = 20;

    public MiPanel(){
        setBorder(BorderFactory.createLineBorder(Color.black));

        addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent e){
                moveSquare(e.getX(), e.getY());
            }
        });
    }

    private void moveSquare(int x, int y){
        int OFFSET = 1;
        if(squareX != x || squareY != y){
            repaint(squareX, squareY, squareW+OFFSET, squareH+OFFSET);
            squareX = x;
            squareY = y;
            repaint(squareX, squareY, squareW+OFFSET, squareH+OFFSET);
        }
    }   

    public Dimension getPreferredSize(){
        return new Dimension(250, 200);
    }
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawString("Este es un ejemplo", 10, 20);
        g.setColor(Color.RED);
        g.fillRect(squareX,squareY,squareW,squareH);
        g.setColor(Color.BLACK);
        g.drawRect(squareX,squareY,squareW,squareH);
    }
}
