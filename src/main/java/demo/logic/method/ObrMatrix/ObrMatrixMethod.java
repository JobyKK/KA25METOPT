package demo.logic.method.ObrMatrix;

import demo.logic.method.Method;
import demo.logic.method.MethodExecutionException;
import demo.logic.method.data.InputData;
import org.springframework.stereotype.Component;

/**
 * Created by Andrey on 16.04.2015.
 */
@Component
public class ObrMatrixMethod extends Method {


    public ObrMatrixMethod(){
        setName("ObrMatrix");
    }

    public ObrMatrixMethod(InputData inputData) {
        super(inputData);
    }

    @Override
    public void executeMethod() throws MethodExecutionException {

    }
}
