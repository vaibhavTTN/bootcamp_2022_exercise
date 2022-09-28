import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;


public class BOI implements Serializable, BankSystem{

    private String AccountHolderName;
    private int AccountNo;
    private String AccountType;
    private double Amount;
    private String CreatedAt;

    public void getDetails() {
        System.out.println("Bank Name : Bank Of India (BOI)");
        System.out.println("Bank Slogan : Relationships beyond Banking");
        System.out.println("Bank rate of interest : 7.5");
    }

    public void writeTranctionsFile(String operation,double amount){
        try(
                FileWriter file = new FileWriter("BankData/BOItransactions.txt",true);
            )
        {
            StringBuilder tranc = new StringBuilder();
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            Date date = new Date();
            String currDate = formatter.format(date)+"";
                tranc.append("Tranction time      : "+currDate +"\n");
                tranc.append("Bank Name           : Bank Of India.\n");
                tranc.append("Account Holder Name : "+this.AccountHolderName+"\n");
                tranc.append("Account No          : "+this.AccountNo+"\n");
                tranc.append("Account Type        : "+this.AccountType+"\n");
            if(amount<0){
                tranc.append("Transaction status  : UnSuccessful"+"\n");
            }else if(operation == "Deposite"){
                double amt = this.Amount+amount;
                tranc.append("Before Transaction  : "+this.Amount+"\n");
                tranc.append("You have Deposited  : "+amount+"\n");
                tranc.append("After Transaction   : "+amt+"\n");
                tranc.append("Transaction status  : Successful"+"\n");
            }else if(operation == "Withdraw"){
                double amt = this.Amount-amount;
                if(amt>=0) {
                    tranc.append("Before Transaction  : " + this.Amount + "\n");
                    tranc.append("You have Withdraw   : " + amount + "\n");
                    tranc.append("After Transaction   : " + amt + "\n");
                    tranc.append("Transaction status  : Successful"+"\n");
                }else{
                    tranc.append("Transaction status  : InSufficient Amount");
                }
            }
            tranc.append("\n");
                tranc.append("------------------------------------------------------------");
                tranc.append("\n");
            file.write(tranc.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void readTranctionsFile() {
        try{
            File file = new File("BankData/BOItransactions.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()){
                String  data =  sc.nextLine();
                System.out.println(data);
            }
            sc.close();
        }catch (FileNotFoundException e) {
            System.out.println("Tranction is Empty");
        }

    }

    public int SerializationObject(){
        //Serialization of Object and storing the Data int txt file
        String filename =  "BankData/"+this.AccountNo+"";
//        File f = new File(filename);
////        seeing that file is already present or not if present it means Account is aready created
//        if(f.exists()){
//            return 0;
//        }

        try(
                FileOutputStream file = new FileOutputStream(filename);
                ObjectOutputStream out = new ObjectOutputStream(file);
        ){
            out.writeObject(this);
        }catch (IOException e){
            System.out.println();
            return 0;
        }

        return 1;
    }

    public static BOI DeserializationObject(int accountNo){
        BOI obj = null;
        String filename =  "BankData/"+accountNo;


        try(
                FileInputStream file = new FileInputStream(filename);
                ObjectInputStream in = new ObjectInputStream(file);
        )
        {
            obj = (BOI) in.readObject();
        }

        catch(IOException ex)
        {
            System.out.println(ex);
        }

        catch(ClassNotFoundException ex)
        {
            System.out.println("ClassNotFoundException is caught");
        }
        return obj;
    }

    @Override
//    this method is used to create account if created returns 1 otherwise return 0
    public int createAccount(String AccountHolderName,int AccountNo,double Amount,String AccountType,String CreatedAt) {
        this.AccountHolderName = AccountHolderName;
        this.AccountNo = AccountNo;
        this.AccountType = AccountType;
        this.Amount = Amount;
        this.CreatedAt = CreatedAt;


        if(SerializationObject()==0){
            return 0;
        }

        return 1;
    }

    @Override
    public int depositMoney(double amount){
        if(amount<0){
            return 0;
        }else{
            writeTranctionsFile("Deposite",amount);
            this.Amount +=  amount;
        }
        System.out.println("Deposite Money : "+ amount);
        System.out.println("Total Money : "+ this.Amount);
        SerializationObject();
        return 1;
    }

    @Override
    public int withdrawMoney(double withdrawAmount) {
        double currentAmount = this.Amount;
        writeTranctionsFile("Withdraw",withdrawAmount);
        if(withdrawAmount<0){
            return 0;
        }
        if(currentAmount-withdrawAmount<0){
            return 0;
        }else{
            this.Amount -= withdrawAmount;
        }
        System.out.println("withdraw Money : "+ withdrawAmount);
        System.out.println("Total Money : "+ this.Amount);
        SerializationObject();
        return 1;
    }



    @Override
    public void getAccountDetails() {
        System.out.println("Account Holder Name : "+this.AccountHolderName);
        System.out.println("Account No : "+this.AccountNo);
        System.out.println("Account Balance : "+this.Amount);
        System.out.println("Account Type : "+this.AccountType);
        System.out.println("Account Created At : "+this.CreatedAt);
    }




}
