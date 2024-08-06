package comunicacion;

public class Alfabeto extends Pictograma{
    private String[] letras;

    private String interpretacion;

    public Alfabeto(String origen, String[] letras, String interpretacion) {
        super(origen);
        this.letras = letras;
        this.interpretacion = interpretacion;
    }

    public int cantidadLetras(){
        return letras.length;
    }


    @Override
    String interpretacion() {
        return interpretacion;
    }

    @Override
    public String toString() {
        String imprimir = "";
        for (int i = 0; i < letras.length; i++){
            imprimir += letras[i] + ", ";
        }
        return imprimir;
    }
}