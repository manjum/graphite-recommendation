package com.talentica.recomendation.app;

import java.io.IOException;

import com.talentica.graphite.api.exception.GraphiteAnnotationParseException;
import com.talentica.graphite.api.exception.ObjectWriteException;
import com.talentica.graphite.api.index.GraphiteAnnotationParser;
import com.talentica.graphite.api.index.ObjectNodeWriter;
import com.talentica.graphite.exceptions.InvalidAtomException;
import com.talentica.graphite.exceptions.MissingAtomException;
import com.talentica.graphite.store.StoreResources;
import com.talentica.recomendation.entity.EmployeeProfile;

public class App {
	private final static String DB_PATH = "/TalenticaWorkspace/personal_git/graphite/data";
	private final static String DB_PROPERTYFILE_PATH = "";
	public static void main(String[] args) throws MissingAtomException, InvalidAtomException, GraphiteAnnotationParseException, IllegalArgumentException, IllegalAccessException, ObjectWriteException, IOException {
		StoreResources storeResources = new StoreResources(DB_PATH, null);
		storeResources.init();
		GraphiteAnnotationParser gap = new GraphiteAnnotationParser("com.talentica.recomendation.entity", storeResources);
		gap.parse();
		ObjectNodeWriter objNodeWriter = new ObjectNodeWriter(storeResources);
		EmployeeProfile empProfile = new EmployeeProfile("sushant");
		objNodeWriter.write(empProfile);
	}
}
