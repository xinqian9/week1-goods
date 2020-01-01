package com.xinqian.senior1.week01.service.impl;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xinqian.senior1.week01.domain.Condition;
import com.xinqian.senior1.week01.domain.Goods;
import com.xinqian.senior1.week01.service.GoodsService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-beans.xml")
public class GoodsServiceImplTest {
	@Autowired
	private GoodsService service;
//	@Test
//	public void testSelectGoods() {
//		List<Goods> list = service.selectGoods(Condition con);
//		System.out.println(list);
//	}

}
