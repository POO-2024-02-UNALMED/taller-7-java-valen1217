package comunicacion;

public class Fabula extends Escrito {
    private String enseñanza;
    private String interpretacion;

    public Fabula(String origen, String titulo, String autor, int paginas, String enseñanza, String interpretacion) {
        super(origen, titulo, autor, paginas);
        this.enseñanza = enseñanza;
        this.interpretacion = interpretacion;
    }

    public String getEnsenanza() {
        return enseñanza;
    }

    public void setEnsenanza(String enseñanza) {
        this.enseñanza = enseñanza;
    }

    @Override
    public String interpretacion() {
        return interpretacion;
    }

    @Override
    public int palabrasTotales(int palabrasPagina) {
        return getPaginas() * palabrasPagina;
    }

    @Override
    public String toString() {
        return resumen() + "\n" + enseñanza;
    }
}
