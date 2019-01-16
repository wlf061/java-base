- Java中修饰符的作用域及可见性
  1. public: 修饰的成员可以在任何范围内直接访问，访问方式 对象.成员
  2. protected: 修饰的成员可以在其所在类中、同一包中及子类中（无论子类在不在同一个包）被直接访问，
               但不能在位于不同包中的非子类中被直接访问，这里需要特别声明：在位于不同包的子类中必须是子类的对象才能直接访问其父类的protected成员，
               而父类自身的对象反而不能访问其所在类中声明的protected成员
  3. default：缺省访问修饰符的成员只能在其所在类中或包中直接访问（可以是通过父类对象，或者子类对象访问），在不同包中即使是不同包的子类也不能直接访问。
  4. private：成员只能在所在类中被直接访问，是4种访问等级最高的一个。

- 内部类介绍
  1. 内部类拥有外部类的所有元素的访问权限
  2. 一般的非内部类 是不允许有private 和protected,但是内部类可以
  3. 可以实现多重继承:多个内部类可以继承多个外部类，对当前类而言就是多继承
  4. 分类：
     - 静态内部类：作为静态成员，存在于某个类的内部
     - 成员内部类：作为类的成员，存在于某个类的内部
     - 局部内部类：存在于某个方法的内部
     - 匿名内部类：存在于某个类的内部，但是无类名

- Java 程序初始化顺序（CodeBlockTest）
  1.静态对象（变量）优先于非静态对象（变量）初始化。其中静态对象（变量）只初始化一次，而非静态对象（变量）可能会初始化很多次
  2.父类优先于子类进行初始化
  3.按照成员变量的定义顺序进行初始化。即使变量定义散布于方法之中，他们依然在任何方法（包括构造函数）被调用前先初始化
  4. 总的顺序：
    父类静态字段初始化
    父类静态代码块
    子类静态字段初始化
    子类静态代码块
    父类普通字段初始化
    父类构造代码块
    父类构造函数
    子类普通字段初始化
    子类构造代码块
    子类构造函数

