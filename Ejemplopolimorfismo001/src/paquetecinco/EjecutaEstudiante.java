package paquetecinco;

import java.util.ArrayList;
import java.util.Scanner;
import paquetecuatro.*;

public class EjecutaEstudiante {

    public static void main(String[] args) {

        /*
        Generar un proceso que permita ingresar n número 
        de docentes. 
        El usuario decide de manera prevía cuantos objetos
        de tipo EstudiantePresencial y EstudianteDistancia
        quiere ingresar.
        
         */
        Scanner entrada = new Scanner(System.in);
        int estudiante;
        String nombresEst;
        String apellidosEst;
        String identificacionEst;
        int edadEst;
        double costoCred;
        int numeroCreds;
        double costoAsig;
        int numeroAsigs;
        int tipoEstudiante;

        System.out.println("Cuantos estudiantes va ha ingresar :");
        estudiante = entrada.nextInt();

        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        EstudiantePresencial estudianteP = new EstudiantePresencial();
        EstudianteDistancia estudianteD = new EstudianteDistancia();

        // inicio de solución
        // ciclo que permite comprobar el polimorfismo
        for (int i = 0; i < estudiante; i++) {
            System.out.println("Ingrese el nombre del Estudiate: ");
            nombresEst = entrada.nextLine();
            nombresEst = entrada.nextLine();
            System.out.println("Ingrese el apellido del Estudiante: ");
            apellidosEst = entrada.nextLine();
            System.out.println("Ingrese la identificacion del Estudiante: ");
            identificacionEst = entrada.nextLine();
            System.out.println("Ingrese la edad el Estudiante: ");
            edadEst = entrada.nextInt();

            System.out.println("Si el tipo de estudiante es Presencial ingrese "
                    + "\n[1] si es Modalidad a Distansia ingrese [2]:");
            tipoEstudiante = entrada.nextInt();

            if (tipoEstudiante == 1) {
                System.out.println("Ingrese el costo de cada credito: ");
                costoCred = entrada.nextInt();
                System.out.println("Igrese el numero de creditos: ");
                numeroCreds = entrada.nextInt();
                estudianteP.establecerNombresEstudiante(nombresEst);
                estudianteP.establecerApellidoEstudiante(apellidosEst);
                estudianteP.establecerIdentificacionEstudiante(identificacionEst);
                estudianteP.establecerEdadEstudiante(edadEst);
                estudianteP.establecerNumeroCreditos(numeroCreds);
                estudianteP.establecerCostoCredito(costoCred);
                estudiantes.add(new EstudiantePresencial());

            }
            if (tipoEstudiante == 2) {

                System.out.println("Ingrese el costo de cada Asignatura: ");
                numeroAsigs = entrada.nextInt();
                System.out.println("Igrese el numero de Asignaturas: ");
                costoAsig = entrada.nextInt();
                estudianteD.establecerNombresEstudiante(nombresEst);
                estudianteD.establecerApellidoEstudiante(apellidosEst);
                estudianteD.establecerIdentificacionEstudiante(identificacionEst);
                estudianteD.establecerEdadEstudiante(edadEst);
                estudianteD.establecerNumeroAsginaturas(numeroAsigs);
                estudianteD.establecerCostoAsignatura(costoAsig);

                estudiantes.add(new EstudianteDistancia());

            }
        }   

        // este código no debe ser modificado.
        for (int i = 0; i < estudiantes.size(); i++) {
            // 1.  
            estudiantes.get(i).calcularMatricula();
            
            System.out.printf("Datos Estudiante\n"
                        + "%s\n",                        
                  estudiantes.get(i));
        }
    }

}
