package com.fayaz.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class MoreController {

    @GetMapping("/more/tabs")
    public String showTabs() {
        return "more/tabs";
    }
    
    @GetMapping("/more/menu")
    public String showMenu() {
        return "more/menu";
    }
    
    @GetMapping("/more/autocomplete")
    public String showAutocomplete() {
        return "more/autocomplete";
    }
    
    @GetMapping("/more/collapse")
    public String showCollapse() {
        return "more/collapse";
    }
    
    @GetMapping("/more/slider")
    public String showSlider() {
        return "more/slider";
    }
    
    @GetMapping("/more/tooltip")
    public String showTooltip() {
        return "more/tooltip";
    }
    
    @GetMapping("/more/popups")
    public String showPopups() {
        return "more/popups";
    }
    
    @GetMapping("/more/links")
    public String showLinks() {
        return "more/links";
    }

    @GetMapping("/more/status/{code}")
    public String showStatus(@PathVariable String code, org.springframework.ui.Model model) {
        model.addAttribute("code", code);
        return "more/status";
    }
    
    @GetMapping("/more/css-properties")
    public String showCssProperties() {
        return "more/css-properties";
    }
    
    @GetMapping("/more/iframes")
    public String showIframes() {
        return "more/iframes";
    }
}