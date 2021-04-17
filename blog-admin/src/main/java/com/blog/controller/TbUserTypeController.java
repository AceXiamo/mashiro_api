package com.blog.controller;

import com.blog.entity.TbUserType;
import com.blog.service.TbUserTypeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (TbUserType)表控制层
 *
 * @author xiamo
 * @since 2021-03-30 16:45:05
 */
@RestController
@RequestMapping("tbUserType")
public class TbUserTypeController extends BaseController {
    /**
     * 服务对象
     */
    @Resource
    private TbUserTypeService tbUserTypeService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TbUserType selectOne(Integer id) {
        return this.tbUserTypeService.queryById(id);
    }

}