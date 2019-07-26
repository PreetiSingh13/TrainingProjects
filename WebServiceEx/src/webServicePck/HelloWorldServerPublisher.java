package webServicePck;

import javax.xml.ws.Endpoint;

public class HelloWorldServerPublisher {
	public static void main(String[]args)
	{
		System.out.println("Begin to publish");
		Endpoint.publish("http://127.0.0.1:9871/hw", new HelloWorldServerImpl());
		System.out.println("Done publishing");
	}
	}
