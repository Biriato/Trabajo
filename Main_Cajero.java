package Proyecto_CODE;

import java.util.Scanner;

public class Main_Cajero {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int opcion=1;
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
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Introduce el numero de cuenta y el dni");
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
                    break;

            }
        }while(opcion!=0);

    }
}
