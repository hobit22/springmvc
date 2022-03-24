package com.sparta.springmvc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController // @Controller + @ResponseBody // view단을 따로 보내주지 않는다
@RequestMapping("/hello/rest")
public class HelloRestController {

    @GetMapping("/json/string")
    public String helloHtmlString() { // RestController -> String -> html 출력
        return "<html><body>Hello @ResponseBody</body></html>";
    }
    @GetMapping("/json/list")
    public List<String> helloJson() { // RestController -> String 외 -> json 출력
        List<String> words = Arrays.asList("Hello", "Controller", "And", "JSON");

        return words;
    }
}