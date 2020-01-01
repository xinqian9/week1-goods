package com.xinqian.senior1.week01.service;

import java.util.List;

import com.xinqian.senior1.week01.domain.Brand;
import com.xinqian.senior1.week01.domain.Condition;
import com.xinqian.senior1.week01.domain.Goods;
import com.xinqian.senior1.week01.domain.GoodsKind;

public interface GoodsService {
	
	List<Goods> selectGoods(Condition con);

	List<Brand> selectBrands();

	List<GoodsKind> selectGoodsKinds();

	boolean insertGood(Goods goods);

	boolean updateGood(Goods goods);

	Goods selectGoodById(String gid);

	boolean delete(String gid);
}
