package com.springboot.shiromybatis.service.impl;

import com.springboot.shiromybatis.entity.TSysPermission;
import com.springboot.shiromybatis.dao.TSysPermissionDao;
import com.springboot.shiromybatis.service.TSysPermissionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TSysPermission)表服务实现类
 *
 * @author makejava
 * @since 2019-11-07 17:02:38
 */
@Service("tSysPermissionService")
public class TSysPermissionServiceImpl implements TSysPermissionService {
    @Resource
    private TSysPermissionDao tSysPermissionDao;

    /**
     * 通过ID查询单条数据
     *
     * @param permissionId 主键
     * @return 实例对象
     */
    @Override
    public TSysPermission queryById(Long permissionId) {
        return this.tSysPermissionDao.queryById(permissionId);
    }

    @Override
    public List<TSysPermission> getPermissionByUserName(String userName) {
        return this.tSysPermissionDao.getPermissionByUserName(userName);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TSysPermission> queryAllByLimit(int offset, int limit) {
        return this.tSysPermissionDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tSysPermission 实例对象
     * @return 实例对象
     */
    @Override
    public TSysPermission insert(TSysPermission tSysPermission) {
        this.tSysPermissionDao.insert(tSysPermission);
        return tSysPermission;
    }

    /**
     * 修改数据
     *
     * @param tSysPermission 实例对象
     * @return 实例对象
     */
    @Override
    public TSysPermission update(TSysPermission tSysPermission) {
        this.tSysPermissionDao.update(tSysPermission);
        return this.queryById(tSysPermission.getPermissionId());
    }

    /**
     * 通过主键删除数据
     *
     * @param permissionId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long permissionId) {
        return this.tSysPermissionDao.deleteById(permissionId) > 0;
    }
}