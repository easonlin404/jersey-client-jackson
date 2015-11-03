package com.eason.jersey;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.jackson.JacksonFeature;

public class ClientExample {

	public static void main(String[] args) {
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target("http://localhost:8080/jersey-server-jackson/api/v1.0/")
				.register(JacksonFeature.class).path("hello");

		User user = new User("Carry", "hello");

		Response response = target.request()
				.post(Entity.entity(user, MediaType.APPLICATION_JSON));

		System.out.println("status:" + response.getStatus());
		System.out.println(response.readEntity(String.class));
	}
}
