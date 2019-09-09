package application;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class RealEstate {
    private HashMap<Integer, String> suburb_list = new HashMap<Integer, String>();
    private Scanner sc = new Scanner(System.in);


    public RealEstate() {

    }

    public void startRealEstate(){
        LinkDatabase.connectJDBCToAWSEC2();

        loadSuburb();


    }

    //this is connect class, this is used to connect to aws server where the database is built.


    public void loadSuburb(){
        try{
            System.out.println("Loading suburb list...");
            BufferedReader reader = new BufferedReader(new FileReader("src//suburb.csv"));
            reader.readLine();
            String line = null;
            while((line=reader.readLine())!=null){
                String item[] = line.split(",",2);
                suburb_list.put(Integer.parseInt(item[0]),item[1]);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(suburb_list.get(3000));
    }

    public void register(){
        String custName = null;
        String emailAddress = null;
        String passWord = null;
        String passWord2 = null;
        System.out.println("enter your information to register");
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your customer name");
        custName = scan.next ();
        System.out.println("enter your email address");
        emailAddress = scan.next ();
        System.out.println("enter your email password");
        passWord = scan.next ();
        System.out.println ("confirm your password");
        passWord2 = scan.next ();
        if (passWord.equals ( passWord2 )){
            System.out.println ( "register successfully" );
        }
        else {System.out.println ( "password mismatch " );
        }

}


