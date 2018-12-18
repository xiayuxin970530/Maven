package com.itheima.dao;

import com.itheima.domain.Items;

public interface ItemsDao {

    //根据id查询对象
    public Items findbyId(Integer id);
}
