package pers.arrayli.utils;

import java.io.File;

/**
 * @author lzj13 ͼƬ��Դ������
 */
public class PictureUtils {
	public static String PicPath = "D:\\PakringResources\\upload";

	public static void delPicture(String fileName) {
		File file = new File(fileName);
		// ����ļ�·������Ӧ���ļ����ڣ�������һ���ļ�����ֱ��ɾ��
		if (file.exists() && file.isFile()) {
			if (file.delete()) {
				System.out.println("ɾ��" + fileName + "�ɹ���");

			} else {
				System.out.println("ɾ��" + fileName + "ʧ�ܣ�");

			}
		} else {
			System.out.println("ɾ�������ļ�ʧ�ܣ�" + fileName + "�����ڣ�");

		}
	}

}
