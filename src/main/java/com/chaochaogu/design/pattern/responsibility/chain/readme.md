16.2 责任链模式的定义
责任链模式定义如下：
Avoid coupling the sender of a request to its receiver by giving more than one object a chance to
handle the request.Chain the receiving objects and pass the request along the chain until an object
handles it.（使多个对象都有机会处理请求，从而避免了请求的发送者和接受者之间的耦合关
系。将这些对象连成一条链，并沿着这条链传递该请求，直到有对象处理它为止。）
责任链模式的重点是在“链”上，由一条链去处理相似的请求在链中决定谁来处理这个请
求，并返回相应的结果，其通用类图如图16-4所示。
![责任链模式通用类图](https://pic.downk.cc/item/5f705c62160a154a67b142b2.jpg)
责任链模式的核心在“链”上，“链”是由多个处理者ConcreteHandler组成的

抽象的处理者实现三个职责：一是定义一个请求的处理方法handleMessage，唯一对外开
放的方法；二是定义一个链的编排方法setNext，设置下一个处理者；三是定义了具体的请求
者必须实现的两个方法：定义自己能够处理的级别getHandlerLevel和具体的处理任务echo。
注意 在责任链模式中一个请求发送到链中后，前一节点消费部分消息，然后交由后续
节点继续处理，最终可以有处理结果也可以没有处理结果，读者可以不用理会什么纯的、不
纯的责任链模式。同时，请读者注意handlerMessage方法前的final关键字，可以阅读第10章
的模板方法模式。

16.3 责任链模式的应用
16.3.1 责任链模式的优点
责任链模式非常显著的优点是将请求和处理分开。请求者可以不用知道是谁处理的，处
理者可以不用知道请求的全貌（例如在J2EE项目开发中，可以剥离出无状态Bean由责任链处
理），两者解耦，提高系统的灵活性。
16.3.2 责任链模式的缺点
责任链有两个非常显著的缺点：一是性能问题，每个请求都是从链头遍历到链尾，特别
是在链比较长的时候，性能是一个非常大的问题。二是调试不很方便，特别是链条比较长，
环节比较多的时候，由于采用了类似递归的方式，调试的时候逻辑可能比较复杂。
16.3.3 责任链模式的注意事项
链中节点数量需要控制，避免出现超长链的情况，一般的做法是在Handler中设置一个
最大节点数量，在setNext方法中判断是否已经是超过其阈值，超过则不允许该链建立，避免
无意识地破坏系统性能。
