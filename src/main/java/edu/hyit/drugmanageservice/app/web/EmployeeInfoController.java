package edu.hyit.drugmanageservice.app.web;

import com.github.pagehelper.PageInfo;
import edu.hyit.drugmanageservice.app.model.EmployeeInfo;
import edu.hyit.drugmanageservice.app.service.EmployeeInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@RestController
public class EmployeeInfoController {

    @Autowired
    private EmployeeInfoService employeeInfoService;

    //@RequestBody将前台的json字符串转换成对象
    @PostMapping("/api/login")
    public EmployeeInfo login(@RequestBody EmployeeInfo employeeInfo, HttpSession session){

        //查询EmployeeInfo对象
        EmployeeInfo principal = employeeInfoService.find(employeeInfo);

        //判断查询有数据返回 principal，无数据返回null
        if (principal!=null){
            session.setAttribute("principal",principal);
            principal.setPassword(null);
            return principal;
        }

        return null;
    }

    @PostMapping("/api/employee/save")
    public String save(@RequestBody EmployeeInfo employeeInfo){
        employeeInfoService.save(employeeInfo);
        return "{\"status\":\"success\"}";
    }
    //分页查询
    @PostMapping("/api/employee/findList")
    public PageInfo<EmployeeInfo> findList(Integer pageNum,Integer pageSize,EmployeeInfo employeeInfo){
        return employeeInfoService.page(employeeInfo,pageNum,pageSize);

    }
    @DeleteMapping("api/employee/delete/{id}")
    public String delete(@PathVariable("id") String id){
        EmployeeInfo condition = new EmployeeInfo();
        condition.setId(id);
        employeeInfoService.delete(condition);
        return "{\"status\":\"success\"}";

    }
}
