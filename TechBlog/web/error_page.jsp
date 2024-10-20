<%-- 
    Document   : error_page
    Created on : May 21, 2021, 1:56:12 AM
    Author     : sangram
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page  isErrorPage="true" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/myStyles.css" type="text/css"/>
        <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <style>
            .banner-background{clip-path: polygon(0 0, 100% 0, 99% 100%, 74% 95%, 44% 99%, 21% 95%, 0 100%);}
            .card{color: #2196f3;}
            #error_btn{
                background: #2196f3;
                border-radius: 20px 20px 20px 20px;
                padding:5px 10px;
                
            }
            #error_btn:hover{
                background: #ffffff;
                color: #2196f3;
                transition: all ease-in 0.4s;
            }
        </style>
        <title>Sorry!Something went wrong</title>
    </head>
    <body>

        <div class="container text-center">

            <img src="img/icons8-error-cloud.gif" class="img-fluid  mx-auto"  alt="error page">
            <h3 style="color: red;font-size: 32px;"class="display-3">Sorry ! Something went wrong ...</h3><br>
            
            <%= exception%><br>
            
            
            <a id="error_btn" href="index.jsp" class="btn btn-primary btn-lg  mt-3">Home</a>

        </div>
    </body>
</html>
