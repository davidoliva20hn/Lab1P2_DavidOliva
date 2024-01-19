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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaN() {
        return FechaN;
    }

    public void setFechaN(Date FechaN) {
        this.FechaN = FechaN;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return "RegistroDeUsuarios{" + "nombre=" + nombre + ", apellido=" + apellido + ", FechaN=" + FechaN + ", Correo=" + Correo + ", contrase\u00f1a=" + contraseña + '}';
    }

}
