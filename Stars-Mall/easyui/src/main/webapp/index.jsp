<%--
  Created by IntelliJ IDEA.
  User: zhou5
  Date: 2019/1/16
  Time: 22:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/js/jquery-easyui-1.4.1/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/js/jquery-easyui-1.4.1/themes/icon.css">
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-easyui-1.4.1/jquery.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-easyui-1.4.1/jquery.easyui.min.js"></script>
  </head>
  <body class="easyui-layout">
  <div data-options="region:'north',title:'North Title',split:true" style="height:100px;"></div>
  <div data-options="region:'west',title:'west Title',split:true" style="width:100px;"></div>
  <div data-options="region:'center',title:'west Title',split:true" style="height:100px;"></div>
  <div data-options="region:'east',title:'west Title',split:true" style="height:100px;"></div>
  <div data-options="region:'south',title:'west Title',split:true" style="height:100px;"></div>
  </body>
</html>
