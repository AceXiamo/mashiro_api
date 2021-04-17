package com.blog.controller;

import com.blog.entity.TbCommentDetail;
import com.blog.entity.TbUser;
import com.blog.enums.SysEnums;
import com.blog.service.TbCommentDetailService;
import com.blog.setting.SysUser;
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
 * (TbCommentDetail)表控制层
 *
 * @author xiamo
 * @since 2021-03-30 16:45:01
 */
@RestController
@RequestMapping("tbCommentDetail")
public class TbCommentDetailController extends BaseController {
  /** 服务对象 */
  @Resource private TbCommentDetailService tbCommentDetailService;

  /**
   * 通过主键查询单条数据
   *
   * @param id 主键
   * @return 单条数据
   */
  @GetMapping("selectOne")
  public TbCommentDetail selectOne(Integer id) {
    return this.tbCommentDetailService.queryById(id);
  }

  /**
   * 通过实体类作为查询条件查询
   *
   * @param tbCommentDetail 查询条件
   * @return list
   */
  @GetMapping("list")
  public List<TbCommentDetail> list(TbCommentDetail tbCommentDetail) {
    return this.tbCommentDetailService.queryAll(tbCommentDetail);
  }

  /**
   * 新增
   *
   * @param tbCommentDetail 实体类
   * @return 结果
   */
  @PostMapping("insert")
  public Map insert(@RequestBody TbCommentDetail tbCommentDetail, HttpServletRequest request) {
    Map map = new HashMap();
    try {
      TbUser user = SysUser.getLoginUser(request);
      if (user != null) {
        tbCommentDetail.setCreateBy(user.getId());
        tbCommentDetail.setIsUser(1);
      }
      String ip = IpAddressUtils.getIpAddress(request);
      Map<String, String> baiduMap = BaiduApiUtils.ipToAddresss(ip);
      tbCommentDetail.setProvince(baiduMap.get("province"));
      tbCommentDetail.setCity(baiduMap.get("city"));
      tbCommentDetail.setCommentStatus(2);
      tbCommentDetail.setIpAddress(IpAddressUtils.getIpAddress(request));
      tbCommentDetail.setCreateTime(DateUtils.getNowDate());
      this.tbCommentDetailService.insert(tbCommentDetail);
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
      this.tbCommentDetailService.deleteById(id);
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
