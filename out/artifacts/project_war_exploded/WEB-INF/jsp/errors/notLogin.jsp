<%--
  Created by IntelliJ IDEA.
  User: lovely
  Date: 2020/2/21
  Time: 11:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>错误页面</title>
</head>
<body>
<h1>${exception.message}</h1>


<script>
    var index = 3;
    window.onload=function(){
        setInterval(function(){
            index--;
            if(index === 0)
                window.location = "${pageContext.request.servletPath}";
        },1000)
    }

</script>
</body>
</html>
