package edu.hyit.drugmanageservice.app.model;

import edu.hyit.drugmanageservice.sys.base.BaseModel;
import lombok.Data;

@Data
public class DepartInfo extends BaseModel {
    private String departName;
    private String departCode;

}
