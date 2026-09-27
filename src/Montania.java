public class Montania extends Bicicleta {


    private int cantidadSuspension;


    public Montania(String codigoBicicleta, int anioFabricacion, double pesoBicicleta, int cantidadSuspension) {
        super(codigoBicicleta, anioFabricacion, pesoBicicleta);
        this.cantidadSuspension = cantidadSuspension;
    }
}
