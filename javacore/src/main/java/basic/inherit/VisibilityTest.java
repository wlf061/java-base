package basic.inherit;

import basic.inherit.visible.Person;

/**
 * 继承的可见性：
 * public: 修饰的成员可以在任何范围内直接访问，访问方式 对象.成员
 * protected: 修饰的成员可以在其所在类中、同一包中及子类中（无论子类在不在同一个包）被直接访问，
 *           但不能在位于不同包中的非子类中被直接访问，这里需要特别声明：在位于不同包的子类中必须是子类的对象才能直接访问其父类的protected成员，
 *           而父类自身的对象反而不能访问其所在类中声明的protected成员
 * default：缺省访问修饰符的成员只能在其所在类中或包中直接访问（可以是通过父类对象，或者子类对象访问)，在不同包中即使是不同包的子类也不能直接访问。
 * private：成员只能在所在类中被直接访问，是4种访问等级最高的一个。
 * @author nancy.wang
 * @Time 2019/1/16
 */
public class VisibilityTest extends Person {

    public void VisibilityTest(){
        this.getName();
    }

    public static void main(String[] args){
        Person p = new Person();
        //p.printCallTrace();  //报错, 不同包中的

        VisibilityTest child = new VisibilityTest();
        child.printCallTrace();   //子类可以访问 从父类继承的protected 方法(即使不在同一个包中也可以)
        //child.printTestProtectedInfo()  // 报错, 不在同一个包中不能访问， 同一个包的子类能访问。
    }
}
