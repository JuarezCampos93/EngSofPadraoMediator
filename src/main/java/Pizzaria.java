public class Pizzaria implements Empresa {

    private static Pizzaria instancia = new Pizzaria();

    private Pizzaria() {}

    public static Pizzaria getInstancia() {
        return instancia;
    }

    public String receberReclamacao(String mensagem) {
        return "A Pizzaria vai procurar melhorar o serviço da reclamação: " + mensagem;
    }

    public String receberElogio(String mensagem) {
        return "A Pizzaria agradece a mensagem: " + mensagem;
    }

    public String receberSugestao(String mensagem) {
        return "A Pizzaria vai analisar a sugestão: " + mensagem;
    }
}
