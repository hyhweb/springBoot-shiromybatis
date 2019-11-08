package com.springboot.shiromybatis.controller;

import com.springboot.shiromybatis.entity.TSysRolePermission;
import com.springboot.shiromybatis.service.TSysRolePermissionService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (TSysRolePermission)表控制层
 *
 * @author makejava
 * @since 2019-11-07 17:02:38
 */
@RestController
@RequestMapping("tSysRolePermission")
public class TSysRolePermissionController {
    /**
     * 服务对象
     */
    @Resource
    private TSysRolePermissionService tSysRolePermissionService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TSysRolePermission selectOne(Long id) {
        return this.tSysRolePermissionService.queryById(id);
    }

}