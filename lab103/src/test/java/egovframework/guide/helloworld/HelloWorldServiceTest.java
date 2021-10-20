package egovframework.guide.helloworld;

import javax.annotation.Resource;

public class HelloWorldServiceTest{
	private HelloWorldService helloworld;
	
	@Resource(name = "helloworld")//helloworld을 어노테이션으로 주입 받는다.
	public void setHelloWorld(HelloWorldService hello) {
		this.helloworld = hello;
	}
	
}

