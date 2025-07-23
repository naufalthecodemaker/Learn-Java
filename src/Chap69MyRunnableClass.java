public class Chap69MyRunnableClass implements Runnable {
    @Override
    public void run(){ // run at the background
        for(int i = 10; i >= 0 ; i--){
            try{
                Thread.sleep(1000); // refers to the main thread
            } catch(InterruptedException e){
                System.out.println("Thread was interrupted!");
            }

            if(i == 0){
                System.out.println("\nTime's up!!!");
                System.exit(0); // end the program
            }
        }
    }
}
