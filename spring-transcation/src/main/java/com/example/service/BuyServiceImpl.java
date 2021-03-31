package com.example.service;

import com.example.dao.GoodsDao;
import com.example.dao.SaleDao;
import com.example.daomain.Goods;
import com.example.daomain.Sale;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


public class BuyServiceImpl implements BuyService {
    private GoodsDao goodsDao;
    private SaleDao saleDao;

    public void setGoodsDao(GoodsDao goodsDao) {
        this.goodsDao = goodsDao;
    }

    public void setSaleDao(SaleDao saleDao) {
        this.saleDao = saleDao;
    }

//    @Transactional(propagation = Propagation.REQUIRED,
//            isolation = Isolation.DEFAULT,
//            readOnly = false,
//            rollbackFor = {
//            NullPointerException.class,
//            BuyException.class
//    })
    @Transactional
    @Override
    public void Buy(int goodid, int amount) {
        Sale sale = new Sale();
        sale.setId(goodid);
        sale.setNums(amount);
        saleDao.insertSale(sale);

        Goods goods = goodsDao.selectGoods(goodid);

        //判断
        if(goods == null){
            throw new NullPointerException("仓库无此商品");
        }else if(goods.getAmount() < amount){
            throw new BuyException("商品库存不足");
        }
        goods = new Goods();

        goods.setAmount(amount);
        goods.setId(goodid);
        goodsDao.updateGoods(goods);





    }
}
