<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/easyui/css/easyui.css">
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath }/easyui/css/icon.css">
<script type="text/javascript"
	src="${pageContext.request.contextPath }/easyui/js/jquery.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath }/easyui/js/jquery.easyui.min.js"></script>
<script type="text/javascript">
$(function(){
	$("#a1").bind("click",function(){
		$("#tt").tabs('add',{    
		    title:'商品信息页',    
		    content:'itemInfo',    
		    closable:true,    
		    tools:[{    
		        iconCls:'icon-mini-refresh',    
		        handler:function(){    
		        	alert('refresh');    
		        }    
		    }]    
		});  
	});
});
</script>
</head>
<body class="easyui-layout" fit="true">
	<div data-options="region:'north',title:'EasyUI-Sample',split:false"
		style="height: 100px;"></div>
	<div data-options="region:'west',title:'Accordion',split:false"
		style="width: 250px;">
		<div id="aa" class="easyui-accordion" border="false"
			style="width: 300px; height: 200px; fit: true;">
				<ul class="easyui-tree">
					<li><a id="a1">查看商品</a></li>
					<li><a id="a2">管理商品</a></li>
				</ul>
		</div>
	</div>
	<div data-options="region:'center'" border="0px">
		<div id="tt" class="easyui-tabs" fit="true">
			<div title="Welcome" style="padding: 20px; display: none;">
				Welcome Page !
			</div>
		</div>

	</div>
</body>

</html>