package Banking_app_project;

public class HdfcBank implements RbiInterface{
    private String acNumber;
    private String password;
    private Integer balance;
    private double rateOfInterest=5;

    public HdfcBank(int balance,String acNumber,String password){
        this.balance=balance;
        this.password=password;
        this.acNumber=acNumber;
    }
    public String depositMoney(int money) {
        if(money>0){
            balance+=money;
            return "Money :"+money+" has been credited in your Ac. Total Bal : "+balance;
        }
        return "Invalid amount entered";
    }

    public String withdrawMoney(int money, String password) {
        if(password.equals(this.password)){
            if(balance-money>=500){
                balance-=money;
                return "Money : "+money+" has been withdrawn successfully. Remaining balance is "+balance;
            }else{
                return "Insufficient balance";
            }
        }
        return "Password Incorrect";
    }


    public String checkBalance(String password) {
        if(password.equals(this.password)){
            String checkBalance=balance.toString();
            System.out.println(checkBalance);
            return checkBalance;
        }
        return "Incorrect Password";
    }


    public double totalInterest(int time) {
        return balance * time * rateOfInterest / 100;
    }
    public String getBank(){
        return "Hdfc Bank";
    }
}
