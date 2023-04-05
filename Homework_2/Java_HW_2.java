class Java_HW_2 {
    public static void main(String[] args) {
        System.out.println(between10And20(-2, 11));
        System.out.println(between10And20(3, 8));
        System.out.println(between10And20(15, 6));
        
        System.out.println(checkNumber(-1)? "Number is positive" : "Number is negative");
        System.out.println(checkNumber(0)? "Number is positive" : "Number is negative");
        System.out.println(checkNumber(1)? "Number is positive" : "Number is negative");


        System.out.println(checkNumberBoolean(-1));
        System.out.println(checkNumberBoolean(0));
        System.out.println(checkNumberBoolean(1));
        
        lineOut("__Java is great!___", 2);
        
        System.out.println(leapYear(2000));
        System.out.println(leapYear(2003));
        System.out.println(leapYear(2004));
        System.out.println(leapYear(2100));
        
        System.out.println(leapYearOptimize(2000));
        System.out.println(leapYearOptimize(2003));
        System.out.println(leapYearOptimize(2004));
        System.out.println(leapYearOptimize(2100));
    }

    static boolean between10And20(int a, int b) {
        return a + b >= 10 && a + b <= 20;
    }

    static boolean checkNumber(int a) {
        return a >= 0;
    }

    static boolean checkNumberBoolean(int a) {
        return a < 0;
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

    static boolean leapYearOptimize(int year) {
        return (year % 4 == 0 && year % 100 !=0) || year % 400 == 0;
    }
}