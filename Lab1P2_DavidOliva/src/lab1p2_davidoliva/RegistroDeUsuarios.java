/*
 */
package lab1p2_davidoliva;

import java.text.SimpleDateFormat;
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
    SimpleDateFormat fecha = new SimpleDateFormat("yyy/MM/dd");

    public RegistroDeUsuarios(String nombre, String apellido, Date FechaN, String Correo, String contraseña) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.FechaN = FechaN;
        this.Correo = Correo;
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return "Registro De Usuarios{" + "Nombre=" + nombre + ", Apellido=" + apellido + ", Fecha de Nacimiento= " + fecha.format(FechaN) + ", Correo=" + Correo + ", Contrasena=" + contraseña + '}';
    }

}
