package pe.edu.upc.anonmusic.dtos;

public class UsuariosPorRolDTO {
    private int id;
    private String rol;
    public int cantidad_usuarios;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public int getCantidad_usuarios() {
        return cantidad_usuarios;
    }

    public void setCantidad_usuarios(int cantidad_usuarios) {
        this.cantidad_usuarios = cantidad_usuarios;
    }
}
