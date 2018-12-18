import com.itheima.dao.ItemsDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class daotest {
    @Test
    public void dao(){
        ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext-dao.xml");
        ItemsDao itemsDao = ac.getBean(ItemsDao.class);
        System.out.println(itemsDao.findbyId(1));

    }
}
