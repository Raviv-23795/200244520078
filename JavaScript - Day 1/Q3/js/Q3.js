function showname()
{
	var fnme, lnme;
	fnme = document.getElementById("fname").value;
	lnme = document.getElementById("lname").value;
	document.getElementById("fullname1").innerHTML = "<h1>Your name is "+fnme+" "+lnme+"</h1><br/><br/>";
	document.getElementById("fullname2").innerHTML = "<h2>Your name is "+fnme+" "+lnme+"</h2><br/><br/>";
	document.getElementById("fullname3").innerHTML = "<h3>Your name is "+fnme+" "+lnme+"</h3><br/><br/>";
	document.getElementById("fullname4").innerHTML = "<h4>Your name is "+fnme+" "+lnme+"</h4><br/><br/>";
	document.getElementById("fullname5").innerHTML = "<h5>Your name is "+fnme+" "+lnme+"</h5><br/><br/>";
}