<%-- 
    Document   : header
    Created on : 07/12/2022, 16:31:14
    Author     : jose
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CaC - Homebanking</title>
        <link rel="stylesheet" href="/homebanking/css/tags.css"/>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
    </head>
<body class="vh-100">
    <header class="d-flex flex-row justify-content-around align-items-center bg-success text-center text-light">
            <a href="/homebanking">
                <img class="rounded" style="height: 70px;" src="/homebanking/img/cac_logo.png" alt="cac_logo"/>
            </a>
            <h1>Codo a Codo - Homebanking</h1>
            <p></p>
            <%
                boolean isLogin;
                if(session.isNew()){
                    session.setAttribute("isLogin", false); 
                }
                isLogin = (boolean) session.getAttribute("isLogin");
            %>
            
            <ul class="nav nav-pills">
                <li class="nav-item mx-2" style="display: initial">
                    <a class="nav-link active" href="/homebanking/views/login.jsp">Ingresar</a>
                </li>
                <li class="nav-item mx-2" style="display:initial">
                    <a class="nav-link active" href="#">Registrarme</a>
                </li>
                <li class="nav-item mx-2" style="display:initial">
                    <a class="nav-link active" href="#">Mi cuenta</a>
                </li>
                <li class="nav-item mx-2" style="display:initial">
                    <a class="nav-link active" href="#">Salir</a>
                </li>
            </ul>
        
    </header>
