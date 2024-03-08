package kr.excel.resume;

public class Career {
    private String workPeriod;
    private String companyName;
    private String jobTitle;
    private String employmentYear;

    public Career() {
    }

    public Career(String workPeriod, String companyName, String jobTitle, String employmentYear) {
        this.workPeriod = workPeriod;
        this.companyName = companyName;
        this.jobTitle = jobTitle;
        this.employmentYear = employmentYear;
    }

    public String getWorkPeriod() {
        return workPeriod;
    }

    public void setWorkPeriod(String workPeriod) {
        this.workPeriod = workPeriod;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getEmploymentYear() {
        return employmentYear;
    }

    public void setEmploymentYear(String employmentYear) {
        this.employmentYear = employmentYear;
    }

    @Override
    public String toString() {
        return "Career{" +
                "workPeriod='" + workPeriod + '\'' +
                ", companyName='" + companyName + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", employmentYear='" + employmentYear + '\'' +
                '}';
    }
}
