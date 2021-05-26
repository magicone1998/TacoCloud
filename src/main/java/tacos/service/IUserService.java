package tacos.service;

import com.baomidou.mybatisplus.extension.service.IService;
import tacos.bean.User;

public interface IUserService extends IService<User> {

      boolean changAndAdd(User user);
}
