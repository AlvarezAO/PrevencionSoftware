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
            <form:form class="custom-form" method="post" action="/modulo5dia12/changeAcci">
                <h1>REVISAR ACCIDENTE</h1>
                <p></p>
                <div class="form-row form-group">
                    <div class="col-sm-4 label-column"><label class="col-form-label" for="id-input-field">Id Asesoria: </label></div>
                    <div class="col-sm-6 input-column"><form:input path="idAccidente" class="form-control" type="number" readonly="true" /></div>
                </div>
                <div class="form-row form-group">
                    <div class="col-sm-4 label-column"><label class="col-form-label" for="detalle-input-field" >Detalle: </label></div>
                    <div class="col-sm-6 input-column"><form:input path="detalleAccidente" class="form-control" type="text" /></div>
                </div>
                <div class="form-row form-group">
                    <div class="col-sm-4 label-column"><label class="col-form-label" for="estado-input-field">Estado Solicitud: </label></div>
                    <div class="col-sm-6 input-column"><form:input path="estadoSolicitud" class="form-control" type="text" /></div>
                </div>
                <div class="form-row form-group">
                    <div class="col-sm-4 label-column"><label class="col-form-label" for="nomAseso-input-field">Nombre Asesoria:</label></div>
                    <div class="col-sm-6 input-column"><form:input path="nombreAccidente" class="form-control" type="text" /></div>
                </div>
                <div class="form-row form-group">
                    <div class="col-sm-4 label-column"><label class="col-form-label" for="fechaAseso-input-field">Fecha Asesoria:</label></div>
                    <div class="col-sm-6 input-column"><form:input path="fechaAccidente" class="form-control" type="text" /></div>
                </div>                 
                <button class="btn btn-primary submit-button mb-3" type="submit" >Modificar</button>
                </form:form>
        </div>
    </div>


<%@include file="/footer.jsp" %> 
