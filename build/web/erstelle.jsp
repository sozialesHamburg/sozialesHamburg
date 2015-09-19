
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
            <ul class="nav nav-tabs">
                <li role="presentation"><a href="welcomeJSF.jsp">Home</a ></li>
                <li role="presentation"><a href="projekte.jsp">Projekte</a></li>
                <li role="presentation" class="active"><a href="erstelle.jsp">Projekt erstellen</a></li>
            </ul>
            <div class="container">
            <h1>Erstelle dein eigenes Projekt</h1>
            <h4>Du hast eine gute Idee wie du Hamburg verbessern möchtest, hast aber nicht genug reichweite.
                Dann bist du hier richtig.
                Fülle das Formular aus und andere können deine Idee anschauen, kommentieren und mitmachen.
                Für ein besseres Hamburg!
            </h4>
            
            <h:form>
                <div class="form-group">
                    <label for="InputEmail">Email address</label>
                    <input type="email" class="form-control" id="InputEmail" placeholder="Email">
                </div>
                <div class="form-group">
                    <label for="InputName">Vor- und Nachname</label>
                    <input type="text" class="form-control" id="InputName" placeholder="Vor- und Nachname">
                </div>
                <div class="form-group">
                    <label for="InputOrt">Ort</label>
                    <input type="text" class="form-control" id="InputOrt" placeholder="Ort">
                </div>
                <div class="form-group">
                    <label for="InputZeitraum">Zeitraum</label>
                    <input type="date" class="form-control" id="InputZeitraum" placeholder="Zeitraum">
                </div>
                <div class="form-group">
                    <label for="InputZiele">Ziele</label>
                    <input type="text" class="form-control" id="InputZiele" placeholder="Ziele">
                </div>
                <button type="submit" class="btn btn-default">Submit</button>


            </h:form>
            </div>
        </body>
    </html>
</f:view>
