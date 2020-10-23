package Experiment3;

public class Course {//添加课程的基本属性
 String ID;
 String Name;
 String Location;
 String Time;
 Teacher Teacher;
 Student Student;
 Course (String i,String n,String l,String te,Teacher tr,Student st){//通过构造方法实例化对象为属性赋值
  this.ID = i;
  this.Name = n;
  this.Location = l;
  this.Time = te;
  this.Teacher = tr;
  this.Student = st;
 }
 public String toString() {//重写toString()方法，将相关属性以既定方式输出显示
  return "编号:"+this.ID+" 课程名称:"+this.Name+" 上课地点:"+this.Location+" 时间:"+this.Time+" 授课教师:"+this.Teacher.Name+" 选课学生:"+this.Student.Name;
 }
}