package demo.logic.method;

import demo.logic.method.data.MethodDataScope;

import java.util.List;

/**
 * Created by Andrey on 16.04.2015.
 */
public interface Result {

    String getExecutionResult();
    List<MethodDataScope> getMethodData();

}
