package tacos.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import tacos.bean.User;
import tacos.mapper.UserMapper;

@Service
public class UserTool extends ServiceImpl<UserMapper, User> {

}
