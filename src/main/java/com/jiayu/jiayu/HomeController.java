package com.jiayu.jiayu;

import com.jiayu.jiayu.model.SearchBlog;
import com.jiayu.jiayu.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @Autowired
    private HomeService homeService;

    @GetMapping("/index")
    public String index() { return "index"; }

    @GetMapping("/contact")
    public String contact() { return "contact"; }

    @GetMapping("/portfolio")
    public String portfolio(Model model) {
        model.addAttribute("projects", homeService.getAllProjects());
        return "portfolio"; }

    @GetMapping("/blog")
    public String blog(Model model) {

        model.addAttribute("blogs", homeService.getAllBlogs());
        model.addAttribute("searchBlog", new SearchBlog(""));
        return "blog"; }

    @PostMapping("/blog")
    public String searchBlog(Model model, @ModelAttribute("searchBlog") SearchBlog searchBlog){
        model.addAttribute("blogs", homeService.inquiryBlog(searchBlog.getSearchString()));
        return "blog"; }
}
