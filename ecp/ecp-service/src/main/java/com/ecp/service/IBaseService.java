package com.ecp.service;

import java.util.List;

/**
 * @ClassName IBaseService
 * @Description 通用数据库接口
 * @author Administrator
 * @Date 2017年5月5日 下午12:13:18
 * @version 1.0.0
 * @param <T>
 * @param <ID>
 */
public interface IBaseService<T,ID> {

    /**
     * 方法功能：添加
     * @param entity
     * @return
     * <hr>
     * <b>描述：</b>
     * <p>Description:方法功能详细说明</p> 
     * <p>Version: 1.0</p>
     * <p>Author: srd </p>
     * <p>Date: 2017年1月10日 下午6:00:55</p>     
     */    
    public int insertSelective(T entity);
    
    /**
     * 方法功能：查询所有
     * @return
     * <hr>
     * <b>描述：</b>
     * <p>Description:方法功能详细说明</p> 
     * <p>Version: 1.0</p>
     * <p>Author: srd </p>
     * <p>Date: 2017年1月10日 下午6:01:01</p>
     */
    public List<T> selectAll();
    
    /**
     * 方法功能：根据主键查询
     * @param id
     * @return
     * <hr>
     * <b>描述：</b>
     * <p>Description:方法功能详细说明</p> 
     * <p>Version: 1.0</p>
     * <p>Author: srd </p>
     * <p>Date: 2017年1月10日 下午6:01:09</p>
     */
    public T selectByPrimaryKey(ID id);
    
    /**
     * 方法功能：根据主键修改
     * @param entity
     * @return
     * <hr>
     * <b>描述：</b>
     * <p>Description:方法功能详细说明</p> 
     * <p>Version: 1.0</p>
     * <p>Author: srd </p>
     * <p>Date: 2017年1月10日 下午6:01:20</p>
     */
    public int updateByPrimaryKeySelective(T entity);
    
    /**
     * 方法功能：根据主键删除
     * @param id
     * @return
     * <hr>
     * <b>描述：</b>
     * <p>Description:方法功能详细说明</p> 
     * <p>Version: 1.0</p>
     * <p>Author: srd </p>
     * <p>Date: 2017年1月10日 下午6:01:31</p>
     */
    public int deleteByPrimaryKey(ID id);
    
    /**
     * 方法功能：根据实体类删除
     * @param entity
     * @return
     * <hr>
     * <b>描述：</b>
     * <p>Description:方法功能详细说明</p> 
     * <p>Version: 1.0</p>
     * <p>Author: srd </p>
     * <p>Date: 2017年1月10日 下午6:01:40</p>
     */
    public int delete(T entity);
    
}
