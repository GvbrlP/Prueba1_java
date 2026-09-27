public class Electrica extends Bicicleta implements IConGarantiaExtendida{


    private int autonomiaKilometro;
    private boolean bateriaCertificada;
    private boolean garantiaExtendida;

    public Electrica(String codigoBicicleta, int anioFabricacion, double pesoBicicleta, int autonomiaKilometro, boolean bateriaCertificada, boolean garantiaExtendida) {
        super(codigoBicicleta, anioFabricacion, pesoBicicleta);
        this.autonomiaKilometro = autonomiaKilometro;
        this.bateriaCertificada = bateriaCertificada;
        this.garantiaExtendida = garantiaExtendida;
    }
}


