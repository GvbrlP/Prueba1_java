public class Electrica extends Bicicleta implements IConGarantiaExtendida{


    private int autonomiaKilometro;
    private int bateriaCertificada;
    private int garantiaExtendida;

    public Electrica(String codigoBicicleta, int anioFabricacion, int pesoBicicleta, int autonomiaKilometro, int bateriaCertificada, int garantiaExtendida) {
        super(codigoBicicleta, anioFabricacion, pesoBicicleta);
        this.autonomiaKilometro = autonomiaKilometro;
        this.bateriaCertificada = bateriaCertificada;
        this.garantiaExtendida = garantiaExtendida;
    }
}


