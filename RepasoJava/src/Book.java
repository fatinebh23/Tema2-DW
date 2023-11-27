public class Book {
   private String titulo;
   private int paginas;
   private String autor;



    public Book(String titulo, int paginas, String autor) {
        this.titulo = titulo;
        this.autor= autor;
        this.paginas= paginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPaginas() {

        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

}
