import java.util.Random;

public class Bichos{
    private int generacion;
    private String nombre;
    Random rand = new Random();

    public Bichos(int generacion, String nombre) {
        this.generacion = generacion;
        this.nombre = nombre;

    }

    public String generarnombre(){
        int longitud = rand.nextInt(10);
        return longitud+"";
    }

    public static void main(String[] x){
        Bichos inicial = new Bichos(0, "Adan");
        System.out.println(inicial.generarnombre());
    }

}

