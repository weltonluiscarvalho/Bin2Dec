package services;

public class BinaryToDecimal {

    public Double toDecimal(String binary) {

        Double sum = 0.0;

        for (int i = binary.length() - 1; i >= 0; i--) {
            Integer binNumber = Integer.parseInt(String.valueOf(binary.charAt(i)));
            double number = Math.pow(2, (binary.length() - 1) - i);
            sum += binNumber * number;
        }

        return sum;
    }
}
