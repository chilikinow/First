package olegChilikin.practice;

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("JANUARY 1 2000 "));
    }

    public static boolean isDateOdd(String date) {
        String [] dateArray = new String[date.length()];
        for (int i = 0; i < date.length(); i++) {
            dateArray[i] = "";
            dateArray[i] += date.charAt(i);
        }
        String month = "";
        String day = "";
        String year = "";
        int probel = 0;
        for (int i = 0; i < dateArray.length; i++) {
            if (probel == 0) {
                if (!dateArray[i].equals(" "))
                    month += dateArray[i];
                else {
                    ++probel;
                    ++i;
                }
            }
            if (probel == 1) {
                if (!dateArray[i].equals(" "))
                    day += dateArray[i];
                else{
                    ++probel;
                    ++i;
                }
            }
            if (probel == 2)
                if (!dateArray[i].equals(" "))
                    year += dateArray[i];
                else
                    break;
        }
        System.out.println(month + " " + day + " " + year);
        return true;
    }


}
