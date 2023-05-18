package clases;

import modelo.Operacion;

public class Division extends Operacion {

    public Division(double x, double y) {
        super(x, y);
      
    }

    //Metodos 
    public void division()
    {
        resultado=x/y;
    }
    
}
