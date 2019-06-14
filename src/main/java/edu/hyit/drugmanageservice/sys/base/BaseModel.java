package edu.hyit.drugmanageservice.sys.base;

import edu.hyit.drugmanageservice.sys.utils.idGenerator;
import lombok.Data;

import java.util.Date;

@Data //在编译期间自动创建无参构造函数和get和set方法
public class BaseModel {
    public String id;
    public Date updateTime;
    public String delFlag;

    public void preInsert(){
        this.id = idGenerator.generator();
        this.updateTime = new Date();
    }

    public void preUpdate(){
        this.updateTime = new Date();
    }
}
