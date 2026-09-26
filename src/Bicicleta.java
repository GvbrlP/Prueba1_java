public class Bicicleta {

    private String codigoBicicleta;
    private int anioFabricacion;
    private int pesoBicicleta;

    public Bicicleta(String codigoBicicleta, int anioFabricacion, int pesoBicicleta) {
        this.codigoBicicleta = codigoBicicleta;
        this.anioFabricacion = anioFabricacion;
        this.pesoBicicleta = pesoBicicleta;
    }

    public String getCodigoBicicleta() {
        return codigoBicicleta;
    }

    public void setCodigoBicicleta(String codigoBicicleta) {
        this.codigoBicicleta = codigoBicicleta;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public int getPesoBicicleta() {
        return pesoBicicleta;
    }

    public void setPesoBicicleta(int pesoBicicleta) {
        this.pesoBicicleta = pesoBicicleta;
    }

}
