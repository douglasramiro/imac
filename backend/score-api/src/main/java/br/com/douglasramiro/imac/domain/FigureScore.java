package br.com.douglasramiro.imac.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class FigureScore {
    private Figure figure;
    private Double score;


    public Double getKFactoredScore(){
        return figure.getKFactor() * score;
    }
}
