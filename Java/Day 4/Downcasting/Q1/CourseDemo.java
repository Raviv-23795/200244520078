/*
create a hierarchy

Course
void start()
void end()

override "start()" and "end()" in all the child classes.

MsCit		Basic		Dbda
						void orientation()

write a class "CourseDemo" with main and perform functions

perform function should be defined in such a way that it can accept any course and invoke "start()" and "end()" functions.

also make sure if "Dbda" is passed , its "orientation()" method also should be called.
 */
public class CourseDemo {
	static void perform(Course ref) {
		
		ref.start();
		
		if(ref instanceof Dbda) {
			Dbda obj = (Dbda) ref;
			obj.orientation();
		}
		
		ref.end();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		perform(new MsCit());
		perform(new Basic());
		perform(new Dbda());
	}

}
