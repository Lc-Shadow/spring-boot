package com.lc;

import com.lc.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FinalApplicationTests {

    @Test
    public void contextLoads() {
        User user = new User();
        System.out.println(user.getName());
    }

    @Test
    public void testTime() throws ParseException {
        LocalDate date = LocalDate.now(); // get the current date

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println(date.format(formatter));
        DateFormat df = new SimpleDateFormat("HH:mm:ss");
        Date dta = df.parse("02:00:00");
        Date dtb = df.parse("08:00:00");
        System.out.println((dtb.getTime() - dta.getTime())/1000/3600);

    }

}
