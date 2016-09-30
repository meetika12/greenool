
package sf.action;

import static com.opensymphony.xwork2.Action.SUCCESS;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import sf.dao.MainLogicDao;
import sf.dto.SignUp;


public class SignUpCodeActionClass  extends ActionSupport implements ModelDriven
{
    
    SignUp obj=new SignUp();

    
    
    
    @Override
    public String execute() throws Exception 
    {   
        MainLogicDao aao=new MainLogicDao();
        aao.insertRecord(obj);
        return SUCCESS;
        }

    @Override
    public SignUp getModel() 
    {
        return obj;
    }
    
    
    
    
}
