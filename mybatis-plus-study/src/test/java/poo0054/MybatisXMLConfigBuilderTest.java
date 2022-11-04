package poo0054;

import com.baomidou.mybatisplus.core.MybatisSqlSessionFactoryBuilder;
import com.baomidou.mybatisplus.core.MybatisXMLConfigBuilder;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import poo0054.dao.TableAttributeDao;
import poo0054.entity.TableAttribute;

import java.io.IOException;
import java.util.List;

/**
 * @author ZhangZhi
 * @version 1.0
 * @date 2022/11/4 14:36
 */
public class MybatisXMLConfigBuilderTest {
    SqlSessionFactory sessionFactory;

    @BeforeEach
    void init() throws IOException {
        ResourceLoader loader = new DefaultResourceLoader();
        Resource resource = loader.getResource("classpath:/mybatis-config.xml");
        //创建
        MybatisXMLConfigBuilder mybatisXMLConfigBuilder = new MybatisXMLConfigBuilder(resource.getInputStream());
        //解析并构建出configuration
        Configuration configuration = mybatisXMLConfigBuilder.parse();
        MybatisSqlSessionFactoryBuilder mybatisSqlSessionFactoryBuilder = new MybatisSqlSessionFactoryBuilder();
        sessionFactory = mybatisSqlSessionFactoryBuilder.build(configuration);
    }

    @Test
    void queryAllByLimit() {
        SqlSession sqlSession = sessionFactory.openSession();
        TableAttributeDao mapper = sqlSession.getMapper(TableAttributeDao.class);
        List<TableAttribute> tableAttributes = mapper.queryAllByLimit(new TableAttribute());
        tableAttributes.forEach(System.out::println);
    }
}
