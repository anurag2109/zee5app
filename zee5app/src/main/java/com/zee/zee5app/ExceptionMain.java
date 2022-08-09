package com.zee.zee5app;



import java.io.FileNotFoundException;

import com.zee.zee5app.dto.Movie;
import com.zee.zee5app.enums.Geners;
import com.zee.zee5app.enums.Languages;
import com.zee.zee5app.exceptions.InvalidIdException;

public class ExceptionMain {
	public static int  methodA() throws FileNotFoundException {
		throw new FileNotFoundException();
	}
	public  static int  methodB() throws FileNotFoundException {
		return methodA();
	}
	public static void  methodC() throws FileNotFoundException {
		methodB();
	}
	
	public static void main(String[] args) {
		try {
			methodC();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
