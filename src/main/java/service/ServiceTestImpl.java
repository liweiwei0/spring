package service;

import dao.DaoTest;

public class ServiceTestImpl implements ServiceTest {

	private DaoTest daoTestImpl;
	public void setDaoTestImpl(DaoTest daoTestImpl) {
		this.daoTestImpl = daoTestImpl;
	}

	public void test() {
        System.out.println("service test");
        daoTestImpl.test();
	}

	public void init() {
		System.out.println("service init");
	}
	
	
}
