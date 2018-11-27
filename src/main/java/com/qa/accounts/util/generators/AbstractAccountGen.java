package com.qa.accounts.util.generators;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.qa.accounts.util.constants.Constants;

public abstract class AbstractAccountGen {

    private List<String> accountNumList = new ArrayList<>();

    public abstract String getGeneratedNumber();

    protected String generateAccountNumber(int accoutnSize){
        String num = constructString(1);
        while(accountNumList.contains(num)){
            num = constructString(1);
        }
        accountNumList.add(num);
        return num;
    }

    private String constructString(int size){
        String accNum="";
        int i = new Random().nextInt(3);
        if(i==0){
            accNum += (Constants.ACCOUNT_TYPE_A + ":");
        }else if(i==2){
            accNum += (Constants.ACCOUNT_TYPE_B + ":");
        }else{
            accNum += (Constants.ACCOUNT_TYPE_C + ":");
        }
        for (int j = 0; j < size; j++) {
            accNum += generateDigit();
        }
        return accNum;
    }

    private String generateDigit(){
        Random random = new Random();
        return random.nextInt(10) +"";
    }
    
    public void setAccountNumList(List<String> accountNumList) {
    	this.accountNumList = accountNumList;
    }
}