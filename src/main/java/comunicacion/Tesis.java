package comunicacion;

public class Tesis extends Escrito{
    private String idea;
    private String[] argumentos;
    private String conclusion;
    private String referencias;
    private String interpretacion;

    public Tesis(String origen, String titulo, String autor, int paginas, String idea, String[] argumentos, String conclusion, String referencias, String interpretacion){
        super(origen, titulo, autor, paginas);
        this.idea = idea;
        this.argumentos = argumentos;
        this.conclusion = conclusion;
        this.interpretacion = interpretacion;
        this.referencias = referencias;

    }

    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }

    public String getConclusion() {
        return conclusion;
    }

    public void setIdea(String idea) {
        this.idea = idea;
    }

    public String getIdea() {
        return idea;
    }

    public void setReferencias(String referencias) {
        this.referencias = referencias;
    }

    public String[] getArgumentos() {
        return argumentos;
    }

    public String getReferencias() {
        return referencias;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }

    public void setArgumentos(String[] argumentos) {
        this.argumentos = argumentos;
    }

    public String getInterpretacion() {
        return interpretacion;
    }

    @Override
    int palabrasTotales(int palabrasPagina) {
        return 5 * getPaginas() * palabrasPagina;
    }

    @Override
    String interpretacion() {
        return interpretacion;
    }

    @Override
    public String toString() {
        return this.getOrigen() + "\n" + this.getTitulo() + "\n" + this.getAutor() + "\n" + this.getPaginas() + "\n" + idea + "\n" + argumentos + "\n" + conclusion + "\n" + referencias;
    }
}