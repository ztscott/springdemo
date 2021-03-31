<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="js/jquery-3.5.1.js"></script>
    <script type="text/javascript">
        $(function () {
            $("button").click(function () {
                $.ajax({
                    url:"test/register1.do",
                    data:{
                        name:"zhangsan",
                        age:20
                    },
                    type:"post",
                    dataType:"json",
                    success:function (resp) {
                        // alert(resp)

                        // alert(resp.name + " " + resp.age);
                        $.each(resp,function (i,n) {
                            alert(n.name+"===="+n.age)

                        })

                    }
                });

            });

        });
    </script>
</head>
<body>
     <p>第一个springmvc项目</p>
     <p><a href="test/some.do">发起some.do的请求</a> </p>
     <p><a href="/test/first.do">发起（first）some.do的请求(错误，因为多加了/)</a> </p>
     <p><a href="test/first.do">发起（first）some.do的请求</a> </p>
<%--     <p><a href="test/other.do">发起other.do的请求</a> </p>--%>
<form action="test/other.do" method="post">
    <input type="submit" value="post请求other.do">
</form><br>

<%--    <form action="test/age.do" method="post">--%>
<%--        姓名：<input type="text" name="rname"><br>--%>
<%--        年龄：<input type="text" name="rage"><br>--%>
<%--        <input type="submit" value="提交参数">--%>
<%--    </form>--%>

     <form action="test/register1.do" method="get">
         姓名：<input type="text" name="rname"><br>
         年龄：<input type="text" name="rage"><br>
         <input type="submit" value="提交参数">
     </form>


<button>register注册</button>

</body>
</html>
