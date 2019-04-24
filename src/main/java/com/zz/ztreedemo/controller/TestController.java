package com.zz.ztreedemo.controller;

import com.zz.ztreedemo.repository.ProMenuRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

@RestController
public class TestController {
    @Resource
    private ProMenuRepository proMenuRepository;
    @RequestMapping("test")
    public List get(){
        return proMenuRepository.findAll();
    }

    @RequestMapping("delete")
    public void deleteMenu(String str){
        str=str.substring(0,str.length()-1);
        String[] array = str.split(",");
        List<String> ls = Arrays.asList(array);
        System.out.println(str);
        proMenuRepository.DeleteSelected(ls);
    }
}
