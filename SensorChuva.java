public class SensorChuva implements Sensor {
    private boolean funcionando;
    private double ultimaLeitura;

    public SensorChuva() {
        this.funcionando = true;
        this.ultimaLeitura = 0.0;
    }

    @Override
    public double lerValor() {
        if (!funcionando) {
            return 0.0;
        }
            // Simula a leitura de um valor de chuva (em mm)
        ultimaLeitura = ((Math.random() * 95.0) * 10.0) / 10.0;
        return ultimaLeitura;
    }

    @Override
    public boolean verificarFuncionamento() {
        return funcionando;
    }

    @Override
    public String retornarTipo() {
        return "Sensor de Chuva";
    }

    @Override
    public String retornarUnidade() {
        return "mm";
    }

    public void setFuncionando(boolean funcionando) {
        this.funcionando = funcionando;
    }
}
