/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete5;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SALAI
 */
public class Ejecutor2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        System.out.println("Ingrese el nombre del Estudiante");
        String nombre = entrada.nextLine();
        System.out.println("Ingrese los Apellidos del Estudiante");
        String apellido = entrada.nextLine();
        System.out.println("Ingrese la identificacion del Estudiante");
        String identificacion = entrada.nextLine();
        System.out.println("Ingrese la edad del Estudiante");
        int edad = entrada.nextInt();
        System.out.println("Ingrse el numero de Creditos");
        int numCreditos = entrada.nextInt();
        System.out.println("Ingrse el costo del Credito");
        double costoCreditos = entrada.nextDouble();

        EstudiantePresencial estPresencial = new EstudiantePresencial(nombre,
                apellido, identificacion, edad, numCreditos, costoCreditos);

        estPresencial.calcularMatriculaPresencial();

        System.out.printf("%s\n",estPresencial);
    }
}
