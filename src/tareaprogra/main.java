package tareaprogra;

import java.util.InputMismatchException;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {


        registroalumno C = new registroalumno(30);
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;

        //Bucle para pedir las opciones hasta que elijamos salir
        while (!salir) {

            //opciones
            System.out.println("1. Registrar Alumnos");
            System.out.println("2. Mostrar Alumnos");
            System.out.println("3. Modificar Datos de Alumnos");
            System.out.println("4. Salir");

            try{

                //Pide una opcion
                System.out.println("Introduce un numero: ");
                opcion = sn.nextInt();

                //Realiza una de las opciones
                switch (opcion) {
                    case 1:
                        agregar(C); break;

                    case 2:
                        Ver(C);break;


                    case 3:modificar(C);
                    break;
                    case 4:
                        salir=true;
                        break;
                    default:
                        System.out.println("Las opciones son entre 1 y 4");
                }


                //controla la excepcionn en caso de que se introduzca un valor no correcto
            }catch(InputMismatchException e){
                System.out.println("Debes escribir un numero");
                sn.next();
            }

        }

        System.out.println("Fin del menu");

    }



    private static void agregar(registroalumno C) {
        Scanner ent = new Scanner(System.in);



        String NombreAlumno, ApellidoAlumno, TelefonoAlumno, CorreoAlumno;
        int aleatorio = 0;
        aleatorio = (int) (Math.random() * 10000);

        System.out.println("Nombre ");
        NombreAlumno = ent.nextLine();
        System.out.println("Apellido ");
        ApellidoAlumno = ent.nextLine();
        System.out.println("Telefono ");
        TelefonoAlumno = ent.nextLine();
        System.out.println("Correo ");
        CorreoAlumno = ent.nextLine();
        C.agregar(new Persona(NombreAlumno, ApellidoAlumno, TelefonoAlumno, CorreoAlumno, aleatorio));

    }

    private static void Ver(registroalumno C) {
        System.out.println(C.toStrin());

    }





    private static void modificar(registroalumno C) {
        Scanner ent = new Scanner(System.in);
        int NombreAlumno;
        String nuevo;
        System.out.println("Nombre");
        NombreAlumno = Integer.parseInt(ent.nextLine());
        Persona aux = C.buscar(String.valueOf(NombreAlumno));
        if(aux != null){
            System.out.println("Nombre Nuevo");
            nuevo = ent.nextLine();
            aux.setNombreAlumno(nuevo);
        }else{
            System.out.println("No existe Persona");
        }
    }
}
