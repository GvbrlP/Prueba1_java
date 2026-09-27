public class Montania extends Bicicleta {


    private int cantidadSuspension;


    public Montania(String codigoBicicleta, int anioFabricacion, double pesoBicicleta, int cantidadSuspension) {
        super(codigoBicicleta, anioFabricacion, pesoBicicleta);
       setCantidadSuspension(cantidadSuspension);
    }

    public int getCantidadSuspension() {
        return cantidadSuspension;
    }

    public void setCantidadSuspension(int cantidadSuspension) {
        this.cantidadSuspension = cantidadSuspension;
    }

    @Override
    public double calcularCostoMantencion() {
        double costoBase = 30000;
        if (cantidadSuspension > 1) {
            return costoBase * 1.15;
        }
        return costoBase;
    }
}

