package pe.edu.upc.anonmusic.dtos;

public class UsuarioConMasSeguidoresDTO {
    private int idUsuario;
    private String username;
    private String correo;
    private int totalseguidores;

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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
