package mapper;

import com.minboo.mapper.UserMapper;
import com.minboo.pojo.User;
import com.minboo.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author hmb
 * @create 2021-11-16 16:20
 */
public class UserMapperTest {

    @Test
    public void testGetUserById(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getUserById(2);
        System.out.println(user);
    }


}
