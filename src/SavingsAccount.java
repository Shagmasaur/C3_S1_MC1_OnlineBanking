import java.util.Random;

public class SavingsAccount
{
    String accountType;
    String accountHolderName;
    int accountHolderAge;
    long accountNumber;
    int accountBalance;
    String accountStatus;


    public long autoGeneratedAccountNumber()
    {
        Random random = new Random();
        long accountNumber = random.nextLong(1000000000000L);
        System.out.println("Account number is : " +accountNumber);
        return accountNumber;
    }

    public float depositAmount(float accountBalance,float depositAmount)
    {
        float newAccountBalance = accountBalance + depositAmount;
        return newAccountBalance;
    }
    public float withdrawAmount(float accountBalance,float withdrawalAmount)
    {
        float updatedAccountBalance = 0;
        if (accountBalance > withdrawalAmount) {
            updatedAccountBalance = accountBalance - withdrawalAmount;
        }
        else
        {
            System.out.println("Insufficient funds");
        }
        return updatedAccountBalance;
    }
    public float transferAmount(float accountBalance,float transferedAmount)
    {
        float updatedAccountBalance = 0;
        if (accountBalance > transferedAmount)
        {
            updatedAccountBalance = accountBalance - transferedAmount;
        }
        else
        {
            System.out.println("Insufficient funds");
        }
        return updatedAccountBalance;
    }

    public int balance()
    {
        return accountBalance;
    }


}
