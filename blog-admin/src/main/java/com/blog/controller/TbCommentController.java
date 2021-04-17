package com.blog.controller;

import com.blog.entity.TbComment;
import com.blog.entity.TbCommentDetail;
import com.blog.enums.SysEnums;
import com.blog.service.TbCommentDetailService;
import com.blog.service.TbCommentService;
import com.blog.utils.DateUtils;
import com.blog.utils.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * (TbComment)表控制层
 *
 * @author xiamo
 * @since 2021-03-30 16:45:01
 */
@RestController
@RequestMapping("tbComment")
public class TbCommentController extends BaseController {

  /** 服务对象 */
  @Resource private TbCommentService tbCommentService;

  /** 服务对象 */
  @Resource private TbCommentDetailService tbCommentDetailService;

  /**
   * 通过主键查询单条数据
   *
   * @param id 主键
   * @return 单条数据
   */
  @GetMapping("selectOne")
  public TbComment selectOne(Integer id) {
    return this.tbCommentService.queryById(id);
  }

  /**
   * 通过实体类作为查询条件查询
   *
   * @param tbComment 查询条件
   * @return list
   */
  @GetMapping("list")
  public List<TbComment> list(TbComment tbComment) {
    return this.tbCommentService.queryAll(tbComment);
  }

  /**
   * 通过博客id作为查询条件查询
   *
   * @param id 查询条件
   * @return list
   */
  @GetMapping("listComment")
  public List<TbCommentDetail> listComment(Integer id) {
    List<TbCommentDetail> list = tbCommentDetailService.queryByblogId(id);
    reSetComment(list);
    return list;
  }

  public void reSetComment(List<TbCommentDetail> list) {
    list.forEach(
        data -> {
          if (!StringUtils.isNull(data.getPid())) {
            data.setCommentp(
                list.stream()
                    .filter((comment -> data.getPid().equals(comment.getId())))
                    .collect(Collectors.toList())
                    .get(0));
          }
        });
  }

  /**
   * 新增
   *
   * @param tbComment 实体类
   * @return 结果
   */
  @PostMapping("insert")
  public Map insert(@RequestBody TbComment tbComment) {
    Map map = new HashMap();
    try {
      tbComment.setCreateTime(DateUtils.getNowDate());
      tbComment.setUpdateTime(DateUtils.getNowDate());
      this.tbCommentService.insert(tbComment);
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
   * @return 单条数据
   */
  @GetMapping("del")
  public Map del(Integer id) {
    Map map = new HashMap();
    try {
      this.tbCommentService.deleteById(id);
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
