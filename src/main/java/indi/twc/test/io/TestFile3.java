package indi.twc.test.io;

import java.io.File;
import java.io.IOException;

/**
 * ����·��
 * ���·��
 * @author ̷γ��
 *
 */
public class TestFile3 {

	public static void main(String[] args) throws IOException {
      File f1 = new File("a.txt"); 
      f1.createNewFile();
      System.out.println(f1.getAbsolutePath());//����·��
      //E:\workspace\JavaFile\a.txt 
      
      /**System.getProperty("user.dir") ����·��*/
      System.out.println("---------"+System.getProperty("user.dir"));		
      //---------E:\workspace\JavaFile
	}

}