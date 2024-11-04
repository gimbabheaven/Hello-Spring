package hello.hello_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("hello")
    public String hello(Model model) {
        model.addAttribute("data", "hello!!"); //model -> attribute로 치환됨

        return "hello"; //viewResolver가 화면을 찾아서 처리 (resources:templates/[viewName].html)
    }

}
