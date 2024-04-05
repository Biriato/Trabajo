package Proyecto_CODE;

import java.util.HashSet;

public class Operacion {
    private String TipoOperacion;
    private HashSet<CuentaBanco> cuenta;

    //Constructores

    public Operacion(String tipoOperacion) {
        TipoOperacion = tipoOperacion;
        cuenta = new HashSet<>();
    }
    //Metodos de la clase
    public void ingreso(){

    }
    public void retirada(){

    }
    public void traspaso(){

    }
    public void verSaldo(){

    }

}
