public class Electrica extends Bicicleta{


    private String autonomiaKilometro;
    private String bateriaCertificada;
    private String garantiaExtendida;

    public Electrica(String codigoBicicleta, int anioFabricacion, int pesoBicicleta, String autonomiaKilometro, String bateriaCertificada, String garantiaExtendida) {
        super(codigoBicicleta, anioFabricacion, pesoBicicleta);
        this.autonomiaKilometro = autonomiaKilometro;
        this.bateriaCertificada = bateriaCertificada;
        this.garantiaExtendida = garantiaExtendida;
    }
}
