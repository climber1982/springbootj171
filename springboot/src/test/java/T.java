import com.lovo.boot.BootMain;
import com.lovo.boot.entity.UserEntity;
import com.lovo.boot.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = BootMain.class)
public class T {

    @Autowired
    private IUserService userService;
    @Test
    public void  savaUser(){
        UserEntity userEntity=new UserEntity();
        userEntity.setUserName("赵云");
        userEntity.setPassword("123456");
        userService.savaUser(userEntity);
    }
}
