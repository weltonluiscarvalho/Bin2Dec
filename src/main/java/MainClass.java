import services.BinaryToDecimal;

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {

        BinaryToDecimal converter = new BinaryToDecimal();

        Scanner in = new Scanner(System.in);

        System.out.print("Enter de binary value: ");
        String binaryValue = in.nextLine();

        Double result = converter.toDecimal(binaryValue);

        System.out.printf("The decimal equivalent is %.0f\n", result);

        in.close();
    }
}
