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

<div class="row register-form">
        <div class="col-md-8 offset-md-2">
            <form:form class="custom-form" method="post" action="grabapago">
                <h1>AGREGAR NUEVO PAGO</h1>
                <p></p>
                <div class="form-row form-group">
                    <div class="col-sm-4 label-column"><label class="col-form-label" for="idpago-input-field">ID Pago </label></div>
                    <div class="col-sm-6 input-column"><form:input path="idPago" class="form-control" type="text"  readonly="true"/></div>
                </div>
                <div class="form-row form-group">
                    <div class="col-sm-4 label-column"><label class="col-form-label" for="fechapago-input-field">Fecha Pago: </label></div>
                    <div class="col-sm-6 input-column"><form:input path="fechaPago" class="form-control" type="text" readonlu="true" /></div>
                </div>
                <div class="form-row form-group">
                    <div class="col-sm-4 label-column"><label class="col-form-label" for="fechavencimiento-input-field">Fecha Vencimiento: </label></div>
                    <div class="col-sm-6 input-column"><form:input path="fechaVencimiento" class="form-control" type="text" readolny="true"/></div>
                </div>
                <div class="form-row form-group">
                    <div class="col-sm-4 label-column"><label class="col-form-label" for="direccion-input-field">Monto a pagar: </label></div>
                    <div class="col-sm-6 input-column"><form:input path="montoPagado" class="form-control" type="text" readolny="true"/></div>
                </div>
                <div class="form-row form-group">
                    <div class="col-sm-4 label-column"><label class="col-form-label" for="total-input-field">Total: </label></div>
                    <div class="col-sm-6 input-column"><form:input path="montoTotal" class="form-control" type="text" readolny="true"/></div>
                </div>
                <div class="form-row form-group">
                    <div class="col-sm-4 label-column"><label class="col-form-label" for="rutCli-input-field">Total: </label></div>
                    <div class="col-sm-6 input-column"><form:input path="rutCli" class="form-control" type="text" readolny="true"/></div>
                </div>
                                
                <button class="btn btn-primary submit-button mb-3" type="submit" >Guardar</button>
                </form:form>
        </div>
    </div>
    <div class="col-4 text-right">
   <a role="button" aria-pressed="true" title="Volver" href="menusolicitudes" class="btn btn-sm btn-info btn-create mb-4">Volver a menu</a>
   </div>


	<%@include file="/footer.jsp" %>