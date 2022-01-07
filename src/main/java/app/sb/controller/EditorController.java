package app.sb.controller;

import lombok.Getter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class EditorController {

    @RequestMapping(value = "/")
    public ModelAndView index(){

        ModelAndView mav = new ModelAndView("/editor/index");

        mav.addObject("content", new Response());

        return mav;
    }

    @Getter
    public static class Response{
        private String data = "hello";
        private String data1 = "hello1";
        private String data2 = "hello2";
    }

}
