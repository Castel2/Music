package Administradores;

/*
 @author castel
 */
public interface CRUD {

    public boolean crear(Object obj);

    public void buscar(Object obj);

    public boolean consultar(Object obj);

    public void consultarTodos();

    public boolean Borrar(Object obj);

    public void Modificar(Object obj);
    
    public boolean mostrar(Object obj);
}
