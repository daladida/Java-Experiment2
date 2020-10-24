# Java-Experiment2
  *Java课程作业项目仓库*
  
## 实验目的：
  * 初步了解分析系统需求，从学生选课角度了解系统中的实体及其关系，学会定义类中的属性以及方法；  
  * 掌握面向对象的类设计方法（属性、方法）；  
  * 掌握类的继承用法，通过构造方法实例化对象；  
  * 学会使用super()，用于实例化子类；  
  * 掌握使用Object根类的toString（）方法,应用在相关对象的信息输出中；  

## 实验要求：
  ### 说明：
  `学校有“人员”，分为“教师”和“学生”，教师教授“课程”，学生选择“课程”。从简化系统考虑，每名教师仅教授一门课程，每门课程的授课教师也仅有一位，每名学生选仅选一门课程。`    
  ### 对象：
    人员（编号、姓名、性别）  
    教师（编号、姓名、性别、所授课程）  
    学生（编号、姓名、性别、所选课程）  
    课程（编号、课程名称、上课地点、时间、授课教师、选课学生）
  >编写上述实体类以及测试主类（**注意类之间继承关系的适用**）  
  >在测试主类中，实例化多个类实体，模拟学生选课操作、打印课程信息（*信息包括：编号、课程名称、上课地点、时间、授课教师、选课学生等*）；  
  >模拟学生退课操作，再打印课程信息。  

## 实验过程：
>* Person类下定义三个基本属性（ID、Name、Sex），利用构造方法实例化对象为属性赋值；    
>* Student类继承Person类，获得父类属性，同时定义一个Course对象Course（所选课程），其数据类型为Course型。然后通过构造方法，在其首行利用super()方法实例化子类，为父类属性赋值；    
>定义Setcourse(Course ce)方法，对Course（所选课程）属性进行赋值，实现学生选课操作。重写toString()方法，将相关属性以既定方式输出显示；    
>* Techer类继承Person类，获得父类属性，同时定义一个Course对象Course（所授课程），其数据类型为Course型。然后通过构造方法，在其首行利用super()方法实例化子类，为父类属性赋值；    
>定义Setcourse(Course ce)方法，对Course（所授课程）属性进行赋值，实现老师授课操作。重写toString()方法，将相关属性以既定方式输出显示；    
>* Course类下定义六个基本属性（ID、Name、Location、Time、Teacher【授课教师】、Student【选课学生】），利用构造方法实例化对象为属性赋值；   
>>* 在Test主类中，定义类下的特有属性static char opt以及方法curriculumTest(char o)为opt赋值；  
>>>main方法中创建一个Teacher对象T1，调用构造方法对其父类属性（ID、Name、Sex）赋值；  
>>>main方法中创建一个Student对象S1，调用构造方法对其父类属性（ID、Name、Sex）赋值；  
>>>main方法中创建一个Course对象C1，调用构造方法为其自身属性（ID、Name、Location、Time、Teacher【授课教师】、Student【选课学生】）赋值；  
>>>然后分别调用S1与T1下的Setcourse(Course ce)方法，将参数ce改为C1，实现学生选课，老师授课；  
>>>接着调用相关类下重写的toString()方法,输出各类属性赋值信息；  
>>>>* 为模拟学生选课操作  
>>>>main方法中创建一个Test对象t，然后调用t下的curriculumTest(char o)方法，输入字符型参数T/F（意为选课/不选课）  
>>>>通过if条件判断语句，输出相应的提示信息，实现学生的退选课；  
## 流程图：
![image](https://github.com/daladida/Java-Experiment2/blob/main/images/%E6%AD%A6%E6%99%93%E5%A8%87.jpg)
## 核心代码：
### Student类
```javascript
public class Student extends Person {//Student类继承Person类，获得父类属性
 public Course Course;//添加Student类的特有属性(所选课程)
 Student (String i,String n,String s){
  super(i,n,s);//super()实例化子类，为父类属性赋值
 }
 public void Selectcourse (Course ce) {
	 this.Course = ce;
 }
 public String toString() {//重写toString()方法，将相关属性以既定方式输出显示
  return "编号:"+this.ID+" 姓名:"+this.Name+" 性别:"+this.Sex+" 所选课程:"+this.Course.Name;
 }
}
```
### Teacher类
```javascript
public class Teacher extends Person{//Teacher类继承Person类，获得父类属性
 public Course Course;//添加Teacher类的特有属性(所授课程)
 Teacher (String i,String n,String s){
  super(i,n,s);//super()实例化子类，为父类属性赋值
 }
 public void Selectcourse (Course ce) {
	 this.Course = ce;
 }
 public String toString() {//重写toString()方法，将相关属性以既定方式输出显示
  return "编号:"+this.ID+" 姓名:"+this.Name+" 性别:"+this.Sex+" 所授课程:"+this.Course.Name;
 }
}
```
### Course类
```javascript
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
```
### Test类
```javascript
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
```
## 系统运行截图：
![image](https://github.com/daladida/Java-Experiment2/blob/main/images/%E5%AE%9E%E9%AA%8C%EF%BC%88%E4%BA%8C%EF%BC%89%E8%BF%90%E8%A1%8C%E7%BB%93%E6%9E%9C.png)
## 编程感想：
  开始试验前，一定要先把老师上课讲解的PPT上的知识吃透，因为这是做实验的基础，否则开始做实验就会没有思路，无从下手，这也将会使我在做实验时的难度大大增加，浪费时间。所有编程语言的最终目的都是提供一种“抽象”方法。都有相似之处，尤其是C++和Java就像继承，C++也有涉及，C++是多重继承，而在Java中类的继承是单一继承，也就是说，一个子类只能拥有一个父类，所以extends只能继承一个类，因为多继承会引起混乱，使得继承链过于复杂，系统难于维护。因为子类无法继承父类的构造函数，所以子类必须通过super关键字调用父类的构造函数，而且还要注意的一点是，super()必须是子类构造函数中的第一行执行语句。还学到了几个新的类和方法，Object类和toString方法，Object类是类体系结构的根，如果在类的声明中
