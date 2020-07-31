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
                <h3 class="panel-title">Listado de Usuarios</h3>
                 </div>
                  <div class="col-4 text-right">
                    <a role="button" aria-pressed="true" title="Editar usuario" href="cliform" class="btn btn-sm btn-success btn-create">Agregar usuario</a>
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
						<th>Rubro</th>
						<th>Direccion</th>
					</tr> 
                  </thead>
                  <tbody align="center">
                  <c:forEach items="${lclientes}" var="lista">
                          <tr>
                            <td align="center">
                              <a class="btn btn-primary mb-1" title="Editar usuario" href="editusuario/${lista.rutCli}"><em class="fa fa-pencil xs"></em></a>
                              <a class="btn btn-danger mb-1" title="Eliminar usuario" href="eliminarusuario/${lista.rutCli}"><em class="fa fa-trash xs"></em></a>
                              <a class="btn btn-warning mb-1" title="Dar de alta" href="agregarol/${lista.rutCli}"><em class="fa fa-male xs"></em></a>
                            </td>
                            <td class="align-middle">${lista.rutCli}</td>
							<td class="align-middle">${lista.nombreCli}</td>
							<td class="align-middle">${lista.rubroCli}</td>
							<td class="align-middle">${lista.direccionCli}</td>
					        </tr>
                    </c:forEach>
                   </tbody>
                </table>
              </div>
  		</div>
 	 </div>
  </div>
  </div>
   

<%@include file="/footer.jsp" %>
