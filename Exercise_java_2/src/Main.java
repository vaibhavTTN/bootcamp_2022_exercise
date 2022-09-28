import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static int AccountPresent(){
        int acNo = 0;
        boolean AccountFlag = true;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Enter Account No : ");
            acNo = sc.nextInt();
            String filename = "BankData/"+acNo;
            File f = new File(filename);
////        seeing that file is already present or not if present it means Account is aready created
            if(!f.exists()){
                System.out.println("Account Not Present !!");
                System.out.println("Try Again !!");
            }else{
                AccountFlag = false;
            }
        }while (AccountFlag);

        return acNo;
    }
    public static int Account(){
            int acNo = 0;
            boolean AccountFlag = true;
            Scanner sc = new Scanner(System.in);
            do{
                System.out.println("Enter Account No : ");
                acNo = sc.nextInt();
                String filename = "BankData/"+acNo;
                File f = new File(filename);
////        seeing that file is already present or not if present it means Account is aready created
                if(f.exists()){
                    System.out.println("Account Already Present !!");
                    System.out.println("Try Again !!");
                }else{
                    AccountFlag = false;
                }
            }while (AccountFlag);

            return acNo;
    }

    public static int selectBank(){
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        int selectedBank = 0;
        do {
            System.out.println();
            System.out.println("1. BOI.");
            System.out.println("2. SBI.");
            System.out.println("3. ICICI.");
            System.out.println("choose any (1 - 3) : ");
            System.out.println();
            selectedBank = sc.nextInt();
            if(selectedBank>3 || selectedBank == 0){
                System.out.println("Invalid Option !!");
            }else{
                flag = false;
            }
        }while(flag);

        return selectedBank;
    }

    public static void main(String[] args) {

        boolean flag = true;
        do{
            System.out.println("--------------------------------------");
            System.out.println("1. Print Details Every Banks.");
            System.out.println("2. Get Details of Single Bank.");
            System.out.println("3. Create Account in Bank.");
            System.out.println("4. Show Details of Account.");
            System.out.println("5. WithDraw Money.");
            System.out.println("6. Deposit Money.");
            System.out.println("7. Show Transactions of all Banks.");
            System.out.println("8. Exit.");
            System.out.println("Choose (1 - 8)");
            System.out.println();

            BankSystem obj = null;
            int accountNo = 0;
            int chooseBank = 0;
            Scanner sc = new Scanner(System.in);
            int opt = sc.nextInt();
            System.out.println();
            switch (opt){
                case 1:
                    System.out.println("1. Print Details Every Banks.");
                    System.out.println();
                    obj = new BOI();
                    obj.getDetails();
                    System.out.println();
                    obj = new SBI();
                    obj.getDetails();
                    System.out.println();
                    obj = new ICICI();
                    obj.getDetails();
                    System.out.println();

                    break;
                case 2:
                    System.out.println("2. Get Details of Single Bank.");
                    chooseBank = selectBank();
                    if(chooseBank==1){
                        obj = new BOI();
                        obj.getDetails();
                    }else if(chooseBank==2){
                        obj = new SBI();
                        obj.getDetails();
                    } else if (chooseBank==3) {
                        obj = new ICICI();
                        obj.getDetails();
                    }
                    System.out.println();
                    break;
                case 3:
                    //        int created = obj.createAccount("abc",12345,1000,"saving","18/08/2022");
                    System.out.println("3. Create Account in Bank.");
                    chooseBank = selectBank();
                    if(chooseBank==1){
                        obj = new BOI();
                    }else if(chooseBank==2){
                        obj = new SBI();
                    }else if(chooseBank==3){
                        obj = new ICICI();
                    }else{
                        System.out.println("Invalid Option !!");
                        break;
                    }
                    System.out.println("Enter Account Holder Name (Name Should not have Space) :");
                    String name = sc.next();
                    boolean accountCheck = true;
                    int accNo = Account();

                    System.out.println("Enter the Amount You want To Deposit : ");
                    double amt = sc.nextDouble();
                    AccountTypes arr[] = AccountTypes.values();
                    System.out.println("Select Account Type :");
                    int count = 0;
                    for (AccountTypes val : AccountTypes.values()){
                        System.out.println(count+". "+val);
                        count++;
                    }
                    int accType = sc.nextInt();
                    count--;
                    if(accType<0 || accType>count){
                        System.out.println("invalid input !!");
                        break;
                    }
                    String type = arr[count-1] +"";

                    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
                    Date date = new Date();
                    String currDate = formatter.format(date)+"";
                    int accountCreationStatus = obj.createAccount(name,accNo,amt,type,currDate);
                    if(accountCreationStatus==0){
                        System.out.println("Duplicate Account No : ");
                    }else{
                        System.out.println("Account Created Successfully :");
                        System.out.println();
                        System.out.println("--------------------------------------");
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.println("4. Show Details of Account.");
                    chooseBank = selectBank();
                    accountNo = AccountPresent();

                    if(chooseBank==1){
                        obj = BOI.DeserializationObject(accountNo);
                    }else if(chooseBank==2){
                        obj = SBI.DeserializationObject(accountNo);
                    }else if(chooseBank==3){
                        obj = ICICI.DeserializationObject(accountNo);
                    }

                    obj.getAccountDetails();
                    System.out.println();

                    break;
                case 5:
                    System.out.println("5. WithDraw Money.");
                    chooseBank = selectBank();

                    accountNo = AccountPresent();
                    if(chooseBank==1){
                        obj = BOI.DeserializationObject(accountNo);
                    }else if(chooseBank==2){
                        obj = SBI.DeserializationObject(accountNo);
                    }else if(chooseBank==3){
                        obj = ICICI.DeserializationObject(accountNo);
                    }
                    System.out.println("Enter the amount you want to withdraw : ");
                    int withdrawAmount = sc.nextInt();
                    int res = obj.withdrawMoney(withdrawAmount);
                    if(res==0){
                        System.out.println("Insufficient Fund !!");
                    }
                    System.out.println();

                    break;
                case 6:
                    System.out.println("6. Deposite Money.");
                    chooseBank = selectBank();
                    accountNo = AccountPresent();
                    if(chooseBank==1){
                        obj = BOI.DeserializationObject(accountNo);
                    }else if(chooseBank==2){
                        obj = SBI.DeserializationObject(accountNo);
                    }else if(chooseBank==3){
                        obj = ICICI.DeserializationObject(accountNo);
                    }
                    System.out.println("Enter the amount you want to Deposite : ");
                    double depositeMoney = sc.nextDouble();
                    res = obj.depositMoney(depositeMoney);
                    if(res == 0){
                        System.out.println("Amount Should be in positive !!");
                    }
                    System.out.println();
                    break;
                case 7:
                    System.out.println("5. Show Transactions of Bank.");
                    chooseBank = selectBank();
                    if(chooseBank==1){
                        BOI.readTranctionsFile();
                    }else if(chooseBank==2){
                        SBI.readTranctionsFile();
                    }else if(chooseBank==3){
                        ICICI.readTranctionsFile();
                    }
                    break;
                case 8 :
                    System.out.println("Exit !!");
                    flag = false;
                    break;
                default:
                    System.out.println("Invalid input !!");
                    break;
            }
        }while (flag);



        System.out.println("Thank you :) ");
    }
}