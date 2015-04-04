package com.cybermint.utils.captchasolver;

import com.cybermint.utils.captchasolver.dbc.DBCCaptchaSolver;

public class CaptchaSolverServiceProviderFactory {


	private static CaptchaSolverServiceProviderFactory instance = null;


	public static CaptchaSolverServiceProviderFactory getInstance() {
		if (instance == null) {
			synchronized (CaptchaSolverServiceProviderFactory.class) {
				if (instance == null) {
                                    instance = new CaptchaSolverServiceProviderFactory();
				}
			}
		}
		return instance;
	}


	public CaptchaSolverServiceProvider getProvider(String provider) {

		CaptchaSolverServiceProvider serviceProvider = null;

		if (provider.equalsIgnoreCase("DBC")) {
			serviceProvider = new DBCCaptchaSolver();
		} else {
                    //TODO to implement other captcha solvers
                }
		return serviceProvider;
	}
}
