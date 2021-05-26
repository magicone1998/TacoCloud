package tacos;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import tacos.bean.User;
import tacos.mapper.UserMapper;
import tacos.service.IUserService;

import java.sql.SQLOutput;
import java.util.Date;
import java.util.List;

@SpringBootTest
//--测试类运行器
@RunWith(SpringRunner.class)
public class TacoCloudApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private IUserService userService;

    @Test
    public void contextLoads() {
        System.out.println("111");
    }

    @Test
    public void queryList(){
        System.out.println("------selectAll method test-------");
//        List<User> users = userMapper.selectList(null);
//        users.forEach(System.out::println);
        User user = new User();
        user.setAge(12);
        user.setName("ChangYan");
        boolean b = userService.changAndAdd(user);
        System.out.println(b);
    }
}
