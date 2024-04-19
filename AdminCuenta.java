package Proyecto_CODE;

import java.util.Map;

import static Proyecto_CODE.Main_Cajero.*;
import static Proyecto_CODE.Operacion.cuentas;

public class AdminCuenta {
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
