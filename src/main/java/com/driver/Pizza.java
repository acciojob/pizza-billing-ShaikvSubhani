package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    public boolean isCheese=false;
    public boolean isTopping=false;
    public boolean isPaperBag=false;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg)
        {
            this.price=300;
        }
        else
            this.price=400;

        return;
    }

    public int getPrice(){

        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(this.isCheese==false)
        {
            this.isCheese=true;
            this.price+=80;
        }
        return;
    }

    public void addExtraToppings(){
        // your code goes here
        if(isVeg && this.isTopping==false)
        {
            this.isTopping=true;
            this.price+=70;

        }
        if(!isVeg  && this.isTopping==false)
        {
            this.isTopping=true;
            this.price+=120;
        }
        return;
    }

    public void addTakeaway(){
        // your code goes here
        if(this.isPaperBag==false)
        {
            this.isPaperBag=true;
            this.price+=20;
        }
        return;
    }

    public String getBill(){
        // your code goes here
        this.bill=("Base Price Of The Pizza: "+(isVeg ? 300:400)+"\n" +
                "Extra cheese added: 80\n" +
                "Extra Topping added: "+(isVeg ? 70:120)+(isPaperBag ? "\n" +
                "paperbag Added: 20":"")+"\n" +
                "Total Price: "+this.price+"\n");
        return this.bill;
    }
}
