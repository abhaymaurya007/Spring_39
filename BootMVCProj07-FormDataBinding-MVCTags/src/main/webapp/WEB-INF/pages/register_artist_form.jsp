<%@ page isELIgnored="false"%>
<%@taglib uri="http://www.springframework.org/tags/form"  prefix="frm"%>


<h1 style="color:green;text-align:center">  Artist Registration Page  </h1>
<frm:form      modelAttribute="artst">
   
   <table  align="center"  bgcolor="cyan">
      <tr>
       <td>  Id  </td>
       <td>  <frm:input  path="aid" title="enter id"/> </td>
      </tr>
      <tr>
       <td>  Name </td>
       <td>  <frm:input  path="aname"/> </td>
      </tr>
      <tr>
       <td>  Addrs </td>
       <td>  <frm:input type="text" path="addrs"/> </td>
      </tr>
      <tr>
       <td>  category </td>
       <td>  <frm:input type="text" path="category"/> </td>
      </tr>
      <tr>
       <td>  Fee </td>
       <td>  <frm:input type="text" path="fee"/> </td>
      </tr>
        <tr>
           <td colspan="2"><input type="submit"  value="register"> </td>
        </tr>
     </table>

</frm:form>
