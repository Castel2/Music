package TiendaMusik;

import java.util.Objects;

/*
 @author castel
 */
public class Persona {

    protected String Nombre;
    protected String Apellido;
    protected int Cedula;
    protected String Direccion;
    protected String Telefono;
    protected String Contrasena;
    protected String Nickname;

    public Persona(String Nombre, String Apellido, int Cedula, String Direccion, String Telefono, String Contrasena, String Nickname) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Cedula = Cedula;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
        this.Contrasena = Contrasena;
        this.Nickname = Nickname;
    }

    public Persona(String Nickname, String Contrasena ) {
        this.Contrasena = Contrasena;
        this.Nickname = Nickname;
    }

    public Persona(int Cedula, String Contrasena) {
        this.Cedula = Cedula;
        this.Contrasena = Contrasena;
    }

    public Persona(int Cedula) {
        this.Cedula = Cedula;
    }

    


    public Persona() {
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        if (!Objects.equals(this.Cedula, other.Cedula)) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.Cedula);
        return hash;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getCedula() {
        return Cedula;
    }

    public void setCedula(int Cedula) {
        this.Cedula = Cedula;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getContrasena() {
        return Contrasena;
    }

    public void setContrasena(String Contrasena) {
        this.Contrasena = Contrasena;
    }

    public String getNickname() {
        return Nickname;
    }

    public void setNickname(String Nickname) {
        this.Nickname = Nickname;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

}
