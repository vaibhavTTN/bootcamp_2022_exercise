package Threading.SynchronizationQuestion3.withOutSynchronization;


/*
         Use Synchronize method and synchronize block to enable synchronization between
         multiple threads trying to access method at same time.
 */

class PrintOddEven{
    static int printTill;


    private int counter = 1;



    public void Odd(){
        while(printTill>=counter){
            if(counter%2==1){
                System.out.println("Print from Odd method :: "+counter);
            }
            counter++;
        }
    }

    public void Even(){
        while(printTill>=counter){
            if(counter%2==0){
                System.out.println("Print from Even method :: "+counter);
            }
            counter++;
        }
    }



}

public class withOutSynchronization {
    public static void main(String[] args) {
        PrintOddEven.printTill = 10;
        PrintOddEven obj = new PrintOddEven();

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

/*
        OUTPUT

        Print from Odd method :: 1
        Print from Even method :: 2
        Print from Odd method :: 3
        Print from Even method :: 4
        Print from Odd method :: 5
        Print from Even method :: 6
        Print from Odd method :: 7
        Print from Odd method :: 9
        Print from Even method :: 8

 */