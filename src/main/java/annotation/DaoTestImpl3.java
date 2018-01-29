package annotation;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Repository;

@Order(3)
@Repository
public class DaoTestImpl3 implements DaoTest {

	public void dao() {
		// TODO Auto-generated method stub
        System.out.println("dao");
	}

}
