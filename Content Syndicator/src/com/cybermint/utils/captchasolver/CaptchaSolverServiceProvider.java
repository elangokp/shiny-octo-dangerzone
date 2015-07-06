package com.cybermint.utils.captchasolver;

import java.io.File;

public interface CaptchaSolverServiceProvider {

	public  String solveCaptchaFromURL(String userName, String password, String imgURL);
	public  String solveCaptchaFromFile(String userName, String password, File img);
}
