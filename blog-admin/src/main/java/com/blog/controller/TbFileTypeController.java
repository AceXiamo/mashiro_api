package com.blog.controller;

import com.blog.entity.TbFileType;
import com.blog.service.TbFileTypeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (TbFileType)表控制层
 *
 * @author xiamo
 * @since 2021-03-30 16:45:04
 */
@RestController
@RequestMapping("tbFileType")
public class TbFileTypeController extends BaseController {
    /**
     * 服务对象
     */
    @Resource
    private TbFileTypeService tbFileTypeService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TbFileType selectOne(Integer id) {
        return this.tbFileTypeService.queryById(id);
    }

}