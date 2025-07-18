public class Chap53BookClass {
    // attributes
    String title;
    int pages;

    // constructor
    Chap53BookClass(String title, int pages){
        this.title = title;
        this.pages = pages;
    }

    String displayInfo(){
        return this.title + " (" + this.pages + ") pages";
    }

}
