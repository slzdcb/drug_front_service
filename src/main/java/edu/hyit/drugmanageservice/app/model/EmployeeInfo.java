package edu.hyit.drugmanageservice.app.model;

import edu.hyit.drugmanageservice.sys.base.BaseModel;
import lombok.Data;

@Data
public class EmployeeInfo extends BaseModel {
    private String username;
    private String password;
    private String name;
    private String phone;
    
    private DepartInfo departInfo;
}
