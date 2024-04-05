package Proyecto_CODE;

import java.util.HashSet;

public class Operacion {
    private String TipoOperacion;
    private HashSet<CuentaBanco> cuenta;

    //Constructores

    public Operacion(String tipoOperacion) {
        this.TipoOperacion = tipoOperacion;
        this.cuenta = new HashSet<>();
    }
    //Metodos de la clase
    public void ingreso(){

    }
    public void Retirada(){

    }
    public void Traspaso(){

    }
    public void VerSaldo(){

    }

}
