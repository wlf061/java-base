package basic.inherit;

/**
 * 类的描述
 *
 * @author nancy.wang
 * @Time 2019/1/16
 */


class SuperClass{
    private int num;
    SuperClass(){
        System.out.println("SuperClass()父类默认构造函数被调用");
    }

    SuperClass(int num){
        System.out.println("SuperClass(int num) 父类有参构造函数被调用");
        this.num = num;
    }
}

class SubClass extends  SuperClass{
    private int num;
    //子类不能继承父类的构造器,但是父类的构造器带有参数的，必须在子类的构造器中显示的通过super
    //关键字调用父类的构造器并配以适当的参数列表；
    SubClass(){
        super(300); //显示调用父类的构造函数
        System.out.println("SubClass 子类默认构造函数被调用");
    }
    public SubClass(int num){
        System.out.println("子类有参构造函数被调用SubClass(int num):" + num);
        this.num = num;
    }
}
public class TestSuperSub {
    public static void main(String str[]){
        SubClass subC = new SubClass();
        SubClass subC2 = new SubClass(100);
    }


}
