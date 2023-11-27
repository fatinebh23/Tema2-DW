import org.example.Book;
import org.example.BookCollection;
import org.example.NoBooksFound;
import org.example.CollectionIsEmpty;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.List;

public class Ejercico4_Test {

    BookCollection books = new BookCollection(new Book[]{
            new Book("un-isbn-1", "un titulo 1", "un autor 1"),
            new Book("un-isbn-4", "un titulo 2", "un autor 2"),
            new Book("un-isbn-2", "un titulo 2", "un autor 2"),
            new Book("un-isbn-3", "un titulo 3", "un autor 3"),
    });
    //Añade un caso de prueba shouldNotFindIfCollectionIsEmpty() que compruebe que si la colección
    //vacía, la lista devuelta por la función find() estará vacía.
    @Test
    public void shouldNotFindIfCollectionIsEmpty() {
        final String isbnToLocate = "un-isbn-2";
        BookCollection books = new BookCollection(new Book[]{});
        List<Book> foundBooks = books.find("un-isbn-2");
        // si no está vacío pasa el test.
        Assertions.assertTrue(foundBooks::isEmpty);
        //assertTrue(foundBooks.isEmpty());



    }

    @Test
    public void  shouldGetAnEmptyListIfNoMatchesAreFound() {
        final String isbnToLocate = "ISBN";  BookCollection books = new BookCollection(new Book[]{
                new Book("un-isbn-1", "un titulo 1", "un autor 1"),
                new Book(isbnToLocate, "un titulo 2", "un autor 2"),
                new Book(isbnToLocate, "un titulo 2", "un autor 2"),
                new Book("un-isbn-3", "un titulo 3", "un autor 3"),
        });
        List<Book> foundBooks = books.find("un-isbn-2");

        Assertions.assertTrue(foundBooks::isEmpty);
    }
    @Test
    public void  shouldGetExceptionWhenUsingFindOrFailWithAnEmptyCollection() {
        final String isbnToLocate = "un-texto-que-no-existe-como-isbn-o-author";
        BookCollection books = new BookCollection(new Book[]{

        });

        Assertions.assertThrows(CollectionIsEmpty.class, () ->
                books.findOrFail(isbnToLocate));

    }

    @Test
    public void shouldGetExceptionWhenUsingFindOrFailWithANonExistentEntry() {
        final String isbnToLocate = "un-texto-que-no-existe-como-isbn-o-author";
        BookCollection books = new BookCollection(new Book[]{
        });

        Assertions.assertThrows(NoBooksFound.class, () ->
                books.findOrFail(isbnToLocate));
    }


}
