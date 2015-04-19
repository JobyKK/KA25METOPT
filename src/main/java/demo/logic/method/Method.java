package demo.logic.method;


import demo.logic.method.data.InputData;

/**
 * Created by Andrey on 16.04.2015.
 */

public abstract class Method {

    String name;

    InputData inputData;
    Result methodResult;

    public Method(){};

    public abstract void executeMethod() throws MethodExecutionException;

    public Method(InputData inputData) {
        this.inputData = inputData;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public InputData getInputData() {
        return inputData;
    }

    public void setInputData(InputData inputData) {
        this.inputData = inputData;
    }

    public Result getMethodResult() {
        return methodResult;
    }

    public void setMethodResult(Result methodResult) {
        this.methodResult = methodResult;
    }
}
