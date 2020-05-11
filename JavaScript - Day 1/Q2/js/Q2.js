function showname()
{
	var fnme, lnme;
	fnme = document.getElementById("fname").value;
	lnme = document.getElementById("lname").value;
	window.alert("Your name is "+fnme+" "+lnme);
	console.log(fnme+" "+lnme);
	document.getElementById("fullname").innerHTML = "Your name is "+fnme+" "+lnme+"<br/><br/>";
}