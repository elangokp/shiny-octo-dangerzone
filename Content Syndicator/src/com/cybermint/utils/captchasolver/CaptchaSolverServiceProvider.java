package com.cybermint.utils.captchasolver;

public interface CaptchaSolverServiceProvider {

	public  String solveCaptchaFromURL(String userName, String password, String imgURL);
}
