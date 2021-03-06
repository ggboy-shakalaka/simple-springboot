package test;

import cn.zhaizq.simple.springboot.Application;
import cn.zhaizq.simple.springboot.mapper.DemoMapper;
import cn.zhaizq.simple.springboot.mapper.entry.DemoEntry;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.util.List;

@RunWith(SpringRunner.class)
@ActiveProfiles("dev")
@SpringBootTest(classes = Application.class)
public class ApplicationTest {
    @Autowired
    private RedisTemplate<String, String> redisTemplate;
    @Autowired
    private DemoMapper baseMapper;

    @Test
    public void action() throws IOException {
//        redisTemplate.boundValueOps("key").set("value");
//        redisTemplate.boundValueOps("key").get();
//        Page<Object> objects = PageHelper.startPage(1, 10);
//        System.out.println("Hello World");
        Page<Object> objects = PageHelper.startPage(1, 1);
        List<DemoEntry> demoEntries = baseMapper.selectList(Wrappers.emptyWrapper());
        System.out.println(123);
    }
}