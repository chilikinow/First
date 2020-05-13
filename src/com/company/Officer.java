package com.company;

public class Officer {

    int maxWeight;
    boolean canDrive;

    public Officer(int max){
        this.maxWeight = max;
    }

    public boolean canIDrive(Truck truck){
        if (truck.weight < maxWeight){
            return true;
        } else{
            return false;
        }

    }
    public static void main (String [] args){
        Truck kamaz = new Truck(10, 4, 2, 10);
        Truck belaz = new Truck(20, 8, 4, 12);
        Officer bridgeOfficer = new Officer(15);
        System.out.println("Mogu li ia proekhat na kamaze, offiser? Offiser:" + bridgeOfficer.canIDrive(kamaz));
        System.out.println("Mogu li ia proekhat na belaz, offiser? Offiser:" + bridgeOfficer.canIDrive(belaz));
    }

}
