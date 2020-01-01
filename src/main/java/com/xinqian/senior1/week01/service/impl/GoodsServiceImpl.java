package com.xinqian.senior1.week01.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xinqian.senior1.week01.dao.GoodsDao;
import com.xinqian.senior1.week01.domain.Brand;
import com.xinqian.senior1.week01.domain.Condition;
import com.xinqian.senior1.week01.domain.Goods;
import com.xinqian.senior1.week01.domain.GoodsKind;
import com.xinqian.senior1.week01.service.GoodsService;
@Service("service")
public class GoodsServiceImpl implements GoodsService{
	@Autowired
	private GoodsDao dao;

	@Override
	public List<Goods> selectGoods(Condition con) {
		// TODO Auto-generated method stub
		return dao.selectGoods(con);
	}

	@Override
	public List<Brand> selectBrands() {
		// TODO Auto-generated method stub
		return dao.selectBrands();
	}

	@Override
	public List<GoodsKind> selectGoodsKinds() {
		// TODO Auto-generated method stub
		return dao.selectGoodsKinds();
	}

	@Override
	public boolean insertGood(Goods goods) {
		// TODO Auto-generated method stub
		return dao.insertGood(goods)>0;
	}

	@Override
	public boolean updateGood(Goods goods) {
		// TODO Auto-generated method stub
		return dao.updateGood(goods)>0;
	}

	@Override
	public Goods selectGoodById(String gid) {
		// TODO Auto-generated method stub
		return dao.selectGoodById(gid);
	}

	@Override
	public boolean delete(String gid) {
		// TODO Auto-generated method stub
		return dao.delete(gid)>0;
	}
}
