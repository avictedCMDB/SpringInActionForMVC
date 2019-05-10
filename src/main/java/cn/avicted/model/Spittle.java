package cn.avicted.model;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import java.util.Date;

/**
 * @ClassName Spittle
 * @Description TODO
 * @Author xulei
 * @Date 2019/5/10/010 13:54
 * @Version 1.0
 **/
public class Spittle {
    private Long id;
    private String message;
    private String time;
    private Double latitude;
    private Double longitude;

    public Spittle(String message, String time) {
        this.message = message;
        this.time = time;
    }

    public Spittle(String message, String time, Double latitude, Double longitude) {
        this.id = null;
        this.message = message;
        this.time = time;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String  getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this, "id", "time");
    }

    @Override
    public boolean equals(Object obj) {
        return EqualsBuilder.reflectionEquals(this, obj, "id","time");
    }

}
