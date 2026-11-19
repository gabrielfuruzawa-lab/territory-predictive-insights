public class SensorNivelRio implements Sensor {
    private boolean funcionando;
    private double ultimaLeitura;

    public SensorNivelRio(){
        this.funcionando = true;
        this.ultimaLeitura = 1.5;
    }

    @Override
    public double lerValor() {
        if (!funcionando) {
            return 0.0;
        }
        ultimaLeitura = Math.round((1.0 + Math.random() * 4.5) * 100.0) / 100.0;
        return ultimaLeitura;
}
@Override
    public boolean verificarFuncionamento() {
        return funcionando;
    }

    @Override
    public String retornarTipo() {
        return "Sensor de Nível do Rio";
    }

    @Override
    public String retornarUnidade() {
        return "m";
    }

    public void setFuncionando(boolean funcionando) {
        this.funcionando = funcionando;
    }
}
