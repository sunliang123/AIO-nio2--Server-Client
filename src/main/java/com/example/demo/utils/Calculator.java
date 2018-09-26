package com.example.demo.utils;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Calculator {

	private final static ScriptEngine jse = new ScriptEngineManager().getEngineByName("JavaScript");

	public static Object cal(String expression) throws ScriptException {
		return jse.eval(expression);
	}
}
