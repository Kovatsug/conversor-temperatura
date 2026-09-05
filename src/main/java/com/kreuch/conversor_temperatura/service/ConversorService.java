package com.kreuch.conversor_temperatura.service;

import com.kreuch.conversor_temperatura.dto.ConversorRequest;
import com.kreuch.conversor_temperatura.dto.ConversorResponse;
import org.springframework.stereotype.Service;

@Service
public class ConversorService {

    public ConversorResponse converter(ConversorRequest request){

        double temperatura = switch (request.getDe()){
            case "CELSIUS" -> switch (request.getPara()){
                case "KELVIN" -> request.getTemperatura()+273.15;
                case "FAHRENHEIT" -> (request.getTemperatura()*9/5)+32;
                default -> request.getTemperatura();
            };
            case "KELVIN" -> switch (request.getPara()){
                case "CELSIUS" -> request.getTemperatura()-273.15;
                case "FAHRENHEIT" -> (request.getTemperatura()-273.15)*9/5 +32;
                default -> request.getTemperatura();
            };
            case "FAHRENHEIT" -> switch (request.getPara()){
              case "CELSIUS" -> (request.getTemperatura()-32)*5/9;
              case "KELVIN" -> (request.getTemperatura()-32)*5/9 +273.15;
              default -> request.getTemperatura();
            };
            default -> 0;
        };

        return new ConversorResponse(temperatura,request.getPara());
    }

}
