![](https://bu.dusays.com/2023/10/05/651e5d73b2fb6.png)
# Java Web 
这门课不需要敲代码，因为都是已经不用的技术了，知道有这么些东西就可以了

- [JavaWeb 教程 已完结（IDEA 2021版本）4K蓝光画质 入土到起立](https://www.bilibili.com/video/BV1CL4y1i7qR?p=1&vd_source=ae16ff6478eb15c1b87880540263910b)
- Java Web 知识库： 对应的 markdown 文档在 notes/JavaWeb笔记 下

## Java网络编程（计算机网络）
通过 Socket 套接字技术，我们可以实现两台计算机之间的通信
它是操作系统底层提供的一项通信技术，支持 TCP 和 UDP

Java 对 Socket 底层支持进行了一套完整的封装

我们需要创建 客户端和服务端，服务器需要提前启动，来等待客户端的连接。客户端只需要随时启动去连接服务端即可

通过Socket对象，我们就可以获取到对应的IO流进行网络数据传输

## 数据库与JDBC
MySQL + JDBC

配置 `SQL Dialect` 
![](https://bu.dusays.com/2023/09/28/6514d25d3df8c.png)

## Lombok(小辣椒)
Lombok 是一个 Java 类库，能自动插入编辑器并构建工具，减少 Java 开发的冗长代码，使代码简洁，提高开发效率

使用 Lombok 之后，我们只需要添加注解，就可以自动添加 getter/setter/toString 等方法

Lombok是一种插件化注解API，是通过添加注解来实现的，然后在javac进行编译的时候，进行处理

## MyBatis 
- [MyBatis 官方文档](https://mybatis.org/mybatis-3/zh/getting-started.html)
- [MyBatis](https://www.bilibili.com/video/BV1CL4y1i7qR?p=37&vd_source=ae16ff6478eb15c1b87880540263910b)
- 这部分视频只看了部分，之后有需要再回过来补

XML 主要是存放数据，它更像是一个配置文件！

不仅仅是Mybatis，包括后面的Spring等众多框架都会用到XML来作为框架的配置文件！

每个基于 MyBatis 的应用都是以一个 SqlSessionFactory 的实例为核心的，我们可以通过`SqlSessionFactory`来创建多个新的会话，`SqlSession`对象，每个会话就相当于我不同的地方登陆一个账号去访问数据库，你也可以认为这就是之前JDBC中的`Statement`对象，会话之间相互隔离，没有任何关联。

而通过`SqlSession`就可以完成几乎所有的数据库操作，我们发现这个接口中定义了大量数据库操作的方法，因此，现在我们只需要通过一个对象就能完成数据库交互了，极大简化了之前的流程。

## JUnit 单元测试
使用 JUnit 进行单元测试

### JUnit 4
@Test 注解：用来标记测试方法。当我们执行测试方法时，就会自动执行该方法

@Before 注解：在测试方法之前执行。在测试方法之前，我们可以进行一些初始化操作

@After 注解：在测试方法之后执行。在测试方法之后，我们可以进行一些资源释放操作
### JUnit 5
@DisplayName 注解：用来标记测试类或测试方法的名称

@Test 注解：用来标记测试方法。当我们执行测试方法时，就会自动执行该方法

@BeforeAll 注解：在测试方法之前执行。在测试方法之前，我们可以进行一些初始化操作
@BeforeEach 注解：在测试方法之前执行。在测试方法之前，我们可以进行一些初始化操作

@AfterAll 注解：在测试方法之后执行。在测试方法之后，我们可以进行一些资源释放操作
@AfterEach 注解：在测试方法之后执行。在测试方法之后，我们可以进行一些资源释放操作

## Maven 包管理工具
### 使用 Maven 管理项目 

- 项目的自动构建，包括代码的编译、测试、打包、安装、部署等
- 依赖管理，项目使用到哪些依赖，可以快速完成导入

可能在导入依赖时，出现卡顿的问题。建议配置一下IDEA自带的Maven插件远程仓库地址，这样就可以快速导入依赖了

### Maven 依赖作用域
- compile：默认的依赖范围，编译、测试、运行都有效，比如 Spring
- provided：已提供依赖范围，编译和测试时有效，运行时无效，比如 Lombok
- runtime：运行时依赖范围，测试和运行时有效，编译时无效，比如 JDBC 驱动
- test：测试依赖范围，只在测试的时候有效，编译和运行时无效，比如 JUnit

### Maven 常用命令
- mvn clean：清理项目，清理掉 target 目录
- mvn compile：编译项目，编译源代码，生成 target 目录
- mvn install：安装，会自动编译源代码和测试代码，然后运行测试，最后打包，最后将打包的结果复制到本地仓库

### Maven 测试项目
- mvn test：测试项目，会自动编译源代码和测试代码，然后运行测试

由于JUnit5比较新，我们需要重新配置插件升级到高版本，才能完美的兼容JUnit5(2021-10-26)

### Maven打包项目
- mvn package：打包项目，会自动编译源代码和测试代码，然后运行测试，最后打包

我们的项目在编写完成之后，要么作为Jar依赖，供其他模型使用，要么就作为一个可以执行的程序，在控制台运行，我们只需要直接执行`package`命令就可以直接对项目的代码进行打包，生成jar文件。

当然，以上方式仅适用于作为Jar依赖的情况
如果我们需要打包一个可执行文件，那么我不仅需要将自己编写的类打包到Jar中，同时还需要将依赖也一并打包到Jar中
 因为我们使用了别人为我们通过的框架，自然也需要运行别人的代码，我们需要使用另一个插件来实现一起打包:
```xml
<plugin>
    <artifactId>maven-assembly-plugin</artifactId>
    <version>3.1.0</version>
    <configuration>
        <descriptorRefs>
            <descriptorRef>jar-with-dependencies</descriptorRef>
        </descriptorRefs>
        <archive>
            <manifest>
                <addClasspath>true</addClasspath>
                <mainClass>com.test.Main</mainClass>
            </manifest>
        </archive>
    </configuration>
    <executions>
        <execution>
            <id>make-assembly</id>
            <phase>package</phase>
            <goals>
                <goal>single</goal>
            </goals>
        </execution>
    </executions>
</plugin>
```

在打包之前也会执行一次test命令，来保证项目能够正常运行，当测试出现问题时，打包将无法完成，我们也可以手动跳过，选择`执行Maven目标`来手动执行Maven命令，输入`mvn package -Dmaven.test.skip=true `来以跳过测试的方式进行打包。

最后得到我们的Jar文件，在同级目录下输入`java -jar xxxx.jar`来运行我们打包好的Jar可执行程序（xxx代表文件名称）

## Tomcat 服务器
Tomcat（汤姆猫）就是一个典型的Web应用服务器软件
通过运行Tomcat服务器，我们就可以快速部署我们的Web项目，并交由Tomcat进行管理
我们只需要直接通过浏览器访问我们的项目即可。

## Servlet 
### 初识 Servlet
它是Java EE的一个标准，大部分的Web服务器都支持此标准，包括Tomcat，就像之前的JDBC一样，由官方定义了一系列接口，而具体实现由我们来编写，最后交给Web服务器（如Tomcat）来运行我们编写的Servlet。
那么，它能做什么呢？我们可以通过实现Servlet来进行动态网页响应，使用Servlet，不再是直接由Tomcat服务器发送我们编写好的静态网页内容（HTML文件），而是由我们通过Java代码进行动态拼接的结果，它能够很好地实现动态网页的返回。
当然，Servlet并不是专用于HTTP协议通信，也可以用于其他的通信，但是一般都是用于HTTP。

浏览器每次发起一次请求，服务器都会创建一个新的线程去处理这个请求，这样就可以实现多个用户同时访问，而不会相互影响。

### 重定向和请求转发
两者的区别为：

* 请求转发是一次请求，重定向是两次请求
* 请求转发地址栏不会发生改变， 重定向地址栏会发生改变
* 请求转发可以共享请求参数 ，重定向之后，就获取不了共享参数了
* 请求转发只能转发给内部的Servlet

## Cookies
Cookie 是一种客户端技术，它是由服务器创建，发送给浏览器，浏览器会将Cookie保存起来，当下次浏览器再次访问服务器时，会将Cookie再次发送给服务器，服务器就可以通过Cookie来识别用户。
![](https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fwww.uml.org.cn%2Fxjs%2Fimages%2F2019032226.jpg&refer=http%3A%2F%2Fwww.uml.org.cn&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1640427806&t=a452f8b27a0769ca82d2269664e71a5e)
我们可以通过使用Cookie来实现记住我功能，我们可以将用户名和密码全部保存在Cookie中，如果访问我们的首页时携带了这些Cookie，那么我们就可以直接为用户进行登陆，如果登陆成功则直接跳转到首页，如果登陆失败，则清理浏览器中的Cookie。

现在已经离我们理想的页面越来越接近了，但是仍然有一个问题，就是我们的首页，无论是否登陆，所有人都可以访问，那么，如何才可以实现只有登陆之后才能访问呢？这就需要用到Session了。

## Session
由于HTTP是无连接的，那么如何能够辨别当前的请求是来自哪个用户发起的呢？Session就是用来处理这种问题的，每个用户的会话都会有一个自己的Session对象，来自同一个浏览器的所有请求，就属于同一个会话。

但是HTTP协议是无连接的呀，那Session是如何做到辨别是否来自同一个浏览器呢？Session实际上是基于Cookie实现的，前面我们了解了Cookie，我们知道，服务端可以将Cookie保存到浏览器，当浏览器下次访问时，就会附带这些Cookie信息。

Session也利用了这一点，它会给浏览器设定一个叫做`JSESSIONID`的Cookie，值是一个随机的排列组合，而此Cookie就对应了你属于哪一个对话，只要我们的浏览器携带此Cookie访问服务器，服务器就会通过Cookie的值进行辨别，得到对应的Session对象，因此，这样就可以追踪到底是哪一个浏览器在访问服务器。

## Filter 过滤器
有了Session之后，我们就可以很好地控制用户的登陆验证了，只有授权的用户，才可以访问一些页面，但是我们需要一个一个去进行配置，还是太过复杂，能否一次性地过滤掉没有登录验证的用户呢？

过滤器相当于在所有访问前加了一堵墙，来自浏览器的所有访问请求都会首先经过过滤器，只有过滤器允许通过的请求，才可以顺利地到达对应的Servlet，而过滤器不允许的通过的请求，我们可以自由地进行控制是否进行重定向或是请求转发。并且过滤器可以添加很多个，就相当于添加了很多堵墙，我们的请求只有穿过层层阻碍，才能与Servlet相拥，像极了爱情。

![](https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fimages.cnitblog.com%2Fblog%2F150046%2F201501%2F072114593437292.png&refer=http%3A%2F%2Fimages.cnitblog.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1640479081&t=a1259950e28398b095ea7ce30c022904)

由于过滤器的过滤顺序是按照类名的自然排序进行的，因此我们将第一个过滤器命名进行调整。

我们发现，在经过第一个过滤器之后，会继续前往第二个过滤器，只有两个过滤器全部经过之后，才会到达我们的Servlet中。

![](https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fimages.cnitblog.com%2Fblog%2F34303%2F201212%2F30153033-d9e09a9c8dfe403fb9f6303052ba4b6c.png&refer=http%3A%2F%2Fimages.cnitblog.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1640479150&t=d14eb2b4c2a3d6e987fc9cf6680a326f)

# Java Spring 核心课程
- [Java Spring 核心课程](https://www.bilibili.com/video/BV1Kv4y1x7is/?spm_id_from=333.999.0.0&vd_source=ae16ff6478eb15c1b87880540263910b)
- [Java Spring 知识库](https://itbaima.net/document)
- Java SSM（Spring+SpringMVC+Mybatis）

Spring是一个框架（文档：https://docs.spring.io/spring-framework/docs/6.0.10/reference/html/core.html#spring-core）
它就是为了简化开发而生，它是轻量级的IoC和AOP的容器框架，主要是针对Bean的生命周期进行管理的轻量级容器，并且它的生态已经发展得极为庞大。

![image-20221121233807593](https://image.itbaima.net/markdown/2022/11/21/KT2XhuCNVmcSvi5.png)

## IOC 容器基础
IOC是Inversion of Control的缩写，翻译为：“控制反转”，把复杂系统分解成相互合作的对象，这些对象类通过封装以后，内部实现对外部是透明的，从而降低了解决问题的复杂度，而且可以灵活地被重用和扩展。

我们可以将对象交给IoC容器进行管理，比如当我们需要一个接口的实现时，由它根据配置文件来决定到底给我们哪一个实现类，这样，我们就可以不用再关心我们要去使用哪一个实现类了，我们只需要关心，给到我的一定是一个可以正常使用的实现类，能用就完事了，反正接口定义了啥，我只管调，这样，我们就可以放心地让一个人去写视图层的代码，一个人去写业务层的代码，开发效率那是高的一匹啊。

即使我们的底层实现类发生了修改，也不会导致与其相关联的类出现错误，而进行大面积修改，通过定义抽象+容器管理的形式，我们就可以将原有的强关联解除。

高内聚，低耦合，是现代软件的开发的设计目标，而Spring框架就给我们提供了这样的一个IoC容器进行对象的的管理，一个由Spring IoC容器实例化、组装和管理的对象，我们称其为Bean。

使用Spring首要目的是为了使得软件项目进行解耦，而不是为了去简化代码！通过它，就可以更好的对我们的Bean进行管理

Spring是一个非入侵式的框架，就像一个工具库一样，它可以很简单地加入到我们已有的项目中，因此，我们只需要直接导入其依赖就可以使用了

### Bean注册与配置
使用Spring来管理我们的对象，并向IoC容器索要被管理的对象。这节课我们就来详细了解一下如何向Spring注册Bean以及Bean的相关配置。

懒加载：只有在使用到Bean时，才会进行初始化，而不是在容器启动时就初始化

- name
- class
- alias
- scope
- lazy-init
- depends-on

### 依赖注入

- property——Setter依赖注入：通过成员属性对应的set方法完成注入。要求对应的属性必须有一个 `set` 方法
  - name：`name` 属性应该与要注入的Java类的属性名称相匹配。
  - ref ：`ref` 属性应该是你要注入的其他Bean的名称。
  - value：直接使用`value`可以直接传入一个具体值。
- constructor-arg——构造方法依赖注入：通过构造方法完成注入。
  - name
  - ref 
  - value 
- List，Map、Set这类常用集合类也可以作为类的成员变量，且可以被配置

### 自动装配
- autowire：自动装配，通过自动装配，Spring会自动为我们注入对应的属性，我们不需要再手动进行注入了。
  - 我们只需要将set方法提供好就可以了，不需要再对 `property` 参数进行配置
    - byName：pring 将尝试按照属性的名称来匹配容器中的 bean，并注入到属性中。确保属性的名称与容器中的 bean 名称匹配，以便成功进行自动装配。如果没有匹配的 bean，将会抛出异常。
    - byType：根据类型去寻找合适的Bean自动装配，autowire 默认按类型自动装配
  - 对于使用构造方法完成的依赖注入，也支持自动装配
    - constructor
- autowire-candidate
- primary

### 生命周期与继承

- init-method
- destroy-method

除了修改构造方法，我们也可以为Bean指定初始化方法和销毁方法，以便在对象创建和被销毁时执行一些其他的任务：

注意，如果Bean不是单例模式，而是采用的原型模式，那么就只会在获取时才创建，并调用init-method，而对应的销毁方法不会被调用（因此，对于原型模式下的Bean，Spring无法顾及其完整生命周期，而在单例模式下，Spring能够从Bean对象的创建一直管理到对象的销毁）

- parent
- abstract

Bean之间也是具备继承关系的，只不过这里的继承并不是类的继承，而是属性的继承

如果我们只是希望某一个Bean仅作为一个配置模版供其他Bean继承使用，那么我们可以将其配置为abstract，这样，容器就不会创建这个Bean的对象了



- default 

我们还可以在最外层的beans标签中进行默认配置

### 工厂模式和工厂Bean
https://www.bilibili.com/video/BV1Kv4y1x7is/?p=8&spm_id_from=pageDriver&vd_source=ae16ff6478eb15c1b87880540263910b

默认情况下，容器会调用Bean对应类型的构造方法进行对象创建，但是在某些时候，我们可能不希望外界使用类的构造方法完成对象创建，比如在工厂方法设计模式中（详情请观看《Java设计模式》篇 视频教程）我们更希望 Spring不要直接利用反射机制通过构造方法创建Bean对象， 而是利用反射机制先找到对应的工厂类，然后利用工厂类去生成需要的Bean对象





### 使用注解开发

很方便，比使用 XML 文件进行配置方便很多



## AOP面向切片

### 使用注解实现AOP

![](https://bu.dusays.com/2023/10/17/652e82a0eda08.png)![](https://bu.dusays.com/2023/10/17/652e82b577d01.png)

![](https://bu.dusays.com/2023/10/17/652e82cb3f6af.png)

![](https://bu.dusays.com/2023/10/17/652e8275f20e5.png)



## Mybatis整合

### 事务管理

- 脏读：读取到了被回滚的数据，它毫无意义。
- 虚读（不可重复读）：由于其他事务更新数据，两次读取的数据不一致。
- 幻读：由于其他事务执行插入删除操作，而又无法感知到表中记录条数发生变化，当下次再读取时会莫名其妙多出或缺失数据，就像产生幻觉一样。

（对于虚读和幻读的区分：虚读是某个数据前后读取不一致，幻读是整个表的记录数量前后读取不一致

![image-20221217160052616](https://image.itbaima.net/markdown/2022/12/17/nHfV8R1ZUybTSd2.png)

### 使用Spring事务管理

使用声明式事务

https://www.bilibili.com/video/BV1Kv4y1x7is/?p=24&spm_id_from=pageDriver&vd_source=ae16ff6478eb15c1b87880540263910b

这部分没有很理解



## JUnit整合

JUnit的基本使用

https://www.bilibili.com/video/BV1Kv4y1x7is?p=25&vd_source=ae16ff6478eb15c1b87880540263910b

# Spring MVC

此阶段，我们将再次回到Tomcat的Web应用程序开发中，去感受Spring框架为我们带来的巨大便捷。

## MVC理论基础

MVC详细解释如下：

- M是指业务模型（Model）：通俗的讲就是我们之前用于封装数据传递的实体类。
- V是指用户界面（View）：一般指的是前端页面。
- C则是控制器（Controller）：控制器就相当于Servlet的基本功能，处理请求，返回响应。

![img](https://image.itbaima.net/markdown/2023/02/18/voy7HYrIbJuw9R3.jpg)



SpringMVC正是希望这三者之间进行解耦，实现各干各的，更加精细地划分对应的职责。最后再将View和Model进行渲染，得到最终的页面并返回给前端（就像之前使用Thymeleaf那样，把实体数据对象和前端页面都给到Thymeleaf，然后它会将其进行整合渲染得到最终有数据的页面，而本教程也会使用Thymeleaf作为视图解析器进行讲解）

## 配置环境并搭建项目

全注解配置形式

## Controller控制器

![img](https://image.itbaima.net/markdown/2023/02/18/SQNnl3yFjhHbp1G.jpg)

当一个请求经过`DispatcherServlet`之后，会先走`HandlerMapping`，它会将请求映射为`HandlerExecutionChain`，依次经过`HandlerInterceptor`有点类似于之前我们所学的过滤器，不过在SpringMVC中我们使用的是拦截器，然后再交给`HandlerAdapter`，根据请求的路径选择合适的控制器进行处理，控制器处理完成之后，会返回一个`ModelAndView`对象，包括数据模型和视图，通俗的讲就是页面中数据和页面本身（只包含视图名称即可）。

返回`ModelAndView`之后，会交给`ViewResolver`（视图解析器）进行处理，视图解析器会对整个视图页面进行解析，SpringMVC自带了一些视图解析器，但是只适用于JSP页面，我们也可以像之前一样使用Thymeleaf作为视图解析器，这样我们就可以根据给定的视图名称，直接读取HTML编写的页面，解析为一个真正的View。

解析完成后，就需要将页面中的数据全部渲染到View中，最后返回给`DispatcherServlet`一个包含所有数据的成形页面，再响应给浏览器，完成整个过程。

因此，实际上整个过程我们只需要编写对应请求路径的的Controller以及配置好我们需要的ViewResolver即可，之后还可以继续补充添加拦截器，而其他的流程已经由SpringMVC帮助我们完成了。

### @RequestMapping详解

前面我们已经了解了如何创建一个控制器来处理我们的请求，接着我们只需要在控制器添加一个方法用于处理对应的请求即可，之前我们需要完整地编写一个Servlet来实现，而现在我们只需要添加一个`@RequestMapping`即可实现，其实从它的名字我们也能得知，此注解就是将请求和处理请求的方法建立一个映射关系，当收到请求时就可以根据映射关系调用对应的请求处理方法

### @RequestParam和@RequestHeader详解

我们接着来看，如何获取到请求中的参数。

我们只需要为方法添加一个形式参数，并在形式参数前面添加`@RequestParam`注解即可

`@RequestHeader`与`@RequestParam`用法一致，不过它是用于获取请求头参数的，这里就不再演示了。

### @CookieValue和@SessionAttrbutie

通过使用`@CookieValue`注解，我们也可以快速获取请求携带的Cookie信息

同样的，Session也能使用注解快速获取

可以发现，通过使用SpringMVC框架，整个Web应用程序的开发变得非常简单，大部分功能只需要一个注解就可以搞定了，正是得益于Spring框架，SpringMVC才能大显身手。

### 重定向和请求转发

重定向和请求转发也非常简单，我们只需要在视图名称前面添加一个前缀即可，比如重定向  

通过添加`redirect:`前缀，就可以很方便地实现重定向，那么请求转发呢，其实也是一样的，使用`forward:`前缀表示转发给其他请求映射  

使用SpringMVC，只需要一个前缀就可以实现重定向和请求转发，非常方便。

## RestFul风格

中文释义为**“表现层状态转换”**（名字挺高大上的），它不是一种标准，而是一种设计风格。它的主要作用是充分并正确利用HTTP协议的特性，规范资源获取的URI路径。通俗的讲，RESTful风格的设计允许将参数通过URL拼接传到服务端，目的是让URL看起来更简洁实用，并且我们可以充分使用多种HTTP请求方式（POST/GET/PUT/DELETE），来执行相同请求地址的不同类型操作。

因此，这种风格的连接，我们就可以直接从请求路径中读取参数  

注意请求路径我们可以手动添加类似占位符一样的信息，这样占位符位置的所有内容都会被作为请求参数，而方法的形参列表中必须包括一个与占位符同名的并且添加了`@PathVariable`注解的参数，或是由`@PathVariable`注解指定为占位符名称：

```java
@RequestMapping("/index/{str}")
public String index(@PathVariable("str") String text){
    System.out.println(text);
    return "index";
}
```

如果没有配置正确，方法名称上会出现黄线。

我们可以按照不同功能进行划分：

- POST http://localhost:8080/mvc/index - 添加用户信息，携带表单数据
- GET http://localhost:8080/mvc/index/{id} - 获取用户信息，id直接放在请求路径中
- PUT http://localhost:8080/mvc/index - 修改用户信息，携带表单数据
- DELETE http://localhost:8080/mvc/index/{id} - 删除用户信息，id直接放在请求路径中

我们分别编写四个请求映射：

```java
@Controller
public class MainController {

    @RequestMapping(value = "/index/{id}", method = RequestMethod.GET)
    public String get(@PathVariable("id") String text){
        System.out.println("获取用户："+text);
        return "index";
    }

    @RequestMapping(value = "/index", method = RequestMethod.POST)
    public String post(String username){
        System.out.println("添加用户："+username);
        return "index";
    }

    @RequestMapping(value = "/index/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable("id") String text){
        System.out.println("删除用户："+text);
        return "index";
    }

    @RequestMapping(value = "/index", method = RequestMethod.PUT)
    public String put(String username){
        System.out.println("修改用户："+username);
        return "index";
    }
}
```

这只是一种设计风格而已，各位小伙伴了解即可。

## Interceptor拦截器

拦截器是整个SpringMVC的一个重要内容，拦截器与过滤器类似，都是用于拦截一些非法请求，但是我们之前讲解的过滤器是作用于Servlet之前，只有经过层层的过滤器才可以成功到达Servlet，而拦截器并不是在Servlet之前，它在Servlet与RequestMapping之间，相当于DispatcherServlet在将请求交给对应Controller中的方法之前进行拦截处理，它只会拦截所有Controller中定义的请求映射对应的请求（不会拦截静态资源），这里一定要区分两者的不同。

![image-20230630194651686](https://image.itbaima.net/markdown/2023/06/30/6J3D98HdkawAOVK.png)

### 创建拦截器

我们发现如果处理过程中抛出异常，那么久不会执行处理后`postHandle`方法，但是会执行`afterCompletion`方法，我们可以在此方法中获取到抛出的异常。

### 多级拦截器

注意拦截顺序就是注册的顺序，因此拦截器会根据注册顺序依次执行  

和多级Filter相同，在处理之前，是按照顺序从前向后进行拦截的，但是处理完成之后，就按照倒序执行处理后方法，而完成后是在所有的`postHandle`执行之后再同样的以倒序方式执行。  

我们发现，与单个拦截器的情况一样，一旦拦截器返回false，那么之后无论有无拦截器，都不再继续。

## 异常处理

当我们的请求映射方法中出现异常时，会直接展示在前端页面，这是因为SpringMVC为我们提供了默认的异常处理页面，当出现异常时，我们的请求会被直接转交给专门用于异常处理的控制器进行处理。

我们可以自定义一个异常处理控制器，一旦出现指定异常，就会转接到此控制器执行



## JSON数据格式

JSON (JavaScript Object Notation, JS 对象简谱) 是一种轻量级的数据交换格式。

我们现在推崇的是前后端分离的开发模式，而不是所有的内容全部交给后端渲染再发送给浏览器，也就是说，整个Web页面的内容在一开始就编写完成了，而其中的数据由前端执行JS代码来向服务器动态获取，再到前端进行渲染（填充），这样可以大幅度减少后端的压力，并且后端只需要传输关键数据即可（在即将到来的SpringBoot阶段，我们将完全采用前后端分离的开发模式）  

**既然要实现前后端分离，那么我们就必须约定一种更加高效的数据传输模式，来向前端页面传输后端提供的数据。因此JSON横空出世，它非常容易理解，并且与前端的兼容性极好，因此现在比较主流的数据传输方式则是通过JSON格式承载的。**

## 三层架构回归

![](https://bu.dusays.com/2023/10/20/653290881fae3.png)

# Spring Boot

Spring Boot是Spring框架的脚手架，我们需要把前面的内容过一遍，先打好基础，再来看部分的内容

## 数据交互

官方网站地址：https://baomidou.com

条件构造器：https://baomidou.com/pages/10c804/#updatewrapper

### MybatisPlus 框架

#### 条件构造器

对于一些复杂查询的情况，MybatisPlus支持我们自己构造QueryWrapper用于复杂条件查询

```java
@SpringBootTest
class DemoApplicationTests {
	@Resource
	UserMapper mapper;

	@Test
	void contextLoads() {
		QueryWrapper<User> wrapper = new QueryWrapper<>();

		wrapper
				.eq("name", "test");

		System.out.println(mapper.selectList(wrapper));
	}

}
```

```java
		Wrappers
				.<User>query()
						.gt("id", 1)
								.orderByDesc("id").val
```



有些时候我们遇到需要批处理的情况，也可以直接使用批处理操作

```java
@Test
void contextLoads() {
    //支持批处理操作，我们可以一次性删除多个指定ID的用户
    int count = mapper.deleteBatchIds(List.of(1, 3));
    System.out.println(count);
}
```



我们也可以快速进行分页查询操作，不过在执行前我们需要先配置一下：

```java
@Configuration
public class MybatisConfiguration {
    @Bean
    public MybatisPlusInterceptor paginationInterceptor() {
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
      	//添加分页拦截器到MybatisPlusInterceptor中
        interceptor.addInnerInterceptor(new PaginationInnerInterceptor(DbType.MYSQL));
        return interceptor;
    }
}
```

这样我们就可以愉快地使用分页功能了：

```java
@Test
void contextLoads() {
    //这里我们将用户表分2页，并获取第一页的数据
    Page<User> page = mapper.selectPage(Page.of(1, 2), Wrappers.emptyWrapper());
    System.out.println(page.getRecords());   //获取分页之后的数据
}
```



对于数据更新操作，我们也可以使用UpdateWrapper非常方便的来完成：

```java
@Test
void contextLoads() {
    UpdateWrapper<User> wrapper = new UpdateWrapper<>();
    wrapper
            .set("name", "lbw")
            .eq("id", 1);
    System.out.println(mapper.update(null, wrapper));
}
```

### 接口基本操作

虽然使用MybatisPlus提供的BaseMapper已经很方便了，但是我们的业务中，实际上很多时候也是一样的工作，都是去简单调用底层的Mapper做一个很简单的事情，那么能不能干脆把Service也给弄个模版？MybatisPlus为我们提供了很方便的CRUD接口，直接实现了各种业务中会用到的增删改查操作。

我们只需要继承即可：

```java
@Service
public interface UserService extends IService<User> {
  	//除了继承模版，我们也可以把它当成普通Service添加自己需要的方法
}
```

接着我们还需要编写一个实现类，这个实现类就是UserService的实现：

```java
@Service   //需要继承ServiceImpl才能实现那些默认的CRUD方法
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
```

使用起来也很方便，整合了超多方法：

![image-20230721181359616](https://image.itbaima.net/markdown/2023/07/21/l5Vkb9dgtJcyL4R.png)



比如我们想批量插入一组用户数据到数据库中：

```java
@Test
void contextLoads() {
    List<User> users = List.of(new User("xxx"), new User("yyy"));
  	//预设方法中已经支持批量保存了，这相比我们直接用for效率高不少
    service.saveBatch(users);
}
```

还有更加方便快捷的保存或更新操作，当数据不存在时（通过主键ID判断）则插入新数据，否则就更新数据：

```java
@Test
void contextLoads() {
    service.saveOrUpdate(new User("aaa"));
}
```

我们也可以直接使用Service来进行链式查询，写法非常舒服：

```java
@Test
void contextLoads() {
    User one = service.query().eq("id", 1).one();
    System.out.println(one);
}
```

### 新版代码生成器

### 新版代码生成器

最后我们再来隆重介绍一下MybatisPlus的代码生成器，这个东西可谓是拯救了千千万万学子的毕设啊。

它能够根据数据库做到代码的一键生成，能做到什么程度呢？

![image-20230721200757985](https://image.itbaima.net/markdown/2023/07/21/lGT4g5Y6Heqavsw.png)



你没看错，整个项目从Mapper到Controller，所有的东西全部都给你生成好了，你只管把需要补充的业务给写了就行，这是真正的把饭给喂到你嘴边的行为，是广大学子的毕设大杀器。

```java
@SpringBootTest
class DemoApplicationTests {
	@Resource
	DataSource source;

	@Test
	void contextLoads() {
		FastAutoGenerator
				.create(new DataSourceConfig.Builder(source))
				.globalConfig(builder -> {
					builder.author("lbw");              //作者信息，一会会变成注释
					builder.commentDate("2024-01-01");  //日期信息，一会会变成注释
					builder.outputDir("src/main/java"); //输出目录设置为当前项目的目录
				})
				//打包设置，这里设置一下包名就行，注意跟我们项目包名设置为一致的
				.packageConfig(builder -> builder.parent("com.example"))
				.strategyConfig(builder -> {
					//设置为所有Mapper添加@Mapper注解
					builder
							.mapperBuilder()
							.mapperAnnotation(Mapper.class)
							.build();
				})
				.execute();
	}
}
```

## 前后端分离

在前后端分离架构中，前端主要负责展示层的开发，包括用户界面的设计、用户交互的实现等。前端使用一些技术栈，如Vue、React等技术来实现用户界面，同时通过Ajax、Axios等技术与后端进行数据的交互，这样前端无论使用什么技术进行开发，都与后端无关，受到的限制会小很多。

后端主要负责业务逻辑的处理和数据的存储，包括用户认证、数据验证、数据处理、数据库访问等，我们在SSM阶段就已经给各位小伙伴介绍过了前后端开发的相关思路了，实际上后端只需要返回前端需要的数据即可，我们一般使用JSON格式进行返回。

前后端分离架构的优势包括：

- 前后端可以同时独立进行开发，提高开发效率。
- 前端可以灵活选择技术栈和框架，提供更好的用户体验。
- 后端可以专注于业务逻辑的实现，提高代码的可维护性。
- 前后端通过接口进行通信，使得前端和后端可以分别进行部署，提高系统的可扩展性和灵活性。

![image-20230722122002573](https://image.itbaima.net/markdown/2023/07/22/8Zxp5PVjN7zfn6b.png)



然而，前后端分离架构也存在一些挑战，包括接口设计的复杂性、前后端协作的沟通成本等。因此，在选择前后端分离架构时，需要综合考虑项目的特点和团队成员的技能，以及开发周期等因素。

### 基于Session的分离（有状态）

#### 登陆实现

#### 接口完善



