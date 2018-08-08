package ${basePackage}.service;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.apache.ibatis.exceptions.TooManyResultsException;
import org.springframework.beans.factory.annotation.Autowired;

import ${basePackage}.dao.MyMapper;
import ${basePackage}.dao.Dao;

import tk.mybatis.mapper.entity.Condition;

/**
 * 基于通用MyBatis Mapper插件的Service接口的实现
 */
public abstract class AbstractService<T> {

    @Autowired
    protected Dao<T> dao;

    private Class<T> modelClass;    // 当前泛型真实类型的Class

    public AbstractService() {
        ParameterizedType pt = (ParameterizedType) this.getClass().getGenericSuperclass();
        modelClass = (Class<T>) pt.getActualTypeArguments()[0];
    }

     public int save(T model) {
        return dao.save(model);
    }

    public int save(List<T> models) {
        return dao.save(models);
    }

    public int deleteById(Integer id) {
        return dao.deleteById(id);
    }

    public int deleteByIds(String ids) {
        return dao.deleteByIds(ids);
    }

    public int update(T model) {
        return dao.update(model);
    }

    public T findById(Integer id) {
        return dao.findById(id);
    }

    public List<T> findByIds(String ids) {
        return dao.findByIds(ids);
    }

    public List<T> findByCondition(Condition condition) {
        return dao.findByCondition(condition);
    }

    public List<T> findAll() {
        return dao.findAll();
    }
}