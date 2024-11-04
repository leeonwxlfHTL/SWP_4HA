package bankingSystem;

import org.testng.annotations.Test;

import org.testng.Assert;


public class AccountTest {

    @Test
    public void testDeposit() throws InvalidAmountException {
        Account account = new Account("12345", 100.0);
        account.deposit(50.0);
        Assert.assertEquals(account.getBalance(), 150.0);
    }

    @Test(expectedExceptions = InvalidAmountException.class)
    public void testDeposit_InvalidAmount() throws InvalidAmountException {
        Account account = new Account("12345", 100.0);
        account.deposit(-10.0);
    }

    @Test
    public void testWithdraw() throws InvalidAmountException, OverdraftException {
        Account account = new Account("12345", 100.0);
        account.withdraw(50.0);
        Assert.assertEquals(account.getBalance(), 50.0);
    }

    @Test(expectedExceptions = OverdraftException.class)
    public void testWithdraw_Overdraft() throws InvalidAmountException, OverdraftException {
        Account account = new Account("12345", 100.0);
        account.withdraw(150.0);
    }

    @Test(expectedExceptions = InvalidAmountException.class)
    public void testWithdraw_InvalidAmount() throws InvalidAmountException, OverdraftException {
        Account account = new Account("12345", 100.0);
        account.withdraw(-20.0);
    }
}

