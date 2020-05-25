function getinfo()
{
	class student
	{
		set studRollNo(roll)
		{
			this.roll = roll;
		}
		set studName(name)
		{
			this.name = name;
		}
		set studMarks1(marks1)
		{
			this.marks1 = marks1;
		}
		set studMarks2(marks2)
		{
			this.marks2 = marks2;
		}
		set studMarks3(marks3)
		{
			this.marks3 = marks3;
		}
		get studRollNo()
		{
			return this.roll;
		}
		get studName()
		{
			return this.name;
		}
		get studMarks1()
		{
			return this.marks1;
		}
		get studMarks2()
		{
			return this.marks2;
		}
		get studMarks3()
		{
			return this.marks3;
		}
		totalMarks()
		{
			this.ttlMar = this.marks1 + this.marks2 + this.marks3;
			return this.ttlMar;
		}
		studPercent()
		{
			this.per = (this.ttlMar / 300) * 100;
			return this.per;
		}
	}
	
	var stud1 = new student();
	stud1.studRollNo = document.getElementById("rollno").value;
	stud1.studName = document.getElementById("name").value;
	stud1.studMarks1 = Number(document.getElementById("sub1").value);
	stud1.studMarks2 = Number(document.getElementById("sub2").value);
	stud1.studMarks3 = Number(document.getElementById("sub3").value);
		
	document.getElementById("stu1").innerHTML = "Roll No.: " + stud1.studRollNo +
	"<br/>Name: " + stud1.studName + "<br/>Subject 1: " + stud1.studMarks1 + "<br/>Subject 2: " + stud1.studMarks2 +
	"<br/>Subject 3: " + stud1.studMarks3 + "<br/>Total: " + stud1.totalMarks() + "<br/>Percentage: " + stud1.studPercent();
}