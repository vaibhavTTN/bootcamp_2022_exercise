package Threading.SynchronizationQuestion3.withSynchronizationMethod;


/*
         Use Synchronize method and synchronize block to enable synchronization between
         multiple threads trying to access method at same time.
 */

class PrintEvenOdd{
    static int printTill;
    private int counter = 1;

    public synchronized void Odd(){
        while(printTill>=counter){
            if(counter%2==1){
                System.out.println("Print from Odd method :: "+counter);
            }
            counter++;
        }
    }

    public synchronized void Even(){
        while(printTill>=counter){
            if(counter%2==0){
                System.out.println("Print from Even method :: "+counter);
            }
            counter++;
        }
    }



}
public class withSynchronizationMethod {

    /*
        In this only Odd number will be printed
     */

    public static void main(String[] args) {
        PrintEvenOdd.printTill = 10;
        PrintEvenOdd obj = new PrintEvenOdd();

        Thread odd = new Thread(()->{
            obj.Odd();
        },"ODD");

        Thread even = new Thread(()->{
            obj.Even();
        },"EVEN");
        odd.start();
        even.start();


    }
}
