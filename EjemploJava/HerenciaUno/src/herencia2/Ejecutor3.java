/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia2;

import java.util.Locale;
import java.util.Scanner;
import herencia1.EstudianteDistancia;
import herencia1.EstudiantePresencial;

/**
 *
 * @author reroes
 */
public class Ejecutor3 {

    public static void main(String[] args) {
        // Ingresar por teclado
        // un objeto de tipo Estudiante Distancia si el usuario ingresa 1 como 
        // opción
        // un objeto de tipo Estudiante Presencial si el usuario ingresa 2 como 
        // opción

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int opcion;

        System.out.println("Si desea ingresar un estudiante a distancia ingrese"
                + " (1) y si desea ingresar un estudiante presencial ingrese"
                + "(2)");
        opcion = entrada.nextInt();
        System.out.println("Ingrese nombres");
        entrada.nextLine();
        String nombres = entrada.nextLine();
        System.out.println("Ingrese apellidos");
        String apellidos = entrada.nextLine();
        System.out.println("Ingrese identificación");
        String identificacion = entrada.nextLine();
        System.out.println("Ingrese edad");
        int edad = entrada.nextInt();

        if (opcion == 1) {
            EstudianteDistancia estudiante = new EstudianteDistancia();
            System.out.println("Ingrese número de asignaturas");
            int asignaturas = entrada.nextInt();
            System.out.println("Ingrese costo asignatura");
            double costoAsignatura = entrada.nextDouble();
            estudiante.establecerNumeroAsginaturas(asignaturas);
            estudiante.establecerCostoAsignatura(costoAsignatura);
            estudiante.calcularMatriculaDistancia();
            estudiante.establecerNombresEstudiante(nombres);
            estudiante.establecerApellidoEstudiante(apellidos);
            estudiante.establecerEdadEstudiante(edad);
            estudiante.establecerIdentificacionEstudiante(identificacion);
            System.out.printf("%s\n", estudiante);

        } else {
            if (opcion == 2) {
                EstudiantePresencial estudiante = new EstudiantePresencial();
                System.out.println("Ingrese número de creditos");
                int creditos = entrada.nextInt();
                System.out.println("Ingrese costo asignatura");
                double costoAsignatura = entrada.nextDouble();
                estudiante.establecerNumeroCreditos(creditos);
                estudiante.establecerCostoCredito(costoAsignatura);
                estudiante.calcularMatriculaPresencial();
                estudiante.establecerNombresEstudiante(nombres);
                estudiante.establecerApellidoEstudiante(apellidos);
                estudiante.establecerEdadEstudiante(edad);
                estudiante.establecerIdentificacionEstudiante(identificacion);
                System.out.printf("%s\n", estudiante);

            } else {
                System.out.println("Opcion incorrecta");
            }
        }

    }
}
