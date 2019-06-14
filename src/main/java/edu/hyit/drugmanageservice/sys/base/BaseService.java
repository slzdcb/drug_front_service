package edu.hyit.drugmanageservice.sys.base;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BaseService < T extends BaseModel,D extends BaseDao<T> >{

    @Autowired
    protected D dao;

    public T find(T condition){
        return dao.find(condition);
    }

    public T findById(String id){
        return dao.findById(id);
    }

    public List<T> findList(T condition){
        return dao.findList(condition);
    }

    public List<T> findAll(){
        return dao.findAll();
    }

    public void  delete(T condition){
        dao.delete(condition);
    }

    /**
     * 根据是否有id自动判断是插入还是更新
     * @param target
     */
    public void save(T target){
        if(target.getId()!=null&&!target.getId().equals("")){
            target.preUpdata();
            dao.update(target);
        }else {
            target.preInsert();
            dao.inset(target);
        }
    }

}
