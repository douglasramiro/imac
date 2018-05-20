package br.com.douglasramiro.imac.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class Sequence {

    private List<Figure> figures;
    private SequenceType type;


    public enum SequenceType {
        KNOWN("Knows"),
        UNKNOWN("Unknown")
        ;

        private String name;

        SequenceType(String name) {
            this.name = name;
        }
    }
}
