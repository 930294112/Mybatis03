package test;

import com.lanou.domain.User;
import com.lanou.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by dllo on 17/11/6.
 */
public class UserMapperTest {

    private SqlSession session;
    private UserMapper mapper;

    @Before
    public void init() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);
        session = sessionFactory.openSession(true);
        mapper = session.getMapper(UserMapper.class);
    }

    @After
    public void close(){
        session.close();
    }

    @Test
    public void findByIds(){
        //构建要查询的id
        List<Integer> ids = new ArrayList<Integer>();
        ids.add(3);
        ids.add(4);
        ids.add(5);
        //调用查询方法
        List<User> users = mapper.findByIds(ids);
        for (User user : users) {
            System.out.println(user);
        }
    }
}
