/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lfa.sbootapp.controller;

import com.lfa.sbootapp.entity.Skills;
import com.lfa.sbootapp.repository.SkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/")
public class DefaultController {
    
    
    @Autowired
    private SkillRepository skillRepo;
    
    @RequestMapping( method = RequestMethod.GET)
    public String index(Model model){
        model.addAttribute("skills", skillRepo.findAll());
        return "index";
    }
    
    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public String save(Skills skill){
        skillRepo.save(skill);
        return "redirect:/";
    }
}
