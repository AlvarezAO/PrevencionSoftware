<nav class="navbar navbar-dark navbar-expand-lg fixed-top bg-dark navbar-custom">
        <div class="container"><a class="navbar-brand" href="#">Una filial de PAMALNI</a><button data-toggle="collapse" class="navbar-toggler" data-target="#navbarResponsive"><span class="navbar-toggler-icon"></span></button>
            <div class="collapse navbar-collapse" id="navbarResponsive">
                <ul class="nav navbar-nav ml-auto">
                    <li class="nav-item" role="presentation"><a class="nav-link" href="login">Ingresar</a></li>
                    <li class="nav-item" role="presentation"></li>
                </ul>
            </div>
        </div>
    </nav>
  <sec:authorize access="hasRole('ADMIN')">
  <div class="navbar navbar-default navbar-static-top">
    <nav class="navbar navbar-dark navbar-expand-lg fixed-top bg-dark navbar-custom">
        <div class="container"><a class="navbar-brand" href="#">Una filial de PAMALNI</a><button data-toggle="collapse" class="navbar-toggler" data-target="#navbarResponsive"><span class="navbar-toggler-icon"></span></button>
            <div class="collapse navbar-collapse" id="navbarResponsive">
                <ul class="nav navbar-nav ml-auto">
                    <li class="nav-item" role="presentation"><a class="nav-link" href="listarclientes">Ver Clientes</a></li>
                    <li class="nav-item" role="presentation"></li>
                    <li class="nav-item" role="presentation"><a class="nav-link" href="cliform">Crear Clientes</a></li>
                    <li class="nav-item" role="presentation"></li>
                    <li class="nav-item" role="presentation"><a class="nav-link" href="#">Ver Solicitudes</a></li>
                    <li class="nav-item" role="presentation"></li>
                    <li class="nav-item" role="presentation"><a class="nav-link" href="#">Reportes</a></li>
                    <li class="nav-item" role="presentation"></li>
                    <li class="nav-item" role="presentation"><a class="nav-link" href="logout">Salir</a></li>
                    <li class="nav-item" role="presentation"></li>
                </ul>
            </div>
        </div>
    </nav>
</div>   
</sec:authorize>
<sec:authorize access="hasRole('USER')">
     <nav class="navbar navbar-dark navbar-expand-lg fixed-top bg-dark navbar-custom">
        <div class="container"><a class="navbar-brand" href="#">Una filial de PAMALNI</a><button data-toggle="collapse" class="navbar-toggler" data-target="#navbarResponsive"><span class="navbar-toggler-icon"></span></button>
            <div class="collapse navbar-collapse" id="navbarResponsive">
                <ul class="nav navbar-nav ml-auto">
               		<li class="nav-item" role="presentation"><a class="nav-link" href="menusolicitudes">Solicitudes</a></li>
                    <li class="nav-item" role="presentation"></li>
                	<li class="nav-item" role="presentation"><a class="nav-link" href="#">Reportes</a></li>
                    <li class="nav-item" role="presentation"></li>
                    <li class="nav-item" role="presentation"><a class="nav-link" href="#">Pagos</a></li>
                    <li class="nav-item" role="presentation"></li>
                    <li class="nav-item" role="presentation"><a class="nav-link" href="logout">Salir</a></li>
                    <li class="nav-item" role="presentation"></li>
                </ul>
            </div>
        </div>
    </nav> 
</sec:authorize>
<sec:authorize access="hasRole('PRO')">
     <nav class="navbar navbar-dark navbar-expand-lg fixed-top bg-dark navbar-custom">
        <div class="container"><a class="navbar-brand" href="#">Una filial de PAMALNI</a><button data-toggle="collapse" class="navbar-toggler" data-target="#navbarResponsive"><span class="navbar-toggler-icon"></span></button>
            <div class="collapse navbar-collapse" id="navbarResponsive">
                <ul class="nav navbar-nav ml-auto">
                    <li class="nav-item" role="presentation"><a class="nav-link" href="logout">Salir</a></li>
                    <li class="nav-item" role="presentation"></li>
                </ul>
            </div>
        </div>
    </nav> 
</sec:authorize>  
