class Java_HW_2 {
    public static void main(String[] args) {
        System.out.println(checkSumSign(2, 20));
        System.out.println(checkNumber(0)? "Number is positive" : "Number is negative");
        System.out.println(checkNumberBoolean(-1));
        lineOut("__Java is great!___", 2);
        System.out.println(leapYear(2024));
    }

    static boolean checkSumSign(int a, int b) {
        if (a + b <= 20 && a + b >= 10) {
        return true;
        } else {
            return false;
        }
    }

    static boolean checkNumber(int a) {
        return a >= 0;
    }

    static boolean checkNumberBoolean(int a) {
        if (a >= 0) {
            return false;
        } else {
            return true;
        }
    }

    static void lineOut(String a, int b) {
        for(int i = 0; i < b; i++) {
            System.out.println(a);
        }
    }

    static boolean leapYear(int a) {          
        if(a % 400 == 0) {
            return true;
        } else if(a % 100 == 0) {
            return false;
        } else if((a+4) % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }
}