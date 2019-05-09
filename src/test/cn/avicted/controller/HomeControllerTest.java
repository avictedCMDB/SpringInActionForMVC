package cn.avicted.controller;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

/**
 * @ClassName HomeControllerTest
 * @Description TODO
 * @Author xulei
 * @Date 2019/5/9/009 16:01
 * @Version 1.0
 **/
public class HomeControllerTest {

    @Test
    public void HomePageTest() throws Exception{
        HomeController homeController = new HomeController();
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(homeController).build();

        mockMvc.perform(get("/")).andExpect(view().name("home"));
    }


}
