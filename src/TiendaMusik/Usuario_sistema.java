package TiendaMusik;
/*
 @author castel
 */

public class Usuario_sistema extends Persona {

    public Usuario_sistema(String Nombre, String Apellido, int Cedula, String Direccion, String Telefono, String Contrasena, String Nickname) {
        super(Nombre, Apellido, Cedula, Direccion, Telefono, Contrasena, Nickname);
    }

    public Usuario_sistema(String Nickname, String Contrasena) {
        super(Nickname, Contrasena);
    }

    public Usuario_sistema(int Cedula, String Contrasena) {
        super(Cedula, Contrasena);
    }

    public Usuario_sistema(int Cedula) {
        super(Cedula);
    }

    
    public Usuario_sistema() {
    }

    @Override
    public String toString() {
        return "\n Nombre: " + Nombre + "\n Apellido: " + Apellido + "\n Cedula: " + Cedula + "\n Direccion: " + Direccion + "\n Telefono: " + Telefono;
    }

}
