package com.blog.common;

import com.blog.controller.BaseController;
import com.blog.enums.SysEnums;
import com.blog.service.TbAccessLogService;
import com.blog.service.TbBlogService;
import com.blog.service.TbCommentDetailService;
import com.blog.utils.HttpClientUtil;
import com.blog.utils.OssUploadUtils;
import com.blog.utils.StringUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@RestController
@RequestMapping("common")
public class CommonController extends BaseController {

  private static String imguploadurl = "https://xiamo.oss-accelerate.aliyuncs.com";

  /** 服务对象 */
  @Resource private TbBlogService tbBlogService;

  @Resource private TbCommentDetailService tbCommentDetailService;

  @Resource private TbAccessLogService tbAccessLogService;

  /*
   * 上传图片
   * ,byte[] by
   * */
  @PostMapping("/uploadimg")
  @ResponseBody
  public Map uploadimg(MultipartFile file, String jsondata) {
    Map map = new HashMap();
    try {
      byte[] buffer = file.getBytes();
      String fileName = file.getOriginalFilename();
      String prefix = fileName.substring(fileName.lastIndexOf(".") + 1);
      String imgname = StringUtils.creatUploadName(prefix);
      int i = -1;
      i = OssUploadUtils.upload("xiamo_avatar/" + imgname, buffer);
      String lont_url = imguploadurl + "/xiamo_avatar/" + imgname;
      //            String url1 = getShortUrl(lont_url);
      map.put("url", lont_url);
      map.put("data", jsondata);
      if (i > 0) {
        map.put("code", SysEnums.SUCCESS.getCode());
        map.put("msg", SysEnums.SUCCESS.getMsg());
      } else {
        map.put("code", SysEnums.UPLOADFILERROR.getCode());
        map.put("msg", SysEnums.UPLOADFILERROR.getMsg());
      }
    } catch (Exception e) {
      e.printStackTrace();
      map.put("code", SysEnums.UPLOADFILERROR.getCode());
      map.put("msg", SysEnums.UPLOADFILERROR.getMsg());
    } finally {
      return map;
    }
  }

  @GetMapping("/index")
  public Map index() {
    Map map = new HashMap();
    try {
      map.put("blog", this.tbBlogService.queryByIndex());
      map.put("comment", this.tbCommentDetailService.queryByIndex());
      map.put("accessLog", this.tbAccessLogService.queryByIndex());
      map.put("code", SysEnums.SUCCESS.getCode());
      map.put("msg", SysEnums.SUCCESS.getMsg());
    } catch (Exception e) {
      map.put("code", SysEnums.ERROR.getCode());
      map.put("msg", SysEnums.ERROR.getMsg());
      e.printStackTrace();
    } finally {
      return map;
    }
  }

  @GetMapping("/qqInfo")
  public Map qqInfo(String qq) {
    Map map = new HashMap();
    try {
      Map qmap = new HashMap();
      qmap.put("get_nick", "1");
      qmap.put("uins", qq);
      String json =
          HttpClientUtil.doGetGBK("https://r.qzone.qq.com/fcg-bin/cgi_get_portrait.fcg", qmap);
      System.out.println(json);
      String regex = "\\[(.*?)]";
      Pattern pattern = Pattern.compile(regex);
      Matcher matcher = pattern.matcher(json);
      while (matcher.find()) {
        String[] s = matcher.group(1).split(",");
        map.put("qq", qq);
        String nickname = s[6];
        nickname = nickname.substring(1, nickname.length());
        nickname = nickname.substring(0, nickname.length() - 1);
        map.put("nickname", nickname);
        break;
      }
      map.put("avatar", "http://q1.qlogo.cn/g?b=qq&nk=" + qq + "&s=640");
    } catch (Exception e) {
      map.put("code", SysEnums.ERROR.getCode());
      map.put("msg", SysEnums.ERROR.getMsg());
      e.printStackTrace();
    } finally {
      return map;
    }
  }
}
