import br.com.douglasramiro.imac.domain.*;
import br.com.douglasramiro.imac.domain.Class;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class FlightSequenceTest {

    private static List<Figure> figures;
    private static Pilot pilot;
    private static Judge judge;
    private static Contest contest;
    private static ArrayList<FigureScore> scores;
    private static FlightSequence flightSequence;

    @BeforeClass
    public static void init(){
        figures = new ArrayList<>();
        figures.add(new Figure(null,"Figure Z",(byte)23));
        figures.add(new Figure(null,"1 3/4 positive spin",(byte)16));
        figures.add(new Figure(null,"Reverse Half Cuban",(byte)39));
        figures.add(new Figure(null,"Outside Loop",(byte)26));
        figures.add(new Figure(null,"HammerHead",(byte)36));
        figures.add(new Figure(null,"Cross Box Humpt Bump",(byte)33));
        figures.add(new Figure(null,"135 Entry Reverse Shark Tooth",(byte)38));
        figures.add(new Figure(null,"Immelmann",(byte)34));
        figures.add(new Figure(null,"Vertical Down Line",(byte)12));
        figures.add(new Figure(null,"90 degree 1 turn roller",(byte)14));
        figures.add(new Figure(null,"Sound",(byte)9));
        figures.add(new Figure(null,"Air space control",(byte)9));

        pilot = new Pilot(
                    new Name("Douglas Ramiro"),
                    new License("223344"),
                    new Address("SMPW QD 5","35","Brasilia","DF","BRazil"),
                    new Airplane("Extra 300","Dalton Aviation",
                        new Engine("DLE","222"),"2.4"),
                    new Class("Intermediate"));

        judge = new Judge((byte)1,new Name("Edval"));

        contest = new Contest( new Address("SMPW QD 5","35","Brasilia","DF","BRazil"),new Date(), new Date());

        scores = new ArrayList<>();
        scores.add(new FigureScore(figures.get(0),7.5));
        scores.add(new FigureScore(figures.get(1),9.0));
        scores.add(new FigureScore(figures.get(2),6.5));
        scores.add(new FigureScore(figures.get(3),8.0));
        scores.add(new FigureScore(figures.get(4),7.0));
        scores.add(new FigureScore(figures.get(5),4.5));
        scores.add(new FigureScore(figures.get(6),6.5));
        scores.add(new FigureScore(figures.get(7),9.5));
        scores.add(new FigureScore(figures.get(8),4.5));
        scores.add(new FigureScore(figures.get(9),0.0));
        scores.add(new FigureScore(figures.get(10),10.0));
        scores.add(new FigureScore(figures.get(11),9.0));

        flightSequence = new FlightSequence(contest,(byte)1,(byte)1,judge,pilot,null, scores);


    }

    @Test
    public void testSimpleSum(){
        Double expected = 82.0;
        assertEquals(expected,flightSequence.getSimpleSum());
    }

    @Test
    public void testKFactoredSum(){
        Double expected = 1973.5;
        assertEquals(expected,flightSequence.getKFactoredSum());
    }

}
