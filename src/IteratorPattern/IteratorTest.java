package IteratorPattern;

/**
 * Created with IntelliJ IDEA.
 * User: guemseok.ju
 * Date: 13. 12. 19
 * Time: 오후 1:51
 * To change this template use File | Settings | File Templates.
 */
public class IteratorTest {

    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf();

        bookShelf.appendBook(new Book("java"));

        bookShelf.appendBook(new Book("oracle"));

        bookShelf.appendBook(new Book("HTML5"));

        bookShelf.appendBook(new Book("javascript"));



        Iterator it = bookShelf.iterator();

        while(it.hasNext()) {

            Book book = (Book)it.next();

            System.out.println(book.getName());

        }
    }
}
