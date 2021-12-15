package com.platzi.functionalproject.CLI;

import com.beust.jcommander.IParameterValidator;
import com.beust.jcommander.ParameterException;

public class KeywordValidator implements IParameterValidator {

    @Override
    public void validate(String name, String value) throws ParameterException {
        if(!value.matches("^[a-zA-Z]+[0-9]*$")){
            System.err.println("El criterio de busqueda no es válido.");
            throw new ParameterException("Unicamente letras y numeros");
        }
    }
}
