package demo.controller;

import demo.logic.method.Method;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andrey on 17.04.2015.
 */
@Service
//@Scope("prototype")
public class MethodService {

    @Autowired(required = false)
    List<Method> methodList;

    public MethodService() {
    }

    public ArrayList<String> getNames(){
        ArrayList<String> res = new ArrayList<>();
        for(Method method : methodList)
            res.add(method.getName());
        return res;
    }

}
