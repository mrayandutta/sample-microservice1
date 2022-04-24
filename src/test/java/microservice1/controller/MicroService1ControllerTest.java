package microservice1.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

@WebMvcTest(MicroService1Controller.class)
public class MicroService1ControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    //public void helloWorld_basic() throws Exception {
    public void micoroservice1_basic() throws Exception {
        //call GET "/hello-world"  application/json

        RequestBuilder request = MockMvcRequestBuilders
                .get("/")
                .accept(MediaType.APPLICATION_JSON);

        MvcResult result = mockMvc.perform(request)
                .andExpect(status().isOk())
                .andExpect(content().string("Hello World, Response from MicroService1 !!"))
                .andReturn();

        //verify "Hello World"
        assertEquals("Hello World, Response from MicroService1 !!", result.getResponse().getContentAsString());
    }

}
