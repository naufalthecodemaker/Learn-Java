public class Chap53Aggregation {
    public static void main(String[] args){
        // aggregation = represents a "has-a" relationship between object.
        //               One object contains another object as part of its structure,
        //               but the contained object/s CAN exist independently

        // example = there are some book objects and library object
        //           library can contain books objects
        //           the library and books are objects that can exist independently

        Chap53BookClass book1 = new Chap53BookClass("The Fellow of the Ring", 423);
        Chap53BookClass book2 = new Chap53BookClass("The Two Towers", 352);
        Chap53BookClass book3 = new Chap53BookClass("The Return of the King", 416);

        Chap53BookClass[] books = {book1, book2, book3};

        // this is aggregation, because the library object, contains books object
        Chap53LibraryClass library = new Chap53LibraryClass("NYC Public Library", 1897, books);

        library.displayInfo();
    }
}
