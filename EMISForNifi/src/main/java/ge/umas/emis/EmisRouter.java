package ge.umas.emis;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import ge.umas.emis.models.Personnel;
import ge.umas.emis.models.Student;
import ge.umas.emis.models.VetPersonnel;
import ge.umas.emis.models.VetStudent;

public class EmisRouter {

	Gson gson = new GsonBuilder().create();

	protected void StudentsEtl(BufferedReader reader, BufferedWriter writer) throws IOException {
		String line = "";
		String source = "";
		while ((line = reader.readLine()) != null) {
			source = source + line;
		}

		Student[] StudentsModel = gson.fromJson(source, Student[].class);
		int count = StudentsModel.length;
		for (int i = 0; i < count; i++) {
			StudentsModel[i].ETL();
			if (!StudentsModel[i].RemoveObject()) {
				writer.write(gson.toJson(StudentsModel[i]) + "\n");
			}
		}

	}

	public void PersonnelEtl(BufferedReader reader, BufferedWriter writer) throws IOException {
		String line = "";
		String source = "";
		while ((line = reader.readLine()) != null) {
			source = source + line;
		}

		Personnel[] Personnel = gson.fromJson(source, Personnel[].class);
		int count = Personnel.length;
		for (int i = 0; i < count; i++) {
			Personnel[i].ETL();
			if (!Personnel[i].RemoveObject()) {
				writer.write(gson.toJson(Personnel[i]) + "\n");
			}
		}

	}

	public void VetStudentsEtl(BufferedReader reader, BufferedWriter writer) throws IOException {
		String line = "";
		String source = "";
		while ((line = reader.readLine()) != null) {
			source = source + line;
		}

		VetStudent[] VetStudentsModel = gson.fromJson(source, VetStudent[].class);
		int count = VetStudentsModel.length;
		for (int i = 0; i < count; i++) {
			VetStudentsModel[i].ETL();
			if (!VetStudentsModel[i].RemoveObject()) {
				writer.write(gson.toJson(VetStudentsModel[i]) + "\n");
			}
		}

	}

	public void VetPersonnelEtl(BufferedReader reader, BufferedWriter writer) throws IOException {
		String line = "";
		String source = "";
		while ((line = reader.readLine()) != null) {
			source = source + line;
		}

		VetPersonnel[] VetPersonnelsModel = gson.fromJson(source, VetPersonnel[].class);
		int count = VetPersonnelsModel.length;
		for (int i = 0; i < count; i++) {
			VetPersonnelsModel[i].ETL();
			if (!VetPersonnelsModel[i].RemoveObject()) {
				writer.write(gson.toJson(VetPersonnelsModel[i]) + "\n");
			}
		}

	}

}
