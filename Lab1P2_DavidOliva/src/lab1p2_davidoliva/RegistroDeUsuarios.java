/*
 */
package lab1p2_davidoliva;

import java.util.Date;

/**
 *
 * @author DAVIDANDRESOLIVAHERN
 */
public class RegistroDeUsuarios {
  String nombre;
String apellido;
Date FechaN;
String Correo;
String contraseña;

    public RegistroDeUsuarios(String nombre, String apellido, Date FechaN, String Correo, String contraseña) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.FechaN = FechaN;
        this.Correo = Correo;
        this.contraseña = contraseña;
    }

}
