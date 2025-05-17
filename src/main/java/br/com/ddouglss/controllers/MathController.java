package br.com.ddouglss.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class MathController {

    //Soma
    @RequestMapping("/sum/{numberOne}/{numberTwo}")
    public Double sum(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo

    ) throws Exception {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) throw new UnsupportedOperationException("Please set a numeric value!");
        return convertToDouble (numberOne) + convertToDouble (numberTwo);
    }

    //subtração
    @RequestMapping("/subtraction/{numberOne}/{numberTwo}")
    public Double subtraction(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo

    ) throws Exception {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) throw new UnsupportedOperationException("Please set a numeric value!");
        return convertToDouble (numberOne) - convertToDouble (numberTwo);
    }

    //multiplicação
    @RequestMapping("/multiplication/{numberOne}/{numberTwo}")
    public Double multiplication(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo

    ) throws Exception {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) throw new UnsupportedOperationException("Please set a numeric value!");
        return convertToDouble (numberOne) * convertToDouble (numberTwo);
    }

    //divisão
    @RequestMapping("/division/{numberOne}/{numberTwo}")
    public Double division(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo

    ) throws Exception {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) throw new UnsupportedOperationException("Please set a numeric value!");
        return convertToDouble (numberOne) / convertToDouble (numberTwo);
    }

    //divisão
    @RequestMapping("/mean/{numberOne}/{numberTwo}")
    public Double mean(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo

    ) throws Exception {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) throw new UnsupportedOperationException("Please set a numeric value!");
        return (convertToDouble (numberOne) + convertToDouble (numberTwo)) / 2;
    }
    //raiz quadrada
    @RequestMapping("/squareRoot/{number}")
    public Double squareRoot(
            @PathVariable("number") String number

    ) throws Exception {
        if (!isNumeric(number)) throw new UnsupportedOperationException("Please set a numeric value!");
        //Double result = Math.sqrt(convertToDouble(number));
        //return result;
        return Math.sqrt(convertToDouble(number));
    }


    private Double convertToDouble(String strNumber) throws IllegalAccessException {

        if(strNumber == null || strNumber.isEmpty()) throw new UnsupportedOperationException("Please set a numeric value!");
        String number = strNumber.replace(",", "."); //Converte "," por "." : R$ 10,00 USD 10.00
        return Double.parseDouble(number);
    }

    private boolean isNumeric(String strNumber) {
        if(strNumber == null || strNumber.isEmpty()) return false;
        String number = strNumber.replace(",", "."); //Converte "," por "." : R$ 10,00 USD 10.00
        return number.matches("[-+]?[0-9]*\\.?[0-9]+");
    }
}



