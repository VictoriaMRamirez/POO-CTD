package FinalPoo;

public class Main {
    public static void main(String[] args) {
        Barco barco = new Barco();

        barco.agregarCarga(CargaFactory.CAJA_MEDICAMENTOS);
        barco.agregarCarga(CargaFactory.TV_32_LCD);
        barco.agregarCarga(CargaFactory.CONTENEDOR);

        barco.agregarCarga(" hola");
        barco.mostrarCargas();
    }
}
