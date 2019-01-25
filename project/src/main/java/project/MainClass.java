package project;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
/*		
		TransportationWalk tw = new TransportationWalk();
		tw.move();
	*/	
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
		
		TransportationWalk tr = ctx.getBean("tWalk", TransportationWalk.class);
		
		tr.move();
		
		ctx.close();
	}

}
