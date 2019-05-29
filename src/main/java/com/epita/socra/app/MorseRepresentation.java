package com.epita.socra.app;

public class MorseRepresentation {

    private String representation;

    public MorseRepresentation(int numberToConvert) {

        if (numberToConvert == 0) {
            representation = "_ _ _ _ _ ";
            return;
        }

        StringBuilder rep_builder = new StringBuilder("");

        while (numberToConvert > 0) {
            int lastDigit = numberToConvert % 10;
            String lastDigitRepresentation = "";

            switch (lastDigit) {
                case 0:
                    lastDigitRepresentation = "_ _ _ _ _ ";
                    break;
                case 1:
                    lastDigitRepresentation = ". _ _ _ _ ";
                    break;
                case 2:
                    lastDigitRepresentation = ". . _ _ _ ";
                    break;
                case 3:
                    lastDigitRepresentation = ". . . _ _ ";
                    break;
                case 4:
                    lastDigitRepresentation = ". . . . _ ";
                    break;
                case 5:
                    lastDigitRepresentation = ". . . . . ";
                    break;
                case 6:
                    lastDigitRepresentation = "_ . . . . ";
                    break;
                case 7:
                    lastDigitRepresentation = "_ _ . . . ";
                    break;
                case 8:
                    lastDigitRepresentation = "_ _ _ . . ";
                    break;
                case 9:
                    lastDigitRepresentation = "_ _ _ _ . ";
                    break;
            }
            numberToConvert /= 10;
            rep_builder.insert(0, lastDigitRepresentation);
        }
        representation = rep_builder.toString();
    }

    @Override
    public String toString() {
        return representation;
    }


}
