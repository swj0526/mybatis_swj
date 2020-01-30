package com.swj.dao;

import com.swj.domain.Tbuser;
import com.swj.utils.MyBatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @author 孙文举
 * @description 测试
 * @create 2020-01-30 13:21
 */
public class UserMapperTest {
    @Test
    public void userTest() {
        SqlSession sqlSession = MyBatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<Tbuser> userList = mapper.getUserList();
        System.out.println(userList);

    }
}