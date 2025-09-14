package com.api.listeners;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListeners implements ITestListener {
    Logger logger= LogManager.getLogger(TestListeners.class);
    @Override
    public void onStart(ITestContext context) {
        logger.info("Suite test started");
    }

    @Override
    public void onFinish(ITestContext context) {
        logger.info("Suite test finished");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        logger.info("Passed  {}", result.getMethod().getMethodName());
        logger.info("Description!! {}", result.getMethod().getDescription());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        logger.error("Failed  {}", result.getMethod().getMethodName());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        logger.info("Skipped  {}", result.getMethod().getMethodName());
    }


}
