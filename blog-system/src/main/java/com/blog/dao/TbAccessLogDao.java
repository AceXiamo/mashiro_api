package com.blog.dao;

import com.blog.entity.TbAccessLog;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (TbAccessLog)表数据库访问层
 *
 * @author xiamo
 * @since 2021-03-30 16:44:57
 */
@Mapper
public interface TbAccessLogDao {

  /**
   * 查询条数
   *
   * @return 实例对象
   */
  Integer queryCount();

  /**
   * 通过ID查询单条数据
   *
   * @param id 主键
   * @return 实例对象
   */
  TbAccessLog queryById(Integer id);

  /**
   * 查询指定行数据
   *
   * @param offset 查询起始位置
   * @param limit 查询条数
   * @return 对象列表
   */
  List<TbAccessLog> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);

  /**
   * 通过实体作为筛选条件查询
   *
   * @param tbAccessLog 实例对象
   * @return 对象列表
   */
  List<TbAccessLog> queryAll(TbAccessLog tbAccessLog);

  /**
   * 首页查最新前五条
   *
   * @return 对象列表
   */
  List<TbAccessLog> queryByIndex();

  /**
   * 新增数据
   *
   * @param tbAccessLog 实例对象
   * @return 影响行数
   */
  int insert(TbAccessLog tbAccessLog);

  /**
   * 批量新增数据（MyBatis原生foreach方法）
   *
   * @param entities List<TbAccessLog> 实例对象列表
   * @return 影响行数
   */
  int insertBatch(@Param("entities") List<TbAccessLog> entities);

  /**
   * 批量新增或按主键更新数据（MyBatis原生foreach方法）
   *
   * @param entities List<TbAccessLog> 实例对象列表
   * @return 影响行数
   */
  int insertOrUpdateBatch(@Param("entities") List<TbAccessLog> entities);

  /**
   * 修改数据
   *
   * @param tbAccessLog 实例对象
   * @return 影响行数
   */
  int update(TbAccessLog tbAccessLog);

  /**
   * 通过主键删除数据
   *
   * @param id 主键
   * @return 影响行数
   */
  int deleteById(Integer id);
}
