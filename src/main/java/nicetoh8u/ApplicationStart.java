package nicetoh8u;

import nicetoh8u.dao.JpaDao;
import nicetoh8u.model.Spitter;
import nicetoh8u.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationStart {

    public static void main(String[] args){
        ApplicationContext ctx = new ClassPathXmlApplicationContext(
                "spring-ctx.xml");
        ItemService itemService = ctx.getBean("itemServiceImpl",ItemService.class);
        Spitter spitter = new  Spitter();
        spitter.setName("ilya");
        spitter.setId(1L);
        itemService.saveItem(spitter);
        System.out.println( itemService.getSpitter(1L).getName());
        itemService.deleteItem(spitter);
        System.out.println( itemService.getSpitter(1L).getName());


    }
}
