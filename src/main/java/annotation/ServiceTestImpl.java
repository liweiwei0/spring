package annotation;

import java.util.List;
import java.util.Map;

import org.apache.catalina.tribes.group.interceptors.TwoPhaseCommitInterceptor.MapEntry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ServiceTestImpl implements ServiceTest {

	@Autowired
	private List<DaoTest> list;
	@Autowired
	private Map<String, DaoTest> map;
	@Qualifier("daoTestImpl3")
	@Autowired
	private DaoTest daoTest;
	
	public void servicec() {
		// TODO Auto-generated method stub
		System.out.println("service");
		for(DaoTest daotest : list) {
			System.out.println(daotest.getClass().getName());
		}
		for(String str : map.keySet()) {
			System.out.println(str + "---"+map.get(str).getClass().getName());
		}
		System.out.println(daoTest.getClass().getName());
	}

}
