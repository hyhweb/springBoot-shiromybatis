package com.springboot.shiromybatis.service;

import com.springboot.shiromybatis.entity.TTestUser;
import java.util.List;

/**
 * (TTestUser)表服务接口
 *
 * @author makejava
 * @since 2019-11-07 17:02:37
 */
public interface TTestUserService {

    /**
     * 通过ID查询单条数据
     *
     * @param userTestId 主键
     * @return 实例对象
     */
    TTestUser queryById(Long userTestId);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TTestUser> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tTestUser 实例对象
     * @return 实例对象
     */
    TTestUser insert(TTestUser tTestUser);

    /**
     * 修改数据
     *
     * @param tTestUser 实例对象
     * @return 实例对象
     */
    TTestUser update(TTestUser tTestUser);

    /**
     * 通过主键删除数据
     *
     * @param userTestId 主键
     * @return 是否成功
     */
    boolean deleteById(Long userTestId);

}