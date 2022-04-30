package eu.epfc.holiday.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DayOff {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String employee;
    private String start;
    private String end;
    private String category;
    private String status;
    private String comment;
    private String refuseReason;

    public DayOff() {
    }

    public DayOff(Long id, String employee, String start, String end, String category, String status, String comment, String refuseReason) {
        this.id = id;
        this.employee = employee;
        this.start = start;
        this.end = end;
        this.category = category;
        this.status = status;
        this.comment = comment;
        this.refuseReason = refuseReason;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getRefuseReason() {
        return refuseReason;
    }

    public void setRefuseReason(String refuseReason) {
        this.refuseReason = refuseReason;
    }

    @Override
    public String toString() {
        return "DayOff{" +
                "id=" + id +
                ", employee='" + employee + '\'' +
                ", start='" + start + '\'' +
                ", end='" + end + '\'' +
                ", category='" + category + '\'' +
                ", status='" + status + '\'' +
                ", comment='" + comment + '\'' +
                ", refuseReason='" + refuseReason + '\'' +
                '}';
    }
}
