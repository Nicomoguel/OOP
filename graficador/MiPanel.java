import java.awt.Font;
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
        int[] coeficientes = {1,0,1};
        this.p = new Polinomio(coeficientes);
        this.xInicial = -5;
        this.xFinal = 5;
        this.yInicial = -5;
        this.yFinal = 5;
    }

    private void graficarFuncion(Graphics g){
        int pixelY, sigX, sigY;
        double x, y, siguienteX, siguienteY;
        for(int pixelX = 0; pixelX < this.getWidth(); pixelX++){
            x = escalarX(pixelX);
            y = this.p.evaluar(x);
            pixelY = escalarY(y);
            sigX = pixelX + 1;
            siguienteX = escalarX(sigX);
            siguienteY = this.p.evaluar(siguienteX);
            sigY = escalarY(siguienteY);
            g.drawLine(pixelX, pixelY, sigX, sigY);

        }
        
    }

    private void dibujarPlano(Graphics g){
        g.drawLine(this.getWidth()/2, 0, this.getWidth()/2, this.getHeight());
        g.drawLine(0, this.getHeight()/2, this.getWidth(), this.getHeight()/2);
        int numeroX = -5;
        int numeroY = 5;
        for(int pixel = 0; pixel < this.getWidth(); pixel++){
            if(pixel % (this.getWidth() / 10) == 0){
                g.drawLine(pixel, (this.getHeight()/2)-10, pixel, (this.getHeight()/2)+10); 
            }
            if(pixel % (this.getHeight() / 10) == 0){ 
                g.drawLine((this.getWidth()/2)+10, pixel+4, (this.getWidth()/2)-10, pixel+4); 
            }
            if(pixel  % (this.getWidth() / 10) == 0){
                if(numeroX != 0){
                    g.drawString(String.valueOf(numeroX), pixel, (this.getHeight() / 2) - 12);   
                }
                numeroX++;
            }
            if(pixel % (this.getHeight() / 10) == 0){
                g.drawString(String.valueOf(numeroY), this.getHeight() / 2, pixel);
                numeroY--;
            }
        }
    }

        
    private int escalarY(double y){
        double yEscalada = -y;
        // invertimos la grafica por que las coordenadas del panel son de (0,0) en la esquina superior izquierda
        yEscalada = yEscalada * this.getHeight() / (this.yFinal - this.yInicial); 
        return (int)yEscalada + (this.getHeight() / 2);
    }

    
    private double escalarX(int x){
        double xEscalada = x - this.getWidth() / 2.0;
        xEscalada /= this.getWidth();
        xEscalada *= (this.xFinal - this.xInicial);
        return xEscalada;
    }


    public Dimension getPreferredSize(){
        return new Dimension(250, 250);
    }
    protected void paintComponent(Graphics g){
        g.setFont(new Font("SANS_SERIF", Font.PLAIN, 10));
        g.drawString("f(x) = x^2 + 1", 40, 50);
        this.dibujarPlano(g);
        graficarFuncion(g);
    }
}
