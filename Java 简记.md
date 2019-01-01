[TOC]

# Java 简记

+ 本文仓促之间写成，代码直接在笔记里面写的，可能有诸多错误，敬请谅解，也欢迎指出帮助修正

+ 引用了官方API和网友博客的部分内容，仅作笔记

+ 关于实验的代码和PTA的代码，我放在了我的[GitHub仓库](https://github.com/FancyKings/Java_Experiment)里面，有需要的不嫌弃的可以看看

+ 当你看到本行文字的时候，说明这份笔记还没完稿

    ————————————————————————————————————————FancyKing

## Java 输入输出

### 基本控制台读写

+ 字节流 ： 数据流中按照字节为IO单元

    + OutputStream (是所有字节输出流的超类)
    + InputStream (是所有字节输入流的超类)

+ 字符流：  数据流中按照字符为IO单元

    + Writer (是所有字符输出流的超类)
    + Reader (是所有字符输入流的超类)

    四者都是抽象类，用起来比较麻烦

+ Java 系统的输入输出是 System.in & System.out，存在于Java.lang.System包中，**如果使用import ，就必须按照static 类型引入包数据 (import static java.lang.System.\*)**

    System包中只有三个基本方法，分别是 

    + err / out （PrintStream类型的标准输出流）
    + in (InputStream) 类型的标准输入流

+ 比较常用的几个输入输出

    + Scanner 输入

        类 Scanner直接继承于 Object， 实现了Iterator接口，支持正则表达式匹配

        声明：

        ​	Scanner cin = new Scanner(System.in)

        读入： 

        ​	cin.next()  获取下一个标记，可以理解为获取下一个按照空白符分割的元素，其中空白符默认通过Character.isWhitespace识别

        ​	cin.nextLine()  直接获取以 '\n' 为标记的一行数据

        ​	cin.next[Type] 获取下一个值为 Type类型的元素，其中Type可以替换为Java支持的int / BigInteger等数据类型

        ​	cin.hasNext() 判断是否存在按照空白符分割的下一个元素，同理其他cin.hasNext[Type]

    + PrintWriter 输出

        类 PrintWriter 继承自 java.io.Writer，间接继承Object

        声明：

        ​	PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out), true);

        ​	其中，第一个参数一般都是这么写，之后的第二个参数的描述为 autoflush，也就是是否自动刷新缓存，如果不设置为自动刷新缓存，那么在代码中手动通过 out.flush() 刷新缓存之前，控制台无输出(**如果进行了多个类的调用，必须在每一个类里面手动控制flush**)

        输出：

        ​	out.println()  其实这个的用法类似于 System的out，不赘述

        ​	out.fomat(String fomat, Object… o) 格式化fomat 字符串

    + StreamTokenizer 输出

        类 StreamTokenizer 直接继承 Object，优点就是速度快，结合PrintWriter一般可以解决Java卡输入输出的问题,缺点。。。就看下面声明多长吧

        声明：

        ​	StreamTokenizer cin = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)))

        读入：

        ​	cin.nextToken() 替换到下一个Tokenizer的位置

        ​	cin.nval 读入一个数字标记，默认类型是Double

        ​	cin.sval 读入一个文字标记，默认类型是String

        ​	cin.wordChars(int low, int high) 指定文字标记范围

        ​	TT_EOF 结束标记，写法类似于C/C++的EOF，同理TT_NUMBER， TT_WORD

+ 输入输出格式控制

    + 暂时只记录一个，就是去除BigDecimal的后置0

```java
BigDecimal bd = new BifDecimal(0);
System.out.println(bd.stripTrailingZeros().toPlainString());
System.out.println(bd.stripTrailingZeros().toString()); //这个是化成科学计数法表示
```



### 文件读写

+ BufferedReader 读取

