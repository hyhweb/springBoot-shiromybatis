package com.springboot.shiromybatis.dao;

import com.springboot.shiromybatis.entity.TSysPermission;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (TSysPermission)表数据库访问层
 *
 * @author makejava
 * @since 2019-11-07 17:02:38
 */
public interface TSysPermissionDao {

    /**
     * 通过ID查询单条数据
     *
     * @param permissionId 主键
     * @return 实例对象
     */
    TSysPermission queryById(Long permissionId);

    List<TSysPermission> getPermissionByUserName(String userName);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TSysPermission> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tSysPermission 实例对象
     * @return 对象列表
     */
    List<TSysPermission> queryAll(TSysPermission tSysPermission);

    /**
     * 新增数据
     *
     * @param tSysPermission 实例对象
     * @return 影响行数
     */
    int insert(TSysPermission tSysPermission);

    /**
     * 修改数据
     *
     * @param tSysPermission 实例对象
     * @return 影响行数
     */
    int update(TSysPermission tSysPermission);

    /**
     * 通过主键删除数据
     *
     * @param permissionId 主键
     * @return 影响行数
     */
    int deleteById(Long permissionId);

}