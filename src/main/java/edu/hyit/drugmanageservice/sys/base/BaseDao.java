package edu.hyit.drugmanageservice.sys.base;

import java.util.List;

public interface BaseDao< T extends BaseModel >{
    void inset(T t);

    void update(T t);

    void delete(T t);

    T find(T condition);

    List<T> findList(T condition);

    List<T> findAll();

    T findById(String id);
}
