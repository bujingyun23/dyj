<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">
<title>系统登录</title>

<jsp:include page="include.jsp"></jsp:include>
<script type="text/javascript">
$(function() {
	var login = function() {
		$('#loginForm').form('submit', {
			url : 'login/userLogin',
			onSubmit : function() {
				return $(this).form('validate');
			},
			success : function(data) {
				$.messager.progress('close');
			}
		});
	};
	
	$('#loginDialog').show().dialog({
		modal : false,
		closable : false,
		iconCls : 'icon-standard-lock-open',
		buttons : [{
			id : 'loginBtn',
			text : '登录',
			handler : function() {
				login();
			}
		}, {
			text : '注册',
			handler : function() {
				location.replace(basePath + '/reg.jsp');
			}
		} ]
	});
});
</script>
</head>

<body>
	<div id="loginDialog" title="系统登录"
		style="display: none; width: 320px; height: 180px; padding: 10px; overflow: hidden;">
		<form id="loginForm" method="post" class="form">
			<table class="table" style="width: 100%; height: 100%;">
				<tr>
					<td width="50">用户名</td>
					<td><input type="text" name="user1.userName"
						class="easyui-validatebox" required="true"
						validType="length[4,12]"
						style="width: 210px;" /></td>
				</tr>
				<tr>
					<td>密码</td>
					<td><input type="password" name="user1.passWord"
						class="easyui-validatebox" required="true"
						validType="length[4,12]"
						style="width: 210px;" /></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>