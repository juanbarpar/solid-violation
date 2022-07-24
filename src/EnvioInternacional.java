public class EnvioInternacional extends Envio implements TiempoEnvio{
    public EnvioInternacional(String tipo, Integer precio) {
        super(tipo, precio);
    }

    public EnvioInternacional() {
    }

    @Override
    public String getTiempo() {

        return "Tiempo envio 90 horas";
    }
}
