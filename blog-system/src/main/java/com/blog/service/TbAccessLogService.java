package com.blog.service;

import com.blog.entity.TbAccessLog;

import java.util.List;

/**
 * (TbAccessLog)表服务接口
 *
 * @author xiamo
 * @since 2021-03-30 16:44:57
 */
public interface TbAccessLogService {

  /**
   * 查询条数
   *
   * @return 实例对象
   */
  Integer queryCount();

  /**
   * 首页查最新前五条
   *
   * @return 对象列表
   */
  List<TbAccessLog> queryByIndex();

  /**
   * 通过ID查询单条数据
   *
   * @param id 主键
   * @return 实例对象
   */
  TbAccessLog queryById(Integer id);

  /**
   * 查询多条数据
   *
   * @param offset 查询起始位置
   * @param limit 查询条数
   * @return 对象列表
   */
  List<TbAccessLog> queryAllByLimit(int offset, int limit);

  /**
   * 通过实体作为筛选条件查询
   *
   * @param tbAccessLog 实例对象
   * @return 对象列表
   */
  List<TbAccessLog> queryAll(TbAccessLog tbAccessLog);

  /**
   * 新增数据
   *
   * @param tbAccessLog 实例对象
   * @return 实例对象
   */
  TbAccessLog insert(TbAccessLog tbAccessLog);

  /**
   * 修改数据
   *
   * @param tbAccessLog 实例对象
   * @return 实例对象
   */
  TbAccessLog update(TbAccessLog tbAccessLog);

  /**
   * 通过主键删除数据
   *
   * @param id 主键
   * @return 是否成功
   */
  boolean deleteById(Integer id);
}
