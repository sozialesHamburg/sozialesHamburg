
<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<%--
    This file is an entry point for JavaServer Faces application.
--%>
<f:view>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Soziales Hamburg</title>
        
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="/JsfJpaCrud/faces/jsfcrud.css" />
    </head>
    <body>
        <%-- Bild --%>
        <ul class="nav nav-tabs">
            <li role="presentation" class="active"><a href="welcomeJSF.jsp">Home</a></li>
            <li role="presentation"><a href="projekte.jsp">Projekte</a></li>
            <li role="presentation"><a href="erstelle.jsp">Projekt erstellen</a></li>
        </ul>
        <h1>Finde dein nächstes Soziales Projekt!</h1>
        <h5> <p>Willkommen auf den ersten wirklich sozialen Netzwerk.</p>
            <p> Hier kannst du Soziale Projekte in Hamburg nachlesen 
                oder wenn du eine gute Idee hast ein eigenes Projekt auf die Beine stellen.</p>
            
            
        </h5>
        <div id="karte"> <iframe src="https://www.google.com/maps/embed?pb=!1m14!1m12!1m3!1d75845.86944929649!2d10.00403915136717!3d53.55449312416848!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!5e0!3m2!1sde!2sde!4v1442672733887" width="600" height="450" frameborder="0" style="border:0" allowfullscreen></iframe></div>
        <div id="postleitzahl"> 
            
            <h3>Finde projekte in deiner Nähe</h3>
        <input type="text" placeholder="Postleitzahl"> <button>Go</button>
        </div>
    </body>
</html>
</f:view>
