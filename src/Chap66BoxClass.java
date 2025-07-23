public class Chap66BoxClass<T> { // <T> means type parameter(we don't know what the data type is going to be)
    T item;

    public void setItem(T item){
        this.item = item;
    }

    public T getItem(){
        return this.item;
    }

}
