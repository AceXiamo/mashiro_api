package com.blog.service.impl;

import com.blog.dao.TbFileDao;
import com.blog.entity.TbFile;
import com.blog.service.TbFileService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TbFile)表服务实现类
 *
 * @author xiamo
 * @since 2021-03-30 16:45:03
 */
@Service("tbFileService")
public class TbFileServiceImpl implements TbFileService {
  @Resource private TbFileDao tbFileDao;

  /**
   * 通过ID查询单条数据
   *
   * @param id 主键
   * @return 实例对象
   */
  @Override
  public TbFile queryById(Integer id) {
    return this.tbFileDao.queryById(id);
  }

  /**
   * 查询多条数据
   *
   * @param offset 查询起始位置
   * @param limit 查询条数
   * @return 对象列表
   */
  @Override
  public List<TbFile> queryAllByLimit(int offset, int limit) {
    return this.tbFileDao.queryAllByLimit(offset, limit);
  }

  /**
   * 通过实体作为筛选条件查询
   *
   * @param tbFile 实例对象
   * @return 对象列表
   */
  @Override
  public List<TbFile> queryAll(TbFile tbFile) {
    return this.tbFileDao.queryAll(tbFile);
  }

  /**
   * 新增数据
   *
   * @param tbFile 实例对象
   * @return 实例对象
   */
  @Override
  public TbFile insert(TbFile tbFile) {
    this.tbFileDao.insert(tbFile);
    return tbFile;
  }

  /**
   * 修改数据
   *
   * @param tbFile 实例对象
   * @return 实例对象
   */
  @Override
  public TbFile update(TbFile tbFile) {
    this.tbFileDao.update(tbFile);
    return this.queryById(tbFile.getId());
  }

  /**
   * 通过主键删除数据
   *
   * @param id 主键
   * @return 是否成功
   */
  @Override
  public boolean deleteById(Integer id) {
    return this.tbFileDao.deleteById(id) > 0;
  }
}
