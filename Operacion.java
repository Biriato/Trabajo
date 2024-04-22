package Proyecto_CODE;


import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

/**
 *Clase en la que esta definido un Hashtable que contiene las cuentas las cuales estan identificadas por un
 * ID
 * @author Alejandro Vidal
 * @version  1.0
 */
public class Operacion {
    static Hashtable<Integer , CuentaBanco> cuentas= new Hashtable<>();
    static Scanner sc = new Scanner(System.in);


    //Constructores

    public Operacion() {
    }
    //Metodos de la clase

    /**
     * Metodo que permite ingresar un valor el cual pasas como parametro para sumarlo al saldo de la cuenta
     * identificada por su clave
     * @param clave int que pasas como parametro e identifica la cuenta
     */
    public void Ingreso(int clave){
        double ingreso=1;
        System.out.println("Introduce la cantidad a ingresar");
        ingreso = sc.nextInt();
        for (Map.Entry<Integer, CuentaBanco> c : cuentas.entrySet()) {
            if (clave == c.getKey()) {
                c.getValue().setSaldo(c.getValue().getSaldo()+ingreso);
                System.out.println("Operacion realizada con exito");

            }
        }
    }

    /**
     * Metodo que permite retirar saldo de una cuenta identificada por su clave
     * @param clave int que pasas como parametro e identifica la cuenta
     */
    public void Retirada(int clave){
        double retirada=1;
        do {
            System.out.println("Introduce la cantidad a retirar o 0 para salir");
            retirada = sc.nextInt();
        }while(retirada<0);
            for (Map.Entry<Integer, CuentaBanco> c : cuentas.entrySet()) {
                if (clave == c.getKey()) {
                    c.getValue().setSaldo(c.getValue().getSaldo() - retirada);
                    System.out.println("Operacion realizada con exito");
                    if (c.getValue().getSaldo() < 0) {
                        c.getValue().setSaldo(0);
                    }
                }
            }



    }

    /**
     * Metodo que permite pasar saldo de una cuenta a otra y encaso de no existir se anularia la operacion
     * @param clave int que identifica la cuenta del propietario
     */
    public void Traspaso(int clave){
        double retirada=1;
        int cuentat;
            System.out.println("Introduce la cantidad a traspasar o 0 para salir");
            retirada = sc.nextInt();
            for (Map.Entry<Integer, CuentaBanco> c : cuentas.entrySet()) {
                if (clave == c.getKey()) {
                    c.getValue().setSaldo(c.getValue().getSaldo() - retirada);

                }
            }
            System.out.println("Numero de cuenta al que vas a hacer el traspaso");
            cuentat = sc.nextInt();
            if(Verificar(cuentat)){
                for (Map.Entry<Integer, CuentaBanco> c : cuentas.entrySet()) {
                    if (cuentat == c.getKey()) {
                        c.getValue().setSaldo(c.getValue().getSaldo() + retirada);
                    }
                }
            }else{
                System.out.println("La cuenta no existe");
                for (Map.Entry<Integer, CuentaBanco> c : cuentas.entrySet()) {
                    if (clave == c.getKey()) {
                        c.getValue().setSaldo(c.getValue().getSaldo() + retirada);

                    }
                }


        }
        }

    /**
     * Metodo que permite ver el saldo de unacuenta usando la clave pasada como parametro
     * @param clave int que identifica a la cuenta
     */
    public void VerSaldo(int clave){
        for (Map.Entry<Integer, CuentaBanco> c : cuentas.entrySet()) {
            if (clave == c.getKey()) {
                System.out.println(c.toString());
            }
        }

    }

    /**
     * Metodo que permite verificar si una cuenta existe  usando el numero de cuenta del objeto
     * @param numacc parametro que pasamos para la verificacion
     * @return Devuelve falso cuando la cuenta no existe y verdadero cuando existe
     */
    public boolean Verificar(int numacc){
        for (Map.Entry<Integer, CuentaBanco> c : cuentas.entrySet()) {
            if (numacc == c.getValue().getNumCuenta()) {
               numacc = c.getKey();
               break;
            }
        }
        return cuentas.containsKey(numacc);
    }

}
