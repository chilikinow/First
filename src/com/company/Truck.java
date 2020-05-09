package com.company;

public class Truck {
    int length, width, height, weight;

    public Truck(int length, int width, int height, int weight){
        this.length = length;
        this.width = width;
        this.height = height;
        this.weight = weight;
    }

    public int getVolume(Truck truck) {
        return truck.length * truck.width * truck.height;
    }
    public static void main (String [] args){
        Truck kamaz = new Truck(10, 4, 2, 10);
        System.out.println(kamaz.getVolume(kamaz));
    }
}
