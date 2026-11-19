public class SensorUmidade implements Sensor {
    private boolean funcionando;
    private double ultimaLeitura;

    public SensorUmidade() {
        this.funcionando = true;
        this.ultimaLeitura = 60.0;
    }

    @Override
    public double lerValor() {
        if (!funcionando) {
            return 0.0;
        }
        ultimaLeitura = Math.round((40.0 + Math.random() * 60.0) * 10.0) / 10.0;
        return ultimaLeitura;
    }

    @Override
    public boolean verificarFuncionamento() {
        return funcionando;
    }

    @Override
    public String retornarTipo() {
        return "Sensor de Umidade";
    }

    @Override
    public String retornarUnidade() {
        return "%";
    }

    public void setFuncionando(boolean funcionando) {
        this.funcionando = funcionando;
    }
}
    

