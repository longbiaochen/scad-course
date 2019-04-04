package simple_factory.permission_management;

public abstract class User
{
	public void sameOperation()
	{
        System.out.println("修改个人资料！");
	}
	
	public abstract void diffOperation();
}