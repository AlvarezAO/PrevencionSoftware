    
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
            <form:form class="custom-form" method="post" action="/modulo5dia12/guardacambio">
                <h1>EDITAR CLIENTE</h1>
                <p></p>
                <div class="form-row form-group">
                    <div class="col-sm-4 label-column"><label class="col-form-label" for="rut-input-field">Rut: </label></div>
                    <div class="col-sm-6 input-column"><form:input path="rut_cli" class="form-control" type="text" /></div>
                </div>
                <div class="form-row form-group">
                    <div class="col-sm-4 label-column"><label class="col-form-label" for="nombre-input-field">Nombre: </label></div>
                    <div class="col-sm-6 input-column"><form:input path="nombre_cli" class="form-control" type="text" /></div>
                </div>
                <div class="form-row form-group">
                    <div class="col-sm-4 label-column"><label class="col-form-label" for="rubro-input-field">Rubro: </label></div>
                    <div class="col-sm-6 input-column"><form:input path="rubro_cli" class="form-control" type="text" /></div>
                </div>
                <div class="form-row form-group">
                    <div class="col-sm-4 label-column"><label class="col-form-label" for="direccion-pawssword-input-field">Direcion: </label></div>
                    <div class="col-sm-6 input-column"><form:input path="direccion_cli" class="form-control" type="email" /></div>
                </div>
                <div class="form-row form-group">
                    <div class="col-sm-4 label-column"><label class="col-form-label" for="pawssword-input-field">Clave: </label></div>
                    <div class="col-sm-6 input-column"><form:input path="clave_cli" class="form-control" type="text" /></div>
                </div>
                                
                <button class="btn btn-primary submit-button mb-3" type="submit" >Guardar</button>
                </form:form>
        </div>
    </div>


 
<!--     <h1>Editar Cliente</h1>   -->
<%--        <form:form method="post" action="/modulo5dia12/guardacambio">     --%>
<!--         <table >   -->
<!--          <tr>       -->
<%--           <td><form:hidden path="usuarioid"  /></td>   --%>
<!--          </tr> -->
<!--          <tr>     -->
<!--           <td>Nombre : </td>    -->
<%--           <td><form:input path="nombre"  /></td>   --%>
<!--          </tr>  -->
<!--           <tr>     -->
<!--           <td>Rut : </td>    -->
<%--           <td><form:input path="rut" /></td>   --%>
<!--          </tr>     -->
<!--          <tr>     -->
<!--           <td>Teléfono :</td>     -->
<%--           <td><form:input path="telefono" /></td>   --%>
<!--          </tr>    -->
<!--          <tr>     -->
<!--           <td>Correo electrónico :</td>     -->
<%--           <td><form:input path="correoelectronico"  /></td>   --%>
<!--          </tr>    -->
<!--          <tr>     -->
<!--           <td>Rubro : </td>    -->
<%--           <td><form:input path="rubro"  /></td>   --%>
<!--          </tr>     -->
<!--          <tr>     -->
<!--           <td>Dirección : </td>    -->
<%--           <td><form:input path="direccion" /></td>   --%>
<!--          </tr>     -->
<!--           <tr>  -->
<!--           <td>Clave : </td>        -->
<%--           <td><form:input path="clave" /></td>   --%>
<!--          </tr>  -->
<!--          <tr>     -->
<!--           <td> </td>     -->
<!--           <td><input type="submit" value="Guardar cambios" /></td>     -->
<!--          </tr>     -->
<!--         </table>     -->
<%--        </form:form>    --%>
   

<%@include file="/footer.jsp" %>