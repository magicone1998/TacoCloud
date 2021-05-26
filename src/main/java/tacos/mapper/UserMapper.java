package tacos.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import tacos.bean.User;

@Mapper
public interface UserMapper extends BaseMapper<User> {

}
