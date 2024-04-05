package Proyecto_CODE;

public class CuentaBanco {
    private String DNI;
    private String  NumCuenta;
    private int saldo = 0;
    private String propietario;
    //Constructores

    public CuentaBanco(String DNI, String numCuenta, int saldo, String propietario) {
        this.DNI = DNI;
        this.NumCuenta = numCuenta;
        this.saldo = saldo;
        this.propietario = propietario;
    }

    public CuentaBanco(String DNI, String numCuenta, String propietario) {
        this.DNI = DNI;
        this.NumCuenta = numCuenta;
        this.propietario = propietario;
    }
    //Metodos Get y Set

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNumCuenta() {
        return NumCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        NumCuenta = numCuenta;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    @Override
    public String toString() {
        return  "DNI: " + DNI + '\'' +
                "NumCuenta: " + NumCuenta + '\'' +
                "saldo: " + saldo +
                "propietario: " + propietario + '\'' ;
    }
    //Metodos de la clase
    public void AñadirCuenta(){

    }

    public void Ingreso(){

    }
    public void Modificacion(){

    }

}
