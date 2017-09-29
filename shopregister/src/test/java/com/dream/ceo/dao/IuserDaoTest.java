package com.dream.ceo.dao;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.dream.ceo.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by masheng on 2017/9/24.
 */
// 加载spring配置文件
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"})
public class IuserDaoTest {

    @Autowired
    private IUserDao iUserDao;

    @Test
    public void testSelectUser() throws Exception {
        long id = 1;
        User user = iUserDao.selectUser(id);
        System.out.println(user.getUsername());
        System.out.println();
    }


}
