package pe.edu.upc.anonmusic.dtos;

public class UsuariosConMasMusicaAnonimaDTO {
    private int idUsuario;
    private String nombre;
    public int total_musica_anonima;

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

    public int getTotal_musica_anonima() {
        return total_musica_anonima;
    }

    public void setTotal_musica_anonima(int total_musica_anonima) {
        this.total_musica_anonima = total_musica_anonima;
    }
}
