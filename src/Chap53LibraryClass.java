public class Chap53LibraryClass {
    // attributes
    String name;
    int year;
    Chap53BookClass[] books; // the library class, contain books array

    // constructor
    Chap53LibraryClass(String name, int year, Chap53BookClass[] books){
        this.name = name;
        this.year = year;
        this.books = books;
    }

    void displayInfo(){
        System.out.println("The " + this.year + " " + this.name);
        System.out.println("Books Available: ");
        for(Chap53BookClass book: books){
            System.out.println(book.displayInfo());
        }
    }
}
