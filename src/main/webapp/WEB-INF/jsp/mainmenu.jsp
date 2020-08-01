<%@include file="/head.jsp" %>
<%@include file="/nav.jsp" %>

<style>      
    body{
        padding-top:100px;
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

 <sec:authorize access="hasRole('ADMIN')">
     <sec:authorize access="isAuthenticated()">
	    authenticated as <sec:authentication property="principal.username" /> 
	</sec:authorize>
	
	
	
</sec:authorize>

<sec:authorize access="hasRole('USER')">
    
    
     <div>
     	<p> Este es usuario</p>
     </div>  
</sec:authorize>

<sec:authorize access="hasRole('PRO')">
      <div>
      	<p>Este es profesional</p>
      </div>  
</sec:authorize>

<%@include file="/footer.jsp"%>