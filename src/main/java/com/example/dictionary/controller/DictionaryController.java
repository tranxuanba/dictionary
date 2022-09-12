package com.example.dictionary.controller;
import com.example.dictionary.model.Dictionary;
//import com.example.model.Dictionary;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class DictionaryController {
    Map<String,String> dictionary = Dictionary.dic;

    @GetMapping("/dic")
    public String getDic(){
        return "this";
    }

    @PostMapping("get")
    public String submit(@RequestParam String eng, Model model){
        boolean check = dictionary.containsKey(eng);
        if (check){
            String result = dictionary.get(eng);
            model.addAttribute("result",result);
            return "this";
        }
        model.addAttribute("result","Deo co trong tu dien");
        return "this";
    }
}
