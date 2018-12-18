package com.itheima.controller;

import com.itheima.domain.Items;
import com.itheima.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/items")
public class itemsController {
    //service属性注入
    @Autowired
    private ItemService itemService;
    @RequestMapping("/itemsfindById")
    public String findById(Integer id, Model model){

        Items item = itemService.findbyId(id);
        model.addAttribute("item",item);
        return "item";
    }
}
