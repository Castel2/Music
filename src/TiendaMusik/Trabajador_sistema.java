package TiendaMusik;

/*
 @author castel
 */
public class Trabajador_sistema extends Persona {

    private String salario;

    public Trabajador_sistema(String Nombre, String Apellido, int Cedula, String Direccion, String Telefono, String salario, String Nickname, String Contrasena) {
        super(Nombre, Apellido, Cedula, Direccion, Telefono, Contrasena, Nickname);
        this.salario = salario;
    }

    public Trabajador_sistema(String Nickname, String Contrasena) {
        super(Nickname, Contrasena);
    }

    public Trabajador_sistema(int Cedula, String Contrasena) {
        super(Cedula, Contrasena);
    }

    public Trabajador_sistema(int Cedula) {
        super(Cedula);
    }

    
    public Trabajador_sistema() {
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "\n Nombre: " + Nombre + "\n Apellido: " + Apellido + "\n Cedula: " + Cedula + "\n Direccion: " + Direccion + "\n Telefono: " + Telefono + "\n salario: " + salario;
    }

}
