package com.blog.dao;

import com.blog.entity.TbEmojiType;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * (TbEmojiType)表数据库访问层
 *
 * @author xiamo
 * @since 2021-03-30 16:45:03
 */
@Mapper
public interface TbEmojiTypeDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TbEmojiType queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<TbEmojiType> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tbEmojiType 实例对象
     * @return 对象列表
     */
    List<TbEmojiType> queryAll(TbEmojiType tbEmojiType);

    /**
     * 新增数据
     *
     * @param tbEmojiType 实例对象
     * @return 影响行数
     */
    int insert(TbEmojiType tbEmojiType);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<TbEmojiType> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<TbEmojiType> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<TbEmojiType> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<TbEmojiType> entities);

    /**
     * 修改数据
     *
     * @param tbEmojiType 实例对象
     * @return 影响行数
     */
    int update(TbEmojiType tbEmojiType);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}