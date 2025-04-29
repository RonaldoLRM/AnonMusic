package pe.edu.upc.anonmusic.dtos;

public class UsuarioConMasSeguidoresDTO {
    private int idUsuario;
    private String nombre;
    public String correo;
    public int totalseguidores;

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getTotalseguidores() {
        return totalseguidores;
    }

    public void setTotalseguidores(int totalseguidores) {
        this.totalseguidores = totalseguidores;
    }
}
