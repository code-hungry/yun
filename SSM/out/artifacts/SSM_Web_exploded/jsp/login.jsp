<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/1/7
  Time: 13:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.8.3.js"></script>
    <script type="text/javascript">
        function reqJson() {
            $.ajax({
                type:'post',
                url:'${pageContext.request.contextPath}/items/reqJson.action',
                data:'{"name":"手机","price":3000,"id":1}',
                contentType:'application/json;charset=utf-8',
                success:function(res){
                    alert(res.name);
            }
            });
        }
        $(
            function () {
                $("#resj").click(
                    $.ajax({
                        type:'post',
                        url:'${pageContext.request.contextPath}/items/resJson.action',
                        data:'name="手机",price=3000,id=1',
                        success:function(res){
                            alert(res.name);
                        }
                    })
                )
            }
        )
        $(
            function () {
                $("#rest").click(
                    $.ajax(
                        {
                            type:'post',
                            url:'${pageContext.request.contextPath}/items/restful/手机/3000',
                            success:function (res) {
                                alert(res.name);
                            }
                        }
                    )
                )
            }
        )
    </script>
</head>
<body>
<form action="${pageContext.request.contextPath }/items/login.action" method="post">
    <div>用户名:<input type="text" name="name" value="${name}"/></div>
    <div>密码:<input type="password" name="password" value="${password}"/></div>
    <div><input type="submit" value="提交"/></div>
</form>
<input type="button" value="reqjson" onclick="reqJson()"/>
<input type="button" value="resJson" id="resj" name="rj"/>
<input type="button" value="restful" id="rest" name="rt"/>
</body>
</html>
