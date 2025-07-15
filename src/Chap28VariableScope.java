
// java will use the local variable first if they have the same name
public class Chap28VariableScope {
    static int x = 3; // CLASS variable => variable that declared outside the method

    public static void main(String[] args){
        // variable scope = where a variable can be accessed

        int x = 1; // LOCAL variable => variable that declared in the method

        doSomething();
    }

    static void doSomething(){
        int x = 2; // LOCAL variable

        System.out.println(x);
    }
}
