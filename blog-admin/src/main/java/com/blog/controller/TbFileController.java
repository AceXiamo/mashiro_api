package com.blog.controller;

import com.blog.entity.TbFile;
import com.blog.entity.TbUser;
import com.blog.enums.SysEnums;
import com.blog.service.TbFileService;
import com.blog.setting.SysUser;
import com.blog.utils.DateUtils;
import com.blog.utils.IpAddressUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * (TbFile)表控制层
 *
 * @author xiamo
 * @since 2021-03-30 16:45:03
 */
@RestController
@RequestMapping("tbFile")
public class TbFileController extends BaseController {
  /** 服务对象 */
  @Resource private TbFileService tbFileService;

  /**
   * 通过主键查询单条数据
   *
   * @param id 主键
   * @return 单条数据
   */
  @GetMapping("selectOne")
  public TbFile selectOne(Integer id) {
    return this.tbFileService.queryById(id);
  }

  /**
   * 通过实体类作为查询条件查询
   *
   * @param tbFile 查询条件
   * @return list
   */
  @GetMapping("list")
  public List<TbFile> list(TbFile tbFile) {
    return this.tbFileService.queryAll(tbFile);
  }

  /**
   * 新增
   *
   * @param tbFile 实体类
   * @return 结果
   */
  @PostMapping("insert")
  public Map insert(@RequestBody TbFile tbFile, HttpServletRequest request) {
    Map map = new HashMap();
    try {
      TbUser user = SysUser.getLoginUser(request);
      tbFile.setIpAddress(IpAddressUtils.getIpAddress(request));
      tbFile.setCreateTime(DateUtils.getNowDate());
      tbFile.setFileStatus(1);
      tbFile.setCreateBy(user.getId().toString());
      tbFile.setCreateTime(DateUtils.getNowDate());
      tbFile.setUpdateTime(DateUtils.getNowDate());
      this.tbFileService.insert(tbFile);
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
      this.tbFileService.deleteById(id);
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
