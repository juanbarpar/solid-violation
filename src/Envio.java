public class Envio extends TipoEnvio implements TiempoEnvio{
  private Integer precio;
  public Envio(String tipo, Integer precio) {
    super(tipo);
    this.precio = precio;
  }

  public Envio( ) {

  }

  @Override
  public String getTiempo() {
    return null;
  }
}