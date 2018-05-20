package br.com.douglasramiro.imac.domain;

import br.com.douglasramiro.imac.util.Regex;
import lombok.Getter;

import java.io.Serializable;

@Getter
public class BRA extends License  implements Serializable {

    public BRA(String number) {
        super(number);
        if (!Regex.getInstance().containsOnlyNumbers(number)){
            throw new IllegalArgumentException("BRA must contain only numbers");
        }

    }
}
