package com.developersview.SpringBootMSSQLTutorial.exception;

import java.util.Date;

/**
 * @author pranoy.chakraborty
 * @Date 13/07/22
 */
public class ErrorDetails {
    private Date timeStamp;
    private String message;
    private String details;

    public ErrorDetails(Date timeStamp, String message, String details) {
        super();
        this.timeStamp = timeStamp;
        this.message = message;
        this.details = details;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public String getMessage() {
        return message;
    }

    public String getDetails() {
        return details;
    }
}
