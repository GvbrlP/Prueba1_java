public class Main {
    public static void main(String[] args) {


    GestorTallerBicicleta gestor = new GestorTallerBicicleta();
        Electrica biciE01 = new Electrica("BIC-E01", 2023, 22.5, 60, false, false);
        Electrica biciE02 = new Electrica("BIC-E02", 2022, 24.0, 45, true, false);

        Montania biciM01 = new Montania("BIC-M01", 2021, 13.5, 2);
        Montania biciM02 = new Montania("BIC-M02", 2020, 12.0, 1);

        System.out.println("*****REGISTRO DE BICICLETAS*****");
        gestor.registrarBicicleta(biciE01);
        gestor.registrarBicicleta(biciE02);
        gestor.registrarBicicleta(biciM01);
        gestor.registrarBicicleta(biciM02);

        System.out.println("**************************");
        String codigoBuscado = "BIC-E01";
        Bicicleta biciEncontrada = gestor.buscarPorCodigo(codigoBuscado);

        if (biciEncontrada != null) {
            System.out.println("Datos encontrados: "+ biciEncontrada.toString());
            System.out.println("Costo de mantención: $" + biciEncontrada.calcularCostoMantencion());
        } else {
            System.out.println("No se encontró ninguna bicicleta con el código: " + codigoBuscado);
        }
        System.out.println("\n*******LISTADO DE TODAS LAS BICICLETAS*******");

        for (Bicicleta b : gestor.getBicicletas()) {
            System.out.println("Código: " + b.getCodigoBicicleta() + " | Año: " + b.getAnioFabricacion());

        }
    }
}