package edu.hyit.drugmanageservice.sys.base;

import edu.hyit.drugmanageservice.sys.utils.idGenerator;
import lombok.Data;

import java.util.Date;

@Data //在编译期间自动创建无参构造函数和get和set方法
public class BaseModel {
    private String id;
    private Date updataTime;
    private String delFlag;

    public void preInsert(){
        this.id = idGenerator.generator();
        this.updataTime = new Date();
    }

    public void preUpdata(){
        this.updataTime = new Date();
    }
}
