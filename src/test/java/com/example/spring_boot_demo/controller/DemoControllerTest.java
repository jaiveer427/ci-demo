package com.example.spring_boot_demo.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(DemoController.class)
public class DemoControllerTest {

	@Autowired // Add it directly here
    private MockMvc mockMvc;

	@Test
	public void shouldReturnDefaultMessage() throws Exception {
		this.mockMvc.perform(get("/hello")) // Simulates GET /hello
				.andExpect(status().isOk()) // Asserts HTTP 200
				.andExpect(content().string("Hello There!")); // Asserts Response Body
	}

}
