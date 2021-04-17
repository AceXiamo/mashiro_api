package com.blog.controller;

import com.blog.entity.TbBlog;
import com.blog.entity.TbComment;
import com.blog.entity.TbUser;
import com.blog.enums.SysEnums;
import com.blog.service.TbBlogService;
import com.blog.service.TbCommentService;
import com.blog.setting.ServletUtils;
import com.blog.setting.SysUser;
import com.blog.utils.DateUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * (TbBlog)表控制层
 *
 * @author xiamo
 * @since 2021-03-30 16:45:00
 */
@RestController
@RequestMapping("tbBlog")
public class TbBlogController extends BaseController {
  /** 服务对象 */
  @Resource private TbBlogService tbBlogService;
  /** 服务对象 */
  @Resource private TbCommentService tbCommentService;

  /**
   * 通过主键查询单条数据
   *
   * @param id 主键
   * @return 单条数据
   */
  @GetMapping("selectOne")
  public TbBlog selectOne(Integer id) {
    return this.tbBlogService.queryById(id);
  }

  /**
   * 查询所有博客
   *
   * @return 单条数据
   */
  @GetMapping("select")
  public List<TbBlog> select(Integer page, Integer size) {
    return this.tbBlogService.queryAllByLimit(page, size);
  }

  /**
   * 新增博客
   *
   * @param blog blog对象
   * @return status
   */
  @PostMapping("insert")
  public Map insert(@RequestBody TbBlog blog) {
    Map map = new HashMap();
    TbUser user = SysUser.getLoginUser(ServletUtils.getRequest());
    try {
      blog.setCreator(String.valueOf(user.getId()));
      blog.setCreatorNickname(user.getNickname());
      blog.setView("0");
      blog.setCreateTime(DateUtils.getNowDate());
      blog.setUpdateTime(DateUtils.getNowDate());
      TbComment comment = new TbComment();
      comment.setTitle(blog.getTitle());
      comment.setCreateTime(DateUtils.getNowDate());
      comment.setUpdateTime(DateUtils.getNowDate());
      comment.setBlogId(this.tbBlogService.insert(blog).getId());
      this.tbCommentService.insert(comment);
      map.put("code", SysEnums.SUCCESS.getCode());
      map.put("msg", SysEnums.SUCCESS.getMsg());
    } catch (Exception e) {
      e.printStackTrace();
      map.put("code", SysEnums.ERROR.getCode());
      map.put("msg", SysEnums.ERROR.getMsg());
    } finally {
      return map;
    }
  }

  /**
   * 修改博客
   *
   * @param blog blog对象
   * @return status
   */
  @PostMapping("update")
  public Map update(@RequestBody TbBlog blog) {
    Map map = new HashMap();
    try {
      TbComment comment = new TbComment();
      comment.setBlogId(blog.getId());
      List<TbComment> comments = tbCommentService.queryAll(comment);
      comments.get(0).setTitle(blog.getTitle());
      tbCommentService.update(comments.get(0));
      blog.setUpdateTime(DateUtils.getNowDate());
      this.tbBlogService.update(blog);
      map.put("code", SysEnums.SUCCESS.getCode());
      map.put("msg", SysEnums.SUCCESS.getMsg());
    } catch (Exception e) {
      e.printStackTrace();
      map.put("code", SysEnums.ERROR.getCode());
      map.put("msg", SysEnums.ERROR.getMsg());
    } finally {
      return map;
    }
  }

  /**
   * 通过主键删除
   *
   * @param id 主键
   * @return status
   */
  @GetMapping("delete")
  public Map delete(Integer id) {
    Map map = new HashMap();
    try {
      this.tbBlogService.deleteById(id);
      map.put("code", SysEnums.SUCCESS.getCode());
      map.put("msg", SysEnums.SUCCESS.getMsg());
    } catch (Exception e) {
      e.printStackTrace();
      map.put("code", SysEnums.ERROR.getCode());
      map.put("msg", SysEnums.ERROR.getMsg());
    } finally {
      return map;
    }
  }
}
