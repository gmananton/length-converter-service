package com.gman.converter.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.gman.converter.service.LengthConverter;

/**
 * Created by Anton Mikhaylov on 03.11.17.
 */

@RestController
@RequestMapping("/")
public class LengthConverterController {

    @Autowired
    LengthConverter lengthConverter;


    @RequestMapping("index")
    public String index() {
        return "index";
    }

    @RequestMapping("convert/{fromUnit}/{toUnit}")
    public String convert(@PathVariable String fromUnit, @PathVariable String toUnit) {
        return lengthConverter.convert(fromUnit, toUnit);
    }



}
