package br.com.ddouglss.request.convertrs;

public class NumberConverter {


    private static Double convertToDouble(String strNumber) throws IllegalAccessException {

        if(strNumber == null || strNumber.isEmpty()) throw new UnsupportedOperationException("Please set a numeric value!");
        String number = strNumber.replace(",", "."); //Converte "," por "." : R$ 10,00 USD 10.00
        return Double.parseDouble(number);
    }

    private static boolean isNumeric(String strNumber) {
        if(strNumber == null || strNumber.isEmpty()) return false;
        String number = strNumber.replace(",", "."); //Converte "," por "." : R$ 10,00 USD 10.00
        return number.matches("[-+]?[0-9]*\\.?[0-9]+");
    }
}
