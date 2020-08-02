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
                <h3 class="panel-title">Listado de Asesorias</h3>
                 </div>
                  <div class="col-4 text-right">
                    <a role="button" aria-pressed="true" title="Editar usuario" href="asesoform" class="btn btn-sm btn-success btn-create">Agregar asesorias</a>
                  </div>
                </div>
              </div>
              <div class="panel-body table-responsive">
                <table class="table table-striped table-bordered table-list ">
                  <thead>
					<tr>
                        <th><em class="fa fa-cog"></em>Acciones</th>
                        <th>Id</th>
						<th>Detalle</th>
						<th title="">Estado de solicitud</th>
						<th>Fecha Solicitada</th>
						<th>Nombre Asesoria</th>
<!-- 						<th>Rut Cliente</th> -->
<!-- 						<th>Visitas</th> -->
					</tr> 
                  </thead>
                  <tbody align="center">
                  <c:forEach items="${lasesorias}" var="lista">
                          <tr>
                            <td align="center">
                              <a class="btn btn-primary mb-1" title="Editar asesoria" href="editAsesoria/${lista.idAseso}"><em class="fa fa-pencil xs"></em></a>
                              <a class="btn btn-danger mb-1" title="Eliminar asesoria" href="eliminaaseso/${lista.idAseso}"><em class="fa fa-trash xs"></em></a>
                            </td>
                            <td class="align-middle">${lista.idAseso}</td>
							<td class="align-middle">${lista.detalleAseso}</td>
							<td class="align-middle">${lista.estadoSolicitud}</td>
							<td class="align-middle">${lista.fechaAseso}</td>
							<td class="align-middle">${lista.nombreAseso}</td>
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