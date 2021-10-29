package egovframework.guide.helloworld;

import static org.junit.Assert.assertEquals;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/context-helloworld.xml" })//참조 할 빈에 대한...
public class HelloWorldServiceTest{
	
	private HelloWorldService helloworld;
	
	@Resource(name = "helloworld")//"helloworld" 빈을 어노테이션으로 주입 받는다.
	public void setHelloWorld(HelloWorldService hello) {
		this.helloworld = hello;
	}
	@Test//junut test를 관리하는 메소드를 의미하는 어노테이션
	public void SayHello() {
		assertEquals("Hello eGovFrame!!!", helloworld.sayHello());
	}
	
}

