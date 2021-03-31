<%@page contentType="text/html;charset=utf-8" language="java" %>
<%    String basePath = request.getScheme() + "://" +
            request.getServerName() + ":" + request.getServerPort() +
            request.getContextPath() + "/";
%>
<html>

<head>
    <base href="<%=basePath%>">
    <title>功能入口</title>
</head>

<body>
<h2>SSM整合</h2>
<div align="center">
    <tr>
        <td >
            <a href="addStudent.jsp">注册学生</a>
        </td>
    </tr>

    <tr><td>
        &nbsp;
    </td></tr>

    <tr>
        <a href="findStudent.jsp">查询学生</a>
        </td>
    </tr>

</div>
</body>
</html>
