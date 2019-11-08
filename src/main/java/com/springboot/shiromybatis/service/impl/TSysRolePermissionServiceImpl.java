package com.springboot.shiromybatis.service.impl;

import com.springboot.shiromybatis.entity.TSysRolePermission;
import com.springboot.shiromybatis.dao.TSysRolePermissionDao;
import com.springboot.shiromybatis.service.TSysRolePermissionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TSysRolePermission)表服务实现类
 *
 * @author makejava
 * @since 2019-11-07 17:02:38
 */
@Service("tSysRolePermissionService")
public class TSysRolePermissionServiceImpl implements TSysRolePermissionService {
    @Resource
    private TSysRolePermissionDao tSysRolePermissionDao;

    /**
     * 通过ID查询单条数据
     *
     * @param rolePermissionId 主键
     * @return 实例对象
     */
    @Override
    public TSysRolePermission queryById(Long rolePermissionId) {
        return this.tSysRolePermissionDao.queryById(rolePermissionId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TSysRolePermission> queryAllByLimit(int offset, int limit) {
        return this.tSysRolePermissionDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tSysRolePermission 实例对象
     * @return 实例对象
     */
    @Override
    public TSysRolePermission insert(TSysRolePermission tSysRolePermission) {
        this.tSysRolePermissionDao.insert(tSysRolePermission);
        return tSysRolePermission;
    }

    /**
     * 修改数据
     *
     * @param tSysRolePermission 实例对象
     * @return 实例对象
     */
    @Override
    public TSysRolePermission update(TSysRolePermission tSysRolePermission) {
        this.tSysRolePermissionDao.update(tSysRolePermission);
        return this.queryById(tSysRolePermission.getRolePermissionId());
    }

    /**
     * 通过主键删除数据
     *
     * @param rolePermissionId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long rolePermissionId) {
        return this.tSysRolePermissionDao.deleteById(rolePermissionId) > 0;
    }
}