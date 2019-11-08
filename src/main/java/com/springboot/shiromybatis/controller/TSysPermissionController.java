package com.springboot.shiromybatis.controller;

import com.springboot.shiromybatis.entity.TSysPermission;
import com.springboot.shiromybatis.service.TSysPermissionService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (TSysPermission)表控制层
 *
 * @author makejava
 * @since 2019-11-07 17:02:38
 */
@RestController
@RequestMapping("tSysPermission")
public class TSysPermissionController {
    /**
     * 服务对象
     */
    @Resource
    private TSysPermissionService tSysPermissionService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TSysPermission selectOne(Long id) {
        return this.tSysPermissionService.queryById(id);
    }

}