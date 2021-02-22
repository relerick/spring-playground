package com.example.demo;



import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.bind.annotation.GetMapping;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;



@WebMvcTest(HomeController.class)
public class HomeControllerTest {
    @Autowired
    MockMvc mvc;


    @Test
    public void PitestHomePageEndpoint() throws Exception {
        this.mvc.perform(get("/math/pi").accept(MediaType.TEXT_PLAIN))
                .andExpect(status().isOk())
                .andExpect(content().string("3.141592653589793"));

    }
        @Test
        public void testHomePageEndpoint() throws Exception {
            this.mvc.perform(get("/").accept(MediaType. TEXT_PLAIN))
                    .andExpect(status().isOk())
                    .andExpect(content().string("Hello, from Spring"));









    }

}
