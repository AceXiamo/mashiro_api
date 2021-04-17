package com.blog.controller;

import com.blog.entity.TbAccessLog;
import com.blog.enums.SysEnums;
import com.blog.service.TbAccessLogService;
import com.blog.utils.BaiduApiUtils;
import com.blog.utils.DateUtils;
import com.blog.utils.IpAddressUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * (TbAccessLog)表控制层
 *
 * @author xiamo
 * @since 2021-03-30 16:44:58
 */
@CrossOrigin
@RestController
@RequestMapping("tbAccessLog")
public class TbAccessLogController extends BaseController {
  /** 服务对象 */
  @Resource private TbAccessLogService tbAccessLogService;

  /**
   * 通过主键查询单条数据
   *
   * @param id 主键
   * @return 单条数据
   */
  @GetMapping("selectOne")
  public TbAccessLog selectOne(Integer id) {
    return this.tbAccessLogService.queryById(id);
  }

  /**
   * 查询条数
   *
   * @return 单条数据
   */
  @GetMapping("queryCount")
  public Integer queryCount() {
    return this.tbAccessLogService.queryCount();
  }

  /**
   * 通过实体类作为查询条件查询
   *
   * @param tbAccessLog 查询条件
   * @return list
   */
  @GetMapping("list")
  public List<TbAccessLog> list(TbAccessLog tbAccessLog) {
    return this.tbAccessLogService.queryAll(tbAccessLog);
  }

  /**
   * 新增
   *
   * @param tbAccessLog 实体类
   * @return 结果
   */
  @PostMapping("insert")
  public Map insert(@RequestBody TbAccessLog tbAccessLog, HttpServletRequest request) {
    Map map = new HashMap();
    try {
      String ip = IpAddressUtils.getIpAddress(request);
      Map<String, String> baiduMap = BaiduApiUtils.ipToAddresss(ip);
      tbAccessLog.setIpaddress(ip);
      tbAccessLog.setProvince(baiduMap.get("province"));
      tbAccessLog.setCity(baiduMap.get("city"));
      tbAccessLog.setLatandlon(baiduMap.get("rectangle"));
      tbAccessLog.setAccessTime(DateUtils.getNowDate());
      this.tbAccessLogService.insert(tbAccessLog);
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
      this.tbAccessLogService.deleteById(id);
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
