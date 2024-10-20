<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
        </style>
        <title>Registration</title>
    </head>
    <body>

        <%@include  file="normal_navbar.jsp" %>
        <main class="primary-background p-5 banner-background">


            <div class="container animate__animated animate__bounceInDown" style="cursor: pointer;">

                <div class=" col-md-6 offset-md-4">

                    <div class="card">

                        <div class="card-header text-center text-primary"> 
                            <span class="fa fa-3x fa fa-user-plus"></span><br>
                            <p>Register here</p>
                        </div>

                        <div class="card-body">
                            <form id="reg-form" action="RegisterServlet" method="POST">

                                <div class="form-group">
                                    <label for="usrName">User Name</label>
                                    <input type="text" name="user_name" class="form-control" id="userName" aria-describedby="emailHelp" placeholder="Enter Name">
                                </div>

                                <div class="form-group">
                                    <label for="exampleInputEmail1">Email address</label>
                                    <input type="email" name="user_email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter email">
                                    <small id="emailHelp" class="form-text text-muted">We'll never share your email with anyone else.</small>
                                </div>
                                <div class="form-group">
                                    <label for="exampleInputPassword1">Password</label>
                                    <input type="password" name="user_password" class="form-control" id="exampleInputPassword1" placeholder="Password">
                                </div>
                                <div class="form-group">
                                    <label for="userGender">Select Gender</label><br>
                                    <input type="radio"  name="gender"  value="male">Male&nbsp;&nbsp;&nbsp;
                                    <input type="radio"  name="gender"  value="female" >Female
                                </div>

                                <div class="form-group">
                                    <textarea name="about" class="form-control" cols="30" rows="10" placeholder="Enter Something about..."></textarea>


                                </div>

                                <div class="form-check">
                                    <input type="checkbox" name="check" value="check" class="form-check-input" id="exampleCheck1">
                                    <label class="form-check-label"  for="exampleCheck1">Agree terms and conditons</label>
                                </div><br>
                                <div class="container text-center" style="display: none;">
                                    <span class="fa fa-refresh fa-spin fa-4x"></span>
                                    <h3>Please wait...</h3>
                                </div>
                                <button type="submit" class="btn btn-primary" id="sumbimt-btn">Submit</button>
                            </form>


                        </div>
                        <div class="card-footer">


                        </div>

                    </div>

                </div>
        </main>

        <%@include file="Footer.jsp" %>
        <script>
            $(document).ready(function () {
                console.log("loaded........")

                $('#reg-form').on('submit', function (event) {
                    event.preventDefault();


                
                     
                    let form = new FormData(this);
                         
                    $("#sumbimt-btn").hide();
                    $("#loader").show();
                    //send register servlet:
                    $.ajax({
                        url: "RegisterServlet",
                        type: 'POST',
                        data: form,
                        success: function (data, textStatus, jqXHR) {
                            console.log(data)

                            $("#sumbimt-btn").show();
                            $("#loader").hide();
                            if(data.trim() === 'done'){
                            swal({
                                title: "Successfully !",
                                text: "Thanks!",
                            });
                        }
                        else{
                            swal({
                                title: "Error !",
                                text: "Please Try Again ",
                            });
                        }

                        },
                        error: function (jqXHR, textStatus, errorThrown) {
                            console.log(jqXHR)
                        },
                        processData: false,
                        contentType: false

                    });

                });


            });



        </script>

    </body>

</html>
