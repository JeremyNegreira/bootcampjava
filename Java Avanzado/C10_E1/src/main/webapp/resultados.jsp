<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Resultados</title>
    </head>
    <body>
        <table style="border-collapse: collapse;">
            <tr>
                <th>Nombre Partido</th>
                <th>Cantidad Votos</th>
            </tr>
            <% ResultSet resultados = (ResultSet) request.getAttribute("resultados");
                if (resultados != null)
                    while (resultados.next()) {%>
            <tr>
                <td><%= resultados.getString("partido")%></td>
                <td><%= resultados.getInt("cantidad_votos")%></td>
            </tr>
            <%}%>
        </table>
    </body>
</html>
