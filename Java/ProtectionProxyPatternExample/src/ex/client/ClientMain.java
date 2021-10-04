package ex.client;

import ex.model.User;
import ex.proxy.FolderProxy;

public class ClientMain
{
	public static void main( String[] args )
	{
		new ClientMain().folderAccess();
	}


	private  void folderAccess()
    {
		System.out.println(this.getClass()+" : Client passing user with designation 'CEO' to folderproxy");
		User john = new User("John", "John123","CEO");
		FolderProxy folderProxy = new FolderProxy(john);
		folderProxy.performReadOrWriteOperations();
		System.out.println("\n************************************************************           ***********************\n");
		System.out.println(this.getClass()+" : Client passing user with designation 'Developer' to folderproxy");
		User has = new User("Haseeb", "has12345","Developer");
		FolderProxy folderProxyWrong = new FolderProxy(has);
		folderProxyWrong.performReadOrWriteOperations();
 
        }
 
}
