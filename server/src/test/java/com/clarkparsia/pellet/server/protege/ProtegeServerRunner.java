package com.clarkparsia.pellet.server.protege;

/**
 * @author Edgar Rodriguez-Diaz
 */
public class ProtegeServerRunner extends ProtegeServerTest {

	public void start() throws Exception {
		before();
	}

	public static void main(String[] args) throws Exception {
		new ProtegeServerRunner().start();
	}

}
