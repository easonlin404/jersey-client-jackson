package com.eason.jersey;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

public class ClientExample {

	public static void main(String[] args) {
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:8080/jersey-server-jackson/api/v1.0/").path(
				"hello");


		Response response  = target.request().get();


		System.out.println("status:" + response.getStatus());
		System.out.println(response.readEntity(String.class));
	}
}
