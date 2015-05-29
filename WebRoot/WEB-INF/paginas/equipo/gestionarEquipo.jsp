<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.ArrayList,java.util.List,mcc.*"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Lista de usuarios</title>
<%@include file="../plantilla/estilosCSS.html" %> 
</head>
<body>
<%@include file="../plantilla/encabezado.html" %> 
<!-- inicia va el contenido -->
<div class="container">
    <div class="row">
        <div class="col-sm-4 col-md-4">
            <div class="post">
                <div class="post-img-content">
                    <img src="http://placehold.it/460x250/e67e22/ffffff&text=HTML5" class="img-responsive" />
                    <span class="post-title"><b>Make a Image Blur Effects With</b><br />
                        <b>CSS3 Blur</b></span>
                </div>
                <div class="content">
                    <div class="author">
                        By <b>Bhaumik</b> |
                        <time datetime="2014-01-20">January 20th, 2014</time>
                    </div>
                    <div>
                        Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem
                        Ipsum has been the industry's standard dummy text ever since the 1500s, when an
                        unknown printer took a galley of type and scrambled it to make a type specimen book.
                    </div>
                    <div>
                        <a href="http://www.jquery2dotnet.com/2014/01/jquery-highlight-table-row-and-column.html" class="btn btn-warning btn-sm">Read more</a>
                    </div>
                </div>
            </div>
        </div>
        <div class="col-sm-4 col-md-4">
            <div class="post">
                <div class="post-img-content">
                    <img src="http://placehold.it/460x250/2980b9/ffffff&text=CSS3" class="img-responsive" />
                    <span class="post-title"><b>Make a Image Blur Effects With</b><br />
                        <b>CSS3 Blur</b></span>
                </div>
                <div class="content">
                    <div class="author">
                        By <b>Bhaumik</b> |
                        <time datetime="2014-01-20">January 20th, 2014</time>
                    </div>
                    <div>
                        Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem
                        Ipsum has been the industry's standard dummy text ever since the 1500s, when an
                        unknown printer took a galley of type and scrambled it to make a type specimen book.
                    </div>
                    <div>
                        <a href="http://www.jquery2dotnet.com/2013/11/share-social-media-round-buttons.html" class="btn btn-primary btn-sm">Read more</a>
                    </div>
                </div>
            </div>
        </div>
        <div class="col-sm-4 col-md-4">
            <div class="post">
                <div class="post-img-content">
                    <img src="http://placehold.it/460x250/47A447/ffffff&text=jQuery" class="img-responsive" />
                    <span class="post-title"><b>Make a Image Blur Effects With</b><br />
                        <b>CSS3 Blur</b></span>
                </div>
                <div class="content">
                    <div class="author">
                        By <b>Bhaumik</b> |
                        <time datetime="2014-01-20">January 20th, 2014</time>
                    </div>
                    <div>
                        Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem
                        Ipsum has been the industry's standard dummy text ever since the 1500s, when an
                        unknown printer took a galley of type and scrambled it to make a type specimen book.
                    </div>
                    <div>
                        <a href="http://www.jquery2dotnet.com/2013/07/cool-social-sharing-button-using-css3.html" class="btn btn-success btn-sm">Read more</a>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

<!--  finaliza el contenido -->
<%@include file="../plantilla/piepagina.html" %> 
</body>
</html>