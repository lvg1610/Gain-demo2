class Bank
{
    private String bankName;
    private String branchName;
    Account[] accounts;  
    private int index = -1;
    public Bank(){}
    public Bank(String bankName,String branchName)
    {
       this.bankName = bankName;
       this.branchName = branchName;
       this.accounts = new Account[10];
    }
    public boolean addAccount(Account account)
    {
        if(index < 9)
           accounts[++index] = account;
        else
           throw new RuntimeException("No More Accounts can be added"); 
    }  
    public boolean transaction(char ttype,int accountNo, double amount)
    {
         for(int i=0;i<index;i++)
         {
             if(accounts[i].getAccountNo() == accountNo)
             {
                 if(ttype == 'W')
                 {
                     if(accounts[i] instanceof SavingsAccount)
                     {
                         if(accounts[i].getBalance() - amount >= SavingsAccount.minimumDepositAmount)
                                accounts[i].setBalance(accounts[i].getBalance() - amount);
                         else
                              throw new InsufficientBalanceException("No sufficient funds exist");
                     } 
                     else
                     {
                         if(accounts[i].getBalance() - amount >= 0)
                           accounts[i].setBalance(accounts[i].getBalance() - amount);
                         else
                              throw new InsufficientBalanceException("No sufficient funds exist");
                     }
                 }
                 else if(ttype== 'D')
                 {
                      accounts[i].setBalance(accounts[i].getBalance() + amount);
                 }
                 else
                     throw new RuntimeException("Invalid Transaction type passed ");   
             }
         }
         return false;
    }
}