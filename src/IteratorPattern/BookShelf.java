package IteratorPattern;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: guemseok.ju
 * Date: 13. 12. 19
 * Time: 오후 1:52
 * To change this template use File | Settings | File Templates.
 */
public class BookShelf  implements Aggregate {

  //  private ArrayList<Book> books;
  private ArrayList<Book> books;

    private int last = 0;

    public BookShelf() {

        this.books = new ArrayList<Book>();

    }

    public Book getBookAt(int index) {

        return (Book)books.get(index);

    }

    public void appendBook(Book book) {

        books.add(book);

        last++;

    }

    public int getLength() {

        return last;

    }

    public Iterator iterator() {

        return new BookShelfIterator(this);

    }
}
