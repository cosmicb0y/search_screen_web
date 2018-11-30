package com.hackday.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class webController {

    // home에 접근하였을때 영역명 리스트들을 뿌려주는 컨트롤러
    @RequestMapping(value="/", method=RequestMethod.GET)
    public String home() {

        return "";
    }

    // 영역명에 접근하였을때 그에 속하는 타입들을 뿌려주는 컨트롤러
    @RequestMapping(value="/{area}", method=RequestMethod.GET)
    public String area(@PathVariable String area) {

        return "";
    }

    @RequestMapping(value="/{area}/{type}", method=RequestMethod.GET)
    public String type(@PathVariable String area, @PathVariable String type) {

        return "";
    }
}
