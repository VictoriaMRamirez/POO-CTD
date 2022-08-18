package FinalPoo;

public class CargaFactory {

    public static final String CONTENEDOR = "CONTENEDORL";
    public static final String CAJA_MEDICAMENTOS = "CAJA_MEDICAMENTOS";
    public static final String TV_32_LCD = "TV_32_LCD";
    private static CargaFactory instance;

    private CargaFactory() {
    }

    public static CargaFactory getInstance() {
        if(instance == null) {
            instance = new CargaFactory();
        }
        return instance;
    }

    public Carga generarCarga(String codigo) throws CargaFactoryException {
        switch (codigo) {
            case CAJA_MEDICAMENTOS:
                return new CargaSimple("Caja medicamentos", "Caja con medicamentos", 2.0, true);
            case TV_32_LCD:
                return new CargaSimple("TV 32' LCD","Televisores de 32'", 3.0, false);
            case CONTENEDOR:
                CargaContenedor contenedor = new CargaContenedor ("Contenedor","Tiene las cargas simples de medicamentos y televisores", 100.0);
                contenedor.agregarContenedor(generarCarga(TV_32_LCD));
                contenedor.agregarContenedor(generarCarga(CAJA_MEDICAMENTOS));
                return contenedor;
            default:
                throw new CargaFactoryException("La carga" + codigo + " no está");
        }
    }
}
