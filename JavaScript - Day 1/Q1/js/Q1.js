function highestnum()
{
	var num1,num2,num3;
	num1 = Number(document.getElementById("n1").value);
	num2 = Number(document.getElementById("n2").value);
	num3 = Number(document.getElementById("n3").value);

	if(num1>num2 && num1>num3)
	{
		document.getElementById("high").innerHTML = "The highest number is "+num1+"<br/><br/>";
	}
	else if(num2>num1 && num2>num3)
	{
		document.getElementById("high").innerHTML = "The highest number is "+num2+"<br/><br/>";
	}
	else if(num3>num1 && num3>num1)
	{
		document.getElementById("high").innerHTML = "The highest number is "+num3+"<br/><br/>";
	}
}