public class EnvioMunicipal extends Envio implements TiempoEnvio{

    public EnvioMunicipal(String tipo, Integer precio) {
        super(tipo, precio);
    }

    public EnvioMunicipal() {
    }

    @Override
    public String getTiempo() {

        return "Tiempo envio 12 horas";
    }
}
