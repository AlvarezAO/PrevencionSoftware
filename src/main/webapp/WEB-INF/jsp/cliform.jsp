<%@include file="/head.jsp" %>
<%@include file="/nav.jsp" %>

<style>      
    body{
        padding-top:60px;
        margin-top: 20px;
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
            <form:form class="custom-form" method="post" action="save">
                <h1>AGREGAR NUEVO CLIENTE</h1>
                <p></p>
                <div class="form-row form-group">
                    <div class="col-sm-4 label-column"><label class="col-form-label" for="rut-input-field">Rut: </label></div>
                    <div class="col-sm-6 input-column"><form:input path="rutCli" class="form-control" type="number" /></div>
                </div>
                <div class="form-row form-group">
                    <div class="col-sm-4 label-column"><label class="col-form-label" for="nombre-input-field">Nombre: </label></div>
                    <div class="col-sm-6 input-column"><form:input path="nombreCli" class="form-control" type="text" /></div>
                </div>
                <div class="form-row form-group">
                    <div class="col-sm-4 label-column"><label class="col-form-label" for="rubro-input-field">Rubro: </label></div>
                    <div class="col-sm-6 input-column"><form:input path="rubroCli" class="form-control" type="text" /></div>
                </div>
                <div class="form-row form-group">
                    <div class="col-sm-4 label-column"><label class="col-form-label" for="direccion-input-field">Direccion: </label></div>
                    <div class="col-sm-6 input-column"><form:input path="direccionCli" class="form-control" type="text" /></div>
                </div>
                                
                <button class="btn btn-primary submit-button mb-3" type="submit" >Guardar</button><br>
                <div class="text-left">
   				<a role="button" aria-pressed="true" title="Volver" href="menusolicitudes" class="btn btn-sm btn-info btn-create mb-4">Volver a menu</a>
   				</div>
                </form:form>
        </div>
    </div>


	<%@include file="/footer.jsp" %>