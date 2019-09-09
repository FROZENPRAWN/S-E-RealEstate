import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        String CustomerNo = "123";
        String Password = "567";
        String CustomerNo2 = "132";
        String Password2 = "576";
        String customerNo;
        String password;
        String customerNo2;
        String password2;


        Scanner scan = new Scanner(System.in);
        System.out.println("***login in***");
        System.out.println("choose if you are employee or customer: 1 for customer,2 for employee");
        int num = scan.nextInt();
        //choose customer or employee
        switch (num){
            //choose which customer
            case 1: System.out.println("choose if you are BRCustomer or VLCustomer: 1 for BRCustomer,2 for VLCustomer");
                num = scan.nextInt();
                switch (num) {
                    case 1:
                        System.out.println("you chose BRCustomer!");
                        System.out.println("enter your CustomerNo");
                        customerNo = scan.next();

                        System.out.println("enter your password");
                        password = scan.next();
                        if (customerNo.equals(CustomerNo) && password.equals(Password)) {
                            System.out.println("login in successfully");
//                 } else if (customerNo.equals(CustomerNo)) {
//                     System.out.println("Invalid password");
//                 } else if (password.equals(Password)) {
//                     System.out.println("Invalid ");
                        } else {
                            System.out.println("Invalid CustomerNo and password");
                        }
                        break;

                    case 2:
                        System.out.println("you chose VLCustomer!");
                        System.out.println("enter your CustomerNo");
                        customerNo2 = scan.next();

                        System.out.println("enter your password");
                        password2 = scan.next();
                        if (customerNo2.equals(CustomerNo2) && password2.equals(Password2)) {
                            System.out.println("login in successfully");
//                   } else if (customerNo2.equals(CustomerNo2)) {
//                       System.out.println("Invalid password");
//                  } else if (password.equals(Password2)) {
//                     System.out.println("Invalid ");
                        } else {
                            System.out.println("Invalid CustomerNo and password");
                        }
                        break;

        }
                     case 2:


        }
    }
}
