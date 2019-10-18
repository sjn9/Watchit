<%@page import="dao.Userdao"%>
<%@page import="dao.Login"%>
<%@page import="dao.User"%>
<%@page  session="true"%>

<!DOCTYPE html>
<!--[if lt IE 7 ]> <html lang="en" class="no-js ie6 lt8"> <![endif]-->
<!--[if IE 7 ]>    <html lang="en" class="no-js ie7 lt8"> <![endif]-->
<!--[if IE 8 ]>    <html lang="en" class="no-js ie8 lt8"> <![endif]-->
<!--[if IE 9 ]>    <html lang="en" class="no-js ie9"> <![endif]-->
<!--[if (gt IE 9)|!(IE)]><!--> <html lang="en" class="no-js"> <!--<![endif]-->
    <head>
        <script language = "javascript">
          function validatelogin()
          {
            var user_name,user_password;
            user_name=document.getElementById("username").value;
            user_password=document.getElementById("password").value;
            
            if(user_name.length>20)
            {    
              alert("Username can not be more than 20 characters.");
              document.getElementById("username").focus();
              return false;
            }
            if(user_password.length>20)
            {    
              alert("Password can not be more than 20 characters.");
              document.getElementById("password").focus();
              return false;
            }
          }
          function validatesignup()
          {
            var user_name,user_password,user_cpassword,user_email;
            user_name=document.getElementById("usernamesignup").value;
            user_password=document.getElementById("passwordsignup").value;
            user_cpassword=document.getElementById("passwordsignup_confirm").value;
            user_email=document.getElementById("emailsignup").value;
            
            if(user_name.length>20)
            {    
              alert("Username can not be more than 20 characters.");
              document.getElementById("usernamesignup").focus();
              return false;
            }
            if(user_password.length>20)
            {    
              alert("Password can not be more than 20 characters.");
              document.getElementById("passwordsignup").focus();
              return false;
            }
            if(user_password!=user_cpassword)
            {    
              alert("Please enter same passwords in both fields.");
              document.getElementById("passwordsignup_confirm").focus();
              document.getElementById("passwordsignup_confirm").select();
              return false;
            }
          }
        </script>
        <meta charset="UTF-8" />
        <!-- <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">  -->
        <title>Welcome to watch-it</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0"> 
        <meta name="description" content="Login and Registration" />
        <meta name="keywords" content="html5, css3, form, switch, animation, :target, pseudo-class" />
        <meta name="author" content="Codrops" />
        <link rel="shortcut icon" href="../favicon.ico"> 
        <link rel="stylesheet" type="text/css" href="css/demo.css" />
        <link rel="stylesheet" type="text/css" href="css/style.css" />
		<link rel="stylesheet" type="text/css" href="css/animate-custom.css" />
    </head>
    <body>
        <div class="container">
            <!-- Codrops top bar -->
            <div class="codrops-top">
                <a href="">
                </a>
                <span class="right">
                    <a href=" http://tympanus.net/codrops/2012/03/27/login-and-registration-form-with-html5-and-css3/">
                    </a>
                </span>
                <div class="clr"></div>
            </div><!--/ Codrops top bar -->
            <header>
                <h1><span></span></h1>
				<br>
                <h1><span></span></h1>
				<br>
				<h1><span></span></h1>
				<nav class="codrops-demos">	
				</nav>
            </header>
            <section>				
                <div id="container_demo" >
                    <!-- hidden anchor to stop jump http://www.css3create.com/Astuce-Empecher-le-scroll-avec-l-utilisation-de-target#wrap4  -->
                    <a class="hiddenanchor" id="toregister"></a>
                    <a class="hiddenanchor" id="tologin"></a>
                    <div id="wrapper">
                        <div id="login" class="animate form">
                            <form  action="Home.html" method="post" autocomplete="off"> 
                                <h1>Log in</h1> 
                                <p> 
                                    <label for="username" class="uname" data-icon="u"> Username </label>
                                    <input id="username" name="username" required="required" maxlength="30" type="text" placeholder="myusername"/>
                                </p>
                                <p> 
                                    <label for="password" class="youpasswd" data-icon="p"> Password </label>
                                    <input id="password" name="password" required="required" maxlength="30" type="password" placeholder="eg. X8df!90EO" /> 
                                </p>
                                <p class="login button"> 
                                    <input type="submit" value="Login" onclick="return validatelogin();"/> 
								</p>
                                <p class="change_link">
									Not a member yet ?
									<a href="#toregister" class="to_register">Join us</a>
								</p>
                            
                            
                            </form>
                            <% 
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
%>
 <% 
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
     %>

                        </div>

                        <div id="register" class="animate form">
                            <form  action="index.jsp#tologin" method="post" autocomplete="on"> 
                                <h1> Sign up </h1> 
                                <p> 
                                    <label for="usernamesignup" class="uname" data-icon="u">Your Username</label>
                                    <input id="usernamesignup" name="usernamesignup" required="required" maxlength="30" type="text" placeholder="mysuperusername690" />
                                </p>
                                <p> 
                                    <label for="emailsignup" class="youmail" data-icon="e" > Your Email</label>
                                    <input id="emailsignup" name="emailsignup" required="required" maxlength="30" type="email" placeholder="mysupermail@mail.com"/> 
                                </p>
                                <p> 
                                    <label for="passwordsignup" class="youpasswd" data-icon="p">Your Password </label>
                                    <input id="passwordsignup" name="passwordsignup" required="required" maxlength="30" type="password" placeholder="eg. X8df!90EO"/>
                                </p>
                                <p> 
                                    <label for="passwordsignup_confirm" class="youpasswd" data-icon="p">Please Confirm Your Password </label>
                                    <input id="passwordsignup_confirm" name="passwordsignup_confirm" required="required" maxlength="30" type="password" placeholder="eg. X8df!90EO"/>
                                </p>
                                <p class="signin button"> 
									<input type="submit" value="Sign up" onclick="return validatesignup();"/> 
								</p>
                                <p class="change_link">  
									Already a member ?
									<a href="#tologin" class="to_register"> Go and log in </a>
								</p>
                            </form>
                        </div>
						
                    </div>
                </div>  
            </section>
        </div>
    </body>
</html>