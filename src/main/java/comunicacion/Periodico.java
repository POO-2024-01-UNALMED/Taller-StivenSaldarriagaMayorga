package comunicacion;

public class Periodico extends Escrito {
    private String fecha;
    private String interpretacion;
    private String primicia;

    public Periodico(String origen, String titulo, String autor, int paginas, String fecha, String interpretacion, String primicia){
        super(origen, titulo, autor, paginas);
        this.fecha = fecha;
        this.interpretacion = interpretacion;
        this.primicia = primicia;
    }

    public String getFecha() {
        return fecha;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    public String getPrimicia() {
        return primicia;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setPrimicia(String primicia) {
        this.primicia = primicia;
    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }

    @Override
    int palabrasTotales(int palabrasPagina) {
        return 10 * getPaginas() * palabrasPagina;
    }

    @Override
    String interpretacion() {
        return interpretacion;
    }

    @Override
    public String toString() {
        return getOrigen() + "\n" + getTitulo() + "\n" + getAutor() + "\n" + getPaginas() + "\n" + fecha + "\n" + primicia;
    }
}