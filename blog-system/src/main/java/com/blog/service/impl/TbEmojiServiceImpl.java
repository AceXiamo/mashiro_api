package com.blog.service.impl;

import com.blog.dao.TbEmojiDao;
import com.blog.entity.TbEmoji;
import com.blog.service.TbEmojiService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TbEmoji)表服务实现类
 *
 * @author xiamo
 * @since 2021-03-30 16:45:02
 */
@Service("tbEmojiService")
public class TbEmojiServiceImpl implements TbEmojiService {
  @Resource private TbEmojiDao tbEmojiDao;

  /**
   * 通过ID查询单条数据
   *
   * @param id 主键
   * @return 实例对象
   */
  @Override
  public TbEmoji queryById(Integer id) {
    return this.tbEmojiDao.queryById(id);
  }

  /**
   * 条件查询
   *
   * @param tbEmoji 实例对象
   * @return 对象列表
   */
  @Override
  public List<TbEmoji> queryAll(TbEmoji tbEmoji) {
    return this.tbEmojiDao.queryAll(tbEmoji);
  }

  /**
   * 查询多条数据
   *
   * @param offset 查询起始位置
   * @param limit 查询条数
   * @return 对象列表
   */
  @Override
  public List<TbEmoji> queryAllByLimit(int offset, int limit) {
    return this.tbEmojiDao.queryAllByLimit(offset, limit);
  }

  /**
   * 新增数据
   *
   * @param tbEmoji 实例对象
   * @return 实例对象
   */
  @Override
  public TbEmoji insert(TbEmoji tbEmoji) {
    this.tbEmojiDao.insert(tbEmoji);
    return tbEmoji;
  }

  /**
   * 修改数据
   *
   * @param tbEmoji 实例对象
   * @return 实例对象
   */
  @Override
  public TbEmoji update(TbEmoji tbEmoji) {
    this.tbEmojiDao.update(tbEmoji);
    return this.queryById(tbEmoji.getId());
  }

  /**
   * 通过主键删除数据
   *
   * @param id 主键
   * @return 是否成功
   */
  @Override
  public boolean deleteById(Integer id) {
    return this.tbEmojiDao.deleteById(id) > 0;
  }
}
