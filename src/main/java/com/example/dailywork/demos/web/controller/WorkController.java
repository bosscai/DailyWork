package com.example.dailywork.demos.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class WorkController {

    public static final String TAG = "WorkController";

    @GetMapping("/form")
    public String showForm(Model model) {
        return "index";
    }


    @PostMapping("/submit")
    public String submitForm(@RequestParam(value = "requestInput[]", required = false) List<String> requestInput,
                             @RequestParam(value = "taskInput[]", required = false) List<String> taskInput,
                             @RequestParam(value = "bugInput[]",required = false) List<String> bugInput,
                             @RequestParam(value = "requestProgress[]",required = false) List<String> requestProgress,
                             @RequestParam(value = "taskProgress[]", required = false) List<String> taskProgress,
                             @RequestParam(value = "actions[]",required = false) List<String> actions,

                             Model model) {
        // 处理表单提交的数据
        model.addAttribute("requestInput[]", requestInput);
        model.addAttribute("taskInput[]", taskInput);
        model.addAttribute("bugInput[]", bugInput);
        model.addAttribute("requestProgress[]", requestProgress);
        model.addAttribute("taskProgress[]", taskProgress);
        model.addAttribute("actions[]", actions);
        System.out.println(TAG + ": " + model);
        return "end";
    }
}
