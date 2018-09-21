import java.util.Scanner;



    public class Main {
        public static void main(String[] args) {
            System.out.print("Введите число. Если число нецелое, то используйте точку : ");
            Scanner in = new Scanner(System.in);
            String numText = in.nextLine();
            System.out.print("Возможные типы данных : ");
            int numInt = 0;

            if (numText.indexOf(".") != -1) {
                System.out.println("double");
                System.out.println("Unfortunately, I can't convert double. Sorry! (");

            } else {
                numInt = Integer.parseInt(numText);
                checkInt(numInt);
                System.out.println("double");
                if (numInt > 1)
                    convertToBinaryInt(numInt);
                else if (numInt == 0) {
                    System.out.print("Converted number: ");
                    System.out.println(0);
                }
                else if (numInt == 1) {
                    System.out.print("Converted number: ");
                    System.out.println(1);
                }
                else
                    System.out.println("Unfortunately, I can't convert negative. Sorry! (");
            }

        }


        public static void checkInt(int numberToCheck) {
            if (numberToCheck < 128)
                System.out.print("byte ");
            if (numberToCheck < 32768)
                System.out.print("short ");
            if (numberToCheck < 2147483647)
                System.out.print("integer ");
        }


        public static void convertToBinaryInt(int numberToConvert) {

            int m = 1;
            do {
                m++;
            } while (numberToConvert >= Math.pow(2, m));
            int[] finalNum = new int[m];
            for (int i = m - 1; i > 0; i--) {
                finalNum[i] = numberToConvert % 2;
                numberToConvert /= 2;
            }
            finalNum[0] = 1;
            System.out.print("Converted number: ");
            for (int l = 0; l < m; l++)
                System.out.print(finalNum[l]);
        }
    }


