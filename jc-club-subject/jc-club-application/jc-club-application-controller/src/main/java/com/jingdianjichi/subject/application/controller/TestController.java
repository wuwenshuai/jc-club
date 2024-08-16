package com.jingdianjichi.subject.application.controller;


import com.jingdianjichi.subject.infra.basic.entity.SubjectCategory;
import com.jingdianjichi.subject.infra.basic.service.SubjectCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


    @Autowired
    private SubjectCategoryService subjectCategoryService;
    @GetMapping("/test")
    public String test() {

        SubjectCategory subjectCategory = subjectCategoryService.queryById(1L);
        System.out.println(subjectCategory.getCategoryName());
        return "hello world" + subjectCategory.getCategoryName();
    }
}
