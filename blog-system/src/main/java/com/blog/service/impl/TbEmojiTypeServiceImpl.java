package com.blog.service.impl;

import com.blog.dao.TbEmojiTypeDao;
import com.blog.entity.TbEmojiType;
import com.blog.service.TbEmojiTypeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TbEmojiType)表服务实现类
 *
 * @author xiamo
 * @since 2021-03-30 16:45:03
 */
@Service("tbEmojiTypeService")
public class TbEmojiTypeServiceImpl implements TbEmojiTypeService {
    @Resource
    private TbEmojiTypeDao tbEmojiTypeDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TbEmojiType queryById(Integer id) {
        return this.tbEmojiTypeDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<TbEmojiType> queryAllByLimit(int offset, int limit) {
        return this.tbEmojiTypeDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tbEmojiType 实例对象
     * @return 实例对象
     */
    @Override
    public TbEmojiType insert(TbEmojiType tbEmojiType) {
        this.tbEmojiTypeDao.insert(tbEmojiType);
        return tbEmojiType;
    }

    /**
     * 修改数据
     *
     * @param tbEmojiType 实例对象
     * @return 实例对象
     */
    @Override
    public TbEmojiType update(TbEmojiType tbEmojiType) {
        this.tbEmojiTypeDao.update(tbEmojiType);
        return this.queryById(tbEmojiType.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.tbEmojiTypeDao.deleteById(id) > 0;
    }
}