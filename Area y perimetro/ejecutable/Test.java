package ejecutable;

import javax.swing.JOptionPane;

import clases.Circulo;
import clases.Rectangulo;

public class Test {
    public static void main(String[] args) {
        double base =Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de base: "));
        double altura =Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de altura: "));
        double radio =Double.parseDouble(JOptionPane.showInputDialog("Digite el valor del radio: "));

        JOptionPane.showMessageDialog(null, "El area del rectangulo es: " + Rectangulo.getArea());
        JOptionPane.showMessageDialog(null, "El area del rectangulo es: " + rectangulo.getPerimetro());


        JOptionPane.showMessageDialog(null, "El area del circulo es: " + circulo.getArea());
        JOptionPane.showMessageDialog(null, "El perimetro del circulo es: " + circulo.getPerimetro());
    
    }

    
}
