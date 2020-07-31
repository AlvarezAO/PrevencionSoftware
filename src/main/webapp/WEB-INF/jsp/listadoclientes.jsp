<%-- <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%> 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />  
<!DOCTYPE html>
<html>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
    <title>Untitled</title>
    <link rel="stylesheet" href="templatesUno/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="templatesUno/fonts/font-awesome.min.css">
    <link rel="stylesheet" href="templatesUno/css/Bootstrap-DataTables.css">
    
</head>

<body> --%>
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
                              <a class="btn btn-primary mb-1" title="Editar usuario" href="editusuario/${lista.rut_cli}"><em class="fa fa-pencil xs"></em></a>
                              <a class="btn btn-danger mb-1" title="Eliminar usuario" href="eliminarusuario/${lista.rut_cli}"><em class="fa fa-trash xs"></em></a>
                              <a class="btn btn-warning mb-1" title="Dar de alta" href="agregarol/${lista.rut_cli}"><em class="fa fa-male xs"></em></a>
                            </td>
                            <td class="align-middle">${lista.rut_cli}</td>
							<td class="align-middle">${lista.nombre_cli}</td>
							<td class="align-middle">${lista.rubro_cli}</td>
							<td class="align-middle">${lista.direccion_cli}</td>
							
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