import com.dao.StudentDao;
import com.entity.TStudentEntity;
import com.service.StudentService;
import org.hibernate.FlushMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring.xml"})
public class SpringHibernateTest {
    @Autowired
    HibernateTemplate hibernateTemplate;
    @Autowired
    StudentService studentService;
    /*@Autowired
    StudentDao studentDao;*/
    @Test
    public void test(){
        TStudentEntity tStudentEntity = hibernateTemplate.get(TStudentEntity.class, 1);
        System.out.println(tStudentEntity);

    }
    @Test
    public void insert(){
        TStudentEntity tStudentEntity = new TStudentEntity();
        tStudentEntity.setGid(1);
        tStudentEntity.setName("morafi");
        studentService.insert(tStudentEntity);
    }

   /* @Test
    public void insert2(){
        TStudentEntity tStudentEntity = new TStudentEntity();
        tStudentEntity.setGid(2);
        tStudentEntity.setName("arla");
        studentDao.insert(tStudentEntity);
    }*/
}
