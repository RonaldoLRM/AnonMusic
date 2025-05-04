package pe.edu.upc.anonmusic.dtos;

public class UsuariosConMasReaccionesNegativasDTO {
    private int idUsuario;
    public int cantidadReacciones;

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getCantidadReacciones() {
        return cantidadReacciones;
    }

    public void setCantidadReacciones(int cantidadReacciones) {
        this.cantidadReacciones = cantidadReacciones;
    }
}
