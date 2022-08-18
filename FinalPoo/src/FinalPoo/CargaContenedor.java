package FinalPoo;

import java.util.ArrayList;
import java.util.List;

public class CargaContenedor extends Carga {
    private Double pesoContenedor;
    private List<Carga> cargas;

    public CargaContenedor(String nombre, String descripcion, Double pesoContenedor) {
        super(nombre, descripcion);
        cargas = new ArrayList<>();
        this.pesoContenedor = pesoContenedor;
    }

    public void agregarContenedor(Carga carga) {
        cargas.add(carga);
    }

    @Override
    public Double calcularPeso() {
        Double pesoTotal = 0.0;
        for (Carga carga : cargas) {
            pesoTotal += carga.calcularPeso();
        }
        return pesoTotal + pesoContenedor;
    }
}
