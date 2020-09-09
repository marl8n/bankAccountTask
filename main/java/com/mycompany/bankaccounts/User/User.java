/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.bankaccounts.User;

import static com.mycompany.bankaccounts.Utils.Utils.twoDecDouble;

/**
 *
 * @author marl8n
 */
public class User {
    private String dpi;
    private String name;
    private Double balance;
    
    public User(String dpi, String name, String balance){
        this.dpi = dpi;
        this.name = name;
        this.balance = twoDecDouble.apply(balance);
    }

    public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
    
    public Boolean deposit(String d){
        this.balance += twoDecDouble.apply(d);
        return true;
    }
    
    public Boolean retire(String d){
        Double buffer = twoDecDouble.apply(d);
        if (this.balance >= buffer){
            this.balance -= buffer;
        }
        else{
            return false;
        }
        return true;
    }
    
    public String getAccountData(){
        return "Nombre: " + this.name + ", Saldo: " + this.balance + ", Dpi:" + this.dpi + "\n";
    }
}
