package xframe.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import xframe.springboot.main.WebMain;
import xframe.springboot.po.Author;
import xframe.springboot.service.impl.TransactionServiceImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(WebMain.class)
public class TestTransactionServiceImpl {

	@Autowired
	protected TransactionServiceImpl transactionServiceImpl;

	@Test
	public void add1() throws Exception {
		transactionServiceImpl.add1(new Author("梁桂钊", "梁桂钊"));
		transactionServiceImpl.add1(new Author("LiangGzone", "LiangGzone"));
	}

	@Test
	public void add2() throws Exception {
		transactionServiceImpl.add2(new Author("梁桂钊", "梁桂钊"));
		transactionServiceImpl.add2(new Author("LiangGzone", "LiangGzone"));
	}

	@Test
	public void add3() throws Exception {
		transactionServiceImpl.add3(new Author("梁桂钊", "梁桂钊"));
		transactionServiceImpl.add3(new Author("LiangGzone", "LiangGzone"));
	}
}
