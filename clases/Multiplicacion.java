package clases;

import modelo.Operacion;

public class Multiplicacion extends Operacion {

    public Multiplicacion(double x, double y) {
        super(x, y);
      
    }

    //Metodos 
    public void multiplicacion()
    {
        resultado=x*y;
    }
    
}
