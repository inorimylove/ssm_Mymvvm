 <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
 <html>    
 <head>         
<meta charset="UTF-8" />     
</head>    
 <body>
 恭喜，web項目已經成功搭建！
 <% String path=request.getContextPath();%>
 <a href="<%=path%>/test/test">试一试</a>
 </body> 
 
</html>