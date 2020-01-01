<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="resources/css/index3.css">
<script type="text/javascript" src="resources/js/jquery-1.8.3.js"></script>
<script type="text/javascript">
	function fenye(pageNum){
		$("[name='pageNum']").val(pageNum);
		$("form").submit();
	}
	
	function insert(){
		location.href="toInsert.do";
	}
	
	function update(gid){
		location.href="toUpdate.do?gid="+gid;
	}
	
	function look(gid){
		location.href="look.do?gid="+gid;
	}
	
	function delete1(gid){
		if(confirm("确定要删除吗？")){
			$.ajax({
				url:"deleteOne.do",
				data:{"gid":gid},
				dataType:"json",
				type:"post",
				success:function(result){
					if(result){
						alert("删除成功！");
						location.href="selectGoods.do";
					}else{
						alert("删除失败！");
						location.reload();
					}
				}
			})
		}
	}
	
	function deleteBatch(){
		var gid="";
		$("[name='cks']:checked").each(function(i,val){
			gid+=this.value+",";
		})
		gid=gid.substring(0,gid.length-1);
		alert(gid);
		if(confirm("确定要删除吗？")){
			$.ajax({
				url:"deleteOne.do",
				data:{"gid":gid},
				dataType:"json",
				type:"post",
				success:function(result){
					if(result){
						alert("删除成功！");
						location.href="selectGoods.do";
					}else{
						alert("删除失败！");
						location.reload();
					}
				}
			})
		}
	}
</script>
</head>
<body>
	<form action="selectGoods.do" method="post">
		<input type="hidden" name="pageNum">
		商品名称：<input type="text" name="gcname" value='${con.gcname}'>
		<input type="submit" value="查询">
	</form>
	<input type="button" value="新增商品" onclick='insert()'>
	<input type="button" value="批量删除" onclick='deleteBatch()'>
	<table>
		<tr>
			<td>请选择</td>
			<td>商品编号</td>
			<td>商品名称</td>
			<td>英文名称</td>
			<td>商品品牌</td>
			<td>商品种类</td>
			<td>尺寸(英尺)</td>
			<td>单价(元)</td>
			<td>数量</td>
			<td>标签</td>
			<td>商品图片</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${list}" var="g" varStatus="count">
			<tr>
				<td>
					<input type="checkbox" name="cks" value='${g.gid}'>
				</td>
				<td>${count.count+pInfo.startRow-1}</td>
				<td>${g.gcname}</td>
				<td>${g.gename}</td>
				<td>${g.brand.bname}</td>
				<td>${g.goodsKind.kname}</td>
				<td>${g.gsize}</td>
				<td>${g.gprice}</td>
				<td>${g.gnum}</td>
				<td>${g.glabel}</td>
				<td>
					<img alt="" src="load/${g.gimg}" width="30" height="30">
				</td>
				<td>
					<input type="button" value="商品详情" onclick="look(${g.gid})">
					<input type="button" value="编辑" onclick="update(${g.gid})">
					<input type="button" value="删除" onclick="delete1(${g.gid})">
				</td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="12">
				<input type="button" value="首页" onclick="fenye(1)">
				<input type="button" value="上一页" onclick="fenye(${pInfo.prePage==0?1:pInfo.prePage})">
				<input type="button" value="下一页" onclick="fenye(${pInfo.nextPage==0?pInfo.pages:pInfo.nextPage})">
				<input type="button" value="尾页" onclick="fenye(${pInfo.pages})">
				当前${pInfo.pageNum}/${pInfo.pages}页，共${pInfo.total}条
			</td>
		</tr>
	</table>
</body>
</html>