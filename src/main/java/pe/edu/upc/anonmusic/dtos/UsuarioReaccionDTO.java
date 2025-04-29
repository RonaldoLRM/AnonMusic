package pe.edu.upc.anonmusic.dtos;

public class UsuarioReaccionDTO {
    private String username;
    private int tipo;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
}
