注意看上面的描述，我们在抽象工厂模式中使用“工厂”来描述构建者，而在建造者模式
中使用“车间”来描述构建者，其实我们已经在说它们两者的区别了，抽象工厂模式就好比是
一个一个的工厂，宝马车工厂生产宝马SUV和宝马VAN，奔驰车工厂生产奔驰车SUV和奔驰
VAN，它是从一个更高层次去看对象的构建，具体到工厂内部还有很多的车间，如制造引擎
的车间、装配引擎的车间等，但这些都是隐藏在工厂内部的细节，对外不公布。也就是对领
导者来说，他只要关心一个工厂到底是生产什么产品的，不用关心具体怎么生产。而建造者
模式就不同了，它是由车间组成，不同的车间完成不同的创建和装配任务，一个完整的汽车
生产过程需要引擎制造车间、引擎装配车间的配合才能完成，它们配合的基础就是设计蓝
图，而这个蓝图是掌握在车间主任（导演类）手中，它给建造车间什么蓝图就能生产什么产
品，建造者模式更关心建造过程。虽然从外界看来一个车间还是生产车辆，但是这个车间的
转型是非常快的，只要重新设计一个蓝图，即可产生不同的产品，这有赖于建造者模式的功
劳。
相对来说，抽象工厂模式比建造者模式的尺度要大，它关注产品整体，而建造者模式关
注构建过程，因此建造者模式可以很容易地构建出一个崭新的产品，只要导演类能够提供具
体的工艺流程。也正因为如此，两者的应用场景截然不同，如果希望屏蔽对象的创建过程，
只提供一个封装良好的对象，则可以选择抽象工厂方法模式。而建造者模式可以用在构件的
装配方面，如通过装配不同的组件或者相同组件的不同顺序，可以产生出一个新的对象，它
可以产生一个非常灵活的架构，方便地扩展和维护系统。