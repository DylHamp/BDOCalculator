package com.calculator.bdo.bdocraftingcalculator;

/**
 * Created by dhampton on 4/12/17.
 */

public class Item {
    public Item(){
        this.name = "nothing";
        this.detail = "nothing is here";
        this.amount = 0;
    }
    public Item(String name, String detail){
        this.name = name;
        this.detail = detail;
        this.amount = 1;
    }
    public Item(String name, String detail, Integer amount){
        this.name = name;
        this.detail = detail;
        this.amount = amount;
    }

    private String name, detail;
    private Integer amount;

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getDetail(){
        return this.detail;
    }

    public void setDetail(String detail){
        this.detail = detail;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}
