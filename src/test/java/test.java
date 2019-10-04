import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.gcu.CCS.dao.UserDao;
import com.gcu.CCS.pojos.User;

@Transactional//使用注解配置事务
public class test {
	@Autowired
	private UserDao userDao;
	public static void main(String[] args) {
		test t=new test();

		List<User> list = t.userDao.Test();
		System.out.println(list.get(0));
	}
}
