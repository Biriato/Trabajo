package Proyecto_CODE;

public class CuentaBanco {
    private String DNI;
    private String  NumCuenta;
    private int saldo = 0;
    private String propietario;
    //Constructores

    public CuentaBanco(String DNI, String numCuenta, int saldo, String propietario) {
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
        if(comprobar(DNI)){
            this.DNI = DNI;
        }
        else{
            System.out.println("DNI invalido");
        }
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
