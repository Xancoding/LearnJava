# Java Web 
[JavaWeb 教程 已完结（IDEA 2021版本）4K蓝光画质 入土到起立](https://www.bilibili.com/video/BV1CL4y1i7qR?p=1&vd_source=ae16ff6478eb15c1b87880540263910b)

- 数据库与JDBC
- Maven 包管理工具
- JUnit 单元测试 
## Java网络编程（计算机网络）
通过 Socket 套接字技术，我们可以实现两台计算机之间的通信
它是操作系统底层提供的一项通信技术，支持 TCP 和 UDP

Java 对 Socket 底层支持进行了一套完整的封装

我们需要创建 客户端和服务端，服务器需要提前启动，来等待客户端的连接。客户端只需要随时启动去连接服务端即可

通过Socket对象，我们就可以获取到对应的IO流进行网络数据传输

## 数据库
MySQL + JDBC 

## Lombok(小辣椒)
Lombok 是一个 Java 类库，能自动插入编辑器并构建工具，减少 Java 开发的冗长代码，使代码简洁，提高开发效率

使用 Lombok 之后，我们只需要添加注解，就可以自动添加 getter/setter/toString 等方法

Lombok是一种插件化注解API，是通过添加注解来实现的，然后在javac进行编译的时候，进行处理

我们通过实战来演示一下Lombok的实用注解：

* 我们通过添加`@Getter`和`@Setter`来为当前类的所有字段生成get/set方法，他们可以添加到类或是字段上，注意静态字段不会生成，final字段无法生成set方法。
    * 我们还可以使用`@Accessors`来控制生成Getter和Setter的样式。
      * `chain`：是否使用链式风格。`Setter`返回当前对象。
      * `fluent`：是否使用fluent风格。只是方法写法不同，不一样的风格罢了，功能不变
* 我们通过添加`@ToString`来为当前类生成预设的toString方法。
  * 我们可以通过添加`@ToString.Exclude`来排除某个字段。
  * 我们可以通过添加`@ToString.Include`来指定某个字段。
  * 我们可以通过添加`@ToString(callSuper=true)`来调用父类的toString方法。
  * 我们可以通过添加`@ToString(of={"name","age"})`来指定某些字段。
  * 我们可以通过添加`@ToString(doNotUseGetters=true)`来不使用get方法。
  * 我们可以通过添加`ToString.Include(name="name",rank=1)`来指定顺序和字段名。
* 我们可以通过添加`@AllArgsConstructor`和`@NoArgsConstructor`来快速生成全参构造和无参构造。
  * `staticName`：是否使用静态工厂方法创建对象。
* 我们可以添加`@RequiredArgsConstructor`来快速生成参数只包含`final`或被标记为`@NonNull`的成员字段。
* 使用`@Data`能代表`@Setter`、`@Getter`、`@RequiredArgsConstructor`、`@ToString`、`@EqualsAndHashCode`全部注解。
    * 一旦使用`@Data`就不建议此类有继承关系，因为`equal`方法可能不符合预期结果（尤其是仅比较子类属性）。
* 使用`@Value`与`@Data`类似，但是并不会生成setter并且成员属性都是final的。
* 使用`@Builder`来快速生成建造者模式。
    * 通过使用`@Builder.Default`来指定默认值。
    * 通过使用`@Builder.ObtainVia`来指定默认值的获取方式。
    * 这是一种设计模式

