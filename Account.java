public class Account {
    private String name;
    private int accountNO;
    private double balance;
    
    public Account(String name,int accountNo,double balance){
        this.name = name;
        this.accountNO = accountNo;
        this.balance = balance;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAccountNO(){
        return this.accountNO;
    }
    public void setName(int accountNo){
        this.accountNO = accountNo;
    }
    public double getBalance(){
        return this.balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
}