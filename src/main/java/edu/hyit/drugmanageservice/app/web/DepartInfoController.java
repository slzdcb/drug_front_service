package edu.hyit.drugmanageservice.app.web;

import edu.hyit.drugmanageservice.app.model.DepartInfo;
import edu.hyit.drugmanageservice.app.service.DepartInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.Null;
import java.util.List;

@RestController
@RequestMapping("/api/depart")
public class DepartInfoController {
    @Autowired
    private DepartInfoService departInfoService;

    @GetMapping("findAll")
    public List<DepartInfo> findAll(){
        return departInfoService.findAll();
    }
}
