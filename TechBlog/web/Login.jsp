<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/myStyles.css" type="text/css"/>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <script src="JS/myJS.js" type="text/javascript" ></script>
        <style>
            .banner-background{
                clip-path: polygon(0 0, 100% 0, 99% 100%, 76% 89%, 45% 93%, 23% 91%, 0 93%);
            }
            .card{color: #2196f3;}            
        </style>
        <title>LoginUser</title>
    </head>
    <body>

        <%@include  file="normal_navbar.jsp" %>
        <main class="d-flex align-items-center banner-background bg-primary " style="height: 70vh;cursor: pointer;"> 

            <div class="container container animate__animated animate__bounceInDown ">
                <div class="row">
                    <div class="col-md-4 offset-md-4" >

                        <div class="card">

                            <div class="card-header text-center ">
                                <span class="fa fa fa-user-circle-o fa-3x" ></span><br>
                                <p>Login here </p> 

                            </div>

                            <div class="card-body">
                                <form action="LoginServlet" method="post">
                                    <div class="form-group">
                                        <label for="exampleInputEmail1">Email address</label>
                                        <input type="email" name="email" required class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email">
                                        <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
                                    </div>
                                    <div class="form-group">
                                        <label for="exampleInputPassword1">Password</label>
                                        <input type="password" name="password" required class="form-control" id="exampleInputPassword1" placeholder="Password">
                                    </div>
                                    <br>
                                    <div class="container text-center">
                                        <button type="submit" class="btn btn-primary">Submit</button>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>

                </div>
            </div>

        </main>
        <%@include file="Footer.jsp" %>
    </body>
</html>
