package Proyecto_CODE;


import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class Operacion {
    static Hashtable<Integer , CuentaBanco> cuentas= new Hashtable<>();
    static Scanner sc = new Scanner(System.in);


    //Constructores

    public Operacion() {
    }
    //Metodos de la clase
    public void Ingreso(int clave){
        int ingreso=1;
        System.out.println("Introduce la cantidad a ingresar");
        ingreso = sc.nextInt();
        for (Map.Entry<Integer, CuentaBanco> c : cuentas.entrySet()) {
            if (clave == c.getKey()) {
                c.getValue().setSaldo(c.getValue().getSaldo()+ingreso);
                System.out.println("Operacion realizada con exito");
            }
        }
    }
    public void Retirada(int clave){
        int retirada=1;
        do {
            System.out.println("Introduce la cantidad a retirar o 0 para salir");
            retirada = sc.nextInt();
        }while(retirada<0);
        while (retirada!=0){

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

    }
    public void Traspaso(int clave){
        int retirada=1;
        while (retirada!=0){
            System.out.println("Introduce la cantidad a traspasar o 0 para salir");
            retirada = sc.nextInt();
            for (Map.Entry<Integer, CuentaBanco> c : cuentas.entrySet()) {
                if (clave == c.getKey()) {
                    c.getValue().setSaldo(c.getValue().getSaldo() - retirada);

                    System.out.println("Operacion realizada con exito");
                }
            }

        }
        }

    public void VerSaldo(int clave){
        for (Map.Entry<Integer, CuentaBanco> c : cuentas.entrySet()) {
            if (clave == c.getKey()) {
                System.out.println(c.toString());
            }
        }

    }
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
