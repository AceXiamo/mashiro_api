package com.blog.controller;

import com.blog.entity.TbEmojiType;
import com.blog.service.TbEmojiTypeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (TbEmojiType)表控制层
 *
 * @author xiamo
 * @since 2021-03-30 16:45:03
 */
@RestController
@RequestMapping("tbEmojiType")
public class TbEmojiTypeController extends BaseController {
    /**
     * 服务对象
     */
    @Resource
    private TbEmojiTypeService tbEmojiTypeService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TbEmojiType selectOne(Integer id) {
        return this.tbEmojiTypeService.queryById(id);
    }

}