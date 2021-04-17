package com.blog.utils;

import javax.servlet.http.HttpServletRequest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author xiamo
 * @date 2021/4/7 11:11
 */
public class IpAddressUtils {
  /** 获取真实ip地址，避免获取代理ip */
  public static String getIpAddress(HttpServletRequest request) {
    String ip = request.getHeader("x-forwarded-for");
    if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
      ip = request.getHeader("Proxy-Client-IP");
    }
    if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
      ip = request.getHeader("WL-Proxy-Client-IP");
    }
    if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
      ip = request.getHeader("HTTP_CLIENT_IP");
    }
    if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
      ip = request.getHeader("HTTP_X_FORWARDED_FOR");
    }
    if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
      ip = request.getRemoteAddr();
    }
    return ip;
  }

  public static String getMacAddrByIp(String ip) {
    String macAddr = null;
    try {
      Process process = Runtime.getRuntime().exec("nbtstat -a " + ip);
      BufferedReader br = new BufferedReader(new InputStreamReader(process.getInputStream()));
      Pattern pattern = Pattern.compile("([A-F0-9]{2}-){5}[A-F0-9]{2}");
      Matcher matcher;
      for (String strLine = br.readLine(); strLine != null; strLine = br.readLine()) {
        matcher = pattern.matcher(strLine);
        if (matcher.find()) {
          macAddr = matcher.group();
          break;
        }
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
    System.out.println(macAddr);
    return macAddr;
  }
}
