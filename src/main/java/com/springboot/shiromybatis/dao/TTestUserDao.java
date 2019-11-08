package com.springboot.shiromybatis.dao;

import com.springboot.shiromybatis.entity.TTestUser;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (TTestUser)表数据库访问层
 *
 * @author makejava
 * @since 2019-11-07 17:02:37
 */
public interface TTestUserDao {

    /**
     * 通过ID查询单条数据
     *
     * @param userTestId 主键
     * @return 实例对象
     */
    TTestUser queryById(Long userTestId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TTestUser> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tTestUser 实例对象
     * @return 对象列表
     */
    List<TTestUser> queryAll(TTestUser tTestUser);

    /**
     * 新增数据
     *
     * @param tTestUser 实例对象
     * @return 影响行数
     */
    int insert(TTestUser tTestUser);

    /**
     * 修改数据
     *
     * @param tTestUser 实例对象
     * @return 影响行数
     */
    int update(TTestUser tTestUser);

    /**
     * 通过主键删除数据
     *
     * @param userTestId 主键
     * @return 影响行数
     */
    int deleteById(Long userTestId);

}