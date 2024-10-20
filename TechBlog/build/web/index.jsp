
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page errorPage="error_page.jsp"  %>
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
                clip-path: polygon(0 0, 100% 0, 99% 100%, 88% 82%, 53% 97%, 25% 93%, 0 100%);
            }
        </style>
        <title>HomePage in JSP</title>
    </head>
    <body>
        <%@include  file="normal_navbar.jsp" %>
    </body>

    <div class="container-fluid m-0 p-0" >

        <div class="jumbotron text-white banner-background " style="background: #2196f3;">

            <h3 class="display-3  animate__animated animate__backInDown  wow"   style="font-family: impact;" >UP ! Today</h3>
            <h3>News</h3>
            <p class="animate__animated animate__fadeIn wow" data-wow-delay="500ms">After multiple reports of bodies of suspected COVID-19 patients being found by the Ganga River in parts of Uttar Pradesh all through last week, police units in different districts across the state have stepped up patrolling by the banks and on the river itself to prevent bodies from being thrown into the river or buried along it.</p>
            <p class="animate__animated animate__fadeOut wow" data-wow-delay="500ms">Visuals from eastern UP's Ballia district, where decomposed bodies were found floating in the river last week, showed police boats on the river carrying out patrolling. A separate police team was filmed making announcements asking people not to throw bodies into the river.</p>

            <a  href="Registration.jsp" class="btn btn-outline-light  btn-lg fa"><span class="fa-user-plus"></span>&nbsp;Registration</a>
            <a href="Login.jsp" class="btn btn-outline-light btn-lg fa "><span class="fa-user-circle-o fa-spin fa"></span>&nbsp;Login</a>
        </div>

    </div>

    <div class="container">
        <div class="row">

            <div  class="col-md-4">


                <div class="card  animate__animated animate__tada  wow" style="width: 18rem;">
                    <div class="card-body">
                        <h5 class="card-title">Gorkhapur City</h5>
                        <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                        <a href="#" class="btn btn-primary text-white fa fa-external-link">&nbsp;Read more</a>
                    </div>
                </div>

            </div>


            <div  class="col-md-4">


                <div class="card animate__animated animate__tada" style="width: 18rem;">
                    <div class="card-body">
                        <h5 class="card-title">Mahrajganj City</h5>
                        <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                        <a href="#" class="btn btn-primary text-white fa fa-external-link">&nbsp;Read more</a>
                    </div>
                </div>

            </div>


            <div  class="col-md-4">


                <div class="card animate__animated animate__tada" style="width: 18rem;">
                    <div class="card-body">
                        <h5 class="card-title">Kushinagar City</h5>
                        <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                        <a href="#" class="btn btn-primary text-white fa fa-external-link" >&nbsp;Read more</a>
                    </div>
                </div>

            </div>
        </div>
         <div class="row">

            <div  class="col-md-4">


                <div class="card animate__animated animate__tada" style="width: 18rem;">
                    <div class="card-body">
                        <h5 class="card-title">Mau City</h5>
                        <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                        <a href="#" class="btn btn-primary text-white fa fa-external-link"> &nbsp;Read more</a>
                    </div>
                </div>

            </div>


            <div  class="col-md-4">


                <div class="card animate__animated animate__tada" style="width: 18rem;">
                    <div class="card-body">
                        <h5 class="card-title">Gazipur City</h5>
                        <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                        <a href="#" class="btn btn-primary text-white fa fa-external-link"> &nbsp;Read more</a>
                    </div>
                </div>

            </div>


            <div  class="col-md-4">


                <div class="card animate__animated animate__tada" style="width: 18rem;">
                    <div class="card-body">
                        <h5 class="card-title">Varansi City</h5>
                        <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                        <a href="#" class="btn btn-primary text-white fa fa-external-link"> &nbsp;Read more</a>
                    </div>
                </div>

            </div>
        </div>

    </div>
</div>
<%@include  file="Footer.jsp" %>


<!--javascript--> 
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
<script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>

<script>//
//        $(document).ready(function (){
//            setTimeout(alert("welcome"),3000);
////            alert("Documents Loaded");
//        })
</script>
</html>
