package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        //paso uno simulando cliente

        Scanner leer = new Scanner(System.in);
        System.out.print("digita el nombre del empleado 😎😎: ");
        String nombre = leer.nextLine();

        System.out.println("ingrse su documento");
        String documento = leer.nextLine();

        System.out.println("ingrese su cuenta bancaria 🪙🪙🪙🪙");
        String cuenta = leer.nextLine();

        System.out.println("ingrese el correo");
        String correo = leer.nextLine();

        System.out.println("direccion");
        String direccion = leer.nextLine();

        System.out.println("salario al mes");
        String salario = leer.nextLine();

        System.out.println("ingrese valor hora extra");
        String horaextra = leer.nextLine();

        System.out.println("ingrese la cantidad de horas extaras");
        String cantidadhorasextras = leer.nextLine();







    }
      //llamar contrato



    //fabrica de funciones

    public static Double calcular_cesantias(Double salariomensual, int diastrabajados) {
        double cesantias = salariomensual * (diastrabajados/360);
        return cesantias;
    }

    public static Double calcular_intereses_censantias(Double salariomensual) {
        double intereses = salariomensual * 0.12;
        return intereses;
    }

    public static Double calcular_prima(Double salariomensual,int diastrabajados){
        double prima = salariomensual*360;
        return  prima;

    }
        public static Double calcular_vacaciones(Double salariomensual){
        double vacaciones = salariomensual*0.5;
        return vacaciones;


        }

}


