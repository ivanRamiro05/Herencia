package clases;

import modelo.Operacion;

public class Resta extends Operacion {

    public Resta(double x, double y) {
        super(x, y);
      
    }

    //Metodos 
    public void resta()
    {
        resultado=x-y;
    }
    
}
