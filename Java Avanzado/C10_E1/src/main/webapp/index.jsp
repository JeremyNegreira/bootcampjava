<%@page import="java.sql.ResultSet" %>
<%@page import="com.bootcampjava.c10_e1.persistencia.VotosDAO" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Votaciín</title>
        <style>
            .blue {
                background-color: blue;
            }
            .green {
                background-color: green;
            }
            .btn {
                color: white;
                border: 0;
                padding: 10px 20px;
                border-radius: 5px;
                cursor: pointer;
            }
        </style>

    </head>

    <body>
        <h1> Votación </h1>

        <p>Elija su voto: </p>

        <form action="VotarServlet" method="post">
            <input type="radio" name="partido" value="Partido A"> Partido A <br>
            <input type="radio" name="partido" value="Partido B"> Partido B <br>
            <input type="radio" name="partido" value="Partido C"> Partido C <br><br>
            <input type="submit" value="Votar" class="blue btn">
        </form>

        <form action="MostrarResultadosServlet" method="post">
            <input type="submit" value="Mostrar resultados" class="green btn">
        </form>

    </body>
</html>
