<%@ page import="java.util.ArrayList" %>
<%@ page import="Beans.Cancion" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%ArrayList<Cancion> lista = (ArrayList<Cancion>) request.getAttribute("lista");%>

<html>
<!--Colocar como value: nombre de la presente página -->
<body>
<div class='container'>
  <!--Colocar como value: artistas, canciones, bandas, tours o tpc  (dependiendo de la pagina a la que corresponda) -->
  <div class="pb-5 pt-4 px-3 titlecolor d-flex justify-content-between align-items-center">
    <div class="col-lg-6">
      <h1 class='text-light'>Bienvenido, este es un ejemplo de tabla:</h1>
    </div>
  </div>
  <div class="tabla">
    <table class="table table-dark table-transparent table-hover">
      <thead>
      <tr>
        <th>ID</th>
        <th>NOMBRE</th>
        <th>ROL</th>
      </tr>
      </thead>

      <tbody>
      <%
        for(Cancion k:lista) {
      %>
      <tr>
        <td><%= k.getIdCancion()%> </td>
        <td class="text-center"><%= k.getNombre()%> </td>
        <td class="text-center"><%= k.getBanda()%> </td>
      </tr>
      <%
        }
      %>
      </tbody>
    </table>
  </div>
</div>
</body>
</html>
