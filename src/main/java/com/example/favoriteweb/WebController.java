package com.example.favoriteweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WebController {
    @GetMapping("/")
    @ResponseBody
    public String main(){
        return "<a href=\"https://11st.co.kr\">11st.co.kr</a>";
    }
}
