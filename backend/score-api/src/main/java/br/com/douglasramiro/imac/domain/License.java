package br.com.douglasramiro.imac.domain;

import lombok.Getter;

import java.io.Serializable;

@Getter
public class License  implements Serializable {
    private String id;

    public License(String id) {
        if (id != null) {
            this.id = id;
        }else{
            throw new IllegalArgumentException("A License id must be provided");
        }
    }
}
