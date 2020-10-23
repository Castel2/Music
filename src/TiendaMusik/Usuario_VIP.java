package TiendaMusik;

/*
 @author castel
 */
public class Usuario_VIP extends Persona {

    private String descuento;

    public Usuario_VIP(String Nombre, String Apellido, int Cedula, String Direccion, String Telefono, String descuento, String Nickname, String Contrasena) {
        super(Nombre, Apellido, Cedula, Direccion, Telefono, Contrasena, Nickname);
        this.descuento = descuento;
    }

    public Usuario_VIP(String Nickname, String Contrasena) {
        super(Nickname, Contrasena);
    }

    public Usuario_VIP(int Cedula, String Contrasena) {
        super(Cedula, Contrasena);
    }

    
    public Usuario_VIP() {
    }

    public String getDescuento() {
        return descuento;
    }

    public void setDescuento(String descuento) {
        this.descuento = descuento;
    }

    @Override
    public String toString() {
        return "\n Nombre: " + Nombre + "\n Apellido:" + Apellido + "\n Cedula: " + Cedula + "\n Direccion: " + Direccion + "\n Telefono: " + Telefono + "\n descuento: " + descuento;
    }

}
