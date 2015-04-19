package demo.logic.method.data;

import org.apache.commons.math3.fraction.Fraction;
import org.apache.commons.math3.fraction.FractionFormat;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andrey on 17.04.2015.
 */
public class ConvertData implements Data{

    ArrayList<ArrayList<Fraction>> matrix;

    ArrayList<ArrayList<String>> matrixRaw;
    List<Double> params;

    public ConvertData() {
    }

    public ConvertData(ArrayList<ArrayList<String>> matrixRaw, List<Double> params) {
        this.matrixRaw = matrixRaw;
        this.params = params;
        matrix = new ArrayList<ArrayList<Fraction>>();
    }

    public ConvertData(ConvertData input) {
        this(input.getMatrixRaw(), input.getParams());
    }


    public ArrayList<ArrayList<String>> getMatrixRaw() {
        return matrixRaw;
    }

    public void setMatrixRaw(ArrayList<ArrayList<String>> matrixRaw) {
        this.matrixRaw = matrixRaw;
    }

    public void setMatrix(ArrayList<ArrayList<Fraction>> matrix) {
        this.matrix = matrix;
    }

    public void setParams(List<Double> params) {
        this.params = params;
    }

    @Override
    public ArrayList<ArrayList<Fraction>> getMatrix() {
        return matrix;
    }

    @Override
    public List<Double> getParams() {
        return null;
    }

    private void processRawMatrix(){
        FractionFormat ff = new FractionFormat();
        for (int i = 0; i < matrixRaw.size(); i++){
            ArrayList<Fraction> vector = new ArrayList<Fraction>();
            for (int j = 0; j < matrixRaw.get(i).size(); j++){
                vector.add(ff.parse(matrixRaw.get(i).get(j)));
            }
            matrix.add(vector);
        }
    }

}
