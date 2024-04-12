package Proyecto_CODE;

import java.util.HashSet;
import java.util.Hashtable;

public class Operacion {
    private String TipoOperacion;

    private Hashtable<Integer , CuentaBanco> cuentas;


    //Constructores

    public Operacion(String tipoOperacion) {
        this.TipoOperacion = tipoOperacion;
        this.cuentas = new Hashtable<>();
    }
    //Metodos de la clase
    public void Ingreso(){

    }
    public void Retirada(){

    }
    public void Traspaso(){

    }
    public void VerSaldo(){

    }

}
