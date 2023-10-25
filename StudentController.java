public class StudentController{
	Student model;
	StudentView view;
	public StudentController(Student m, StudentView v){
	    model = m;
	    view = v;
	}
	public void setStudentName(String n){
	    model.setName(n);
	}
	public String getStudentName(){
	    return model.getName();
	}
	public void setStudentRollNo(String n){
	    model.setRollNo(n);
	}
	public String getStudentRollNo(){
	    return model.getRollNo();
	}
	public void updateView(){
	    view.printStudentDetails(model);
	}
}