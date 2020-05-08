package com.company;

public class Main {

    public static void main(String[] args) {

        int a = 2, b = 4, c = 6;

        double itogo;

        itogo = sum(a,b) + umno(a,b);
        printd(itogo);
        kartochka oleg = new kartochka();
        oleg.id = 1;
        oleg.firstname = "Oleg";
        oleg.lastname = "Chilikin";
        System.out.println(oleg.id, oleg.firstname, oleg.lastname);
    }

	public static int sum(int sum1, int sum2){
	    int sum0;
	    sum0 = sum1 + sum2;
	    return sum0;
        }

    public static double umno(int um1,int um2){
	    double um0;
	    um0 = um1 * um2;
	    return um0;
        }

    public static void printd(double pt){
	    System.out.println(pt);
        }

        public static class kartochka {
	    public static short id;
	    public static String firstname;
	    public static String lastname;
        }




}
