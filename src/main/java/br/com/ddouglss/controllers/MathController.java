package br.com.ddouglss.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class MathController {

    @RequestMapping("/sum/{numberOne}/{numberTwo}")
    public Double sum(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo

    ) throws Exception {
        if (!isNumeric(numberOne) || !isNumeric(numberTwo)) throw new IllegalAccessException();
        return convertToDouble (numberOne) + convertToDouble (numberTwo);
    }

    private Double convertToDouble(String strNumber) throws IllegalAccessException {

        if(strNumber == null || strNumber.isEmpty()) throw new IllegalAccessException();
        String number = strNumber.replace(",", "."); //Converte "," por "." : R$ 10,00 USD 10.00
        return Double.parseDouble(number);
    }

    private boolean isNumeric(String strNumber) {
        if(strNumber == null || strNumber.isEmpty()) return false;
        String number = strNumber.replace(",", "."); //Converte "," por "." : R$ 10,00 USD 10.00
        return number.matches("[-+]?[0-9]*\\.?[0-9]+");
    }
}



