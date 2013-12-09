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
  <link href="css/default/easyui.css" rel="stylesheet" type="text/css" />
  <link href="css/icon.css" rel="stylesheet" type="text/css" /> 
  <script src="js/jquery-1.10.2.js" type="text/javascript"></script>
  <script src="js/jquery.easyui.min.js" type="text/javascript"></script>
  <script src="js/easyui-lang-zh_CN.js" type="text/javascript"></script>   
  <script src="txl/txl.js" type="text/javascript"></script>
   </head>
   <body >
       <div id="datagrid"></div>  
       
           <div id="newTxl" title="增加窗口"  style="width: 600px; height: 300px;">
           <div style="padding: 20px 20px 40px 80px;">
            <form id="addForm" method="post">
            <table>
                <tr>
                    <td>  姓名：</td>
                    <td> <input name="txlBook.name"  class="easyui-validatebox"     data-options="required:true" style="width: 300px;" /></td>
                </tr>
                <tr>
                    <td>  邮箱：</td>
                    <td> <input  name="txlBook.youxiang" class="easyui-validatebox"  data-options="required:true,validType:'email'"  style="width: 300px;" /></td>
                </tr>
                 <tr>
                    <td>  电话：</td>
                    <td> <input name="txlBook.phone"  class="easyui-validatebox" style="width: 300px;" /></td>
                </tr>                
                 <tr>
                    <td>  QQ号：</td>
                    <td> <input  name="txlBook.qq"  style="width: 300px;" /></td>
                </tr>                            
                 <tr>
                    <td>  地址：</td>
                    <td> <input name="txlBook.dizhi"  style="width: 300px;" /></td>
                </tr>
                 <tr>
                    <td>  生日：</td>
                    <td> <input name="txlBook.birthday"   class="easyui-datebox" style="width: 300px;" /></td>                   
                </tr>
            </table>
            </form>
        </div>
    </div>
    
    
    
       <div id="editTxl" title="编辑窗口"  style="width: 600px; height: 300px;">
           <div style="padding: 20px 20px 40px 80px;">
            <form id="editForm" method="post">
            <div style="display:none"><input name="txlid"/></div>
            <table>
                <tr>
                    <td>  姓名：</td>
                    <td> <input name="name"  class="easyui-validatebox"   data-options="required:true" style="width: 300px;" /></td>
                </tr>
                <tr>
                    <td>  邮箱：</td>
                    <td> <input  name="youxiang"  class="easyui-validatebox"  data-options="required:true,validType:'email'"  style="width: 300px;" /></td>
                </tr>
                 <tr>
                    <td>  电话：</td>
                    <td> <input name="phone"  class="easyui-validatebox" style="width: 300px;" /></td>
                </tr>                
                 <tr>
                    <td>  QQ号：</td>
                    <td> <input  name="qq"  style="width: 300px;" /></td>
                </tr>                            
                 <tr>
                    <td>  地址：</td>
                    <td> <input name="dizhi"  style="width: 300px;" /></td>
                </tr>
                 <tr>
                    <td>  生日：</td>
                    <td> <input name="birthday"   class="easyui-datebox" style="width: 300px;" /></td>                   
                </tr>
            </table>
            </form>
        </div>
    </div>
    
    
     <div id="search" title="查询窗口" style="width: 400px; height: 250px;">
        <div style="padding: 20px 20px 40px 80px;">
            <form id="searchForm" method="post">
            <table>
                <tr>
                    <td>  姓名：</td>
                    <td><input name="name" id="name" style="width: 150px;" /> </td>
                </tr>
                 <tr>
                    <td>  邮箱：</td>
                    <td><input name="youxiang" id="youxiang" style="width: 150px;" /> </td>
                </tr>
                 <tr>
                    <td>  电话：</td>
                    <td><input name="phone" id="phone" style="width: 150px;" /> </td>
                </tr>
            </table>
            </form>
        </div>
        
        
        <div style="text-align: center; padding: 5px;">
            <a href="javascript:void(0)" onclick="searchTxl()" id="btn-search" icon="icon-ok">确定</a>
            <a href="javascript:void(0)" onclick="closeSearchWindow()" id="btn-search-cancel" icon="icon-cancel">取消</a>
        </div>
    </div> 
</body>
 </html>