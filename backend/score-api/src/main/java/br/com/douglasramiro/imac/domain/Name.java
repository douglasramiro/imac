package br.com.douglasramiro.imac.domain;

import br.com.douglasramiro.imac.util.Regex;
import lombok.Data;
import lombok.Getter;

import java.io.Serializable;

@Getter
public class Name  implements Serializable {
    private String fullName;

    public Name(String fullName) {
        if (Regex.getInstance().containsAValidName(fullName)){
            this.fullName = fullName;
        }else{
            throw new IllegalArgumentException("The provided name is invalid");
        }
    }
}
