class Java_HW_1 {
	public static void main(String[] args) {
	printThreeWords();
	checkSumSign();
	printColor();
	compareNumbers();
	}
	    public static void printThreeWords() {
		System.out.println("Orange");
		System.out.println("Banana");
		System.out.println("Apple");
	}
	
	    public static void checkSumSign() {
		int a = -5;
		int b = -10;
		System.out.println(a + b >= 0? "Sum is positive" : "Sum is negative");
		
		/* if (a + b >= 0) { */
		    /* System.out.println("Sum is positive"); */
		/* } */
		/* if (a + b < 0) { */
			/* System.out.println("Sum is negative"); */
	    /* } */
    }
	
        public static void printColor() {
		int value = 110;
		if (value <= 0) {
			System.out.println("Red");
		}
		else if (value > 0 && value <= 100) {
			System.out.println("Yellow");
		}
		else {
			System.out.println("Green");
		}
	}
	
	    public static void compareNumbers() {
		int a =6;
		int b = 7;
		System.out.println(a >= b? "a >= b" : "a < b");
		/* if (a >= b) { */
		    /* System.out.println("a >= b"); */
		/* } */
		/* else { */
			/* System.out.println("a < b"); */
		/* } */
	}
}

