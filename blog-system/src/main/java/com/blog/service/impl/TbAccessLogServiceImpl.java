package com.blog.service.impl;

import com.blog.dao.TbAccessLogDao;
import com.blog.entity.TbAccessLog;
import com.blog.service.TbAccessLogService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TbAccessLog)表服务实现类
 *
 * @author xiamo
 * @since 2021-03-30 16:44:57
 */
@Service("tbAccessLogService")
public class TbAccessLogServiceImpl implements TbAccessLogService {
  @Resource private TbAccessLogDao tbAccessLogDao;

  /**
   * 查询条数
   *
   * @return 实例对象
   */
  @Override
  public Integer queryCount() {
    return this.tbAccessLogDao.queryCount();
  }

  /**
   * 首页查最新前五条
   *
   * @return 对象列表
   */
  @Override
  public List<TbAccessLog> queryByIndex() {
    return this.tbAccessLogDao.queryByIndex();
  }

  /**
   * 通过ID查询单条数据
   *
   * @param id 主键
   * @return 实例对象
   */
  @Override
  public TbAccessLog queryById(Integer id) {
    return this.tbAccessLogDao.queryById(id);
  }

  /**
   * 查询多条数据
   *
   * @param offset 查询起始位置
   * @param limit 查询条数
   * @return 对象列表
   */
  @Override
  public List<TbAccessLog> queryAllByLimit(int offset, int limit) {
    return this.tbAccessLogDao.queryAllByLimit(offset, limit);
  }

  /**
   * 通过实体作为筛选条件查询
   *
   * @param tbAccessLog 实例对象
   * @return 对象列表
   */
  @Override
  public List<TbAccessLog> queryAll(TbAccessLog tbAccessLog) {
    return this.tbAccessLogDao.queryAll(tbAccessLog);
  }

  /**
   * 新增数据
   *
   * @param tbAccessLog 实例对象
   * @return 实例对象
   */
  @Override
  public TbAccessLog insert(TbAccessLog tbAccessLog) {
    this.tbAccessLogDao.insert(tbAccessLog);
    return tbAccessLog;
  }

  /**
   * 修改数据
   *
   * @param tbAccessLog 实例对象
   * @return 实例对象
   */
  @Override
  public TbAccessLog update(TbAccessLog tbAccessLog) {
    this.tbAccessLogDao.update(tbAccessLog);
    return this.queryById(tbAccessLog.getId());
  }

  /**
   * 通过主键删除数据
   *
   * @param id 主键
   * @return 是否成功
   */
  @Override
  public boolean deleteById(Integer id) {
    return this.tbAccessLogDao.deleteById(id) > 0;
  }
}
