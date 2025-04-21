package pe.edu.upc.anonmusic.dtos;

public class UsuarioReaccionDTO {
    private String nombre;
    private int tipo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
}
