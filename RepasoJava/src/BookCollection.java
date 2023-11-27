import java.util.ArrayList;

public class BookCollection {
private int paginas;
    ArrayList<Book> books;

    public BookCollection() {
     books = new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
    }
    //Obtener la cantidad de libros con más de 500 páginas
    public void Bookmas500pag(int pag){
        for (Book book : books) {
            if (book.getPaginas()> 500) {
               
            }
    }
}
