package javaweek8sandip.pro17carpetcostcalculator;

public class Carpet {

    double cost;

    Carpet(double c){

        this.cost =  0;
        if (c > 0){
            this.cost = c;
        }
    }

    public double getCost(){

        return this.cost;
    }
}
