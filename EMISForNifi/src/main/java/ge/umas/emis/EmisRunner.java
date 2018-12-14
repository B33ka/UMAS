package ge.umas.emis;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

public class EmisRunner {

	public static void main(String[] method) {
		try {
			EmisRouter route = new EmisRouter();

			InputStream inputStream = System.in;
			BufferedReader bufferedReader = new BufferedReader(
					new InputStreamReader(inputStream, StandardCharsets.UTF_8));
			OutputStream outputStream = System.out;
			BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, "utf-8"));

			/*
			 * File fr = new File("C:\\Users\\b.saldadze\\Desktop\\MES\\2017-02-25");
			 * BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new
			 * FileInputStream(fr), "UTF8"));
			 * 
			 * BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(
			 * new
			 * FileOutputStream("C:\\Users\\b.saldadze\\Desktop\\MES\\NewStudentsETL.json",
			 * true), StandardCharsets.UTF_8));
			 */

			if (method.length > 0 && method[0] != null) {
				String methodName = method[0];
				switch (methodName) {
				case "Students":
					route.StudentsEtl(bufferedReader, bufferedWriter);
					break;
				case "Personnel":
					route.PersonnelEtl(bufferedReader, bufferedWriter);
					break;
				case "VetStudents":
					route.VetStudentsEtl(bufferedReader, bufferedWriter);
					break;
				case "VetPersonnel":
					route.VetPersonnelEtl(bufferedReader, bufferedWriter);
					break;

				}

			}
			bufferedReader.close();
			bufferedWriter.close();
			outputStream.close();
			inputStream.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
