package FinalPoo;

import java.util.ArrayList;
import java.util.List;

public class Barco {

    private List<Carga> cargas;

    public Barco() {
        cargas = new ArrayList<>();
    }

    public void agregarCarga(String codigo){
        try {
            cargas.add(CargaFactory.getInstance().generarCarga(codigo));
        } catch (CargaFactoryException e) {
            System.out.println(e.getMessage());
        }
    }

    public void mostrarCargas(){
        for (Carga carga: cargas) {
            System.out.println("La carga es: " + carga.getNombre() + " y pesa: " + carga.calcularPeso() + " kgs");
        }
    }
}
