# Java-Experiment2
  Java课程作业项目仓库
  
## 实验目的：
  （1、初步了解分析系统需求，从学生选课角度了解系统中的实体及其关系，学会定义类中的属性以及方法；  
  （2、掌握面向对象的类设计方法（属性、方法）；  
  （3、掌握类的继承用法，通过构造方法实例化对象；  
  （4、学会使用super()，用于实例化子类；  
  （5、掌握使用Object根类的toString（）方法,应用在相关对象的信息输出中；  

## 实验要求：
  ### 说明：
  学校有“人员”，分为“教师”和“学生”，教师教授“课程”，学生选择“课程”。从简化系统考虑，每名教师仅教授一门课程，每门课程的授课教师也仅有一位，每名学生选仅选一门课程。    
  ### 对象：
        人员（编号、姓名、性别）    
        教师（编号、姓名、性别、所授课程）    
	学生（编号、姓名、性别、所选课程）    
	课程（编号、课程名称、上课地点、时间、授课教师）    
  1.编写上述实体类以及测试主类（注意类之间继承关系的适用）  
  2.在测试主类中，实例化多个类实体，模拟学生选课操作、打印课程信息（信息包括：编号、课程名称、上课地点、时间、授课教师 等）；模拟学生退课操作，再打印课程信息。  

## 实验过程：
## 流程图：
## 核心代码：
## 注释：
## 系统运行截图：
## 编程感想：
   开始试验前，一定要先把老师上课讲解的PPT上的知识吃透，因为这是做实验的基础，否则开始做实验就会没有思路，无从下手，这也将会使我在做实验时的难度大大增加，浪费时间。所有编程语言的最终目的都是提供一种“抽象”方法。都有相似之处，尤其是C++和Java就像继承，C++也有涉及，C++是多重继承，而在Java中类的继承是单一继承，也就是说，一个子类只能拥有一个父类，所以extends只能继承一个类，因为多继承会引起混乱，使得继承链过于复杂，系统难于维护。因为子类无法继承父类的构造函数，所以子类必须通过super关键字调用父类的构造函数，而且还要注意的一点是，super()必须是子类构造函数中的第一行执行语句。还学到了几个新的类和方法，Object类和toString方法，Object类是类体系结构的根，如果在类的声明中
