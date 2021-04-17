package com.blog.dao;

import com.blog.entity.TbUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (TbUser)表数据库访问层
 *
 * @author xiamo
 * @since 2021-03-30 16:45:04
 */
@Mapper
public interface TbUserDao {

  /**
   * 通过ID查询单条数据
   *
   * @param id 主键
   * @return 实例对象
   */
  TbUser queryById(Integer id);

  /**
   * 通过token查询单条数据
   *
   * @param token token
   * @return 实例对象
   */
  TbUser queryByToken(String token);

  /**
   * 通过用户名查询单条数据
   *
   * @param userName 用户名
   * @return 实例对象
   */
  TbUser queryByUserName(String userName);

  /**
   * 查询指定行数据
   *
   * @param offset 查询起始位置
   * @param limit 查询条数
   * @return 对象列表
   */
  List<TbUser> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);

  /**
   * 通过实体作为筛选条件查询
   *
   * @param tbUser 实例对象
   * @return 对象列表
   */
  List<TbUser> queryAll(TbUser tbUser);

  /**
   * 新增数据
   *
   * @param tbUser 实例对象
   * @return 影响行数
   */
  int insert(TbUser tbUser);

  /**
   * 批量新增数据（MyBatis原生foreach方法）
   *
   * @param entities List<TbUser> 实例对象列表
   * @return 影响行数
   */
  int insertBatch(@Param("entities") List<TbUser> entities);

  /**
   * 批量新增或按主键更新数据（MyBatis原生foreach方法）
   *
   * @param entities List<TbUser> 实例对象列表
   * @return 影响行数
   */
  int insertOrUpdateBatch(@Param("entities") List<TbUser> entities);

  /**
   * 修改数据
   *
   * @param tbUser 实例对象
   * @return 影响行数
   */
  int update(TbUser tbUser);

  /**
   * 通过主键删除数据
   *
   * @param id 主键
   * @return 影响行数
   */
  int deleteById(Integer id);
}
