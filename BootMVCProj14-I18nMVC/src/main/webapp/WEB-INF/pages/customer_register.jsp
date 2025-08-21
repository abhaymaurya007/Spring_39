<%@ page isELIgnored="false"  contentType="text/html; charset=UTF-8" %>
<%@taglib uri="http://www.springframework.org/tags/form"  prefix="frm"%>
<%@taglib uri="http://www.springframework.org/tags"  prefix="sp"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>



<h1  style="color:red;text-align:center"> <sp:message code="registration.title"/> </h1>

<frm:form  method="POST"  modelAttribute="cust">
    <table  align="center" bgcolor="cyan">
       <tr>
          <td> <sp:message  code="registration.cno"/> </td>
          <td> <frm:input path="cno"/> </td>
       </tr>
       <tr>
          <td> <sp:message  code="registration.cname"/> </td>
          <td> <frm:input path="cname"/> </td>
       </tr>
       <tr>
          <td> <sp:message  code="registration.billamt"/> </td>
          <td> <frm:input path="billAmt"/> </td>
       </tr>
       <tr>
          <td colspan="2"> <input type="submit" value="<sp:message  code='registration.caption'/>" /> </td>
        </tr>
    </table>
</frm:form>

<center>
    <a href="?lang=fr_FR">French</a> &nbsp;
    <a href="?lang=de_DE">German</a>&nbsp;
    <a href="?lang=zh_CN">Chinese</a>&nbsp;
    <a href="?lang=hi_IN">Hindi</a>&nbsp;
    <a href="?lang=en_US">English</a>&nbsp;
 </center>
<hr>

<br>
 <b>Current Active Locale :: ${pageContext.response.locale}</b> <Br>
   <fmt:setLocale value=" ${pageContext.response.locale}"/>
   
   <fmt:formatDate var="fdate"  value="${sysDate}"  type="date"  dateStyle="FULL"/>
   <fmt:formatDate var="ftime"  value="${sysDate}"  type="time"  timeStyle="SHORT"/>
    <fmt:formatDate var="fdatetime"  value="${sysDate}"  type="both"  timeStyle="MEDIUM"/>
 
   <b> Formatted date:: ${fdate}</b> <br>
   <b> Formatted time:: ${ftime}</b> <br>
   <b> Formatted datetime:: ${fdatetime}</b> <br>
   
   <fmt:formatNumber  var="fnumber"  value="${distance}"  type="number"/>
   <fmt:formatNumber  var="fprice"  value="${price}"  type="currency"/>
   <fmt:formatNumber  var="favg"  value="${avg}"  type="percent"/>
   <br><br>
   <b> Formatted  Number :: ${fnumber}</b> <br>
   <b> Formatted  Price :: ${fprice}</b> <br>
   <b> Formatted  Avg :: ${favg}</b> <br>
   
   
   
   
   
   
   
   
   
   
 