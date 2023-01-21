package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill="";
    private boolean isExtraCheese;
    private boolean isExtraTopping;
    private boolean isTakeAway;
    private int extraToppings;
    private boolean isBill;


    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
         this.isExtraCheese=false;
         this.isExtraTopping=false;
         this.isTakeAway=false;
         this.isBill=false;
        // your code goes here
        if(isVeg)
        {
            this.price=300;
            this.extraToppings=70;
        }
        else {
            this.price+=400;
            this.extraToppings=120;

        }
        this.bill+="Base Price Of The Pizza: "+this.price+"\n";

    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!isExtraCheese)
        {
            this.price+=80;
            isExtraCheese=true;
        }
        return;
    }

    public void addExtraToppings(){
        // your code goes here
        if(!isExtraTopping)
        {
                this.price+=this.extraToppings;
                isExtraTopping=true;
        }
            return;
    }

    public void addTakeaway(){
        // your code goes here
            if(!isTakeAway)
            {
                this.price+=20;
                isTakeAway=true;
            }
            return;
    }

    public String getBill(){
        // your code goes here
        if(!isBill) {
            if (isExtraCheese)
                this.bill += "Extra Cheese Added: " + 80 + "\n";
            if (isExtraTopping)
                this.bill += "Extra Toppings Added: " + this.extraToppings + "\n";
            if (isTakeAway)
                this.bill += "Paperbag Added: " + 20 + "\n";
//            System.out.print("Total Price: " + this.price + "\n");
            this.bill+="Total Price: "+this.price;
            isBill = true;

        }
            return this.bill;

    }
}
