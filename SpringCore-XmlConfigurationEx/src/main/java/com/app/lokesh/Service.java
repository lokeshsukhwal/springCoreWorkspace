package com.app.lokesh;

public class Service {
	private Repository repository;

	public Service() {
		super();
	}

	public void setRepository(Repository repository) {
		this.repository = repository;
	}

	public Repository getRepository() {
		return repository;
	}

	@Override
	public String toString() {
		return "Service [repository=" + repository + "]";
	}

}
