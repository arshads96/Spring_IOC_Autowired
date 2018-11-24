
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Arshad
 */
public class Client {

    public static void main(String args[]) {
        Resource res = new ClassPathResource("spconfig.xml");
        BeanFactory bFactory = new XmlBeanFactory(res);
        Object o = bFactory.getBean("id1");
        Bean1 b1 = (Bean1) o;
        b1.show();
        Object o1 = bFactory.getBean("id2");
        Bean2 b2 = (Bean2) o1;
        b2.show();
        Object o2 = bFactory.getBean("id3");
        Bean3 b3 = (Bean3) o2;
        b3.show();
        Object o3 = bFactory.getBean("id5");
        Bean4 b4 = (Bean4)o3;
        b4.show();
    }

}
