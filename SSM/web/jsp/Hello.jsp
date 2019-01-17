
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<head>
    <title>Title</title>
    <script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.8.3.js"></script>
    <script type="text/javascript">
        $(
            function () {
                $("[name='test']").click(

                    function(){
                        alert("Hello World");
                        /*$(this).next().html("我是");*/
                    }

                )
            }
        )

    </script>
</head>
<body>
<input type="button" value="点我" name="test"/><span></span>

</body>
</html>
