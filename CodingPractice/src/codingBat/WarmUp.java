package codingBat;

public class WarmUp {

    public static void main(String args[]) {
        WarmUp wu = new WarmUp();
        System.out.println("*******************" + " WARM UP 1 " + "*******************");
        boolean warmUp1 = wu.nearHundred(93);
        System.out.println(warmUp1);
        warmUp1 = wu.nearHundred(90);
        System.out.println(warmUp1);
        warmUp1 = wu.nearHundred(89);
        System.out.println(warmUp1);

        System.out.println("*******************" + " WARM UP 2 " + "*******************");
        boolean warmUp2 = wu.posNeg(1, -1, false);
        System.out.println(warmUp2);
        warmUp2 = wu.posNeg(-1, 1, false);
        System.out.println(warmUp2);
        warmUp2 = wu.posNeg(-4, -5, true);
        System.out.println(warmUp2);

        System.out.println("*******************" + " WARM UP 3 " + "*******************");
        String warmUp3 = wu.notString("not candy");
        System.out.println(warmUp3);
        warmUp3 = wu.notString("X");
        System.out.println(warmUp3);
        warmUp3 = wu.notString("not");
        System.out.println(warmUp3);


    }


//    Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number.
//    nearHundred(93) → true
//    nearHundred(90) → true
//    nearHundred(89) → false

    public boolean nearHundred(int n) {
        if (Math.abs(n - 100) <= 10 || Math.abs(n - 200) <= 10) {
            return true;
        }
        return false;
    }


//    Given 2 int values, return true if one is negative and one is positive. Except if the parameter "negative" is true, then return true only if both are negative.
//    posNeg(1, -1, false) → true
//    posNeg(-1, 1, false) → true
//    posNeg(-4, -5, true) → true

    public boolean posNeg(int a, int b, boolean negative) {
        if (negative) {
            return (a < 0 && b < 0);
        } else {
            return ((a < 0 && b > 0) || (a > 0 && b < 0));
        }
    }

//    Given a string, return a new string where "not " has been added to the front. However, if the string already begins with "not", return the string unchanged. Note: use .equals() to compare 2 strings.
//    notString("candy") → "not candy"
//    notString("x") → "not x"
//    notString("not bad") → "not bad"

    public String notString(String str) {
        if (str.length() >= 3 && str.substring(0, 3).equals("not")) {
            return str;
        }
        return "not " + str;
    }






}