package com.iicanf.dao;

import tk.mybatis.mapper.entity.Condition;
import java.util.List;

/**
 * Dao 层 基础接口，其他Dao 接口 请继承该接口
 * Created by iicanf on 2018/08/08
 */
public interface Dao<T> {
	
	/**
	 * 插入数据
	 * @param model
	 */
    int save(T model);
    
    /**
     * 批量插入数据
     * @param models
     */
    int save(List<T> models);
    
    /**
     * 通过主鍵刪除
     * @param id
     */
     int deleteById(Integer id);
    
    /**
     * 批量刪除 
     * @param ids eg：ids -> "1,2,3,4"
     */
     int deleteByIds(String ids);
    
    /**
     * 更新
     * @param model
     */
     int update(T model);
    
    /**
     * 通过ID查找
     * @param id
     * @return
     */
    T findById(Integer id);
    
    /**
     * 通过多个ID查找
     * @param ids eg：ids -> "1,2,3,4"
     * @return
     */
    List<T> findByIds(String ids);
    
    /**
     * 根据条件查找
     * @param condition
     * @return
     */
    List<T> findByCondition(Condition condition);
    
    /**
     * 获取所有
     * @return
     */
    List<T> findAll();
}
