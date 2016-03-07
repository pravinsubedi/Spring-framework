<%-- 
    Document   : enquiry
    Created on : Feb 28, 2016, 8:34:29 AM
    Author     : pravin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>enquiries!</h1>
        <table class="table">
            <tr>
                <th>id</th>
                <th>name</th>
                <th>email</th>
                <th>subject</th>
                <th>action</th>
            </tr>
            
            <c:forEach var="enq" items="${enquiries}">
                <tr>
                    <td>${enq.id}</td>
                    <td>${enq.name}</td>
                    <td>${enq.email}</td>
                    <td>${enq.subject}</td>
                    <td><a href="${pageContext.request.contextPath}/admin/enquiry/edit/${enq.id}">Edit</a></td>    
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
