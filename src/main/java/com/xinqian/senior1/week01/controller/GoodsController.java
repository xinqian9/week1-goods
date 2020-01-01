package com.xinqian.senior1.week01.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.swing.LookAndFeel;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.google.gson.annotations.JsonAdapter;
import com.xinqian.senior1.week01.domain.Brand;
import com.xinqian.senior1.week01.domain.Condition;
import com.xinqian.senior1.week01.domain.Goods;
import com.xinqian.senior1.week01.domain.GoodsKind;
import com.xinqian.senior1.week01.service.GoodsService;

@Controller
public class GoodsController {
	@Autowired
	private GoodsService service;
	
	@RequestMapping("selectGoods.do")
	public Object selectGoods(Model m,Condition con) {
		if(con.getPageNum()==null) {
			con.setPageNum(1);
		}
		PageHelper.startPage(con.getPageNum(),3);
		List<Goods> list=service.selectGoods(con);
		PageInfo<Goods> pInfo = new PageInfo<Goods>(list);
		m.addAttribute("list",list);
		m.addAttribute("pInfo",pInfo);
		m.addAttribute("con",con);
		return "list";
	}
	
	@RequestMapping("toInsert.do")
	public Object toInsert(Model m,Goods goods) {
		List<Brand> blist=service.selectBrands();
		List<GoodsKind> klist=service.selectGoodsKinds();
		m.addAttribute("blist", blist);
		m.addAttribute("klist", klist);
		m.addAttribute("goods", goods);
		return "insert";
	}
	@RequestMapping("insert.do")
	public Object insertGood(Model m,@RequestParam("myfile")MultipartFile myfile,@ModelAttribute("goods")Goods goods,BindingResult br,HttpServletRequest request) throws IllegalStateException, IOException {
		System.out.println(goods);
		String realName = myfile.getOriginalFilename();
		System.out.println(realName);
		String realPath = request.getSession().getServletContext().getRealPath("/load/");
		File file = new File(realPath+realName);
		myfile.transferTo(file);
		goods.setGimg(realName);
		System.out.println(goods);
		boolean result=service.insertGood(goods);
		if(result) {
			m.addAttribute("msg","添加成功！");
		}else {
			m.addAttribute("msg","添加失败！");
		}
		return "insert";
	}
	
	@RequestMapping("toUpdate.do")
	public Object toUpdate(Model m,Goods goods) {
		List<Brand> blist=service.selectBrands();
		List<GoodsKind> klist=service.selectGoodsKinds();
		m.addAttribute("blist", blist);
		m.addAttribute("klist", klist);
		m.addAttribute("goods", goods);
		return "update";
	}
	
	@RequestMapping("update.do")
	public Object updateGood(Model m,@RequestParam("myfile")MultipartFile myfile,@ModelAttribute("goods")Goods goods,BindingResult br,HttpServletRequest request) throws IllegalStateException, IOException {
		System.out.println(goods);
		String realName = myfile.getOriginalFilename();
		System.out.println(realName);
		String realPath = request.getSession().getServletContext().getRealPath("/load/");
		File file = new File(realPath+realName);
		myfile.transferTo(file);
		goods.setGimg(realName);
		System.out.println(goods);
		boolean result=service.updateGood(goods);
		if(result) {
			m.addAttribute("msg","修改成功！");
		}else {
			m.addAttribute("msg","修改失败！");
		}
		return "update";
	}
	@RequestMapping("look.do")
	public Object look(Model m,Goods goods) {
		List<Brand> blist=service.selectBrands();
		List<GoodsKind> klist=service.selectGoodsKinds();
		m.addAttribute("blist", blist);
		m.addAttribute("klist", klist);
		m.addAttribute("goods", goods);
		return "look";
	}
	@ResponseBody
	@RequestMapping("selectGoodById.do")
	public Object selectGoodById(Model m,@RequestParam("gid")String gid) {
		Goods goods=service.selectGoodById(gid);
		return goods;
	}
	
	@ResponseBody
	@RequestMapping("deleteOne.do")
	public Object deleteOne(Model m,@RequestParam("gid")String gid) {
		boolean result=service.delete(gid);
		return result;
	}
	
	@RequestMapping("updatefail.do")
	public Object ufaile() {
		return "update";
	}
	
	@RequestMapping("insertfail.do")
	public Object ifaile() {
		return "insert";
	}
	
}
