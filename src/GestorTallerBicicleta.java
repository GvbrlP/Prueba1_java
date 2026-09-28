import java.util.ArrayList;
public class GestorTallerBicicleta {

    private ArrayList<Bicicleta> bicicletas;

    public GestorTallerBicicleta(){
        this.bicicletas = new ArrayList<>();
    }

    public void registrarBicicleta(Bicicleta bicicleta){
        bicicletas.add(bicicleta);

        System.out.println(bicicleta. getCodigoBicicleta() + " (" + bicicleta.getClass().getSimpleName() + ") registrada correctamente. ");
    }
    public Bicicleta buscarPorCodigo(String codigo){
        for (Bicicleta b : bicicletas){
            if (b.getCodigoBicicleta().equalsIgnoreCase(codigo)){
                return b;
            }
        }
        return null;
    }

    public ArrayList<Bicicleta> getBicicletas() {
        return bicicletas;
    }
}
