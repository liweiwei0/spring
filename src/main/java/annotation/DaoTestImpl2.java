package annotation;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Repository;

@Order(5)
@Repository
public class DaoTestImpl2 implements DaoTest {

	public void dao() {
		// TODO Auto-generated method stub
        System.out.println("dao");
	}

}
