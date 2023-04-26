package tr.edu.maltepe.oop;
public  class simple_main {
    public static void main(String[] args) {
        Student student = new Student("Sena");
        Prof prof = new Prof("Paul");
        Book book1 = new Book("The Little Prince.");
        Book book2 = new Book("A Tale of Two Cities.");

        student.readBook(book1);
        prof.readBook(book2);

        student.play();
        prof.play();
    }
}

