package ejecutable;

import javax.swing.JOptionPane;

import clases.Division;
import clases.Multiplicacion;
import clases.Resta;
import clases.Suma;

public class Test {
    public static void main(String[] args) {
        double x =Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de x: "));
        double y =Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de y: "));

        Suma miSuma =new Suma(x, y);
        miSuma.sumar();
        JOptionPane.showMessageDialog(null, "La suma de "+y+ " y "+x+" es "+miSuma.mostrarResultado());

        Resta miResta =new Resta(x, y);
        miResta.resta();
        JOptionPane.showMessageDialog(null, "La resta de "+y+ " y "+x+" es "+miResta.mostrarResultado());

        Multiplicacion miMultiplicacion =new Multiplicacion(x, y);
        miMultiplicacion.multiplicacion();
        JOptionPane.showMessageDialog(null, "La multiplicacion de "+y+ " y "+x+" es "+miMultiplicacion.mostrarResultado());

        Division miDivision =new Division(x, y);
        miDivision.division();
        JOptionPane.showMessageDialog(null, "La division de "+y+ "y"+x+"es"+miDivision.mostrarResultado());

        System.exit(0);
    }
    
}
