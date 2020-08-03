<%@include file="/head.jsp" %>
<%@include file="/nav.jsp" %>

<style>      
    body{
        padding-top:60px;
        
       
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
    
    
</style>



 <sec:authorize access="hasRole('USER')">
    <div class="article-list">
        <div class="container">
            <div class="intro">
                <h2 class="text-center">MENU PRINCIPAL</h2>
                <p class="text-center">Bienvenido a nuestra nueva plataforma virtual. </p>
            	<p class="text-center">A raíz de la Pandemia por el Covid 19 hemos implementado esta nueva manera de realizar tus trámites, estamos en una etapa de prueba por ello algunos de los links se encuentran desactivados.</p>
            </div>
            <div class="row articles">
            
                <div class="col-sm-6 col-md-6 item"><a href="listarasesorias"><img class="img-fluid" src="resources/img/desk.jpg"></a>
                    <h3 class="name">Historial Asesorias</h3>
                    <p class="description"></p></div>
                <div
                    class="col-sm-6 col-md-6 item"><a href="asesoform"><img class="img-fluid" src="resources/img/building.jpg"></a>
                    <h3 class="name">Pedir Asesoria</h3>
                    <p class="description"></p></div>
                    
            <div class="col-sm-6 col-md-6 item"><a href="listarcapa"><img class="img-fluid" src="resources/img/loft.jpg"></a>
                <h3 class="name">Historial Capacitaciones</h3>
                <p class="description"></p></div>
                <div class="col-sm-6 col-md-6 item"><a href="capaform"><img class="img-fluid" src="resources/img/desk.jpg"></a>
                    <h3 class="name">Pedir Capacitación</h3>
                    <p class="description"></p></div>
                <div
                    class="col-sm-6 col-md-6 item"><a href="listaraccidentes"><img class="img-fluid" src="resources/img/building.jpg"></a>
                    <h3 class="name">Historial Accidentes</h3>
                    <p class="description"></p></div>
            <div
                class="col-sm-6 col-md-6 item"><a href="acciform"><img class="img-fluid" src="resources/img/loft.jpg"></a>
                <h3 class="name">Reportar Accidente</h3>
                <p class="description"></p></div>
   
    </div>
    </div>
    </div>
 </sec:authorize>   
 
  <sec:authorize access="hasRole('ADMIN')">
  		
    <div class="article-list">
        <div class="container">
            <div class="intro">
                <h2 class="text-center">Menú Administrador</h2>
                <p class="text-center">Bienvenido a nuestra nueva plataforma virtual. </p>
            	<p class="text-center">A raíz de la Pandemia por el Covid 19 hemos implementado esta nueva manera de realizar tus trámites, estamos en una etapa de prueba por ello algunos de los links se encuentran desactivados.</p>
            </div>
            <div class="row articles">
            
                <div class="col-sm-6 col-md-4 item"><a href="listarasesorias"><img class="img-fluid" src="resources/img/desk.jpg"></a>
                    <h3 class="name">Solicitud Asesorias</h3>
                    <p class="description"></p></div>
                
                <div class="col-sm-6 col-md-4 item"><a href="listarcapa"><img class="img-fluid" src="resources/img/loft.jpg"></a>
	                <h3 class="name">Solicitud Capacitaciones</h3>
	                <p class="description"></p></div>
	               
                <div  class="col-sm-6 col-md-4 item"><a href="listaraccidentes"><img class="img-fluid" src="resources/img/building.jpg"></a>
                    <h3 class="name">Solicitud Accidentes</h3>
                    <p class="description"></p></div>
        
   
    </div>
    </div>
    </div>
 </sec:authorize>
<%@include file="/footer.jsp" %>