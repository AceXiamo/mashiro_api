package com.blog.utils;

import com.aliyun.oss.OSSClient;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

// 阿里云上传文件
public class OssUploadUtils {
  private static String endpoint = "";
  private static String accessKeyId = "";
  private static String accessKeySecret = "";
  private static String bucketName = "";

  public static void fileToByte(String neturl, String filepath) {
    try {
      URL url = new URL(neturl);
      URLConnection connection = url.openConnection();
      connection.setRequestProperty("accept", "*/*");
      connection.setRequestProperty("connection", "Keep-Alive");
      connection.setRequestProperty(
          "user-agent", "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
      // 建立实际的连接
      connection.connect();
      connection.getInputStream();

      InputStream in = connection.getInputStream();

      //            MultipartFile multipartFile = new MockMultipartFile("temp.jpg","temp.jpg","",
      // connection.getInputStream());

      int filesize = connection.getInputStream().available();

      ByteArrayOutputStream baos = new ByteArrayOutputStream();

      byte[] tmp = new byte[filesize];
      int i;
      while ((i = in.read(tmp, 0, filesize)) > 0) {
        baos.write(tmp, 0, i);
      }
      byte[] imgs = baos.toByteArray();
      upload(filepath, imgs);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static int upload(String filepath, byte[] by) {
    // 创建OSSClient实例
    OSSClient client = new OSSClient(endpoint, accessKeyId, accessKeySecret);
    // 使用访问OSS
    // FileReader
    try {
      // 上传成功   zhiyouapp为正式使用   zhiyouapp_test  测试使用
      client.putObject(
          bucketName,
          filepath,
          new ByteArrayInputStream(
              by)); // 上传成功后访问地址
                    // http://zhiyouvideo.oss-cn-shanghai.aliyuncs.com/zhiyouapp/wenjianming.jpg
      return 1;
    } catch (Exception e) {
      // 上传失败
      System.out.println(e.getMessage());
      return 0;
    }
  }
}
