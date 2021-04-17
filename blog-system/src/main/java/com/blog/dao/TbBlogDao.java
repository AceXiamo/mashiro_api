package com.blog.dao;

import com.blog.entity.TbBlog;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (TbBlog)表数据库访问层
 *
 * @author xiamo
 * @since 2021-03-30 16:44:59
 */
@Mapper
public interface TbBlogDao {

  /**
   * 首页查最新前五条
   *
   * @return 对象列表
   */
  List<TbBlog> queryByIndex();

  /**
   * 通过ID查询单条数据
   *
   * @param id 主键
   * @return 实例对象
   */
  TbBlog queryById(Integer id);

  /**
   * 查询指定行数据
   *
   * @param offset 查询起始位置
   * @param limit 查询条数
   * @return 对象列表
   */
  List<TbBlog> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);

  /**
   * 通过实体作为筛选条件查询
   *
   * @param tbBlog 实例对象
   * @return 对象列表
   */
  List<TbBlog> queryAll(TbBlog tbBlog);

  /**
   * 新增数据
   *
   * @param tbBlog 实例对象
   * @return 影响行数
   */
  int insert(TbBlog tbBlog);

  /**
   * 批量新增数据（MyBatis原生foreach方法）
   *
   * @param entities List<TbBlog> 实例对象列表
   * @return 影响行数
   */
  int insertBatch(@Param("entities") List<TbBlog> entities);

  /**
   * 批量新增或按主键更新数据（MyBatis原生foreach方法）
   *
   * @param entities List<TbBlog> 实例对象列表
   * @return 影响行数
   */
  int insertOrUpdateBatch(@Param("entities") List<TbBlog> entities);

  /**
   * 修改数据
   *
   * @param tbBlog 实例对象
   * @return 影响行数
   */
  int update(TbBlog tbBlog);

  /**
   * 通过主键删除数据
   *
   * @param id 主键
   * @return 影响行数
   */
  int deleteById(Integer id);
}
