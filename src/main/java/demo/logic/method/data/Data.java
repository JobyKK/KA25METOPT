package demo.logic.method.data;

import org.apache.commons.math3.fraction.Fraction;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andrey on 16.04.2015.
 */
public interface Data {

    ArrayList<ArrayList<Fraction>> getMatrix();
    List<Double> getParams();

}
