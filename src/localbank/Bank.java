/**
 * Bank class.
 */
package localbank;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.*;

public class Bank {

    private ArrayList accounts;

    /**
     * constructor 
     * pre: none 
     * post: accounts has been initialized.
     */
    public Bank() {
        accounts = new ArrayList();
    }

    /**
     * Adds a new account to the bank accounts. 
     * pre: none 
     * post: An account has been added to the bank's accounts.
     */
    public void addAccount(Double bal, String fName, String lName, String street, String city, String state, String zip, JLabel acntID) {
        Account newAcct;
        newAcct = new Account(bal, fName, lName, street, city, state, zip); //create acct object
        accounts.add(newAcct); //add account to bank accounts
        acntID.setText("Account created. Account ID is: " + newAcct.getID());
    }

    /**
     * Deletes an existing account. 
     * pre: none 
     * post: An existing account has been deleted.
     */
    public void deleteAccount(String acctID, JLabel text) {
        int acctIndex;
        Account acctToMatch;
        acctToMatch = new Account(acctID);
        acctIndex = accounts.indexOf(acctToMatch); //retrieve location of account
        if (acctIndex > -1) {
            accounts.remove(acctIndex); //remove account
            text.setText("Account removed.");
        } else {
            text.setText("Account does not exist.");
        }
    }

    /**
     * Performs a transaction on an existing account. 
     * A transCode of 1 is for deposits and a transCode of 2 is for withdrawals. 
     * pre: transCode is 1 or 2. 
     * post: A transaction has occurred for an existing account.
     */
    public void transaction(int transCode, String acctID, double amt, JTextArea text) {
        int acctIndex;
        Account acctToMatch, acct;

        acctToMatch = new Account(acctID);
        acctIndex = accounts.indexOf(acctToMatch); //retrieve location of account
        if (acctIndex > -1) {
            acct = (Account) accounts.get(acctIndex); //retrieve object to modify
            if (transCode == 1) {
                acct.deposit(amt);
                accounts.set(acctIndex, acct); //replace object with updated object
                text.setText(acct.toString());
            } else if (transCode == 2) {
                accounts.set(acctIndex, acct); //replace object with updated object
                text.setText(acct.toString());
                acct.withdrawal(amt, text);
            }
        } else {
            text.setText("Account does not exist.");
        }
    }

    /**
     * Displays the account information, including the current balance, for an
     * existing account. 
     * pre: none 
     * post: Account information, including balance, has been displayed.
     */
    public void checkBalance(String acctID, JTextArea text) {
        int acctIndex;
        Account acctToMatch, acct;

        acctToMatch = new Account(acctID);
        acctIndex = accounts.indexOf(acctToMatch); //retrieve location of account
        if (acctIndex > -1) {
            acct = (Account) accounts.get(acctIndex); //retrieve object to display
            text.setText(acct.toString());
        } else {
            text.setText("Account does not exist.");
        }
    }

     /**
     * Modifies the account address details for an existing account. 
     * pre: none
     * post: Account address information is modified, and then displayed.
     */
    public void modifyAccount(String acctID, String newStreet, String newCity, String newState, String newZip, JTextArea text) {
        int acctIndex;
        Account acctToMatch, acct;

        acctToMatch = new Account(acctID);
        acctIndex = accounts.indexOf(acctToMatch); //retrieve location of account
        if (acctIndex > -1) {
            acct = (Account) accounts.get(acctIndex); //retrieve object to display
            acct.changeAddress(newStreet, newCity, newState, newZip);
            accounts.set(acctIndex, acct); //replace object with updated object
            text.setText(acct.toString());
        } else {
            text.setText("Account does not exist.");
        }
    }
}
