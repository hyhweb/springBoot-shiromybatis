package com.springboot.shiromybatis.service;

import com.springboot.shiromybatis.entity.TSysRolePermission;
import java.util.List;

/**
 * (TSysRolePermission)表服务接口
 *
 * @author makejava
 * @since 2019-11-07 17:02:38
 */
public interface TSysRolePermissionService {

    /**
     * 通过ID查询单条数据
     *
     * @param rolePermissionId 主键
     * @return 实例对象
     */
    TSysRolePermission queryById(Long rolePermissionId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TSysRolePermission> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tSysRolePermission 实例对象
     * @return 实例对象
     */
    TSysRolePermission insert(TSysRolePermission tSysRolePermission);

    /**
     * 修改数据
     *
     * @param tSysRolePermission 实例对象
     * @return 实例对象
     */
    TSysRolePermission update(TSysRolePermission tSysRolePermission);

    /**
     * 通过主键删除数据
     *
     * @param rolePermissionId 主键
     * @return 是否成功
     */
    boolean deleteById(Long rolePermissionId);

}