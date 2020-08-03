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
<sec:authorize access="hasRole('ADMIN')">
<div class="container">
    <div class="row">
        <div class="col-md-10 offset-md-1">
    <p></p>
    <h1>SECURITY LIFE</h1>
       <div class="panel panel-default panel-table">
          <div class="panel-heading">
            <div class="row">
              <div class="col-8">
                <h3 class="panel-title">Listado de Capacitaciones</h3>
                 </div>
                </div>
              </div>
              
              <div class="panel-body table-responsive">
                <table class="table table-striped table-bordered table-list ">
                  <thead>
                    <tr>
                        <th><em class="fa fa-cog"></em>Acciones</th>
						<th>Nombre Capacitación</th>
						<th>Detalle Capacitación</th>
						<th>Fecha Capacitación</th>
						<th>Estado Solicitud</th>
						<th>Rut Cliente</th>
					</tr> 
                  </thead>
                  <tbody align="center">
                  <c:forEach items="${listcapa}" var="lista">
                          <tr>
                            <td align="center">
                              <a class="btn btn-primary mb-1" title="Editar asesoria" href="editacapa/${lista.idCapa}"><em class="fa fa-pencil xs"></em></a>
                              <a class="btn btn-danger mb-1" title="Eliminar asesoria" href="eliminacapa/${lista.idCapa}"><em class="fa fa-trash xs"></em></a>
                            </td>
							<td class="align-middle">${lista.nombreCapa}</td>
							<td class="align-middle">${lista.detalleCapa}</td>
							<td class="align-middle">${lista.fechaCapa}</td>
							<td class="align-middle">${lista.estadoSolicitud}</td>
							<td class="align-middle">${lista.rutCli}</td>
					        </tr>
                    </c:forEach>
                   </tbody>
                </table>
                <div class="col-4 text-left">
   				<a role="button" aria-pressed="true" title="Volver" href="menusolicitudes" class="btn btn-sm btn-info btn-create mb-4">Volver a menu</a>
   				</div>
              </div>
  		</div>
 	 </div>
  </div>
  </div>
  </sec:authorize>
  
  <sec:authorize access="hasRole('USER')">
  		<div class="container">
    <div class="row">
        <div class="col-md-10 offset-md-1">
    <p></p>
    <h1>SECURITY LIFE</h1>
       <div class="panel panel-default panel-table">
          <div class="panel-heading">
            <div class="row">
              <div class="col-8">
                <h3 class="panel-title">Listado de Capacitaciones</h3>
                </div>
                <div class="col-4 text-right">
	                    <a role="button" aria-pressed="true" title="Solicitar Capacitación" href="capaform" class="btn btn-sm btn-success btn-create">Solicitar Capacitación</a>
	                 	
	                  </div>
                </div>
              </div>
              
              <div class="panel-body table-responsive">
                <table class="table table-striped table-bordered table-list ">
                  <thead>
                    <tr>
						<th>Nombre Capacitación</th>
						<th>Detalle Capacitación</th>
						<th>Fecha Capacitación</th>
						<th>Estado Solicitud</th>
						<th>Rut Cliente</th>
					</tr> 
                  </thead>
                  <tbody align="center">
                  <c:forEach items="${listcapa}" var="lista">
                          <tr>
							<td class="align-middle">${lista.nombreCapa}</td>
							<td class="align-middle">${lista.detalleCapa}</td>
							<td class="align-middle">${lista.fechaCapa}</td>
							<td class="align-middle">${lista.estadoSolicitud}</td>
							<td class="align-middle">${lista.rutCli}</td>
					        </tr>
                    </c:forEach>
                   </tbody>
                </table>
                <div class="col-4 text-left">
   				<a role="button" aria-pressed="true" title="Volver" href="menusolicitudes" class="btn btn-sm btn-info btn-create mb-4">Volver a menu</a>
   				</div>
              </div>
  		</div>
 	 </div>
  </div>
  </div>
  
  </sec:authorize>
 <%@include file="/footer.jsp" %> 