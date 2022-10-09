package Threading.SynchronizationQuestion3.withSychronizationBlock;

/*
         Use Synchronize method and synchronize block to enable synchronization between
         multiple threads trying to access method at same time.
 */

class PrintOddEven{
    static int printTill;


    private int counter = 1;



    public void Odd(){
        synchronized (this){
            while(printTill>=counter){
                if(counter%2==1){
                    System.out.println("Print from Odd method :: "+counter);
                }
                counter++;
            }
        }
    }

    public void Even(){
        synchronized (this){
            while(printTill>=counter){
                if(counter%2==0){
                    System.out.println("Print from Even method :: "+counter);
                }
                counter++;
            }
        }
    }



}

public class withSychronizationBlock {
    public static void main(String[] args) {
        PrintOddEven.printTill = 10;
        PrintOddEven obj = new PrintOddEven();

        Thread even = new Thread(()->{
            obj.Even();
        },"EVEN");

        Thread odd = new Thread(()->{
            obj.Odd();
        },"ODD");

        even.start();
        odd.start();


    }
}

/*
        OUTPUT

        Print from Even method :: 2
        Print from Even method :: 4
        Print from Even method :: 6
        Print from Even method :: 8
        Print from Even method :: 10

 */