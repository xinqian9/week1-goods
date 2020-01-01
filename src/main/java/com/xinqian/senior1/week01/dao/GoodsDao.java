package com.xinqian.senior1.week01.dao;

import java.util.List;

import com.xinqian.senior1.week01.domain.Brand;
import com.xinqian.senior1.week01.domain.Condition;
import com.xinqian.senior1.week01.domain.Goods;
import com.xinqian.senior1.week01.domain.GoodsKind;

public interface GoodsDao {

	List<Goods> selectGoods(Condition con);

	List<Brand> selectBrands();

	List<GoodsKind> selectGoodsKinds();

	int insertGood(Goods goods);

	int updateGood(Goods goods);

	Goods selectGoodById(String gid);

	int delete(String gid);

}
