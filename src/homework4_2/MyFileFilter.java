package homework4_2;

import java.io.File;
import java.io.FileFilter;

            
public class MyFileFilter  implements FileFilter {
private String a;//���������� ��� ����������

public MyFileFilter(String a) {
	super();
	this.a = a;
}
private boolean chek(String ext) {
	
		if(a.equals(ext)) {
			return true;
		
	}
		
	return false;
}
@Override
public boolean accept(File pathname) {
	int pointerIndex = pathname.getName().lastIndexOf(".");// ���� ����� � �����. � ��������� ������ �����
	if (pointerIndex == -1) {
		return false;
		}
	String ext = pathname.getName().substring(pointerIndex + 1);
	return chek(ext);
}

}
