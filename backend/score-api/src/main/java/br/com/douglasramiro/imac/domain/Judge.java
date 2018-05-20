package br.com.douglasramiro.imac.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.io.Serializable;

@Getter
public class Judge implements Serializable {
    private Byte id;
    private Name name;

    public Judge(Byte id, Name name) {

        if (id == null){
            throw new IllegalArgumentException("A judge id must be provided");
        }

        if (name == null){
            throw new IllegalArgumentException("A judge name must be provided");
        }

        this.id = id;
        this.name = name;
    }
}
