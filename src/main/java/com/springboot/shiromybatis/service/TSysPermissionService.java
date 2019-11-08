package com.springboot.shiromybatis.service;

import com.springboot.shiromybatis.entity.TSysPermission;
import java.util.List;

/**
 * (TSysPermission)表服务接口
 *
 * @author makejava
 * @since 2019-11-07 17:02:38
 */
public interface TSysPermissionService {

    /**
     * 通过ID查询单条数据
     *
     * @param permissionId 主键
     * @return 实例对象
     */
    TSysPermission queryById(Long permissionId);

    List<TSysPermission> getPermissionByUserName(String userName);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TSysPermission> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tSysPermission 实例对象
     * @return 实例对象
     */
    TSysPermission insert(TSysPermission tSysPermission);

    /**
     * 修改数据
     *
     * @param tSysPermission 实例对象
     * @return 实例对象
     */
    TSysPermission update(TSysPermission tSysPermission);

    /**
     * 通过主键删除数据
     *
     * @param permissionId 主键
     * @return 是否成功
     */
    boolean deleteById(Long permissionId);

}