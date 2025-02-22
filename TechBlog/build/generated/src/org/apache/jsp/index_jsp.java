package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/normal_navbar.jsp");
    _jspx_dependants.add("/Footer.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			"error_page.jsp", true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/myStyles.css\" type=\"text/css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <script src=\"JS/myJS.js\" type=\"text/javascript\" ></script>\n");
      out.write("        <style>\n");
      out.write("            .banner-background{\n");
      out.write("                clip-path: polygon(0 0, 100% 0, 99% 100%, 88% 82%, 53% 97%, 25% 93%, 0 100%);\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <title>HomePage in JSP</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-dark  primary-background\">\n");
      out.write("    <a class=\"navbar-brand\" href=\"index.jsp\"><span class=\"fa fa-cog fa-spin\"></span>&nbsp;News India</a>\n");
      out.write("    <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("        <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("    </button>\n");
      out.write("\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("        <ul class=\"navbar-nav mr-auto\">\n");
      out.write("            <li class=\"nav-item active\">\n");
      out.write("                <a class=\"nav-link\" href=\"index.jsp\"><span class=\"fa fa-bell-o \"></span>News Update <span class=\"sr-only\">(current)</span></a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item dropdown\">\n");
      out.write("                <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                    <span class=\"fa fa-navicon\"></span>&nbsp;Catagories\n");
      out.write("                </a>\n");
      out.write("                <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("                    <a class=\"dropdown-item\" href=\"#\"><span class=\"fa fa-tag\"></span>&nbsp;State</a>\n");
      out.write("                    <a class=\"dropdown-item\" href=\"#\"><span class=\"fa fa-globe\"></span>&nbsp;International</a>\n");
      out.write("                    <div class=\"dropdown-divider\"></div>\n");
      out.write("                    <a class=\"dropdown-item\" href=\"#\"><span class=\"fa fa-futbol-o\"></span>&nbsp;Sport</a>\n");
      out.write("                </div>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link\" href><span class=\"fa fa-edit\"></span>&nbsp;Contact US</a>\n");
      out.write("            </li>\n");
      out.write("\n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link\" href=\"Login.jsp\"><span class=\"fa fa-edit fa-user-circle-o fa-spin \"></span>&nbsp;Login</a>\n");
      out.write("            </li>\n");
      out.write("            \n");
      out.write("            <li class=\"nav-item\">\n");
      out.write("                <a class=\"nav-link\" href=\"Registration.jsp\"><span class=\"fa fa-edit fa fa-user-plus\"></span>&nbsp;Sign Up</a>\n");
      out.write("            </li>\n");
      out.write("        </ul>\n");
      out.write("        <form class=\"form-inline my-2 my-lg-0\">\n");
      out.write("            <input class=\"form-control mr-sm-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\n");
      out.write("            <button class=\"btn btn-outline-success my-2 my-sm-0 text-white bg-primary\" type=\"submit\"><span class=\"fa fa-search\"></span>&nbsp;</button>\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("</nav>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("    <div class=\"container-fluid m-0 p-0\" >\n");
      out.write("\n");
      out.write("        <div class=\"jumbotron text-white banner-background \" style=\"background: #2196f3;\">\n");
      out.write("\n");
      out.write("            <h3 class=\"display-3  animate__animated animate__backInDown  wow\"   style=\"font-family: impact;\" >UP ! Today</h3>\n");
      out.write("            <h3>News</h3>\n");
      out.write("            <p class=\"animate__animated animate__fadeIn wow\" data-wow-delay=\"500ms\">After multiple reports of bodies of suspected COVID-19 patients being found by the Ganga River in parts of Uttar Pradesh all through last week, police units in different districts across the state have stepped up patrolling by the banks and on the river itself to prevent bodies from being thrown into the river or buried along it.</p>\n");
      out.write("            <p class=\"animate__animated animate__fadeOut wow\" data-wow-delay=\"500ms\">Visuals from eastern UP's Ballia district, where decomposed bodies were found floating in the river last week, showed police boats on the river carrying out patrolling. A separate police team was filmed making announcements asking people not to throw bodies into the river.</p>\n");
      out.write("\n");
      out.write("            <a  href=\"Registration.jsp\" class=\"btn btn-outline-light  btn-lg fa\"><span class=\"fa-user-plus\"></span>&nbsp;Registration</a>\n");
      out.write("            <a href=\"Login.jsp\" class=\"btn btn-outline-light btn-lg fa \"><span class=\"fa-user-circle-o fa-spin fa\"></span>&nbsp;Login</a>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("\n");
      out.write("            <div  class=\"col-md-4\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"card  animate__animated animate__tada  wow\" style=\"width: 18rem;\">\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("                        <h5 class=\"card-title\">Gorkhapur City</h5>\n");
      out.write("                        <p class=\"card-text\">Some quick example text to build on the card title and make up the bulk of the card's content.</p>\n");
      out.write("                        <a href=\"#\" class=\"btn btn-primary text-white fa fa-external-link\">&nbsp;Read more</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div  class=\"col-md-4\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"card animate__animated animate__tada\" style=\"width: 18rem;\">\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("                        <h5 class=\"card-title\">Mahrajganj City</h5>\n");
      out.write("                        <p class=\"card-text\">Some quick example text to build on the card title and make up the bulk of the card's content.</p>\n");
      out.write("                        <a href=\"#\" class=\"btn btn-primary text-white fa fa-external-link\">&nbsp;Read more</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div  class=\"col-md-4\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"card animate__animated animate__tada\" style=\"width: 18rem;\">\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("                        <h5 class=\"card-title\">Kushinagar City</h5>\n");
      out.write("                        <p class=\"card-text\">Some quick example text to build on the card title and make up the bulk of the card's content.</p>\n");
      out.write("                        <a href=\"#\" class=\"btn btn-primary text-white fa fa-external-link\" >&nbsp;Read more</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("         <div class=\"row\">\n");
      out.write("\n");
      out.write("            <div  class=\"col-md-4\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"card animate__animated animate__tada\" style=\"width: 18rem;\">\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("                        <h5 class=\"card-title\">Mau City</h5>\n");
      out.write("                        <p class=\"card-text\">Some quick example text to build on the card title and make up the bulk of the card's content.</p>\n");
      out.write("                        <a href=\"#\" class=\"btn btn-primary text-white fa fa-external-link\"> &nbsp;Read more</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div  class=\"col-md-4\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"card animate__animated animate__tada\" style=\"width: 18rem;\">\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("                        <h5 class=\"card-title\">Gazipur City</h5>\n");
      out.write("                        <p class=\"card-text\">Some quick example text to build on the card title and make up the bulk of the card's content.</p>\n");
      out.write("                        <a href=\"#\" class=\"btn btn-primary text-white fa fa-external-link\"> &nbsp;Read more</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div  class=\"col-md-4\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"card animate__animated animate__tada\" style=\"width: 18rem;\">\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("                        <h5 class=\"card-title\">Varansi City</h5>\n");
      out.write("                        <p class=\"card-text\">Some quick example text to build on the card title and make up the bulk of the card's content.</p>\n");
      out.write("                        <a href=\"#\" class=\"btn btn-primary text-white fa fa-external-link\"> &nbsp;Read more</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/myStyles.css\" type=\"text/css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/owl.theme.default.min.css\">\n");
      out.write("        <link\n");
      out.write("            rel=\"stylesheet\"\n");
      out.write("            href=\"https://cdnjs.cloudflare.com/ajax/libs/animate.css/4.1.1/animate.min.css\"\n");
      out.write("            />\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/owl.carousel.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.6.0.min.js\" integrity=\"sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"JS/myJS.js\" type=\"text/javascript\" ></script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <h1 class=\"text-center py-5 animate__animated animate__tada\" style=\"  font-size: 42px;\n");
      out.write("            background: -webkit-linear-gradient(#ee4, #333);\n");
      out.write("            -webkit-background-clip: text;\n");
      out.write("            -webkit-text-fill-color: transparent; font-family: impact;\" >International Update News</h1><hr>\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"owl-carousel owl-theme\">\n");
      out.write("                <div> \n");
      out.write("\n");
      out.write("                    <div class=\"card text-center\">\n");
      out.write("                        <div class=\"card-body\">\n");
      out.write("\n");
      out.write("                            <img src=\"img/—Pngtree—concept coronavirus vaccine covid-19 bottle_5838340.png\" alt=\"covid vax pic\" class=\"img-fluid rounded-circle mx-auto\" height=\"100%\" width=\"100%\" style=\"max-height: 150px;\"\n");
      out.write("                                 />\n");
      out.write("                            <h3>USA</h3>\n");
      out.write("\n");
      out.write("                            <p>\n");
      out.write("                                The U.S. is a country of 50 states covering a vast swath of North America, with Alaska in the northwest and Hawaii extending the nation’s presence into the Pacific Ocean. Major Atlantic Coast cities are New York, a global finance and culture center, and capital Washington, DC.  \n");
      out.write("                            </p>\n");
      out.write("\n");
      out.write("                            <div class=\"container\">\n");
      out.write("                                <button class=\"btn btn-primary\">\n");
      out.write("                                    Read More..\n");
      out.write("                                </button>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div> \n");
      out.write("\n");
      out.write("                    <div class=\"card text-center\">\n");
      out.write("                        <div class=\"card-body\">\n");
      out.write("\n");
      out.write("                            <img src=\"img/—Pngtree—concept coronavirus vaccine covid-19 bottle_5838340.png\" alt=\"covid vax pic\" class=\"img-fluid rounded-circle mx-auto\" height=\"100%\" width=\"100%\" style=\"max-height: 150px;\"\n");
      out.write("                                 />\n");
      out.write("                            <h3>USA</h3>\n");
      out.write("\n");
      out.write("                            <p>\n");
      out.write("                                The U.S. is a country of 50 states covering a vast swath of North America, with Alaska in the northwest and Hawaii extending the nation’s presence into the Pacific Ocean. Major Atlantic Coast cities are New York, a global finance and culture center, and capital Washington, DC.  \n");
      out.write("                            </p>\n");
      out.write("\n");
      out.write("                            <div class=\"container\">\n");
      out.write("                                <button class=\"btn btn-primary\">\n");
      out.write("                                    Read More..\n");
      out.write("                                </button>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div> \n");
      out.write("\n");
      out.write("                    <div class=\"card text-center\">\n");
      out.write("                        <div class=\"card-body\">\n");
      out.write("\n");
      out.write("                            <img src=\"img/—Pngtree—concept coronavirus vaccine covid-19 bottle_5838340.png\" alt=\"covid vax pic\" class=\"img-fluid rounded-circle mx-auto\" height=\"100%\" width=\"100%\" style=\"max-height: 150px;\"\n");
      out.write("                                 />\n");
      out.write("                            <h3>USA</h3>\n");
      out.write("\n");
      out.write("                            <p>\n");
      out.write("                                The U.S. is a country of 50 states covering a vast swath of North America, with Alaska in the northwest and Hawaii extending the nation’s presence into the Pacific Ocean. Major Atlantic Coast cities are New York, a global finance and culture center, and capital Washington, DC.  \n");
      out.write("                            </p>\n");
      out.write("\n");
      out.write("                            <div class=\"container\">\n");
      out.write("                                <button class=\"btn btn-primary\">\n");
      out.write("                                    Read More..\n");
      out.write("                                </button>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div>\n");
      out.write("\n");
      out.write("                    <div class=\"card text-center\">\n");
      out.write("                        <div class=\"card-body\">\n");
      out.write("\n");
      out.write("                            <img src=\"img/—Pngtree—concept coronavirus vaccine covid-19 bottle_5838340.png\" alt=\"covid vax pic\" class=\"img-fluid rounded-circle mx-auto\" height=\"100%\" width=\"100%\" style=\"max-height: 150px;\"\n");
      out.write("                                 />\n");
      out.write("                            <h3>USA</h3>\n");
      out.write("\n");
      out.write("                            <p>\n");
      out.write("                                The U.S. is a country of 50 states covering a vast swath of North America, with Alaska in the northwest and Hawaii extending the nation’s presence into the Pacific Ocean. Major Atlantic Coast cities are New York, a global finance and culture center, and capital Washington, DC.  \n");
      out.write("                            </p>\n");
      out.write("\n");
      out.write("                            <div class=\"container\">\n");
      out.write("                                <button class=\"btn btn-primary\">\n");
      out.write("                                    Read More..\n");
      out.write("                                </button>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div>\n");
      out.write("\n");
      out.write("                    <div class=\"card text-center\">\n");
      out.write("                        <div class=\"card-body\">\n");
      out.write("\n");
      out.write("                            <img src=\"img/—Pngtree—concept coronavirus vaccine covid-19 bottle_5838340.png\" alt=\"covid vax pic\" class=\"img-fluid rounded-circle mx-auto\" height=\"100%\" width=\"100%\" style=\"max-height: 150px;\"\n");
      out.write("                                 />\n");
      out.write("                            <h3>USA</h3>\n");
      out.write("\n");
      out.write("                            <p>\n");
      out.write("                                The U.S. is a country of 50 states covering a vast swath of North America, with Alaska in the northwest and Hawaii extending the nation’s presence into the Pacific Ocean. Major Atlantic Coast cities are New York, a global finance and culture center, and capital Washington, DC.  \n");
      out.write("                            </p>\n");
      out.write("\n");
      out.write("                            <div class=\"container\">\n");
      out.write("                                <button class=\"btn btn-primary\">\n");
      out.write("                                    Read More..\n");
      out.write("                                </button>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div> \n");
      out.write("\n");
      out.write("                    <div class=\"card text-center\">\n");
      out.write("                        <div class=\"card-body\">\n");
      out.write("\n");
      out.write("                            <img src=\"img/—Pngtree—concept coronavirus vaccine covid-19 bottle_5838340.png\" alt=\"covid vax pic\" class=\"img-fluid rounded-circle mx-auto\" height=\"100%\" width=\"100%\" style=\"max-height: 150px;\"\n");
      out.write("                                 />\n");
      out.write("                            <h3>USA</h3>\n");
      out.write("\n");
      out.write("                            <p>\n");
      out.write("                                The U.S. is a country of 50 states covering a vast swath of North America, with Alaska in the northwest and Hawaii extending the nation’s presence into the Pacific Ocean. Major Atlantic Coast cities are New York, a global finance and culture center, and capital Washington, DC.  \n");
      out.write("                            </p>\n");
      out.write("\n");
      out.write("                            <div class=\"container\">\n");
      out.write("                                <button class=\"btn btn-primary\">\n");
      out.write("                                    Read More..\n");
      out.write("                                </button>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div> \n");
      out.write("\n");
      out.write("                    <div class=\"card text-center\">\n");
      out.write("                        <div class=\"card-body\">\n");
      out.write("\n");
      out.write("                            <img src=\"img/—Pngtree—concept coronavirus vaccine covid-19 bottle_5838340.png\" alt=\"covid vax pic\" class=\"img-fluid rounded-circle mx-auto\" height=\"100%\" width=\"100%\" style=\"max-height: 150px;\"\n");
      out.write("                                 />\n");
      out.write("                            <h3>USA</h3>\n");
      out.write("\n");
      out.write("                            <p>\n");
      out.write("                                The U.S. is a country of 50 states covering a vast swath of North America, with Alaska in the northwest and Hawaii extending the nation’s presence into the Pacific Ocean. Major Atlantic Coast cities are New York, a global finance and culture center, and capital Washington, DC.  \n");
      out.write("                            </p>\n");
      out.write("\n");
      out.write("                            <div class=\"container\">\n");
      out.write("                                <button class=\"btn btn-primary\">\n");
      out.write("                                    Read More..\n");
      out.write("                                </button>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <script src=\"JS/owl.carousel.min.js\"></script>\n");
      out.write("        <script src=\"JS/wow.min.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            new WOW().init();\n");
      out.write("        </script>\n");
      out.write("        <script>\n");
      out.write("            $('.owl-carousel').owlCarousel({\n");
      out.write("                autoplay: true,\n");
      out.write("                margin: 10,\n");
      out.write("                responsiveClass: true,\n");
      out.write("                responsive: {\n");
      out.write("                    0: {\n");
      out.write("                        items: 1,\n");
      out.write("                        nav: true\n");
      out.write("                    },\n");
      out.write("                    600: {\n");
      out.write("                        items: 3,\n");
      out.write("                        nav: false\n");
      out.write("                    },\n");
      out.write("                    1000: {\n");
      out.write("                        items: 3,\n");
      out.write("                        nav: true,\n");
      out.write("                        loop: true\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("            })\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!--javascript--> \n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.6.0.min.js\" integrity=\"sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=\" crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("<script>//\n");
      out.write("//        $(document).ready(function (){\n");
      out.write("//            setTimeout(alert(\"welcome\"),3000);\n");
      out.write("////            alert(\"Documents Loaded\");\n");
      out.write("//        })\n");
      out.write("</script>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
