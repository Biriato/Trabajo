package Proyecto_CODE;


import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class Operacion {
    static Hashtable<Integer , CuentaBanco> cuentas= new Hashtable<>();
    static Scanner sc = new Scanner(System.in);
    private String TipoOperacion;

    //Constructores

    public Operacion(String tipoOperacion) {
        this.TipoOperacion = tipoOperacion;

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
        System.out.println("Introduce el numero de cuanta a la que quieras realizar el traspaso");
        int numc = sc.nextInt();
        do {
            System.out.println("Introduce la cantidad a traspasar o 0 para salir");
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
    public void VerSaldo(int clave){

    }

}
