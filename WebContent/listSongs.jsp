<%@page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Show All Users</title>
</head>
<body>
    <table border=1>
        <thead>
            <tr>
                <th>Song Id</th>
                <th>Song</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach items="${songs}" var="song">
                <tr>
                    <td><c:out value="${song.songId}" /></td>
                    <td><c:out value="${song.name}" /></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>