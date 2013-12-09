<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
 <%
 String path = request.getContextPath();
 String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
 %>
 <!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
 <html>
   <head>
     <base href="<%=basePath%>">
     <title>My JSP 'index.jsp' starting page</title>
  <meta http-equiv="pragma" content="no-cache">
  <meta http-equiv="cache-control" content="no-cache">
  <meta http-equiv="expires" content="0">    
  <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
  <meta http-equiv="description" content="This is my page">
  <script src="js/jquery-1.10.2.js" type="text/javascript"></script>
  <script src="js/jquery.easyui.min.js" type="text/javascript"></script>
<script src="js/easyui-lang-zh_CN.js" type="text/javascript"></script>
<script src="js/index.js" type="text/javascript"></script>        
  <link href="css/default/easyui.css" rel="stylesheet" type="text/css" />
  <link href="css/icon.css" rel="stylesheet" type="text/css" />
  <link href="icons/icon-all.css" rel="stylesheet" type="text/css" />
  <script  type="text/javascript">
  function tijiao(){
	  $('#myForm').form('submit', {
	        url:'login/userLogin',
	        onSubmit: function () {
	            return $(this).form('validate');
	        },
	        success: function (data) {
	        	$.messager.progress('close');
	        }
	    });  
	  }
  </script>
   </head>
   <body>  
      <div style="padding: 300px 200px 800px 800px;"> 
       <form id="myForm" method="post">
       <table>  
        <tr>
            <td colspan="2" align="center">登录验证</td>
       </tr>  
        <tr>
           <td> 用户名：</td>
           <td> <input type="text"  name="user1.userName"  class="easyui-validatebox" required="true" validType="length[4,12]" missingMessage="不能为空" style="width: 200px;" /></td>
       </tr>
       <tr>
           <td> 密码：</td>
           <td> <input type="password"  name="user1.passWord"   class="easyui-validatebox" required="true" validType="length[4,12]" missingMessage="不能为空" style="width: 200px;" /></td>
       </tr>  
       <tr>   
           <td align="center" colspan="2">  
                <input type="submit"  value="提交" onclick="tijiao()"/>  
                <input type="reset" value="重置"/>  
           </td>                 
       </tr> 
     </table>
     </form>
     </div>
   </body>
 </html>