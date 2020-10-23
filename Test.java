package Experiment3;


public class Test {
 static char opt;//创建Test类下的特有属性
 public char curriculumTest (char o){
	 return this.opt = o;}//方法为属性赋值
 public static void main(String args[]) {
  Teacher T1 = new Teacher("2019311012","张世博","男孩");
  Student S1 = new Student("2019311087","武晓娇","女孩");
  Course C1 = new Course("CST202-1","Java技术及应用","教300","1-16周",T1,S1);//调用相关类下的构造方法，为各类属性赋值信息
  T1.Selectcourse(C1);//老师授课
  S1.Selectcourse(C1);//学生选课
  System.out.println("学生信息 "+S1);//调用相关类下重写的toString()方法,输出各类属性赋值信息
  System.out.println("课程信息 "+C1);
  System.out.println("教师信息 "+T1);
  Test t= new Test();//创建Test类型的对象t
  t.curriculumTest('F');//调用方法为Test类型对象t中的属性赋值
  if(opt == 'T')//学生通过输入T/F实现选课退课
   System.out.println("恭喜你，选课成功!");
  if(opt == 'F')
   System.out.println("恭喜你，退课成功!");
   else
	   System.out.println("无效字符，请重新输入！");
 }
}