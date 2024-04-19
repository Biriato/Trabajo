package Proyecto_CODE;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

import static Proyecto_CODE.AdminCuenta.*;
import static Proyecto_CODE.Operacion.cuentas;
public class Main_Cajero {
    static Scanner sc = new Scanner(System.in);
    static Scanner sc2 = new Scanner(System.in);
    static int id=1;
    static  int numcuenta =1;
    public static void main(String[] args) {
        Operacion operacion = new Operacion();
        int a;
        int opcion=1;
        int numacc=0;
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
                    System.out.println("Introduce el numero de cuenta");
                    numacc = sc.nextInt();
                    existe = operacion.Verificar(numacc);
                    if(existe){
                        System.out.println("Que operacion quieres realizar sobre esta cuenta");
                        System.out.println("1)Ingreso 2)Retirada 3)Traspaso 4)Ver Saldo de la cuenta");
                        switch (opcion){
                            case 1:
                                operacion.Ingreso(numacc);
                                existe = false;
                                break;
                            case 2:
                                operacion.Retirada(numacc);
                                existe = false;
                                break;
                            case 3:
                                operacion.Traspaso(numacc);
                                existe = false;
                                break;
                            case 4:
                                operacion.VerSaldo(numacc);
                                existe = false;
                                break;
                        }
                    }else {
                        System.out.println("El numero de cuenta introducido no existe");

                    }

                    break;

            }
        }while(opcion!=0);

    }



}
