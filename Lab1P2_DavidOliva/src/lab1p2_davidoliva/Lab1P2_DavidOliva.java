/*
 */
package lab1p2_davidoliva;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author DAVIDANDRESOLIVAHERN
 */
public class Lab1P2_DavidOliva {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        Pattern a=Pattern.compile("^?=()");
        Scanner lea = new Scanner(System.in);
        Scanner leer = new Scanner(System.in);
        ArrayList<RegistroDeUsuarios> usuario = new ArrayList<>();
        int opc;
        do {
            System.out.println("1. Registra un usuario");
            System.out.println("2. Listar todos los usuarios");
            System.out.println("3. Listar Por Dominio");
            System.out.println("6. Salir");
            System.out.println("Ingrese una opcion:");
            opc = leer.nextInt();
            switch (opc) {
                case 1 -> {
                    System.out.println("Ingrese su nombre:");
                    String nombre = lea.nextLine();
                    System.out.println("Ingrese su apellido");
                    String apellido = lea.nextLine();
                    int FechaMenor;
                    Date FechaN;
                    do {
                        System.out.println("Ingrese la fecha de nacimiento (dd/MM/yyy) :");
                        String fn = lea.next();
                        SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yyy");
                        FechaN = fecha.parse(fn);
                        FechaMenor = FechaN.getYear();
                        FechaMenor = 2010 - FechaMenor;
                    } while (FechaMenor <= 13);
                    String Correo;
                    do {
                        System.out.println("Ingrese el Correo Electrónico:");
                        Correo = lea.next();
                        
                    } while (true);
                    System.out.println("Ingrese contraseña:");
                    String contraseña = lea.next();
                    RegistroDeUsuarios Registro = new RegistroDeUsuarios(nombre, apellido, FechaN, Correo, contraseña);
                    usuario.add(Registro);
                }
                case 2 -> {
                    for (int i = 0; i < usuario.size(); i++) {
                        System.out.println(usuario.get(i));
                    }
                }
            }
        } while (true);
    }

}
