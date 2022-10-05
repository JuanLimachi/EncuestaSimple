<%@page import="com.emergentes.Encuesta"%>
<%
    Encuesta enc = (Encuesta)request.getAttribute("enc");
    //String lenguajes[] = enc.getLenguajes();
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>GRACIAS POR LLENAR LA ENCUESTA</h1>
        <p>Los datos recibidos son:</p>
        <p>Nombre: <%= enc.getNombre() %> y los lenguajes de su preferencia son:</p>
        <ul>
            <%
                if(enc.getLenguajes() != null){
                //if(lenguajes != null){
                    for(String item : enc.getLenguajes()){
                    //for(String item : lenguajes){
            %>
                        <li><%= item %></li>
            <%
                    }
                }
            %>
        </ul>
        <br>
        <a href="index.jsp">VOLVER</a>
    </body>
</html>
