public class Formulario {
    private static Formulario instancia = new Formulario();

    private Formulario() {}

    public static Formulario getInstancia() {
        return instancia;
    }

    public String receberElogioRestaurante(String mensagem) {
        return "Agradecemos seu contato.\n"+
                "A Pizzaria respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Pizzaria.getInstancia().receberElogio(mensagem);
    }

    public String receberReclamacaoRestaurante(String mensagem) {
        return "Agradecemos seu contato.\n"+
                "A Pizzaria respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Pizzaria.getInstancia().receberReclamacao(mensagem);
    }

    public String receberSugestaoRestaurante(String mensagem) {
        return "Agradecemos seu contato.\n"+
                "A Pizzaria respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Pizzaria.getInstancia().receberSugestao(mensagem);
    }
}
