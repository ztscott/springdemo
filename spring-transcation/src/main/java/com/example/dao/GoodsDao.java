package com.example.dao;

import com.example.daomain.Goods;

public interface GoodsDao {
    int updateGoods(Goods goods);
    Goods selectGoods(Integer goodId);
}
