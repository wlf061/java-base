package basic.inherit.visible;

/**
 * @author nancy.wang
 * @Time 2019/1/16
 */
public class Person {
    private String aa;
    public String name;

    protected void printCallTrace(){
        System.out.println("call protected function");
    }

    void printTestProtectedInfo(){
        System.out.println("call protected printTestProtectedInfo function");
    }

    public String getAa() {
        return aa;
    }

    public void setAa(String aa) {
        this.aa = aa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
