import java.util.*;
public class TestPerson{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	Scanner sc1 = new Scanner(System.in);
	System.out.println("name of the person:");
	String name = sc.next();
	System.out.println("address of the person:");
	String address = sc.next();
	System.out.println("name of the student:");
	String name1 = sc.next();
	System.out.println("address of the student:");
	String address1 = sc.next();
	System.out.println("program of the student:");	
	String program = sc.next();
	System.out.println("year of the student:");
	int year = sc1.nextInt();
	System.out.println("fee of the student:");
	double fee = sc1.nextDouble();
	System.out.println("name of the staff:");
	String name2 = sc.next();
	System.out.println("address of the staff:");
	String address2 = sc.next();
	System.out.println("school of the student:");
	String school = sc.next();
	System.out.println("payment for staff:");
	double pay = sc1.nextDouble();
	Person p = new Person(name, address);
	Student st = new Student(name1, address1, program, year, fee);
	Staff s = new Staff(name2, address2, school, pay);
	System.out.println(p.getName());
	System.out.println(p.getAddress());
	System.out.println(p.toString());
	System.out.println("new address:");
	String add = sc.next();
	p.setAddress(add);
	System.out.println(p.toString());
	
	System.out.println(st.getName());
	System.out.println(st.getAddress());
	System.out.println(st.getYear());
	System.out.println(st.getFee());
	System.out.println(st.toString());
	System.out.println("new year:");
	int y = sc1.nextInt();
	st.setYear(y);
	System.out.println(st.toString());
	
	System.out.println(s.getName());
	System.out.println(s.getAddress());
	System.out.println(s.getSchool());
	System.out.println(s.getPay());
	System.out.println(s.toString());
	System.out.println("new school:");
	String sch = sc.next();
	s.setSchool(sch);
	System.out.println(s.toString());
	
		}
	}
class Person{  
	 
 String name;  
 String address;
  
  
 Person(String name, String address){  

 this.name = name;  
 this.address = address;  
 }  
 public String getName(){
	 return name;
	 }
public void setName(String name){
	this.name = name;
	}	 
	
	public String getAddress(){
	 return address;
	 }
public void setAddress(String pay){
	this.address = address;
	}
	
   
 public String toString(){
  return "Person[name= " +name+"address= " +address+"]";
 }  
 
}  


class Student extends Person{  
 int year;  
 String program;  
 double fee;  
 
  
 Student(String name, String address, String program, int year, double fee){  
	 super(name,address);
 this.program = program;  
 this.year = year;  
 this.fee = fee;  
 }  
 public String getProgram(){
	 return program;
	 }
public void setProgram(String program){
	this.program = program;
	}	 
	
	public int getYear(){
	 return year;
	 }
public void setYear(int year){
	this.year = year;
	}
	
	public double getFee(){
	 return fee;
	 }
public void setFee(double fee){
	this.fee = fee;
	}
	
   
 public String toString(){
  return "Student[Person[name="+name+"address="+address+"program="+program+"year="+year+"fee="+fee+"]";
 }  
 
}  
class Staff extends Person{  
	 
 String school;  
 double pay;  

  
 Staff(String name, String address, String school, double pay){  
 super(name,address);
 this.school = school;  
 this.pay = pay;  
 }  
 public String getSchool(){
	 return school;
	 }
public void setSchool(String school){
	this.school = school;
	}	 
	
	public double getPay(){
	 return pay;
	 }
public void setPay(double pay){
	this.pay = pay;
	}
	
   
 public String toString(){
  return "Staff[Person[name="+name+"address="+address+"]"+"school="+school+"]"+"pay="+pay+"]";
 }  
 
}  
