<%@ page isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>

<h1  style="color:green;text-align:center"> Show Report Page </h1>

<c:choose>
  <c:when test="${!empty doctorsList}">
    <table  bgcolor="cyan"  align="center"  border="1">
       <tr>
         <th> Id </th> <th> Name </th> <th>Specialization </th>  <th> Fee </th> <th> Qualification</th> <th> Operations  </th>
       </tr>
       <c:forEach  var="doc" items="${doctorsList}">
          <tr>
              <td> ${doc.did} </td>
              <td> ${doc.dname} </td>
              <td> ${doc.specialization} </td>
              <td> ${doc.fee} </td>
              <td> ${doc.qlfy} </td>
              <td> <a href="edit?no=${doc.did}"><img src="images/edit.jpg" width="30px" height="30px"></a>   &nbsp;&nbsp;
                        <a href="delete?no=${doc.did}"  onclick="return confirm('Do you Really want to delete the Record?')"><img src="images/delete.jpg" width="30px" height="30px"></a>   
              
              </td>
          </tr> 
       </c:forEach>
      </table>
  </c:when>
  <c:otherwise>
              <h1  style="color:red;text-align:center"> No Doctors Are Found </h1>
  </c:otherwise>

</c:choose>
   <h1  style="color:red;text-align:center"><a href="register">Add Dcotor<img src="images/add.jpg" ></a>
   <br><br>
      <h1  style="color:green;text-align:center">${resultMsg}</h1>
   <br><br>
   <h1  style="color:red;text-align:center"><a href="./">Home<img src="images/home.jpg" ></a>
   