```java
String dir = "/home/fancyking/test.txt";
try (BufferedReader readIn = new BufferedReader(new FileReader(dir))) {
    String line;
    while((line = readIn.readLine()) != null) {
        System.out.println(line);
    }
} catch (IOException e) {
    e.printStackTrace();
}
```

+ Scanner 读取

```java
String dir = "/home/fancyking/test.txt";
try (Scanner readIn = new Scanner(new File(dir))) {
    while(readIn.hasNextLine()) {
        System.out.println(readIn.nextLine());
    }
} catch (IOException e) {
    e.printStackTrace();
}
```

+ BufferedReader + Stream 读取

```java
String dir = "/home/fancyking/test.txt";
List<String> dic = new ArrayList<>(16);
try (BufferedReader readIn = Files.newBufferedReader(Paths.get(dir))) {
    dic = readIn.lines().collect(Collectors.toList()); // Can Replace By a lambda
    // readIn.lines().filter(o -> o.contains("A String")).map(String::trim).forEach(System.out::println);
} catch (IOException e) {
    e.printStackTrace();
}
```

+ BufferedWriter 写入

```java
String dir = "/home/fancyking/test.txt";
List<String> dic = new ArrayList<>(16);
try (BufferedWriter printOut = new BufferedWriter(new FileWriter (dir))) {
    for (String now : dic) {
        printOut.write(now + "\n"); // Attention NewLine
    }
} catch (IOException e) {
    e.printStackTrace();
}
```

+ Files.write 写入

```java
String dir = "/home/fancyking/testOut.txt";
String ori = "/home/fancyking/testIn.txt";
try {
    List<String> oriDic = Files.readAllLines(Paths.get(ori));
    Files.write(Paths.get(dir), oriDic);
} catch (IOException e) {
    e.printStackTrace();
}
```

+ 一次性全部读取（小文件）

```
String dir = "/home/fancyking/test.txt";
List<String> dic = null;
try {
    dic = Files.readAllLines(Paths.get(dir));
} catch (IOException e) {
    e.printStackTrace();
}

for (String now : dic) {
    System.out.println(now);
}
```

+ 需要注意的是，**Try-with-resource不支持 readAllLines**

+ File类与相关接口 （待写）



## Java 方法

### 方法的所属性

- 如果一个方法使用了  static 修饰，那么这个方法属于这个类本身，否则就属于实例对象。
- 在同一个类中，方法的调用者总是  this 或者 类
    - 当被调方法是普通方法的时候，默认使用 this 作为调用者
    - 当被调方法是静态方法的时候，默认使用 类 作为被调者



1. 方法不能独立定义，只能在类体内进行定义
2. 从逻辑上看，方法要么属于类本身，要么属于类的某一个实例对象
3. 永远无法独立的执行方法，执行方法必须使用类或者对象作为调用者

静态方法属于类本身，不属于任何实例对象，但是二者都可以调用

### 方法的参数传递机制

- Java 只有一种参数传递机制，就是值传递，相当于拷贝，拷贝之后的改变对于原实参没有影响

### 形参个数可变的方法

- 如果在定义方法的时候，在 ==最后一个形参== 后面增加三个点(.)， 则就表示该形参可以接受多个该类型的参数
- 形参个数可变对于每个方法最多只有一个，并且仅仅用于最后一个形参，其余形参个数不可变，传入自动转为数组的形式传入

### 方法重载

- Java中一个方法的判定要看三个方面：
    1. 调用者，方法的所属者，可以是对象，也可以是类
    2. 方法名， 方法的标识
    3. 形参列表， 当调用方法的时候，系统会根据实际传入的参数进行再一次的匹配
- 也就是说，如果要重载一个方法， 必须要保证两同一不同：同一个类中，方法名相同，参数列表不同
- 返回值，修饰符等其他因素不同的，不算做方法的重载
- 对于包含有形参可变的方法，当该位置只传入一个参数的时候，优先调用不是形参可变的方法

### 成员变量和局部变量

