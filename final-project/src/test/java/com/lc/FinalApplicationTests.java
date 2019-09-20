package com.lc;

import com.lc.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FinalApplicationTests {

    @Test
    public void contextLoads() {
        User user = new User();
        System.out.println(user.getName());
    }

    @Test
    public void testTime(){
        LocalDate date = LocalDate.now(); // get the current date

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println(date.format(formatter));
    }

}
