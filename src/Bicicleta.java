public abstract class Bicicleta {

    private String codigoBicicleta;
    private int anioFabricacion;
    private double pesoBicicleta;

    public Bicicleta(String codigoBicicleta, int anioFabricacion, double pesoBicicleta) {
        setCodigoBicicleta(codigoBicicleta);
        setAnioFabricacion(anioFabricacion);
        setPesoBicicleta(pesoBicicleta);
    }

    public String getCodigoBicicleta() {
        return codigoBicicleta;
    }

    public void setCodigoBicicleta(String codigoBicicleta) {
        if (codigoBicicleta == null || codigoBicicleta.trim().isEmpty()){
            throw new IllegalArgumentException("el codigo no puede ser nulo");
        }
        this.codigoBicicleta = codigoBicicleta;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        if (anioFabricacion < 2000 ||  anioFabricacion >2026){
            throw new IllegalArgumentException("el año de fabricacion debe estar entre 2000 y 2026");
        }
        this.anioFabricacion = anioFabricacion;
    }

    public double getPesoBicicleta() {
        return pesoBicicleta;
    }

    public void setPesoBicicleta(double pesoBicicleta) {
       if (pesoBicicleta <= 0){
           throw new IllegalArgumentException("el peso debe ser mayor a cero");

       }
        this.pesoBicicleta = pesoBicicleta;
    }

    @Override
    public String toString() {
        return "Codigo: " + codigoBicicleta + " | Año: " + anioFabricacion;
    }

    public abstract double calcularCostoMantencion();
}
