package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dao.Userdao;
import dao.Login;
import dao.User;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!--[if lt IE 7 ]> <html lang=\"en\" class=\"no-js ie6 lt8\"> <![endif]-->\n");
      out.write("<!--[if IE 7 ]>    <html lang=\"en\" class=\"no-js ie7 lt8\"> <![endif]-->\n");
      out.write("<!--[if IE 8 ]>    <html lang=\"en\" class=\"no-js ie8 lt8\"> <![endif]-->\n");
      out.write("<!--[if IE 9 ]>    <html lang=\"en\" class=\"no-js ie9\"> <![endif]-->\n");
      out.write("<!--[if (gt IE 9)|!(IE)]><!--> <html lang=\"en\" class=\"no-js\"> <!--<![endif]-->\n");
      out.write("    <head>\n");
      out.write("        <script language = \"javascript\">\n");
      out.write("          function validatelogin()\n");
      out.write("          {\n");
      out.write("            var user_name,user_password;\n");
      out.write("            user_name=document.getElementById(\"username\").value;\n");
      out.write("            user_password=document.getElementById(\"password\").value;\n");
      out.write("            \n");
      out.write("            if(user_name.length>20)\n");
      out.write("            {    \n");
      out.write("              alert(\"Username can not be more than 20 characters.\");\n");
      out.write("              document.getElementById(\"username\").focus();\n");
      out.write("              return false;\n");
      out.write("            }\n");
      out.write("            if(user_password.length>20)\n");
      out.write("            {    \n");
      out.write("              alert(\"Password can not be more than 20 characters.\");\n");
      out.write("              document.getElementById(\"password\").focus();\n");
      out.write("              return false;\n");
      out.write("            }\n");
      out.write("          }\n");
      out.write("          function validatesignup()\n");
      out.write("          {\n");
      out.write("            var user_name,user_password,user_cpassword,user_email;\n");
      out.write("            user_name=document.getElementById(\"usernamesignup\").value;\n");
      out.write("            user_password=document.getElementById(\"passwordsignup\").value;\n");
      out.write("            user_cpassword=document.getElementById(\"passwordsignup_confirm\").value;\n");
      out.write("            user_email=document.getElementById(\"emailsignup\").value;\n");
      out.write("            \n");
      out.write("            if(user_name.length>20)\n");
      out.write("            {    \n");
      out.write("              alert(\"Username can not be more than 20 characters.\");\n");
      out.write("              document.getElementById(\"usernamesignup\").focus();\n");
      out.write("              return false;\n");
      out.write("            }\n");
      out.write("            if(user_password.length>20)\n");
      out.write("            {    \n");
      out.write("              alert(\"Password can not be more than 20 characters.\");\n");
      out.write("              document.getElementById(\"passwordsignup\").focus();\n");
      out.write("              return false;\n");
      out.write("            }\n");
      out.write("            if(user_password!=user_cpassword)\n");
      out.write("            {    \n");
      out.write("              alert(\"Please enter same passwords in both fields.\");\n");
      out.write("              document.getElementById(\"passwordsignup_confirm\").focus();\n");
      out.write("              document.getElementById(\"passwordsignup_confirm\").select();\n");
      out.write("              return false;\n");
      out.write("            }\n");
      out.write("          }\n");
      out.write("        </script>\n");
      out.write("        <meta charset=\"UTF-8\" />\n");
      out.write("        <!-- <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">  -->\n");
      out.write("        <title>Welcome to watch-it</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"> \n");
      out.write("        <meta name=\"description\" content=\"Login and Registration\" />\n");
      out.write("        <meta name=\"keywords\" content=\"html5, css3, form, switch, animation, :target, pseudo-class\" />\n");
      out.write("        <meta name=\"author\" content=\"Codrops\" />\n");
      out.write("        <link rel=\"shortcut icon\" href=\"../favicon.ico\"> \n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/demo.css\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\" />\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/animate-custom.css\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <!-- Codrops top bar -->\n");
      out.write("            <div class=\"codrops-top\">\n");
      out.write("                <a href=\"\">\n");
      out.write("                </a>\n");
      out.write("                <span class=\"right\">\n");
      out.write("                    <a href=\" http://tympanus.net/codrops/2012/03/27/login-and-registration-form-with-html5-and-css3/\">\n");
      out.write("                    </a>\n");
      out.write("                </span>\n");
      out.write("                <div class=\"clr\"></div>\n");
      out.write("            </div><!--/ Codrops top bar -->\n");
      out.write("            <header>\n");
      out.write("                <h1><span></span></h1>\n");
      out.write("\t\t\t\t<br>\n");
      out.write("                <h1><span></span></h1>\n");
      out.write("\t\t\t\t<br>\n");
      out.write("\t\t\t\t<h1><span></span></h1>\n");
      out.write("\t\t\t\t<nav class=\"codrops-demos\">\t\n");
      out.write("\t\t\t\t</nav>\n");
      out.write("            </header>\n");
      out.write("            <section>\t\t\t\t\n");
      out.write("                <div id=\"container_demo\" >\n");
      out.write("                    <!-- hidden anchor to stop jump http://www.css3create.com/Astuce-Empecher-le-scroll-avec-l-utilisation-de-target#wrap4  -->\n");
      out.write("                    <a class=\"hiddenanchor\" id=\"toregister\"></a>\n");
      out.write("                    <a class=\"hiddenanchor\" id=\"tologin\"></a>\n");
      out.write("                    <div id=\"wrapper\">\n");
      out.write("                        <div id=\"login\" class=\"animate form\">\n");
      out.write("                            <form  action=\"Home.html\" method=\"post\" autocomplete=\"off\"> \n");
      out.write("                                <h1>Log in</h1> \n");
      out.write("                                <p> \n");
      out.write("                                    <label for=\"username\" class=\"uname\" data-icon=\"u\"> Username </label>\n");
      out.write("                                    <input id=\"username\" name=\"username\" required=\"required\" maxlength=\"30\" type=\"text\" placeholder=\"myusername\"/>\n");
      out.write("                                </p>\n");
      out.write("                                <p> \n");
      out.write("                                    <label for=\"password\" class=\"youpasswd\" data-icon=\"p\"> Password </label>\n");
      out.write("                                    <input id=\"password\" name=\"password\" required=\"required\" maxlength=\"30\" type=\"password\" placeholder=\"eg. X8df!90EO\" /> \n");
      out.write("                                </p>\n");
      out.write("                                <p class=\"login button\"> \n");
      out.write("                                    <input type=\"submit\" value=\"Login\" onclick=\"return validatelogin();\"/> \n");
      out.write("\t\t\t\t\t\t\t\t</p>\n");
      out.write("                                <p class=\"change_link\">\n");
      out.write("\t\t\t\t\t\t\t\t\tNot a member yet ?\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#toregister\" class=\"to_register\">Join us</a>\n");
      out.write("\t\t\t\t\t\t\t\t</p>\n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                            </form>\n");
      out.write("                            ");
 
 String uname=null,upass=null;
         uname=request.getParameter("username");
         upass=request.getParameter("password");
       if(uname!=null && upass!=null)
    {        
          Login l =new Login();
         if(l.checkLogin(uname, upass)) 
        { 
          session.setAttribute("name", uname); 
          session.setAttribute("pass", upass);
          response.sendRedirect("index.jsp");                      
          
        }   
         else
          out.println("<div align=center>Invalid user name or password</div>");  
     }

      out.write('\n');
      out.write(' ');
 
        String name=null; 
       String pass=null;
        name=request.getParameter("usernamesignup");
        pass=request.getParameter("passwordsignup");
      if((name!=null)&&(pass!=null))
     {  
            
         User u=new User();
         Userdao ud=new Userdao();
         u.setName(name);
         u.setPass(pass);
         if(ud.insertUser(u))
          out.println("Record inserted");
     }   
     
      out.write("\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div id=\"register\" class=\"animate form\">\n");
      out.write("                            <form  action=\"index.jsp#tologin\" method=\"post\" autocomplete=\"on\"> \n");
      out.write("                                <h1> Sign up </h1> \n");
      out.write("                                <p> \n");
      out.write("                                    <label for=\"usernamesignup\" class=\"uname\" data-icon=\"u\">Your Username</label>\n");
      out.write("                                    <input id=\"usernamesignup\" name=\"usernamesignup\" required=\"required\" maxlength=\"30\" type=\"text\" placeholder=\"mysuperusername690\" />\n");
      out.write("                                </p>\n");
      out.write("                                <p> \n");
      out.write("                                    <label for=\"emailsignup\" class=\"youmail\" data-icon=\"e\" > Your Email</label>\n");
      out.write("                                    <input id=\"emailsignup\" name=\"emailsignup\" required=\"required\" maxlength=\"30\" type=\"email\" placeholder=\"mysupermail@mail.com\"/> \n");
      out.write("                                </p>\n");
      out.write("                                <p> \n");
      out.write("                                    <label for=\"passwordsignup\" class=\"youpasswd\" data-icon=\"p\">Your Password </label>\n");
      out.write("                                    <input id=\"passwordsignup\" name=\"passwordsignup\" required=\"required\" maxlength=\"30\" type=\"password\" placeholder=\"eg. X8df!90EO\"/>\n");
      out.write("                                </p>\n");
      out.write("                                <p> \n");
      out.write("                                    <label for=\"passwordsignup_confirm\" class=\"youpasswd\" data-icon=\"p\">Please Confirm Your Password </label>\n");
      out.write("                                    <input id=\"passwordsignup_confirm\" name=\"passwordsignup_confirm\" required=\"required\" maxlength=\"30\" type=\"password\" placeholder=\"eg. X8df!90EO\"/>\n");
      out.write("                                </p>\n");
      out.write("                                <p class=\"signin button\"> \n");
      out.write("\t\t\t\t\t\t\t\t\t<input type=\"submit\" value=\"Sign up\" onclick=\"return validatesignup();\"/> \n");
      out.write("\t\t\t\t\t\t\t\t</p>\n");
      out.write("                                <p class=\"change_link\">  \n");
      out.write("\t\t\t\t\t\t\t\t\tAlready a member ?\n");
      out.write("\t\t\t\t\t\t\t\t\t<a href=\"#tologin\" class=\"to_register\"> Go and log in </a>\n");
      out.write("\t\t\t\t\t\t\t\t</p>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("                    </div>\n");
      out.write("                </div>  \n");
      out.write("            </section>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
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
