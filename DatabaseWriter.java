package com.directi.training.dip.exercise_refactoring;

import com.directi.training.dip.exercise.MyDatabase;

public class DatabaseWriter implements Writer{
	 public void write(String data) {
	        // Écrire dans une base de données
	        MyDatabase database = new MyDatabase();
	        database.write(data);
	    }

}
