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
    private Polinomio p;
    private int xInicial, xFinal, yInicial, yFinal;

    public MiPanel(){
        setBorder(BorderFactory.createLineBorder(Color.black));
        int[] coeficientes = {0,0,1};
        this.p = new Polinomio(coeficientes);
        this.xInicial = -5;
        this.xFinal = 5;
        this.yInicial = -5;
        this.yFinal = 5;
        addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent e){
                moveSquare(e.getX(), e.getY());
            }
        });
    }

    private void graficarFuncion(Graphics g){
        double x, y, sigX, sigY;
        double siguienteX, siguienteY;
        for(int pixel = 0; pixel < this.getWidth(); pixel++){
            x = escalar(pixel);
            y = this.p.evaluar(x);
        }
        
    }
    
    private double escalarX(int x){
        double xEscalada = x - this.getWidth() / 2.0;
        xEscalada /= this.getWidth();
        xEscalada *= (this.xFinal - this.xInicial);
        return xEscalada
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
        // dibujamos los ejes coordenados
        g.drawLine(this.getWidth()/2, 0, this.getWidth()/2, this.getHeight());
        g.drawLine(0, this.getHeight()/2, this.getWidth(), this.getHeight()/2);
        g.drawLine(0, this.getHeight(), this.getWidth(), 0);
        g.drawLine(0, 0, this.getWidth(), this.getHeight());

        graficarFuncion(g);
    }
}
