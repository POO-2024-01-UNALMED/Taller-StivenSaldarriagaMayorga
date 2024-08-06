package comunicacion;

public class Libro extends Escrito{
    private String co_autor;
    private String editorial;
    private String edicion;
    private String interpretacion;

    public Libro(String origen, String titulo, String autor, int paginas, String co_autor, String editorial, String edicion, String interpretacion) {
        super(origen, titulo, autor, paginas);
        this.co_autor = co_autor;
        this.edicion = edicion;
        this.editorial = editorial;
        this.interpretacion = interpretacion;
    }

    @Override
    int palabrasTotales(int palabrasPagina) {
        return 2 * this.getPaginas() * palabrasPagina;
    }

    @Override
    String interpretacion() {
        return interpretacion;
    }

    @Override
    public String toString() {
        return this.getOrigen() + "\n" + this.getTitulo() + "\n" + this.getAutor() + "\n" + this.getPaginas() + "\n" + co_autor + "\n" + editorial + "\n" + edicion;
    }

    public String getCo_autor(){
        return this.co_autor;
    }

    public String getEditorial(){
        return this.editorial;
    }
    public String getEdicion(){
        return  this.edicion;
    }
    public String getInterpretacion(){
        return this.interpretacion;
    }
    public void setCo_autor(String nuevo_co_autor){
        this.co_autor = nuevo_co_autor;
    }
    public void setEditorial(String nuevo_editorial){
        this.editorial = nuevo_editorial;
    }
    public void setEdicion(String nuevo_edicion){
        this.edicion = edicion;
    }
    public void setInterpretacion(String nuevo_interpretacion){
        this.interpretacion = interpretacion;
    }