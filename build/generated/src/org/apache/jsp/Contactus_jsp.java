package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dao.Contactdao;
import dao.Contact;

public final class Contactus_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\t<head>\n");
      out.write("\t\t<meta charset=\"UTF-8\">\n");
      out.write("\t\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0,maximum-scale=1\">\n");
      out.write("\t\t\n");
      out.write("\t\t<title>Movie Review | Contact</title>\n");
      out.write("\n");
      out.write("\t\t<!-- Loading third party fonts -->\n");
      out.write("\t\t<link href=\"http://fonts.googleapis.com/css?family=Roboto:300,400,700|\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("\t\t<link href=\"fonts/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("\n");
      out.write("\t\t<!-- Loading main css file -->\n");
      out.write("\t\t<link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("\t\t\n");
      out.write("\t\t<!--[if lt IE 9]>\n");
      out.write("\t\t<script src=\"js/ie-support/html5.js\"></script>\n");
      out.write("\t\t<script src=\"js/ie-support/respond.js\"></script>\n");
      out.write("\t\t<![endif]-->\n");
      out.write("\n");
      out.write("\t</head>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t<body>\n");
      out.write("\t\t\n");
      out.write("\n");
      out.write("\t\t<div id=\"site-content\">\n");
      out.write("\t\t\t<header class=\"site-header\">\n");
      out.write("\t\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t\t<a href=\"i.html\" id=\"branding\">\n");
      out.write("\t\t\t\t\t\t<img src=\"images/logo.png\" alt=\"\" class=\"logo\">\n");
      out.write("\t\t\t\t\t\t<div class=\"logo-copy\">\n");
      out.write("\t\t\t\t\t\t\t<h1 class=\"site-title\">Company Name</h1>\n");
      out.write("\t\t\t\t\t\t\t<small class=\"site-description\">Tagline goes here</small>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</a> <!-- #branding -->\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"main-navigation\">\n");
      out.write("\t\t\t\t\t\t<button type=\"button\" class=\"menu-toggle\"><i class=\"fa fa-bars\"></i></button>\n");
      out.write("\t\t\t\t\t\t<ul class=\"menu\">\n");
      out.write("\t\t\t\t\t\t\t<li class=\"menu-item\"><a href=\"i.html\">Home</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li class=\"menu-item\"><a href=\"about.html\">About</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li class=\"menu-item\"><a href=\"review.html\">Movie reviews</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li class=\"menu-item\"><a href=\"joinus.html\">Join us</a></li>\n");
      out.write("\t\t\t\t\t\t\t<li class=\"menu-item current-menu-item\"><a href=\"contact.html\">Contact</a></li>\n");
      out.write("\t\t\t\t\t\t</ul> <!-- .menu -->\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<form action=\"Contactus.jsp\" method=\"post\" autocomplete=\"off\">\n");
      out.write("\t\t\t\t\t\t\t<input type=\"text\" placeholder=\"Search...\">\n");
      out.write("\t\t\t\t\t\t\t<button><i class=\"fa fa-search\"></i></button>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</div> <!-- .main-navigation -->\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"mobile-navigation\"></div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</header>\n");
      out.write("\t\t\t<main class=\"main-content\">\n");
      out.write("\t\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t\t<div class=\"page\">\n");
      out.write("\t\t\t\t\t\t<div class=\"breadcrumbs\">\n");
      out.write("\t\t\t\t\t\t\t<a href=\"i.html\">Home</a>\n");
      out.write("\t\t\t\t\t\t\t<span>Contact</span>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<div class=\"content\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-4\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<h2>Contact</h2>\n");
      out.write("\t\t\t\t\t\t\t\t\t<ul class=\"contact-detail\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<img src=\"images/icon-contact-map.png\" alt=\"#\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<address><span>Company name. INC</span> <br>550 Avenue Street, New york</address>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<img src=\"images/icon-contact-phone.png\" alt=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"tel:1590912831\">+1 590 912 831</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<li>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<img src=\"images/icon-contact-message.png\" alt=\"\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<a href=\"mailto:contact@companyname.com\">contact@companyname.com</a>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"contact-form\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"text\" name=\"name\" class=\"name\" placeholder=\"name...\">\n");
      out.write("                                                                                <input type=\"text\" name=\"email\" class=\"email\" placeholder=\"email...\">\n");
      out.write("                                                                                <input type=\"text\" name=\"website\" class=\"website\" placeholder=\"website...\">\n");
      out.write("                                                                                <textarea name=\"message\" class=\"message\" placeholder=\"message...\"></textarea>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<input type=\"submit\" value=\"send message\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"col-md-7 col-md-offset-1\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"map\"></div>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("                                    </form>\n");
      out.write("\t\t\t\t</div> <!-- .container -->\n");
      out.write("\t\t\t</main>\n");
      out.write("                    ");
 
        String name=null; 
       String email=null;
              String website=null;
                     String message=null;
        name=request.getParameter("name");
                email=request.getParameter("email");
                        website=request.getParameter("website");
        message=request.getParameter("message");
      if((email!=null)&&(message!=null))
     {  
            
         Contact c=new Contact();
         Contactdao cd=new Contactdao();
         c.setName(name);
         c.setEmail(email);
         c.setWebsite(website);
         c.setMessage(message);
         if(cd.insertContact(c))
          out.println("Record inserted");
     }   
     
      out.write("\n");
      out.write("\n");
      out.write("\t\t\t<footer class=\"site-footer\">\n");
      out.write("\t\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-2\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"widget\">\n");
      out.write("\t\t\t\t\t\t\t\t<h3 class=\"widget-title\">About Us</h3>\n");
      out.write("\t\t\t\t\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Quia tempore vitae mollitia nesciunt saepe cupiditate</p>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-2\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"widget\">\n");
      out.write("\t\t\t\t\t\t\t\t<h3 class=\"widget-title\">Recent Review</h3>\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"no-bullet\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>Lorem ipsum dolor</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>Sit amet consecture</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>Dolorem respequem</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>Invenore veritae</li>\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-2\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"widget\">\n");
      out.write("\t\t\t\t\t\t\t\t<h3 class=\"widget-title\">Help Center</h3>\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"no-bullet\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>Lorem ipsum dolor</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>Sit amet consecture</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>Dolorem respequem</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>Invenore veritae</li>\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-2\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"widget\">\n");
      out.write("\t\t\t\t\t\t\t\t<h3 class=\"widget-title\">Join Us</h3>\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"no-bullet\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>Lorem ipsum dolor</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>Sit amet consecture</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>Dolorem respequem</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>Invenore veritae</li>\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-2\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"widget\">\n");
      out.write("\t\t\t\t\t\t\t\t<h3 class=\"widget-title\">Social Media</h3>\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"no-bullet\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>Facebook</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>Twitter</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>Google+</li>\n");
      out.write("\t\t\t\t\t\t\t\t\t<li>Pinterest</li>\n");
      out.write("\t\t\t\t\t\t\t\t</ul>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-2\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"widget\">\n");
      out.write("\t\t\t\t\t\t\t\t<h3 class=\"widget-title\">Newsletter</h3>\n");
      out.write("\t\t\t\t\t\t\t\t<form action=\"#\" class=\"subscribe-form\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"text\" placeholder=\"Email Address\">\n");
      out.write("\t\t\t\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div> <!-- .row -->\n");
      out.write("\n");
      out.write("\t\t\t\t\t<div class=\"colophon\">Copyright 2014 Company name, Designed by Themezy. All rights reserved</div>\n");
      out.write("\t\t\t\t</div> <!-- .container -->\n");
      out.write("\n");
      out.write("\t\t\t</footer>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<!-- Default snippet for navigation -->\n");
      out.write("\t\t\n");
      out.write("\n");
      out.write("\n");
      out.write("\t\t<script src=\"js/jquery-1.11.1.min.js\"></script>\n");
      out.write("\t\t<script src=\"http://maps.google.com/maps/api/js?sensor=false&amp;language=en\"></script>\n");
      out.write("\t\t<script src=\"js/plugins.js\"></script>\n");
      out.write("\t\t<script src=\"js/app.js\"></script>\n");
      out.write("\t\t\n");
      out.write("\t</body>\n");
      out.write("\n");
      out.write("</html>");
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
