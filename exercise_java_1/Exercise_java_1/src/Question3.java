import java.util.Scanner;

//Q3) Write a java program to show following menu to the user:
//
//        *******Menu*******
//        1. Calculate Area of Circle
//        2. Calculate Circumference of a Circle
//        3. Exit.
//        Choose an option (1-3):
//
//        Take radius as user input.
//
//        Hint: Use Switch statement to act on the menu. Also area and circumference methods should be static
public class Question3 {

    public static void AreaOfCircle(double radius){
        System.out.println("Area of Circle : "+ Math.PI*(radius*radius));
    }

    public static void CircumfereceOfCircle(double radius){
        System.out.println("Area of Circle : "+ 2*(Math.PI)*(radius));
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        do{
            System.out.println("1. Calculate Area of Circle");
            System.out.println("2. Calculate Circumference of a Circle");
            System.out.println("3. Exit");
            System.out.println("Choose an option (1-3):");
            int no = sc.nextInt();
            double r = 0;
            switch (no){
                case 1:
                    System.out.println("Enter radius :");
                    r = sc.nextDouble();
                    AreaOfCircle(r);
                    break;
                case 2:
                    System.out.println("Enter radius :");
                    r = sc.nextDouble();
                    CircumfereceOfCircle(r);
                    break;
                case 3:
                    System.out.println("Exit !!");
                    flag = false;
                    break;
                default: System.out.println("Invalid input. Please enter valid no!!");
            }
            System.out.println();
            System.out.println("--------------------X---------------------------X----------------------");
            System.out.println();

        }while(flag);
    }
}
