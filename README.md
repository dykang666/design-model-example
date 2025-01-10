1、建造者模式，这个模式通常用于需要构建复杂对象的场景 应用实例： 1、去肯德基，汉堡、可乐、薯条、炸鸡翅等是不变的，而其组合是经常变化的，生成出所谓的"套餐"。  例如：StringBuilder 、 JdbcTemplate和DataSource的构建 、@ConfigurationProperties
2、原型模式， 原型模式是通过拷贝一个现有对象生成新对象的。 例如： Bean 的作用域（Scope） @Scope("prototype")。
3、工厂模式，过工厂模式创建不同的对象实例。广泛用于  Bean 的创建和 依赖注入 的机制， 例如： 通过工厂模式从 Spring 容器获取 Bean ,context.getBean(MyService.class),@Bean, BeanFactory 中获取bean
4、单例模式， Spring 的 默认 Bean 作用域就是单例，@Component、@Service、@Repository、@Controller 等注解定义 Bean 时，Spring 会默认把它们注册为单例 Bean，ApplicationContext 也是单例的，启动类是单例SpringApplication 
5、模版模式，简单说，模板方法模式，定义一个操作中的算法的骨架，而将一些步骤延迟到子类中，使得子类可以不改变一个算法的结构。  例如：  JdbcTemplate  TransactionTemplate 、spring启动过程中的模版模式（refresh方法）
6、策略模式 解决在多种相似算法存在时，使用条件语句（如if...else）导致的复杂性和难以维护的问题。 场景：Spring Security 中的认证和授权策略（表单认证、HTTP 基本认证、OAuth2 认证）， @Profile，Spring Data JPA 中的查询策略： 支持多种查询方式（如方法名查询、JPQL 查询、原生 SQL 查询等）。
7、代理模式，代理模式通过引入代理对象，为原始对象添加额外的功能，如权限控制、缓存、日志记录等，而不修改原始对象的代码。这使得 Spring 在实现多种功能时具有更好的灵活性和扩展性
场景：Spring AOP（面向切面编程）中的代理模式,JDK 动态代理和CGLIB代理；@Transactional事务管理 Spring 会创建一个代理对象，在方法执行时对事务进行管理（开启、提交、回滚等）。如果方法执行过程中发生异常，代理对象会捕获异常并触发事务回滚，
![image](https://github.com/user-attachments/assets/feae1158-d16f-434d-81a5-df4ff59637eb)

8、观察者模式，观察者模式通过一对多的关系，使得一个对象的状态变化能够通知到多个相关对象。场景：常用于事件驱动（监听器）、通知系统和模型-视图控制器（MVC）设计模式中。
场景： Spring MVC 的 HandlerAdapter：适配不同类型的控制器；通过适配器将第三方 API 转换为统一的接口；任务调度系统适配：将 Quartz 等第三方调度系统与 Spring Boot 兼容；

9 桥接模式，桥接模式是一种结构型设计模式，它通过将抽象部分与实现部分分离，从而使得二者可以独立地变化。  场景：springboot对不同数据库的支持。

10 责任链模式 责任链模式通过将请求传递给多个处理者，直到某个处理者能够处理它，减少了请求发送者和处理者之间的耦合性，并且能够灵活扩展和修改处理逻辑。适用于需要多个对象处理同一个请求、请求处理流程有多个步骤的场景。
场景 :
请求拦截：在 Web 应用中，可能需要对请求进行多层次的拦截和处理（如身份验证、权限控制、请求日志记录等），责任链模式可以灵活处理。
权限验证：在进行权限验证时，可能有多个验证步骤（如用户权限、角色权限、API 权限等），责任链模式能有效地处理这种需求。



