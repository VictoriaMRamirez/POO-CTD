package FinalPoo;

public class CargaSimple extends Carga {
    private Double pesoCarga;
    private Boolean tieneRefrigeracion;

    public CargaSimple(String nombre, String descripcion, Double pesoCarga, Boolean tieneRefrigeracion) {
        super(nombre, descripcion);
        this.pesoCarga = pesoCarga;
        this.tieneRefrigeracion = tieneRefrigeracion;
    }

    @Override
    public Double calcularPeso() {
        if (tieneRefrigeracion) {
            return pesoCarga + (pesoCarga * 0.1);
        }
        return pesoCarga;
    }
}
