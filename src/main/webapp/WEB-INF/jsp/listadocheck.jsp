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
                <h3 class="panel-title">Listado de Checklist</h3>
                 </div>
                 </div>
              </div>
              <div class="panel-body table-responsive">
                <table class="table table-striped table-bordered table-list ">
                  <thead>
					<tr>
                        <th><em class="fa fa-cog"></em>Acciones</th>
                        <th>Detalle</th>
						<th>Estado de Chequeo</th>
					</tr> 
                  </thead>
                  <tbody align="center">
                  <c:forEach items="${listacheck}" var="lista">
                          <tr>
                            <td align="center">
                              <a class="btn btn-primary mb-1" title="Editar Checklist" href="editcheck/${lista.idCheck}"><em class="fa fa-pencil xs"></em></a>  
                              <a class="btn btn-primary mb-1" title="Responder Checklist" href="#"><em class="fa fa-share-square-o xs"></em></a>
                            </td>
                            <td class="align-middle">${lista.detallechequeo}</td>
							<td class="align-middle">${lista.estado}</td>
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
  <div class="col-4 text-right">
   <a role="button" aria-pressed="true" title="Volver" href="menusolicitudes" class="btn btn-sm btn-info btn-create mb-4">Volver a menu</a>
   </div>
  
 <%@include file="/footer.jsp" %>