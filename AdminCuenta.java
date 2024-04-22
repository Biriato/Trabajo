package Proyecto_CODE;

import java.util.Map;

import static Proyecto_CODE.Main_Cajero.*;
import static Proyecto_CODE.Operacion.cuentas;

/**
 * Clase vacia que solo contiene metodos que actuan directamente sobre la cuenta
 * @author Alejandro Vidal
 * @version  1.0
 */
public class AdminCuenta {
    /**
     * Metodo que crea un objeto de tipo CuentaBanco  y lo añade al Mapa
     */
    public static void AñadirCuenta(){
        System.out.println("Introduce un DNI");
        String DNI=sc2.nextLine();
        System.out.println("Saldo base de la cuenta");
        int saldob = sc.nextInt();
        System.out.println("Propietario de la cuenta");
        String prop = sc2.nextLine();
        cuentas.put(id,new CuentaBanco(DNI,numcuenta,saldob,prop));

    }

    /**
     * Metodo que permite eliminar una cuenta del Mapa usando el numero de cuenta
     */
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

    /**
     * Metodo que permite modificar la cuenta  usando el numero decuenta para cambiar el propietario
     */
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
