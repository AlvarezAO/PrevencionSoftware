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
                <h3 class="panel-title">Listado de Pagos</h3>
                 </div>
                  
                </div>
              </div>
              
              <div class="panel-body table-responsive">
                <table class="table table-striped table-bordered table-list ">
                  <thead>
                    <tr>
                        <th><em class="fa fa-cog"></em>Acciones</th>
                        <th>ID pago</th>
						<th>Fecha de pago</th>
						<th>Fecha vencimiento</th>
						<th>Monto pagado</th>
						<th>Monto total</th>
						<th>Rut Cliente</th>
					</tr> 
                  </thead>
                  <tbody align="center">
                  <c:forEach items="${lpago}" var="lista">
                          <tr>
                            <td align="center">
                              <a class="btn btn-warning mb-1" title="Realizar pago" href=""><em class="fa fa-usd xs"></em></a>
                            </td>
                            <td class="align-middle">${lista.idPago}</td>
							<td class="align-middle">${lista.fechaPago}</td>
							<td class="align-middle">${lista.fechaVencimiento}</td>
							<td class="align-middle">${lista.montoPagado}</td>
							<td class="align-middle">${lista.montoTotal}</td>
							<td class="align-middle">${lista.rutCli}</td>
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
