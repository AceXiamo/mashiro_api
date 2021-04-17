package com.blog.utils;

import net.sf.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xiamo
 * @date 2021/4/10 5:13
 */
public class BaiduApiUtils {

  protected static String baiduKey = "1f29a8ad0a949c597b8c4b4f5f731593";
  protected static String iptoaddress = "https://restapi.amap.com/v3/ip";

  public static Map<String, String> ipToAddresss(String ipAddress) {
    Map baidumap = new HashMap();
    baidumap.put("key", baiduKey);
    baidumap.put("ip", ipAddress);
    String cityJson = HttpClientUtil.doGet(iptoaddress, baidumap);
    JSONObject resData = JSONObject.fromObject(cityJson);
    Map<String, String> map = new HashMap();
    map.put("province", String.valueOf(resData.get("province")));
    map.put("city", String.valueOf(resData.get("city")));
    map.put("rectangle", String.valueOf(resData.get("rectangle")));
    return map;
  }
}
