package app.sb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class EditorController {

    @RequestMapping(value = "/")
    public ModelAndView index(){

        ModelAndView mav = new ModelAndView("/editor/index");

        return mav;
    }

}
