public class Printer {
    public static void imprimirTiempoDeEnvio(Envio[] envios){
        for (Envio coche : envios) {
            System.out.println(coche.getTiempo());
        }
    }



}

