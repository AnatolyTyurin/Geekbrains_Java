package ru.geekbrains.lesson3;

import java.util.Arrays;

public class Java_HW_3 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        changeArr(arr);
        System.out.println(Arrays.toString(arr));

        int[] arr2 = new int[100];
        listNumbers(arr2);
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = {1,5,3,2,11,4,5,2,4,8,8,1};
        multArr(arr3);
        System.out.println(Arrays.toString(arr3));

        int[][] arr4 = new int[5][5];
        sqArr(arr4);

        System.out.println(Arrays.toString(lenArr(7, 4)));


        int[] numbers = {1,2,3};
        for (int num : numbers) {
            System.out.println(num);
        }

        int[] arr5 = {1,2,3};
        System.out.println(Arrays.toString(minMaxArr(arr5)));
    }

    public static void changeArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
    }
    public static void listNumbers(int[] arr2) {
        for(int i = 0; i < arr2.length; i++) {
        arr2[i] = i + 1;}
    }

    public static void multArr(int[] arr3) {
        for(int i = 0; i < arr3.length; i++) {
            if(arr3[i] < 6) {
                arr3[i] *= 2;
            }
        }
    }

    public static void sqArr(int[][] arr4){
        for(int  i = 0; i < arr4.length; i++) {
            for(int j = 0; j < arr4[i].length; j++) {
                if(i == j || (i + j) == arr4.length - 1) {
                    arr4[i][j] = 1;
                } else {
                    arr4[i][j] = 0;
                }
            }
            System.out.println(Arrays.toString(arr4[i]));
        }
    }

    public static int[] lenArr(int len, int initialValue) {
        int[] result = new int[len];
        for(int i = 0; i < len; i++) {
            result[i] = initialValue;
        }
        return(result);
    }

    static int[] minMaxArr(int[] arr5) {
        int min = arr5[0], max = arr5[0];
        for(int i : arr5) {
            if(min > i) {
                min = i;
            }
            if (max < i) {
                max = i;
            }
        }
        return new int[]{min, max};
    }


}



        /*
        String str1 = "A";
        String str2 = "A";
        String str3 = "B";
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
    }
}

        /*
        System.out.printf("Слово: %s, Число с плавающей запятой: %f, Целое число: %d, Символ: %c", "Java", 2.5f, 20, 'e');
    }
}

        /*
        Random rand = new Random();
        int x = rand.nextInt(2000);
        System.out.println(x);
    }
}


        /*
        int[] arr = {1, 4, 8, 4, 5, 6, 4};
        System.out.println(arrSum(arr));
        System.out.println(Arrays.toString(arr));
    }

    public static int arrSum(int[] arr) {
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
           int w = arr[i];
            if (w == 4) {
                sum++;}
        }
        return sum;
    }
}


        /*
        for (int i = 0; i < arr[0].length; i++) {
            System.out.print(i + " ");
        };
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + 1 + " ");
            for (int j = 0; j < arr[i].length; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }
}

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println();
    }
}

    /*
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int d = getNumberFromScanner("Введите число в пределах от 5 до 10", 5, 10);
        System.out.println("d = " + d);
    }
    public static int getNumberFromScanner(String message, int min, int max) {
        int x;
        do {
            System.out.println(message);
            x = sc.nextInt();
        } while (x < min || x > max);
        return x;
    }
}



        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        int number = sc.nextInt();
        System.out.print("Вы ввели:" + number);
        sc.close();
    }

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int a = sc.nextInt();
        a *= 2;
        System.out.println("Введенное вами число, умноженное на 2, равно" + a);
        sc.close();
    }

        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
        String b = sc.nextLine();
//        String c = sc.next();
//        sc.close();
//        System.out.println(c);
        System.out.println(b);
    }

        int[] arr = {2, 4, 5, 1, 2, 3, 4, 5};
        System.out.println("Arr.length: " + arr.length);
        for(int i = 1; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

        int[][] arr = {{1, 2, 3}, {3, 4, 5}};
        printArr(arr);
    }
    public static void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
            System.out.println(arr.length);
            System.out.println(arr[i].length);
        }

    }
        int counter = 1;
        int[][] table = new int[3][4];
        for(int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                table[i][j] = counter;
                System.out.print(table[i][j] + " ");
                counter++;
            }
            System.out.println();
        }
    }
        String[] arr = {"A", "B", "C", "D"};
        System.out.println(Arrays.toString(arr));
    }
        int[] arr = new int[10];
        for(int i = 0; i < 9; i++) {
            arr[i] = i;
            System.out.println("arr["+ i +"]=" + arr[i]);
        }
    }
        int[] nums = new int[4];
        nums[0] = 5;
        nums[1] = 10;
        nums[2] = 15;
        nums[3] = 15;
    }
        int [] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = i;
            System.out.println("arr["+ i +"] = " + arr[i]);
        }

        int[] t = new int [24];
        t[0] = -3;
        t[6] = 0;
        System.out.println(t[0]);
        System.out.println(t[6]);
        int[] arr = {123, 321, 111, 212, 313};
        System.out.println(Arrays.toString(arr));
        Random random = new Random();
        for (int i = 0; i < 30; i++) {
            System.out.print(random.nextInt(30) + " ");
        }
        System.out.println();
        System.out.println(">");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("a = " + a);

        int [][] matrix = {{1, 2, 3},{4, 5, 6}, {7, 8 ,9}};
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
            }
        */
