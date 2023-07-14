package Banking_app_project;

public interface RbiInterface {
    public String depositMoney(int money);
    public String withdrawMoney(int money, String password);
    public String checkBalance(String password);
    public double totalInterest(int time);
    public String getBank();
}
