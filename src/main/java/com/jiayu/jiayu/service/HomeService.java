package com.jiayu.jiayu.service;

import com.jiayu.jiayu.model.BlogItem;
import com.jiayu.jiayu.model.ProjectItem;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class HomeService {
    private List<BlogItem> blogItems;
    private List<ProjectItem> projectItems;

    public HomeService() {

        this.blogItems = new ArrayList<>();
        BlogItem blog1 = new BlogItem("1", "This is a blog1", "content", "category", "author", "dateCreated", "pictureUrl");
        BlogItem blog2 = new BlogItem("2", "This is a blog2", "content", "category", "author", "dateCreated", "pictureUrl");
        this.blogItems.add(blog1);
        this.blogItems.add(blog2);
        this.projectItems = new ArrayList<>();
        ProjectItem project1 = new ProjectItem("1", "This is a project", 2019, "dataGroup", "category", new ArrayList<>());
        ProjectItem project2 = new ProjectItem("2", "This is a project", 2019, "dataGroup", "category", new ArrayList<>());

        this.projectItems.add(project1);
        this.projectItems.add(project2);
    }

    public List<ProjectItem> getAllProjects() {

        return projectItems;
    }

    public List<BlogItem> getAllBlogs() {

        return blogItems;
    }

    public List<BlogItem> inquiryBlog(String searchString) {

        //get result blogs from searching title contains searchString
        List<BlogItem> results = new ArrayList<>();
        results = blogItems.stream().filter(blog->blog.getTitle().contains(searchString)).collect(Collectors.toList());

        return results;
    }
}
