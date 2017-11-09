package com.gman.converter.service;

import com.gman.converter.ws.length.LengthUnit;
import com.gman.converter.ws.length.LengthUnitSoap;
import com.gman.converter.ws.length.Lengths;
import org.springframework.stereotype.Service;

/**
 * Created by Anton Mikhaylov on 03.11.17.
 */

@Service
public class LengthConverter {

    public String convert(String from, String to, double value) {

        String resultTemplate = "@{value} @{fromUnit} is @{calculatedResult} @{toUnit}";

        Lengths lengthFrom = Lengths.fromValue(upperCaseFirstLetter(from));
        Lengths lengthTo = Lengths.fromValue(upperCaseFirstLetter(to));

        LengthUnitSoap ws = new LengthUnit().getLengthUnitSoap();
        double calcResult = ws.changeLengthUnit(value, lengthFrom, lengthTo);

        return resultTemplate
                .replace("@{value}", String.valueOf(value))
                .replace("@{fromUnit}", from)
                .replace("@{toUnit}", to)
                .replace("@{calculatedResult}", String.valueOf(calcResult));
    }

    private String upperCaseFirstLetter(String str) {
        return new String(str.substring(0, 1).toUpperCase() + str.substring(1));
    }
}
