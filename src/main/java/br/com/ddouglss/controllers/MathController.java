package br.com.ddouglss.controllers;

import br.com.ddouglss.math.SimpleMath;
import br.com.ddouglss.request.convertrs.NumberConverter;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class MathController {

    private SimpleMath math = new SimpleMath();

    //Soma
    @RequestMapping("/sum/{numberOne}/{numberTwo}")
    public Double sum(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo

    ) throws Exception {
        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) throw new UnsupportedOperationException("Please set a numeric value!");
        return math.sum(NumberConverter.convertToDouble (numberOne), NumberConverter.convertToDouble (numberTwo));
    }

    //subtração
    @RequestMapping("/subtraction/{numberOne}/{numberTwo}")
    public Double subtraction(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo

    ) throws Exception {
        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) throw new UnsupportedOperationException("Please set a numeric value!");
        return math.subtraction(NumberConverter.convertToDouble (numberOne), NumberConverter.convertToDouble (numberTwo));
    }

    //multiplicação
    @RequestMapping("/multiplication/{numberOne}/{numberTwo}")
    public Double multiplication(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo

    ) throws Exception {
        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) throw new UnsupportedOperationException("Please set a numeric value!");
        return math.multiplication(NumberConverter.convertToDouble (numberOne), NumberConverter.convertToDouble (numberTwo));
    }

    //divisão
    @RequestMapping("/division/{numberOne}/{numberTwo}")
    public Double division(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo

    ) throws Exception {
        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) throw new UnsupportedOperationException("Please set a numeric value!");
        return math.division(NumberConverter.convertToDouble (numberOne), NumberConverter.convertToDouble (numberTwo));
    }

    //media
    @RequestMapping("/mean/{numberOne}/{numberTwo}")
    public Double mean(
            @PathVariable("numberOne") String numberOne,
            @PathVariable("numberTwo") String numberTwo

    ) throws Exception {
        if (!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)) throw new UnsupportedOperationException("Please set a numeric value!");
        return math.mean(NumberConverter.convertToDouble (numberOne), NumberConverter.convertToDouble (numberTwo));
    }
    //raiz quadrada
    @RequestMapping("/squareroot/{number}")
    public Double squareRoot(
            @PathVariable("number") String number

    ) throws Exception {
        if (!NumberConverter.isNumeric(number)) throw new UnsupportedOperationException("Please set a numeric value!");
        //Double result = Math.sqrt(NumberConverter.convertToDouble(number));
        //return result;
        return math.squareRoot(NumberConverter.convertToDouble(number));
    }

}



