package Threading.Question5;

/*
        Write a program to simulate a deadlock in java and
        then improve the program to handle the deadlock using reentract lock.
 */

import java.util.concurrent.locks.ReentrantLock;

public class Question5 {

    static ReentrantLock re = new ReentrantLock();
    public static void transfer(Account fromacc1, Account Toacc2,int amount){

        /*
                This is for creating DeadLock
         */

//        synchronized (fromacc1.getLock()){
//            synchronized (Toacc2.getLock()){
//                System.out.println("Transferring amount: " + amount + " from account: " + fromacc1.getAccountNumber() + " to account: " + Toacc2.getAccountNumber());
//                Toacc2.setAmount(Toacc2.getAmount() - amount);
//                fromacc1.setAmount(fromacc1.getAmount() + amount);
//            }
//        }

        /*
                Solving the deadlock by ReentrantLock
         */
        re.lock();
            re.lock();
                System.out.println("Transferring amount: " + amount + " from account: " + fromacc1.getAccountNumber() + " to account: " + Toacc2.getAccountNumber());
                Toacc2.setAmount(Toacc2.getAmount() - amount);
                fromacc1.setAmount(fromacc1.getAmount() + amount);
            re.unlock();
        re.unlock();

    }

    public static void main(String[] args) {
        Account account1 = new Account("1234",1000);
        Account account2 = new Account("12345",1000);

        Thread t1 = new Thread(()->{
           for(int i = 0; i<5000; i++){
               Question5.transfer(account1,account2,100);
           }
        },"t1");


        Thread t2 = new Thread(()->{
            for(int i = 0; i<5000; i++){
                Question5.transfer(account2,account1,100);
            }
        },"t2");

        t1.start();
        t2.start();

        System.out.println("Total balance for both account: " + account1.getAmount() +" "+ account2.getAmount());
    }
}
