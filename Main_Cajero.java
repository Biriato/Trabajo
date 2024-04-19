package Proyecto_CODE;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

import static Proyecto_CODE.Operacion.cuentas;

public class Main_Cajero {
    static Scanner sc = new Scanner(System.in);
    static Scanner sc2 = new Scanner(System.in);
    static int id=1;
    static  int numcuenta =1;
    public static void main(String[] args) {
        int opcion=1;
        boolean existe = false;
        do{
            System.out.println("Seleciona la opcion que quieras realizar");
            System.out.println("0)Salir 1)Administar Cuenta 2 Operaciones con su cuenta");
            opcion=sc.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Seleccionaste Administrar Cuenta");
                    System.out.println("1)Alta de cuenta 2)Dar de baja una cuenta 3)Modificar cuenta");
                    opcion = sc.nextInt();
                    switch (opcion){
                        case 1: AñadirCuenta();
                            break;
                        case 2: EliminarCuenta();
                            break;
                        case 3: ModificarCuenta();
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Introduce el numero de cuenta y el dni");
                    if(existe){
                        System.out.println("Que operacion quieres realizar sobre esta cuenta");
                        System.out.println("1)Ingreso 2)Retirada 3)Traspaso 4)Ver Saldo de la cuenta");
                        switch (opcion){
                            case 1:
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                        }
                    }

                    break;

            }
        }while(opcion!=0);

    }
    public static void AñadirCuenta(){
        System.out.println("Introduce un DNI");
        String DNI=sc2.nextLine();
        System.out.println("Saldo base de la cuenta");
        int saldob = sc.nextInt();
        System.out.println("Propietario de la cuenta");
        String prop = sc2.nextLine();
        cuentas.put(id,new CuentaBanco(DNI,numcuenta,saldob,prop));

    }

    public  static void EliminarCuenta(){
        System.out.println("Introduce el numero de cuenta que quieres eliminar");
        int ver = sc.nextInt();
        int clave=0;

        for (Map.Entry<Integer,CuentaBanco> c : cuentas.entrySet()) {
            if (ver == c.getValue().getNumCuenta()) {
                   clave=c.getKey();
            }
        }
        cuentas.remove(clave);

    }
    public static  void ModificarCuenta(){
        int clave = 0;
        String p="";
            System.out.println("Introduce el numero de cuenta que quieres modificar");
            int acu = sc.nextInt();
            for (Map.Entry<Integer, CuentaBanco> c : cuentas.entrySet()) {
                if (acu == c.getValue().getNumCuenta()) {
                    clave = c.getKey();
                } else {
                    clave = 0;
                }
            }
            if(clave!=0){
                System.out.println("Introduce el nuevo propietario");
                p=sc2.nextLine();
                for (Map.Entry<Integer, CuentaBanco> c : cuentas.entrySet()) {
                    if (clave==c.getKey()) {
                        c.getValue().setPropietario(p);
                    }
                }
            }


    }


}
