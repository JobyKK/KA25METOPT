package demo.controller;

import demo.logic.method.data.ConvertData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Andrey on 16.04.2015.
 */

@Controller
public class MethodController {

    MethodService methodService;

    @Autowired
    public MethodController(MethodService methodService) {
        this.methodService = methodService;
    }

    @RequestMapping(value = "/methods")
    public String greeting(ModelMap model) {
        ArrayList<String> names = methodService.getNames();
        for (String n:names)
            System.out.println(n);
        model.addAttribute("names", names);
        System.out.println("-----------------");
        return "methods";//getNames();
    }

    @RequestMapping(value = "/names")
    @ResponseBody
    public ArrayList<String> names() {
        ArrayList<String> names = methodService.getNames();
        for (String n:names)
            System.out.println(n);
        System.out.println("-----------------");
        return names;//getNames();
    }

    @RequestMapping(value = "/methods/json", params = "get")
    @ResponseBody
    public ConvertData getData(@RequestBody ConvertData input){
        ConvertData convertData =  new ConvertData(input);
        for (int i = 0; i < convertData.getMatrixRaw().size(); i++){
            for (int j = 0; j < convertData.getMatrixRaw().get(i).size(); j++) {
                System.out.println(convertData.getMatrixRaw().get(i).get(j));
            }
            System.out.println();
        }
        return convertData;
    }

    @RequestMapping(value="/methods/test", method= RequestMethod.GET)
    public String testForm(Model model) {
        model.addAttribute("convertData", new ConvertData());
        return "result";
    }


    @RequestMapping(value="/methods/test", method= RequestMethod.POST)
    public String greetingSubmit(@ModelAttribute ConvertData convertData, Model model) {
        model.addAttribute("convertData", convertData);
//        System.out.println(convertData.getMatrix().size());
        System.out.println(convertData.getMatrixRaw().size());
        return "result";
    }

    @RequestMapping(value = "/methods/json")
    @ResponseBody
    public ConvertData pushData(){
        ArrayList<ArrayList<String>> lol = new ArrayList<>();
        ArrayList<Double> params = new ArrayList<>(Arrays.asList(new Double[]{new Double(1231231)}));
        lol.add(new ArrayList<>(Arrays.asList(new String[]{"123"})));
        lol.add(new ArrayList<>(Arrays.asList(new String[]{"567"})));
        return new ConvertData(lol, params);
    }

    @RequestMapping(value = {"/methods/obrmatrix ", "/obrmatrix"})
    public String obtmatrixView() {
        return "methods";
    }


    @RequestMapping(value = {"/methods/obrmatrix ", "/obrmatrix"}, params = {"save"})
    public String obtmatrixSave(){
        return "methods";
    }

}

class TestTest{
    private int a;
    private int b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
}