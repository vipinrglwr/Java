package controlstatement.classstest;

public class Account {
    private long accountNo;
    private String accountType;
    static double balance;
    private String userName;
    private String bankName;

    void addAccount()
    {
        accountNo  =1235678910l;
        accountType ="Saving";
         balance = 50000;
        userName=" John Patil";
         bankName= " No Bank";
    }

    public long getAccountNo() {
        return accountNo=123456789;
    }

    public void setAccountNo(long accountNo) {
        this.accountNo = accountNo;
    }

    public String getAccountType() {
        return accountType = "savings" ;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public static double getBalance() {
        return balance=50000;
    }

    public static void setBalance(double balance) {
        Account.balance = balance;
    }

    public String getUserName() {
        return userName = "John Patil";
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getBankName() {
        return bankName ="No Bank";
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    void DisplayData(){
        System.out.println("Account Number :-"+getAccountNo());
       System.out.println("Account Type :-"+getAccountType());
       System.out.println("Balance :-"+getBalance());
       System.out.println("UserName :-"+getUserName());
       System.out.println("Bank Name :-"+getBankName());
        System.out.println("*********************************");

    }

    public static void withdrawMoney( double  amount){

       for(int i=0;i<1;i++)
       {
if(amount < balance & amount >0)
{
    System.out.println("Amount Has Been Request");
    System.out.println("Balance Remaining :-"+(balance-amount) );
}
else{
    System.out.println("Insufficient Balance");
    }

           } }


void depositMoney(double amount1){
        int banklimit=100000;


        for (int i=0;i<1;i++)
        {
        if (amount1<banklimit & amount1>0)
        {

            System.out.println("balance added :-"+amount1);
            System.out.println("Total Balance :-"+(amount1+balance));
        }
        else
        {
            System.out.println("Invalid Input");
        }
        }

}

void Display()
{
    System.out.println("Account Number :-"+getAccountNo());
    System.out.println("Account Type :-"+getAccountType());

    System.out.println("Balance :-"+balance);

    System.out.println("UserName :-"+getUserName());
    System.out.println("Bank Name :-"+getBankName());
    System.out.println("*********************************");
}



}


