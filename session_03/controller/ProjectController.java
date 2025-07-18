package com.data.session_03.controller;

import com.data.session_03.model.Project;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ProjectController {
    @GetMapping("/projects")
    public String showProjects(Model model) {
        List<Project> projectList = new ArrayList<>();
        projectList.add(new Project(1, "Website Bán Hàng", "Hệ thống bán hàng online", "image1.jpg"));
        projectList.add(new Project(2, "Quản lý sinh viên", "Quản lý thông tin sinh viên", "image2.jpg"));
        projectList.add(new Project(3, "Hệ thống ngân hàng", "Quản lý tài khoản và giao dịch", "image3.jpg"));
        model.addAttribute("projects", projectList);
        return "list";
    }
}
