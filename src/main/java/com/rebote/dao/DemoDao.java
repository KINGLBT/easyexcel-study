package com.rebote.dao;

import com.rebote.domain.DemoData;

import java.util.List;

/**
 * @ClassName: DemoDao
 * @description:
 * @author: luomeng
 * @time: 2020/7/1 13:34
 */
public interface DemoDao {

    /**
     * 批量插入
     *
     * @param list
     */
    public void save(List<DemoData> list);
}
