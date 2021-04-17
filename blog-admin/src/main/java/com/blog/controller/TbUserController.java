package com.blog.controller;

import com.blog.entity.TbUser;
import com.blog.enums.SysEnums;
import com.blog.service.TbUserService;
import com.blog.utils.DateUtils;
import com.blog.utils.Md5Utils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * (TbUser)表控制层
 *
 * @author xiamo
 * @since 2021-03-30 16:45:05
 */
@RestController
@RequestMapping("tbUser")
public class TbUserController extends BaseController {
  /** 服务对象 */
  @Resource private TbUserService tbUserService;

  /**
   * 通过主键查询单条数据
   *
   * @param id 主键
   * @return 单条数据
   */
  @GetMapping("selectOne")
  public TbUser selectOne(Integer id) {
    return this.tbUserService.queryById(id);
  }

  /**
   * 通过实体类作为查询条件查询
   *
   * @param tbUser 查询条件
   * @return list
   */
  @GetMapping("list")
  public List<TbUser> list(TbUser tbUser) {
    return this.tbUserService.queryAll(tbUser);
  }

  /**
   * 修改
   *
   * @param tbUser 实体类
   * @return Map
   */
  @PostMapping("update")
  public Map update(@RequestBody TbUser tbUser) {
    Map map = new HashMap();
    try {
      TbUser user = this.tbUserService.queryById(tbUser.getId());
      if (!user.getPassword().equals(tbUser.getPassword())) {
        tbUser.setPassword(Md5Utils.hash(tbUser.getPassword()));
      }
      tbUser.setUpdateTime(DateUtils.getNowDate());
      this.tbUserService.update(tbUser);
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
   * 新增
   *
   * @param tbUser 实体类
   * @return 结果
   */
  @PostMapping("insert")
  public Map insert(@RequestBody TbUser tbUser) {
    Map map = new HashMap();
    try {
      tbUser.setPassword(Md5Utils.hash(tbUser.getPassword()));
      tbUser.setTypeId(2);
      tbUser.setCreateTime(DateUtils.getNowDate());
      tbUser.setUpdateTime(DateUtils.getNowDate());
      this.tbUserService.insert(tbUser);
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
      this.tbUserService.deleteById(id);
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
