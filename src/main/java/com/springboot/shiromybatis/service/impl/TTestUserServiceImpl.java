package com.springboot.shiromybatis.service.impl;

import com.springboot.shiromybatis.entity.TTestUser;
import com.springboot.shiromybatis.dao.TTestUserDao;
import com.springboot.shiromybatis.service.TTestUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TTestUser)表服务实现类
 *
 * @author makejava
 * @since 2019-11-07 17:02:37
 */
@Service("tTestUserService")
public class TTestUserServiceImpl implements TTestUserService {
    @Resource
    private TTestUserDao tTestUserDao;

    /**
     * 通过ID查询单条数据
     *
     * @param userTestId 主键
     * @return 实例对象
     */
    @Override
    public TTestUser queryById(Long userTestId) {
        return this.tTestUserDao.queryById(userTestId);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<TTestUser> queryAllByLimit(int offset, int limit) {
        return this.tTestUserDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tTestUser 实例对象
     * @return 实例对象
     */
    @Override
    public TTestUser insert(TTestUser tTestUser) {
        this.tTestUserDao.insert(tTestUser);
        return tTestUser;
    }

    /**
     * 修改数据
     *
     * @param tTestUser 实例对象
     * @return 实例对象
     */
    @Override
    public TTestUser update(TTestUser tTestUser) {
        this.tTestUserDao.update(tTestUser);
        return this.queryById(tTestUser.getUserTestId());
    }

    /**
     * 通过主键删除数据
     *
     * @param userTestId 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long userTestId) {
        return this.tTestUserDao.deleteById(userTestId) > 0;
    }
}