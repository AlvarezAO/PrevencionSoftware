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

<div class="container">
    <div class="row">
        <div class="col-md-10 offset-md-1">
    <p></p>
    <h1>SECURITY LIFE</h1>
       <div class="panel panel-default panel-table">
          <div class="panel-heading">
            <div class="row">
              <div class="col-8">
                <h3 class="panel-title">Listado de Empleados</h3>
                 </div>
                  <div class="col-4 text-right">
                    <a role="button" aria-pressed="true" title="Agregar Empleado" href="empform" class="btn btn-sm btn-success btn-create">Agregar Empleado</a>
                  </div>
                </div>
              </div>
              
              <div class="panel-body table-responsive">
                <table class="table table-striped table-bordered table-list ">
                  <thead>
                    <tr>
                        <th><em class="fa fa-cog"></em>Acciones</th>
                        <th>Rut</th>
						<th>Nombre</th>
						<th>Telefono</th>
						<th>Email</th>
					</tr> 
                  </thead>
                  <tbody align="center">
                  <c:forEach items="${lEmpleado}" var="lista">
                          <tr>
                            <td align="center">
                              <a class="btn btn-primary mb-1" title="Editar Empleado" href="editempleado/${lista.rutEmp}"><em class="fa fa-pencil xs"></em></a>
                              <a class="btn btn-danger mb-1" title="Eliminar Empleado" href="eliminarempleaod/${lista.rutEmp}"><em class="fa fa-trash xs"></em></a>
                              <a class="btn btn-warning mb-1" title="Dar de alta" href="agregarol/${lista.rutEmp}"><em class="fa fa-male xs"></em></a>
                            </td>
                            <td class="align-middle">${lista.rutEmp}</td>
							<td class="align-middle">${lista.nombreEmp}</td>
							<td class="align-middle">${lista.fonoEmp}</td>
							<td class="align-middle">${lista.emailEmp}</td>
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
 

<%@include file="/footer.jsp" %>
