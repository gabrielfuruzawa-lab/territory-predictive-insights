public class EstacaoMonitoramento extends ComponenteTerritorial {
    private String pontoReferencia;

    public EstacaoMonitoramento(String id, String nome, String regiao, String pontoReferencia) {
        super(id, nome, regiao);
        this.pontoReferencia = pontoReferencia;
    }

    @Override
    public String verificarStatus() {
        if (isAtivo()) {
            return "A estação de monitoramento " + getNome() + " está ativa.";
        } else {
            return "A estação de monitoramento " + getNome() + " está desativada.";
        }
    }

    public String getPontoReferencia() {
        return pontoReferencia;
    }
    
}
