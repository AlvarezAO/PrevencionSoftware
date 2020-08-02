<%@include file="/head.jsp" %>
<%@include file="/nav.jsp" %>

<%
 String error = (String) request.getAttribute("error");
 if (error != null && error.equals("true"))
 {
 out.println("<h4 style=\"color:red\">Invalid login credentials. Please try again!!</h4>");
 }
 %>
 
 <% Cookie miCookie=null;
    String rutusuario = request.getParameter("username");%>
 
 <style>      
    body{
    	
        padding-top:200px;
    }
    /* fix padding under menu after resize */
    @media screen and (max-width: 767px) {
        body { padding-top: 60px; }
    }
    @media screen and (min-width:768px) and (max-width: 991px) {
        body { padding-top: 110px; }
    }
    @media screen and (min-width: 992px) {
        body { padding-top: 60px; }
    }
    .mh-100vh {
  min-height: 100vh;
}

#login-block {
  -webkit-box-shadow: 0px 0px 45px 0px rgba(0,0,0,0.4);
  -moz-box-shadow: 0px 0px 45px 0px rgba(0,0,0,0.4);
  box-shadow: 0px 0px 45px 0px rgba(0,0,0,0.4);
  z-index: 2;
}

@media (max-width: 991.98px) {
  #login-block {
    opacity: .95;
  }
}

@media (max-width: 991.98px) {
  #bg-block {
    position: fixed;
    top: 0;
    left: 0;
    bottom: 0;
    right: 0;
  }
}

@media (min-width: 992px) {
  .w-lg-75 {
    width: 75%;
  }
}

@media (min-width: 992px) {
  .rounded-lg-0 {
    border-radius: 0 !important;
  }
}

@media (min-width: 1200px) {
  .w-xl-50 {
    width: 50%;
  }
}
    
</style>

<div class="container-fluid">
        <div class="row mh-100vh">
            <div class="col-10 col-sm-8 col-md-6 col-lg-6 offset-1 offset-sm-2 offset-md-3 offset-lg-0 align-self-center d-lg-flex align-items-lg-center align-self-lg-stretch bg-white p-5 rounded rounded-lg-0 my-5 my-lg-0" id="login-block">
                <div class="m-auto w-lg-75 w-xl-50">
                    <h2 class="text-info font-weight-light mb-5"><i class="fa fa-handshake-o"></i>SECURITY LIFE<br>&nbsp; &nbsp; Compañia de Seguros</h2>
                    <form name='loginForm' action=<c:url value='login' /> method='POST'>
                        <div class="form-group"><label class="text-secondary">Usuario</label><input class="form-control" type="text"  name='username' required="">
                        </div>
                        <div class="form-group"><label class="text-secondary">Contraseña</label><input class="form-control" type="password" name='password' required="">
                        </div>
                        <input class="btn btn-info mt-2" type="submit" value="Ingresar"/>
                        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
                    </form>
                    <p class="mt-3 mb-0"></p>
                </div>
            </div>
            <div class="col-lg-6 d-flex align-items-end" id="bg-block" style="background: url(resources/img/Helping-Hand-1220x813.jpg) center center / cover;">
                <p class="ml-auto small text-dark mb-2"><br></p>
            </div>
        </div>
    </div>
