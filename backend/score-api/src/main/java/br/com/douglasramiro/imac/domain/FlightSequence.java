package br.com.douglasramiro.imac.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

@Getter
@AllArgsConstructor
public class FlightSequence {

    private Contest contest;
    private Byte round;
    private Byte sequenceNumber;
    private Judge judge;
    private Pilot pilot;
    private Sequence sequence;
    private List<FigureScore> scores;


    public Double getSimpleSum(){
        AtomicReference<Double> sum = new AtomicReference<>(0.0);
        scores.forEach(fs -> sum.accumulateAndGet(fs.getScore(), (x, y) -> x+y));
        return sum.get();
    }

    public Double getKFactoredSum(){
        AtomicReference<Double> sum = new AtomicReference<>(0.0);
        scores.forEach(fs -> sum.accumulateAndGet((fs.getKFactoredScore()), (x,y) -> x+y));
        return sum.get();
    }

}
