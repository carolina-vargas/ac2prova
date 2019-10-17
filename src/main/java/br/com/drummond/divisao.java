package br.com.drummond;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class divisao {

@RequestMapping(value = "/api3/{dividendo}/{divisor}", method = RequestMethod.GET)
public String dividisao (@PathVariable Integer dividendo, @PathVariable Integer divisor) {

Integer resultado;
resultado = dividendo / divisor;

return "O resultado da sua divisão é: " + resultado;

}
 
}
