import java.util.ArrayList;

public class AndarVIP {

    public ArrayList<UsuarioComum> listaDeAcesso = new ArrayList<UsuarioComum>();
    public int andar;

    public AndarVIP(int andar) {
        this.andar = andar;
    }

    public void adicionarUsuario(UsuarioComum usuario) {
        listaDeAcesso.add(usuario);
    }

    public void removerUsuario(UsuarioComum usuario) {
        listaDeAcesso.remove(usuario);
    }

    public boolean validarDonoDeAndar(UsuarioDonoDeAndar usuario) {
        return usuario.getAndar() == this.andar;
    }

    public boolean verificarUsuario(BiometriaFacial biometriaFacial) {
        for (UsuarioComum usuario : listaDeAcesso) {
            if (usuario.getBiometriaFacial().equals(biometriaFacial)) {
                return true;
            }
        }
        return false;
    }

    public int getAndar() {
        return andar;
    }

}
