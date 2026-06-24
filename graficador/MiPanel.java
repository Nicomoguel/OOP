import java.awt.Font;
import javax.swing.BorderFactory;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.AlphaComposite;
import java.awt.Graphics2D;
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
    private Funcion p;
    private Funcion[] funciones;
    private int xInicial, xFinal, yInicial, yFinal;

    public MiPanel(){
        setBorder(BorderFactory.createLineBorder(Color.black));
        //double[] coeficientes = {1.0,1.0,1.0,1.0};
        //Trigonometrica a = new Seno(1.0, 1.0, 0.0, 0.0);
        //Seno a_sen = (Seno) a;
        //Coseno derivada_sen = (Coseno)a_sen.derivar();
        //this.p = derivada_sen;
        funciones = new Funcion[3];
        funciones[0] = new Polinomio(new double[]{2.5,7.9,4.5});
        funciones[1] = new Seno(1.0,1.0,0,0);
        funciones[2] = new Coseno(1.0,1.0,0,0);
        this.xInicial = -5;
        this.xFinal = 5;
        this.yInicial = -5;
        this.yFinal = 5;
    }

    private void graficarFunciones(Graphics g){
        for(int i = 0; i < funciones.length; i++){
            graficarFuncion(this.funciones[i], g);
        }
    }

    private void graficarFuncion(Funcion func, Graphics g){
        int pixelY, sigX, sigY;
        double x, y, siguienteX, siguienteY;
        for(int pixelX = 0; pixelX < this.getWidth(); pixelX++){
            x = escalarX(pixelX);
            y = func.evaluar(x);
            pixelY = escalarY(y);
            sigX = pixelX + 1;
            siguienteX = escalarX(sigX);
            siguienteY = func.evaluar(siguienteX);
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
                pintarOpacas(pixel, 0, pixel, this.getHeight(), g);
            }
            if(pixel % (this.getHeight() / 10) == 0){ 
                g.drawLine((this.getWidth()/2)+10, pixel+4, (this.getWidth()/2)-10, pixel+4);
                pintarOpacas(0,pixel+4, this.getWidth(), pixel+4, g);
            }
            if(pixel  % (this.getWidth() / 10) == 0){
                if(numeroX != 0){
                    g.drawString(String.valueOf(numeroX), pixel, (this.getHeight() / 2) - 12);   
                }
                numeroX++;
            }
            if(pixel % (this.getHeight() / 10) == 0){
                g.drawString(String.valueOf(numeroY), this.getWidth() / 2 + 12, pixel);
                numeroY--;
            }
        }
    }

    private void pintarOpacas(int x1, int y1, int x2, int y2, Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        // Configurar una opacidad del 50% (0.5f) para todo lo que se dibuje después
        AlphaComposite ac = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.2f);
        g2d.setComposite(ac);
        // Ahora las formas o imágenes se dibujarán a la mitad de su transparencia
        g2d.drawLine(x1,y1,x2,y2);
        // Restaurar el composite predeterminado (opaco al 100%)
        g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1.0f));
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
    public void printFunciones(Graphics g){
        for(int i = 0; i < funciones.length; i++){
            String funcion = funciones[i].mostrarFuncion();
            g.drawString("f(x) = " + funcion, 40, 50 + (15*i));

        }
    }


    public Dimension getPreferredSize(){
        return new Dimension(250, 250);
    }
    protected void paintComponent(Graphics g){
        g.setFont(new Font("SANS_SERIF", Font.PLAIN, 15));
        //String funcion = p.mostrarFuncion();
        // g.drawString("f(x) = " + funcion, 40, 50);

        dibujarPlano(g);
        printFunciones(g);
        graficarFunciones(g);
    }
}
