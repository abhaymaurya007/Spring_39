<%@ page isELIgnored="false"%>


<h1 style="color:green;text-align:center">  Artist Registration Page  </h1>
<form  action="register"  method="POST">
   
   <table  align="center"  bgcolor="cyan">
      <tr>
       <td>  Id  </td>
       <td>  <input type="text" name="aid"  placeholder="enter id"> </td>
      </tr>
      <tr>
       <td>  Name </td>
       <td>  <input type="text" name="aname"> </td>
      </tr>
      <tr>
       <td>  Addrs </td>
       <td>  <input type="text" name="addrs"> </td>
      </tr>
      <tr>
       <td>  category </td>
       <td>  <input type="text" name="category"> </td>
      </tr>
      <tr>
       <td>  Fee </td>
       <td>  <input type="text" name="fee"> </td>
      </tr>
        <tr>
           <td colspan="2"><input type="submit"  value="register"> </td>
        </tr>
     </table>

</form>
