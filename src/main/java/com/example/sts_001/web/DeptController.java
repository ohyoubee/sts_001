package com.example.sts_001.web;

import com.example.sts_001.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DeptController {
    @Autowired
    private DeptService deptService;


    @GetMapping("ex2")
    public String deptList(@RequestParam(name = "deptno", defaultValue = "1") Long deptno, Model model) {
        Long preWorkCount = deptService.countPreWorkByDeptNo(deptno);
        Long workCount = deptService.countWorkByDeptNo(deptno);
        Long leaveCount = deptService.countLeaveByDeptNo(deptno);
        String deptname = deptService.getDeptnameByDeptno(deptno);

        model.addAttribute("preWorkCount", preWorkCount);
        model.addAttribute("workCount", workCount);
        model.addAttribute("leaveCount", leaveCount);
        model.addAttribute("deptname", deptname);

        return "ex2";
    }
}


