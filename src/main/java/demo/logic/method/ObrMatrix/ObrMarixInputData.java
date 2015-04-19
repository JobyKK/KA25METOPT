package demo.logic.method.ObrMatrix;

import demo.logic.method.data.InputData;
import org.apache.commons.math3.fraction.Fraction;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andrey on 17.04.2015.
 */
public class ObrMarixInputData implements InputData {

    ArrayList<ArrayList<Fraction>> matrix;
    List<Double> params;

    @Override
    public ArrayList<ArrayList<Fraction>> getMatrix() {
        return matrix;
    }

    public void setMatrix(ArrayList<ArrayList<Fraction>> matrix) {
        this.matrix = matrix;
    }

    @Override
    public List<Double> getParams() {
        return params;
    }

    public void setParams(List<Double> params) {
        this.params = params;
    }
}
