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
        Scanner lea = new Scanner(System.in);
        Scanner leer = new Scanner(System.in);
        ArrayList<RegistroDeUsuarios> usuario = new ArrayList<>();
        int opc;
        do {
            System.out.println("1. Registra un usuario");
            System.out.println("2. Listar todos los usuarios");
            System.out.println("3. Listar Por Dominio");
            System.out.println("4. Salir");
            System.out.println("Ingrese una opcion:");
            opc = leer.nextInt();
            switch (opc) {
                case 1 -> {
                    System.out.println("Ingrese su nombre:");
                    String nombre = lea.nextLine();
                    System.out.println("Ingrese su apellido");
                    String apellido = lea.nextLine();
                    int i;
                    int año;
                    Date FechaN;
                        Date fachaactual = new Date();
                        System.out.println("Ingrese la fecha de nacimiento (yyy/MM/dd):");
                        String fn = lea.next();
                        SimpleDateFormat fecha = new SimpleDateFormat("yyy/MM/dd");
                        FechaN = fecha.parse(fn);
                        if (FechaN.getDate() == fachaactual.getDate() && FechaN.getMonth() == fachaactual.getMonth()) {
                            i = 0;
                        } else {
                            i = 1;
                        }
                        año = fachaactual.getYear() - FechaN.getYear() - i;
                        if (año<=13){
                            System.out.println("Lo sentimos usted es menor de edad");
                            System.out.println("");
                            break;
                        }
                    String Correo;
                    boolean validador;
                    do {
                        System.out.println("Ingrese el Correo Electronico:");
                        Correo = lea.next();
                        validador = ValidadorCorreo(Correo);
                    } while (validador == false);
                    String contraseña;
                    boolean ValidadorContra;
                    do {
                        System.out.println("Ingrese Contrasena:");
                        contraseña = lea.next();
                        ValidadorContra = ValidadorContraseña(contraseña);
                    } while (ValidadorContra == false);
                    RegistroDeUsuarios Registro = new RegistroDeUsuarios(nombre, apellido, FechaN, Correo, contraseña);
                    usuario.add(Registro);
                }
                case 2 -> {
                    for (int i = 0; i < usuario.size(); i++) {
                        System.out.println(usuario.get(i));
                    }
                }
                case 3 -> {
                    for (int i = 0; i < usuario.size(); i++) {
                        if (usuario.get(i).Correo.toLowerCase().contains("gmail")) {
                            System.out.println(usuario.get(i));
                        } else if (usuario.get(i).Correo.toLowerCase().contains("outlook")) {
                            System.out.println(usuario.get(i));
                        } else if (usuario.get(i).Correo.toLowerCase().contains("yahoo")) {
                            System.out.println(usuario.get(i));
                        } else if (usuario.get(i).Correo.toLowerCase().contains("iCloud")) {
                            System.out.println(usuario.get(i));
                        } else if (usuario.get(i).Correo.toLowerCase().contains("frotonMail")) {
                            System.out.println(usuario.get(i));
                        } else if (usuario.get(i).Correo.toLowerCase().contains("fastMail.")) {
                            System.out.println(usuario.get(i));
                        }
                    }
                }
            }
        } while (opc != 4);
    }

    public static boolean ValidadorCorreo(String email) {
        String regex = "^[a-zA-Z0-9._%&$+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static boolean ValidadorContraseña(String Contraseña) {
        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[!\"<>$%?]).{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(Contraseña);
        return matcher.matches();
    }
}
