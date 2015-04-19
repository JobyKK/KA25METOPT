package demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Andrey on 14.04.2015.
 */
@Component
@RestController
public class Test {

    private static String template = "Now %s is testing in %s method";

    @Value("unit")
    private String testMathod;
    @Value("all")
    private String testName;

    public String getTestMathod() {
        return testMathod;
    }

    public void setTestMathod(String testMathod) {
        this.testMathod = testMathod;
    }

    public String getTestName() {
        return testName;
    }

    @Autowired()
    public Test(@Value("simple")String testMathod,
                @Value("Al" +
                        "l")String testName) {
        this.testMathod = testMathod;
        this.testName = testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }
    @RequestMapping("/test")
    public String getTesting(){
        return String.format(template, testName, testMathod);
    }

}
