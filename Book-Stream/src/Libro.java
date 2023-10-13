public class Libro {
    private int NumPaginas;
    private String Titulo;
    private String Autor;

    public Libro(int numPaginas, String titulo, String autor) {
        NumPaginas = numPaginas;
        Titulo = titulo;
        Autor = autor;
    }

    public int getNumPaginas() {
        return NumPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        NumPaginas = numPaginas;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }
}

