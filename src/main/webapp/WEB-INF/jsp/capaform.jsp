 <%@include file="/head.jsp" %>
   <%@include file="/nav.jsp" %>

<div class="row register-form">
        <div class="col-md-8 offset-md-2">
            <form:form class="custom-form" method="post" action="savecapa" modelAttribute="cap">
                <h1>AGREGAR NUEVA SOLICITUD</h1>
                <p></p>
                <div class="form-row form-group">
                    <div class="col-sm-4 label-column"><label class="col-form-label" for="name-input-field">Nombre: </label></div>
                    <div class="col-sm-6 input-column"><form:input path="nombreCapa" class="form-control" type="text" /></div>
                </div>
                <div class="form-row form-group">
                    <div class="col-sm-4 label-column"><label class="col-form-label" for="name-input-field">Detalle: </label></div>
                    <div class="col-sm-6 input-column"><form:input path="detalleCapa" class="form-control" type="text" /></div>
                </div>
                <div class="form-row form-group">
                    <div class="col-sm-4 label-column"><label class="col-form-label" for="name-input-field">Fecha Solicitada: </label></div>
                    <div class="col-sm-6 input-column"><form:input path="fechaCapa" class="form-control" type="text" /></div>
                </div>
                <div class="form-row form-group">
                    <div class="col-sm-4 label-column"><label class="col-form-label" for="repeat-input-field">Tipo Solicitud: </label></div>
                    <div class="col-sm-6 input-column"><form:input path="rutCli" class="form-control" type="text" /></div>
                </div>
                
                
                <button class="btn btn-primary submit-button mb-3" type="submit" >Solicitar</button>
                </form:form>
        </div>
    </div>

	<%@include file="/footer.jsp" %>