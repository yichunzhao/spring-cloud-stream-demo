# spring-cloud-stream-demo
exploring Spring Cloud Stream

Spring-Cloud-Stream is an abstraction of the underlying messaging system. It facilitates building a message-driven system with minimal effort to set up the broker and linking producer and consumer together.

The following diagram illustrates the structure as using the Spring cloud stream. 

![SpringCloudStream](https://user-images.githubusercontent.com/17804600/115138314-a5c32680-a02b-11eb-9d3a-737aeb3d420e.jpg)

Producer defines source, channel, and then enable binding(@EnableBinding(Source.class)) the channel to the underlying queue.
Consumer defines sink, channel, and then enable binding(@EnableBinding(Input.class)) the channel to the underlying queue.

Source and Sink are interfaced with channels, i,e. interface methods; In runtime, Spring use them to generate proxy instances, which handle the dirty works with the messaging system.

Channels are defined @Output (pruducing) or @Input (consuming); Channel name by default is the method name; or cusotermized as @OutPout("xxx") or @Input("yyy");

Pointing channels to the underlying mmessage queue in the appplication.properties, as following

````
spring.cloud.stream.bindings.xxx.destination=employeeRegChannel

spring.cloud.stream.bindings.yyy.destination=employeeRegChannel
````
thus producer and consumer are linked together for their channels pointing to the same queue name. 

Futher Task: 
I need to explore the Spring-cloud-Stream latest version, for there are a lot of updates. 

