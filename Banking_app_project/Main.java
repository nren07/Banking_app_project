package Banking_app_project;

import java.util.Scanner;
import java.util.logging.LoggingPermission;

public class Main {
    static RbiInterface bank;
    static String Ac;

    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<=15;i++){
            sb.append((int)(Math.random()*10));
        }
        Ac=sb.toString();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter option 1,2,3 for PnbBank,SbiBank,HdfcBank");
        int option=sc.nextInt();
        System.out.println("Enter opening balance,password");
        int balance=sc.nextInt();
        String password=sc.next();
        if(option==1){
            bank= new PnbBank(balance,Ac,password);
        }
        else if(option==2){
            bank= new SbiBank(balance,Ac,password);
        }else{
            bank=new HdfcBank(balance,Ac,password);
        }
        System.out.println("Welcome  Mr/Mrs to "+bank.getBank()+"\n"+"your Account No is "+Ac);
        System.out.println("Money enter you want to deposit ");
        int money=sc.nextInt();
        System.out.println(bank.depositMoney(money));
        System.out.println("Money enter you want to withdraw and password ");
        money  =sc.nextInt();
        System.out.println(bank.withdrawMoney(money,password));

        System.out.println("Enter time period in years to know your interest");
        int time=sc.nextInt();
        System.out.println(bank.totalInterest(time));
    }
}
