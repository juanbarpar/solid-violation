public class EnvioIntermunicipal extends Envio implements TiempoEnvio{
    public EnvioIntermunicipal(String tipo, Integer precio) {
        super(tipo, precio);
    }

    public EnvioIntermunicipal() {
    }

    @Override
    public String getTiempo() {
        return "Tiempo envio 36 horas";
    }
}
