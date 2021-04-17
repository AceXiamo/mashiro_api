package com.blog.controller;

import com.blog.entity.TbEmoji;
import com.blog.entity.TbUser;
import com.blog.enums.SysEnums;
import com.blog.service.TbEmojiService;
import com.blog.setting.SysUser;
import com.blog.utils.DateUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * (TbEmoji)表控制层
 *
 * @author xiamo
 * @since 2021-03-30 16:45:02
 */
@RestController
@RequestMapping("tbEmoji")
public class TbEmojiController extends BaseController {
  /** 服务对象 */
  @Resource private TbEmojiService tbEmojiService;

  /**
   * 通过主键查询单条数据
   *
   * @param id 主键
   * @return 单条数据
   */
  @GetMapping("selectOne")
  public TbEmoji selectOne(Integer id) {
    return this.tbEmojiService.queryById(id);
  }

  /**
   * 通过实体类作为查询条件查询
   *
   * @param tbEmoji 查询条件
   * @return list
   */
  @GetMapping("list")
  public List<TbEmoji> list(TbEmoji tbEmoji) {
    return this.tbEmojiService.queryAll(tbEmoji);
  }

  /**
   * 新增
   *
   * @param tbEmoji 实体类
   * @return 结果
   */
  @PostMapping("insert")
  public Map insert(@RequestBody TbEmoji tbEmoji, HttpServletRequest request) {
    Map map = new HashMap();
    try {
      TbUser user = SysUser.getLoginUser(request);
      tbEmoji.setCreateBy(user.getId().toString());
      tbEmoji.setCreateTime(DateUtils.getNowDate());
      tbEmoji.setUpdateTime(DateUtils.getNowDate());
      this.tbEmojiService.insert(tbEmoji);
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
      this.tbEmojiService.deleteById(id);
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
