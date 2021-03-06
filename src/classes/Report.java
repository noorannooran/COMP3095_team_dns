package classes;

/************************************************************************
 * Project: COMP3095_team_dns
 * Assignment: Assignment #2
 * Authors: Dylan Roberts, Nooran El-Sherif, Sean Price
 * Student Numbers: 100727526, 100695733, 101015020
 * Date: 03/01/2018
 * Description: Report - Class for the Report Object.
 *              Stores information relating to Report 
 ***********************************************************************/

import java.sql.Date;

public class Report extends ReportTemplate {
    private int reportId;
	private int templateId;
    private int groupId = -1;
    private int employeeId = -1;
    private String reportTitle;
    private String reportType;
    private int evaluation;
    private Date date;
    //Default values to avoid some nulls in the db insert logic
    private String comment1 = "No comments given";
    private String comment2 = "No comments given";
    private String comment3 = "No comments given";
    
    public Report() {}

    public Report(String templateName, int departmentId, String sec1Title, String sec2Title, String sec3Title,
            String sec1Criteria, String sec2Criteria, String sec3Criteria, int templateId, String reportTitle, 
            String reportType, int evaluationMax, int evaluation, Date date) {
        super(templateName, departmentId, sec1Title, sec2Title, sec3Title, sec1Criteria, sec2Criteria, sec3Criteria);
        this.templateId = templateId;
        this.reportTitle = reportTitle;
        this.reportType = reportType;
        this.evaluation = evaluation;
        this.date = date;
    }
    public int getReportId()
    {
    	return reportId;
    }
    public void setReportId(int id)
    {
    	this.reportId = id;
    }
    public int getTemplateId() {
        return templateId;
    }

    public void setTemplateId(int templateId) {
        this.templateId = templateId;
    }

    public String getReportTitle() {
        return reportTitle;
    }

    public void setReportTitle(String reportTitle) {
        this.reportTitle = reportTitle;
    }

    public String getReportType() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    public int getEvaluation() {
        return evaluation;
    }

    public void setEvaluation(int evaluation) {
        this.evaluation = evaluation;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getComment1() {
        return comment1;
    }

    public void setComment1(String comment1) {
        this.comment1 = comment1;
    }

    public String getComment2() {
        return comment2;
    }

    public void setComment2(String comment2) {
        this.comment2 = comment2;
    }

    public String getComment3() {
        return comment3;
    }

    public void setComment3(String comment3) {
        this.comment3 = comment3;
    }
}
