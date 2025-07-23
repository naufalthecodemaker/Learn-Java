public class Chap66Product<T, U>{
    T item; // don't know the data type (string or char or everything)
    U price; // don't know the data type of price (integer or double or everything)

    // constructor
    Chap66Product(T item, U price){
        this.item = item;
        this.price = price;
    }

    // method
    public T getItem(){
        return this.item;
    }

    public U getPrice(){
        return this.price;
    }
}
