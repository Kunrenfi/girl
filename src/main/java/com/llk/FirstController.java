package com.llk;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 林力克 on 2018/12/12.
 */
@RestController
public class FirstController {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)

    public String Hello(){
        return  "Hello World!";
    }

}
