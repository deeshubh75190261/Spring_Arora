package com.arora.example.oops.composition;

public class CompositionMain {

	static class Engine {

		private String engineName;

		Engine(String engineName) {
			this.engineName = engineName;
		}

		public void setEngineName(String engineName) {
			this.engineName = engineName;
		}

		public String getEngineName() {
			return engineName;
		}
	}

	static class Car {

		private Engine engine;

		Car(String engineName) {
			this.engine = new Engine(engineName);
		}

		public Engine getEngine() {
			return engine;
		}
	}

	public static void main(String[] args) {

		Car car = new Car("v8");
		System.out.println(car.getEngine().getEngineName());

	}

}
