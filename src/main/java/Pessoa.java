public class Pessoa {

    public String elogiarRestaurante(String mensagem) {
        return Formulario.getInstancia().receberElogioRestaurante(mensagem);
    }

    public String reclamarRestaurante(String mensagem) {
        return Formulario.getInstancia().receberReclamacaoRestaurante(mensagem);
    }

    public String sugerirRestaurante(String mensagem) {
        return Formulario.getInstancia().receberSugestaoRestaurante(mensagem);
    }

}
