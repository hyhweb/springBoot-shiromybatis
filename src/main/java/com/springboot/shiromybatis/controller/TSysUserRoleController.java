package com.springboot.shiromybatis.controller;

import com.springboot.shiromybatis.entity.TSysUserRole;
import com.springboot.shiromybatis.service.TSysUserRoleService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (TSysUserRole)表控制层
 *
 * @author makejava
 * @since 2019-11-07 17:02:38
 */
@RestController
@RequestMapping("tSysUserRole")
public class TSysUserRoleController {
    /**
     * 服务对象
     */
    @Resource
    private TSysUserRoleService tSysUserRoleService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TSysUserRole selectOne(Long id) {
        return this.tSysUserRoleService.queryById(id);
    }

}