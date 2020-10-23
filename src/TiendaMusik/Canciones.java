package TiendaMusik;

import java.util.Objects;

/*
 @author Castel...
 */
public class Canciones {

    private String nombre;
    private String artista;
    private String genero;
    private String album;
    private String fecha_ao;
    private int id_cancion;
    

    public Canciones() {
    }
    

    public Canciones(String nombre, String artista, String genero, String album, String fecha_ao, int id_cancion) {
        this.nombre = nombre;
        this.artista = artista;
        this.genero = genero;
        this.album = album;
        this.fecha_ao = fecha_ao;
        this.id_cancion = id_cancion;
    }

    public Canciones(String nombre, String artista, String genero) {
        this.nombre = nombre;
        this.artista = artista;
        this.genero = genero;
    }

    


    public Canciones(int id_cancion) {
        this.id_cancion = id_cancion;
    }

    
    

    

   
    @Override
    public String toString() {
        return "\n Nombre: " + nombre + "\n Artista: " + artista + "\n Genero: " + genero + "\n Album: " + album + "\n Año: " + fecha_ao + "\n Identificador: " + id_cancion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getFecha_ao() {
        return fecha_ao;
    }

    public void setFecha_ao(String fecha_ao) {
        this.fecha_ao = fecha_ao;
    }

    public int getId_cancion() {
        return id_cancion;
    }

    public void setId_cancion(int id_cancion) {
        this.id_cancion = id_cancion;
    }

    

    
    
    

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    public boolean equalscancion(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Canciones other = (Canciones) obj;
        if (!Objects.equals(this.id_cancion, other.id_cancion)) {
            return false;
        }
        return true;
    }

}
