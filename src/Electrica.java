public class Electrica extends Bicicleta implements IConGarantiaExtendida{


    private int autonomiaKilometro;
    private boolean bateriaCertificada;
    private boolean garantiaExtendida;

    public Electrica(String codigoBicicleta, int anioFabricacion, double pesoBicicleta, int autonomiaKilometro, boolean bateriaCertificada, boolean garantiaExtendida) {
        super(codigoBicicleta, anioFabricacion, pesoBicicleta);
        setAutonomiaKilometro(autonomiaKilometro);
        setBateriaCertificada(bateriaCertificada);
        setGarantiaExtendida(garantiaExtendida);
    }

    public int getAutonomiaKilometro() {
        return autonomiaKilometro;
    }

    public void setAutonomiaKilometro(int autonomiaKilometro) {
        this.autonomiaKilometro = autonomiaKilometro;
    }

    public boolean isBateriaCertificada() {
        return bateriaCertificada;
    }

    public void setBateriaCertificada(boolean bateriaCertificada) {
        this.bateriaCertificada = bateriaCertificada;
    }

    public boolean isGarantiaExtendida() {
        return garantiaExtendida;
    }

    public void setGarantiaExtendida(boolean garantiaExtendida) {
        this.garantiaExtendida = garantiaExtendida;
    }

    @Override
    public double calcularCostoMantencion() {
        double costoBase = 45000;
        if (!bateriaCertificada) {
            return costoBase * 1.25;
        }
        return costoBase;
    }

    @Override
    public boolean consultarGarantiaActiva() {
        return this.garantiaExtendida;


    }
    @Override
    public void activarGarantia() {
        this.garantiaExtendida = true;
    }

    @Override
    public String toString() {
        String textoBateria = bateriaCertificada ? "si" : "no";
        String textoGarantia = garantiaExtendida ? "si" : "no";

        return super.toString()+ " | Autonomía: " + autonomiaKilometro + " km | Batería certificada: " + textoBateria + " | Garantía extendida: " + textoGarantia;
    }

}




