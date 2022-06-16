/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete4;

/**
 *
 * @author SALAI
 */
public class Ejecutor2 {

    public static void main(String[] args) {
        //1.Crear y p´resentar un objeto de tipo Estudiante Presencial
        String nombre = "René";
        String apellido = "Elizalde";
        String identificacion = "110011";
        int edad = 36;

        EstudiantePresencial estPresencial = new EstudiantePresencial(nombre,
                apellido, identificacion, edad);

        estPresencial.establecerNumeroCreditos(50);
        estPresencial.establecerCostoCredito(5.5);
        estPresencial.calcularMatriculaPresencial();

        System.out.println(estPresencial);
        do {
            System.out.println(estPresencial);
        } while (true);
    }
}
