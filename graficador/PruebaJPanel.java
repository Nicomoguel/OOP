import javax.swing.JFrame;

public class PruebaJPanel{
    public static void main(String[] s){
        JFrame frame = new JFrame("Prueba ventana");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.add(new MiPanel());
        frame.pack();

        frame.setSize(500, 500);
        frame.setVisible(true);
    }
}
