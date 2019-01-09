<%@ page import="java.util.Date" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<body>
<h2>SSM项目 <%=new Date().toLocaleString()%>
</h2>
<h3><a href="${pageContext.request.contextPath}/account/transfer/aaa/bbb/500">执行转账</a></h3>
<h3><a href="${pageContext.request.contextPath}/account/findAll">查询所有账户</a></h3>
</body>
</html>
