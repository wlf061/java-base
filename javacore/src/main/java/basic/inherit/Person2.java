package basic.inherit;

/**
 * @author nancy.wang
 * @Time 2019/1/16
 */
public class Person2 {
    private String aa;
    public String name;

    void printCallTrace(){
        System.out.println("call Person2's protected function");
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
