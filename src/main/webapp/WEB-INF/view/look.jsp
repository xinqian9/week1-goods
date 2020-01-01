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
		var gid=${param.gid}
		$.ajax({
			url:"selectGoodById.do",
			data:{"gid":gid},
			dataType:"json",
			type:"post",
			success:function(arr){
				$("[name=gcname]").val(arr.gcname);
				$("[name=gename]").val(arr.gename);
				$("[name=gsize]").val(arr.gsize);
				$("[name=gprice]").val(arr.gprice);
				$("[name=gnum]").val(arr.gnum);
				$("[name=glabel]").val(arr.glabel);
				$("#opt1").each(function(i,val){
					if($(this).val()==arr.bid){
						$(this).attr("selected",true);
					}
				})
				$("#opt2").each(function(){
					if($(this).val()==arr.kid){
						$(this).prop("selected",selected);
					}
				})
			}
		})
	})
</script>
</head>
<body>
		<table>
			<tr>
				<th colspan="2">编辑商品</th>
			</tr>
			<tr>
				<td>商品名称</td>
				<td>
					<input type="hidden" name="gid" value='${param.gid}'>
					<input type="text" name="gcname" readonly="readonly">
				</td>
			</tr>
			<tr>
				<td>英文名称</td>
				<td>
					<input type="text" name="gename" readonly="readonly">
				</td>
			</tr>
			<tr>
				<td>商品品牌</td>
				<td>
					<select name="bid">
						<option value=0>请选择</option>
						<c:forEach items="${blist}" var="b">
							<option value="${b.bid}" id="opt1">${b.bname}</option>
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
							<option value="${k.kid}" id="opt2">${k.kname}</option>
						</c:forEach>
					</select>
				</td>
			</tr>
			<tr>
				<td>尺寸(英寸)</td>
				<td>
					<input type="text" name="gsize" readonly="readonly">
				</td>
			</tr>
			<tr>
				<td>单价(元)</td>
				<td>
					<input type="text" name="gprice" readonly="readonly">
				</td>
			</tr>
			<tr>
				<td>数量</td>
				<td>
					<input type="text" name="gnum" readonly="readonly">
				</td>
			</tr>
			<tr>
				<td>标签</td>
				<td>
					<input type="text" name="glabel" readonly="readonly">
				</td>
			</tr>
			<tr>
				<td>商品图片上传</td>
				<td>
					<input type="file" name="myfile" readonly="readonly">
				</td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="提交">
				</td>
			</tr>
		</table>
</body>
</html>