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
	$(function(){
		var flag='${msg}'
		if(flag=="添加成功！"){
			alert("添加成功！");
			location.href="selectGoods.do";
		}if(flag=="添加失败！"){
			alert("添加失败！");
			location.href="insertfail.do";
		}
	})

</script>
</head>
<body>
	<form action="insert.do" method="post" enctype="multipart/form-data">
		<table>
			<tr>
				<th colspan="2">新增商品</th>
			</tr>
			<tr>
				<td>商品名称</td>
				<td>
					<input type="text" name="gcname">
				</td>
			</tr>
			<tr>
				<td>英文名称</td>
				<td>
					<input type="text" name="gename">
				</td>
			</tr>
			<tr>
				<td>商品品牌</td>
				<td>
					<select name="bid">
						<option value=0>请选择</option>
						<c:forEach items="${blist}" var="b">
							<option value="${b.bid}">${b.bname}</option>
						</c:forEach>
					</select>
				</td>
			</tr>
			<tr>
				<td>商品种类</td>
				<td>
					<select name="kid">
						<option value=0>请选择</option>
						<c:forEach items="${klist}" var="k">
							<option value="${k.kid}">${k.kname}</option>
						</c:forEach>
					</select>
				</td>
			</tr>
			<tr>
				<td>尺寸(英寸)</td>
				<td>
					<input type="text" name="gsize">
				</td>
			</tr>
			<tr>
				<td>单价(元)</td>
				<td>
					<input type="text" name="gprice">
				</td>
			</tr>
			<tr>
				<td>数量</td>
				<td>
					<input type="text" name="gnum">
				</td>
			</tr>
			<tr>
				<td>标签</td>
				<td>
					<input type="text" name="glabel">
				</td>
			</tr>
			<tr>
				<td>商品图片上传</td>
				<td>
					<input type="file" name="myfile">
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="提交">
				</td>
			</tr>
		</table>
	</form>
</body>
</html>