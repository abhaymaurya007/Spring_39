<%@ page isELIgnored="false"  %>


<h1 style="color:red;text-align:center"> Welcome to Spring Boot MVC (SeasonFinderApp) </h1>


<h3 style="color:red;text-align:center"><a href="season"> show Season</a></h3>


<br><br>

<a href="report">send request(GET)</a> <br>
<form action="report" method="POST">
  <input type="submit"  value="Send(POST)">
</form>