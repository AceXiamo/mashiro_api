package com.blog.service;

import com.blog.entity.TbUser;

import java.util.List;

/**
 * (TbUser)表服务接口
 *
 * @author xiamo
 * @since 2021-03-30 16:45:04
 */
public interface TbUserService {

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
   * 查询多条数据
   *
   * @param offset 查询起始位置
   * @param limit 查询条数
   * @return 对象列表
   */
  List<TbUser> queryAllByLimit(int offset, int limit);

  /**
   * 新增数据
   *
   * @param tbUser 实例对象
   * @return 实例对象
   */
  TbUser insert(TbUser tbUser);

  /**
   * 条件查询
   *
   * @param tbUser 实例对象
   * @return 对象列表
   */
  List<TbUser> queryAll(TbUser tbUser);

  /**
   * 修改数据
   *
   * @param tbUser 实例对象
   * @return 实例对象
   */
  TbUser update(TbUser tbUser);

  /**
   * 通过主键删除数据
   *
   * @param id 主键
   * @return 是否成功
   */
  boolean deleteById(Integer id);
}