![成员变量和局部变量](https://i.loli.net/2018/10/16/5bc54385b83b1.png)

- 成员变量是在类里面进行定义的变量，局部变量是在方法里面定义的变量
- 成员变量分为类变量和实例变量两种，static 修饰的是类变量， 和类的生存时间相同， 没有static修饰的属于实例变量，和变量的生存时间相同
- 一个类的生存周期包括 : 类加载-类验证-类准备-类解析-类初始化-类使用-类卸载
    - 类加载-类验证-类准备-类初始化的发生顺序是确认的，但是解析阶段不一定，解析有可能

发生在初始化阶段之后，然后再去进行类使用

​			![类的生存周期](https://i.loli.net/2018/10/16/5bc55240288d5.jpg))

- 一个类中不能定义两个同名的成员变量(一个是类变量，一个是实例变量也不行)
- 同一个方法中不能定义同名的方法局部变量，但是不同的代码块变量可以重名
- 在允许的情况下，默认使用就近原则来进行变量的运算



### 局部变量的初始化和内存中的运行机制

- 局部变量经过定义后，只有在被赋值时才会被分配内存空间，定义时不进行初始化
- 局部变量总是保存在所在方法的 栈 内存中，栈中的变量无需系统垃圾回收，随方法或代码块结束而结束
- 尽可能的缩小局部变量的作用范围









## 隐藏和封装

### 封装

- 封装指的是将对象的状态信息隐藏在对象的内部，不允许外部程序直接访问对象的内部信息，而是通过类提供的方法来实现对内部信息的操作和访问

### 访问控制符

- Java的访问控制级别由大到小分别是： public - default - protected - private (当代码中不使用任何访问控制符来修饰类或者类成员的时候，默认调用 default 来修饰权限)
    - private : 当前类的访问权限，一个被private 修饰的属性或者方法只能值当前类中被调用
    - default : 包访问权限，被 default 修饰的属性或者方法可以被相同包下的类访问
    - protected : 子类访问权限， 被 protected 修饰的属性或者方法可以被同一个包中的子类访问，也可以被不同包中的子类访问
    - public : 公共访问权限， 可以被所有的类访问，无论包关系和继承与否
- 对于局部变量来说，作用域限定了他的有效访问空间，访问权限控制符对其无效
- 如果一个Java 源文件中定义的所有类都没有使用 public 进行修饰， 那么Java 源文件的文件名可以是任意合法文件名，但是如果一个 Java 源文件中定义了一个 public 修饰的类，那么这源文件的文件名必须与此类名相同
- 如果一个父类的方法希望被子类重写，最好使用 protected 方法



### package / import / import package

#### 包相关

- ==生成包 class 文件时，javac 必须带有 -d 选项==
- 在编写包文件的时候，位于包中的类，在文件系统中也必须有与包名层次结构相同的目录结构，即有一个以包名命名的文件夹下面才是类中的
- 调用运行该包中的类的时候，类名前需要指定包名。同一个包内的类可以直接调用
- 一个包源文件的第一条语句必须是非注释的 package 语句，一个源文件只能定义一个包
- 如果父包中的类需要使用子包中的类，必须使用子包的全名，不能省略父包部分
- Java 的包机制需要两个方面的保证
    - 源文件里面使用的 package 语句指定包名
    - class 文件必须放在对应的制定路径下

#### import 相关

- 文件中可以使用 import 语句来引入某一个包，如果在包中引入其他的包，必须出现在 package 语句之后
- import 语句的 * 匹配符只能代表类，而无法代表包名，默认导入java.lang
- import static 用于导入静态的成员变量方法，例如 System的使用可以化简未out



## Java常用容器类和接口

+ 在 `java.util` 包中，包括三个常用的数据结构接口：List / Set / Map
+ 详细点儿的包含继承关系如下

Collection

- List
    - LinkedList
    - Vector
    - ArrayList
- Map
    - TreeMap
    - HashMap
    - Hashtable
- Set
    - TreeSet
    - HashSet
- Queue
    - PriorityQueue

### Collection

- Collection 是所有集合类的接口，List / Set 都由 Collection 继承而来，基本操作都实现了，下面是[API文档](https://docs.oracle.com/javase/10/docs/api/java/util/Collection.html)的方法摘要
- Collections 是所有操作集合的工具类，提供了很多使用便捷的方法，集合的操作，排序等，大部分集合接口的实现类都不是多线程同步的，要是想使用多线程同步的话，需要使用 `Collections.synchronized*(new *)`来创建线程同步的集合类

![Collection](https://i.loli.net/2018/11/05/5be05d0626c52.png)





### List

- ArrayList / Vector 是线性表，效率都比不上数组，但是可以扩展较为固定的数组，此外使用ArrayList效率一般比较好，但是，Vector默认是线程同步的，而ArrayList不是线程安全的

- LinkedList 是基于链表实现的，对于频繁的删除插入，使用LinkedList的效率更好
- LinkedList的几个常用方法

|           Method            |           Description            |
| :-------------------------: | :------------------------------: |
| add([int index,] E element) |        在index处插入元素         |
|        addFirst(E e)        |      在列表头部加入指定元素      |
|        addLast(E e)         |      在列表尾部加入指定元素      |
|     contains(Object o)      |       判断列表中是否包含 o       |
|         peekFirst()         |     获取但不删除列表头部元素     |
|         pollLast()          |      获取并移除列表尾部元素      |
|     remove([int index])     |     移除指定位置[首位]的元素     |
|      remove(Object o)       | 移除列表中第一次上出现的指定元素 |
|           size()            |           列表元素个数           |



### Map

- HashMap
    - HashMap 的实质的存储一个Entry对象，每次将 put 进来的键值对转换成一个 Entry 对象储存到一个 Entry 数组中，位置是由 key 的哈希值和数组长度计算的来，采用直接覆盖的形式添加元素，即先通过 hashcode找到数组中的某一个元素，再通过 key 的 equals 方法在链表中找到与之对应的 value
- TreeMap
    - TreeMap 的实现是一个由Entry元素构成的红黑树，每次put进入的蒜素按照定义时传入的Comparator进行排序，依然保证 key 唯一有序
- HashTable
    - HashTable 和 HashMap 差不多，但是区别在以下几点
        - HashMap不是线程安全的，当有多个线程共用，不会被同步锁锁定，而是会抛出异常
        - HashMap可以另存储的 key 是 null， 但是HashTable不可以
        - HashMap中元素的顺序是不固定的
- 经常创建的不是Map，而是HashMap，方法比较多，记录几个极其常用的
    - get(Object Key) 	获取指定的 key 键的 value 值
    - put(Object Key, Object value)    覆盖性的存放当前的键值对
    - containsKey(Object Key)    判断Map中是否包含某一个key键元素
- **需要覆盖重写的方法**
    - equals(Object o)
    - hashCode()
- **Map遍历没有直接的获取方式，只能通过“视图”的方式，分别是**
    - entrySet()    返回值是Map映射的Set视图，每一个元素都是Map.Entry对象，获取键 / 值得方法是 getKey() / getValue()
    - keySet()    返回Map的Set视图，此时对Set操作将会关联性得影响Map中的映射
    - values()    返回Map的Collection视图，同操作关联
    - 每一种便利还都无法直接遍历，都必须使用Iterator迭代器

```java
/* ForEach 方法 */
Map<Integer, Integer> dic = new HashMap<Integer, Integer>();

/* 遍历全部Map映射的Key 和 Value */
for (Map.Entry<Integer, Integer> now : map.entrySet()) {
    System.out.println(now.getKey());
    System.out.println(now.getValue());
}

/* 仅仅遍历Map映射的Key键 */
for (Integer now : dic.keySet()) {
    System.out.println(now);
}

/* 仅仅遍历Map映射的Value值 */
for (Integer now : dic.values()) {
    System.out.println(now);
}
```

- ForEach 方法只能用于JDK 5之后的版本，并且在**遍历之前必须检查Map是否为空**，避免遍历空Map抛出NullPointerException异常

```java
/* 使用 Iterator 方法， 可以在遍历的时候通过迭代器删除元素(it.remove()) */

/* 使用泛型 */
Map<Integer, Integer> dic = new HashMap<Integer, Integer>();
Iterator<Map.Entry<Integer, Integer>> it = dic.entrySet().iterator();
while(it.hasNext()) {
    Map.Entry<Integer, Integer> now = it.next();
    System.out.println(now.getKey());
    System.out.println(now.getValue());
}

/* 不使用泛型 */
Map dic = new HashMap();
Iterator it = dic.entrySet().iterator();
while(now.hasNext()) {
    Map.Entry now = (Map.Entry) it.next();
    Iterator key = (Iterator) now.getKey();
    Iterator value = (Iterator) now.getValue();
    System.out.println(key);
}
```

- 下面这种方法效率太低，不建议使用

```java
Map<Integer, Integer> dic = new HashMap<Integer, Integer>();
for(Integer key : map.keySet()) {
    Integer value = map.get(key);
}
```

- **HashMap 的排序，使用Collections的sort或者自身List的sort**
    - 详细的排序放在了下面
    - sort需要传入一个自定义的Comparator参数，重载其compare方法，根据返回值正负实现比较排序， Comparator的类型是需要比较的类型
    - 根据key进行比较可以只传一个类型，但是对于value排序必须先将其转换为ArrayList，Comparator使用Map.Entry<>类型

```java
Map<String, Integer> dic = new HashMap<>(16);
List<Map.Entry<String, Integer>> dicList = new ArrayList<>(dic.entrySet());
// Collections.sort(dicList, new Comparator<Map.Entry<String, Integer>>() {
dicList.sort(new Comparator<Map.Entry<String, Integer>>() {
	@Override
    public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2){
        return - o1.getValue() + o2.getValue();
    }
});
```

- TreeMap的排序可以在一开始就指定，在new的时候默认参数写入一个Comparator即可，与上文类似

    |       Method        |            Description            |
    | :-----------------: | :-------------------------------: |
    | put(K key, V value) |       创建key到value的映射        |
    |   get(Object key)   |  返回指定键的值，不存在返回null   |
    |       size()        |          返回映射的个数           |
    |      keySet()       | 返回此映射中包含的所有键的set视图 |
    |      values()       | 返回映射中包含键的Collection视图  |
    | remove(Object key)  |    如果映射中包含映射，则删除     |
    |     hashCode()      |            返回哈希码             |

![HashMap](https://i.loli.net/2018/11/07/5be2c36c2f1df.png)



### Set

- Set内部保证不含有重复元素，但是储存时无序的，判断重复根据的是equals方法，空元素也至多有一个
- Set 的方法继承自Collection，但是增加了禁止元素重复和
- HashSet基于哈希表，实际上是维护了一个HashMap
- 默认认为同一个对象的所有引用都是相同的元素，但是如果想要使得两个不同的元素某种情况下相等，就必须重写 hashCode（hashCode一般默认是根据对象的内存地址计算出来的） 和 equals 方法
    - 如果调用hashCode返回结果相同但是equals返回false，Set也会加入元素，此时元素的hashCode依然相同，但是会在此哈希值下继续储存，放在一个该哈希值的集合中
    - 如果调用hashCode放回结果是不同的，则Set认为无论如何而这不可能相等

![Set](https://i.loli.net/2018/11/07/5be2d0932a954.png)

### Queue

- 主要是优先队列，一般基于最大最小堆实现，可以实现根据优先级高低进行取值访问
- 在使用时，尽量使用offer来加入元素，使用poll来获取首元素，避免add和remove方法错误时抛出异常
- LinkedList实现了Queue的接口，因此可以使用Queue来new LinkedList

![PriorityQueue](https://i.loli.net/2018/11/06/5be19db50062c.png)



### 排序[接口Comparator] - 我也还在看，这个递归好深啊\~\~\~

- 可以作为参数被传递到Collection.sort 和 Arrays.sort方法中，也可以传入某些数据结构中，控制排序
- 与equals一致的排序：compare(e1, e2) == 0 与 e1.equals(e2) 的真假相同时，Comparator进行的排序
- 一个参数需要Override的是compare，用来比较排序的两个参数，另一个是equals

#### Collections排序

+ 第一种是使用Collections.sort 进行排序，可以传入两个参数，第一个参数是要排序的Collection，第二个是比较器类Comparator， 当然，定义出来的List等数组名也可以直接调用sort方法，具体代码看下文的Map排序就好
+ 第二种就是使用Comparable 接口来实现，通过implements继承Comparable接口，在类中重载compare方法，就可以直接调用sort，省略创建Comparator来进行sort排序

#### Map排序

+ TreeMap 中默认按照 key 的升序排序，如果要修改的话，可以在创建的时候直接传入Comparator
+ Map提供了三种视图，都是Collection，分别是键值， 集值， 键值对映射关系，，迭代器返回的元素顺序在某些类中不一定有序(HashMap  的映射集不一定有序，但是Tree的可以)
+ Map.entrySet() 方法返回映射关系的Set视图，在源Map中进行的修改可以在Set中体现，但是在Set中进行的修改无法在Map中正确的反应，此外其只支持移除操作，无法添加元素，下面的是Map.java和HashMap.java给出的实现(其中entrySet是一个HashMap中的值：transient Set<Map.Entry<K,V>> entrySet;也就是保存的缓存的entrySet，transient是一个关键字，用于屏蔽变量，不能再递归了！)

```java
// initial
Set<Map.Entry<K, V>> entrySet();

// HashMap
public Set<Map.Entry<K,V>> entrySet() {
    Set<Map.Entry<K,V>> es;
    return (es = entrySet) == null ? (entrySet = new EntrySet()) : es;
}
```



+ Map本身不支持排序，只能是先将Map中的每一个元素映射到List，或者Set，使用的方法就是使用entrySet()将本身键值对映射给List 或者 Set
+ Map.Entry 是一个键值对的映射项，通过Map.entrySet()方法映射的Collection视图中的每个元素都属该类型，注意的是，Map.Entry 对象仅仅在迭代期间有效，也就是改变他的值，源不一定会进行相应的修改，除非使用其setValue()在映射项上直接操作

+ 其实前面记不住也无所谓，不理解更无所谓，下面上代码看排序

```java
Map<String, Integer> dic = new HashMap<>(16);
List<Map.Entry<String, Integer>> toList = new ArrayList<>(dic.entrySet());

// Choose One
// Collections.sort(toList, new Comparator<Map.Entry<String, Integer>>(){
// Choose Two below
ToList.sort(new Comparator<Map.Entry<String, Integer>>() {
    @Override
    public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
        if (o1.getValue().equals(o2.getValue())) {
            return o1.getKey().compareTo(o2.getKey());
        } else {
            return o2.getValue() - o1.getValue();
        }
    }
}); // Don't Foget ;
```

如果熟悉Lambda表达式的话，上述代码可以简化为：(第 4 行)

```java
Map<String, Integer> dic = new HashMap<>(16);
List<Map.Entry<String, Integer>> toList = new ArrayList<>(dic.entrySet());

toList.sort((o1, o2) -> {
    @Override
    public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
        if (o1.getValue().equals(o2.getValue())) {
            return o1.getKey().compareTo(o2.getKey());
        } else {
            return o2.getValue() - o1.getValue();
        }
    }
}); // Don't Foget ;
```

