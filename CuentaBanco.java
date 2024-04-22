package Proyecto_CODE;

/**
 * Clase que define objetos de tipo CuentaBanco
 * @author Alejandro Vidal
 * @version  1.0
 */
public class CuentaBanco {
    private String DNI;
    private int  NumCuenta;
    private double saldo = 0;
    private String propietario;
    //Constructores

    public CuentaBanco(String DNI, int numCuenta, double saldo, String propietario) {
        if(comprobar(DNI)){
            this.DNI = DNI;
        }
        else{
            System.out.println("DNI invalido");
        }
        this.NumCuenta = numCuenta;
        this.saldo = saldo;
        this.propietario = propietario;
    }

    public CuentaBanco(String DNI, int numCuenta, String propietario) {
        this.DNI = DNI;
        this.NumCuenta = numCuenta;
        this.propietario = propietario;
    }
    //Metodos Get y Set

    /**
     * Metodo que permite recuperar el DNI
     * @return String DNI
     */
    public String getDNI() {
        return DNI;
    }

    /**
     * Metodo que permite asignar un DNI  mientras sea valido si no devuelve un mensaje
     * @param DNI String al que se le asigna el valor pasado como parametro
     */
    public void setDNI(String DNI) {
        if(comprobar(DNI)){
            this.DNI = DNI;
        }
        else{
            System.out.println("DNI invalido");
        }
    }

    /**
     * Metodo que permite recurerar el valor de NumCuenta
     * @return int numCuenta
     */
    public int getNumCuenta() {
        return NumCuenta;
    }

    /**
     * Metodo que permite asignar un valor pasado como parametro a NumCuenta
     * @param numCuenta int al que se asigna el valor
     */
    public void setNumCuenta(int numCuenta) {
        NumCuenta = numCuenta;
    }

    /**
     * Metodo que permite recurerar el valor de saldo
     * @return double saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Metodo que permiteasignar un valor pasado como parametroa saldo
     * @param saldo double al que se asigna valor
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Metodo que permite recuperar el valor almacenado en propietario
     * @return String propietario
     */
    public String getPropietario() {
        return propietario;
    }

    /**
     * Metodo que permite asignar un valor a propietario pasandolo como parametro
     * @param propietario  String al que se le asigna valor
     */
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

    /**
     * Metodo que verifica DNI
     * @param cadena String que contiene un DNI
     * @return devuelve true cuando el DNI cumple las restricciones y false cuando no
     */
    public boolean comprobar(String cadena){
        String DNI = cadena.toUpperCase();
        int numero;
        String letras ="TRWAGMYFPDXBNJZSQVHLCKET";
        if(DNI.length()!=9){
            return false;
        }
        for (int i = 0; i <8 ; i++) {
            if(DNI.charAt(i)<47 || DNI.charAt(i)>57){
                return false;
            }
        }
        numero = Integer.parseInt(DNI.substring(0,8));
        char letra = DNI.charAt(8);
        if(letras.charAt(numero%23)!=letra){
            return false;
        }
        return true;
    }



}
