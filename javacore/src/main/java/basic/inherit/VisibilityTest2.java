package basic.inherit;

public class VisibilityTest2 extends Person2 {

    public void VisibilityTest(){
        this.getName();
    }

    public static void main(String[] args){
        Person2 p = new Person2();
        p.printCallTrace();   //

        VisibilityTest2 child = new VisibilityTest2();
        child.printCallTrace();  // default 成员变量， 同一个包中的子孙类可以访问
    }
}
