package tr.edu.maltepe.oop;

import java.util.ArrayList;

public class Student extends Person {
    ArrayList<Book> books;
    public Student(String name) {
        super(name);
        this.books = new ArrayList<Book>();
    }
    public void readBook(Book book) {
        this.books.add(book);
        System.out.println(this.name + " is reading " + book.getTitle() );
    }
    public void play() {
        System.out.println(this.name + " is playing a sport.");
    }
}
