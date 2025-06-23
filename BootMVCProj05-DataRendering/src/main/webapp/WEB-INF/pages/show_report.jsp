<%@ page isELIgnored="false"  import="java.util.*" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"   prefix="c"%>


<b> Model attribute vlaues (simple) :: ${name}, ${age}</b>
<br><br>
<%-- <b> Model attribute vlaues (array) :: <%=Arrays.toString((Object[])request.getAttribute("favColors")) %> </b><br>
<b> Model attribute vlaues (List) :: ${friends}</b><br>
<b> Model attribute vlaues (Set) :: ${phones}</b><br>
<b> Model attribute vlaues (Map) :: ${idDetails}</b><br>
 --%>
 
 <b> Model  attribute vlaues </b>
 <c:if  test="${!empty favColors}">
     <b>favColors::</b>
    <c:forEach  var="color"  items="${favColors}">
          ${color}<br>
    </c:forEach>
 </c:if>
 <br>
 <c:if  test="${!empty friends}">
     <b> friends ::  ${friends}</b>
 </c:if>
 <br>
 <c:if  test="${!empty friends}">
     <b>friends </b>
      <c:forEach var="fr"  items="${friends}">
                ${fr} <br>
      </c:forEach>
 </c:if>
 <br>
 <c:if  test="${!empty phones}">
     <b> friends ::  ${phones}</b>
 </c:if>
 
 <br>
 <c:if  test="${!empty idDetails}">
     <b> friends ::  ${idDetails}</b>
 </c:if>
 <br>
 <c:if  test="${!empty idDetails}">
     <b> IDetails ::  </b> <br>
     <c:forEach var="id"  items="${idDetails}">
            <b> ${id.key} .....   ${id.value}</b> <br>
     
     </c:forEach>
  </c:if>
 <br>
 <hr>
 <c:if test="${!empty artistData}">
     <b> Artist Info is :: ${artistData} </b> <br>
     <b>  Artist Name,Fee :: ${artistData.aname},  ${artistData.fee} </b>
 </c:if>
 
 <hr>
 <c:if   test="${!empty artistList}">
     <table  border="1"  bgcolor="cyan">
       <tr>
          <th> aid  </th><th> aname  </th><th> addrs  </th> <th> fee  </th>
       </tr>
       <c:forEach var="artist"  items="${artistList}">
          <tr>
             <td>${artist.aid}</td>
             <td>${artist.aname}</td>
             <td>${artist.addrs}</td>
             <td>${artist.fee}</td>
          </tr>
       </c:forEach>
     </table>
 
 </c:if>







    