package com.example.Pratice.student;

import javax.persistence.*;

import org.hibernate.type.ClobType;

import java.math.BigInteger;
import java.time.LocalDate;

@Entity(name = "Student") 
@Table 
public class Student
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    @Column(name = "id",
            updatable = false  
    )
    private Long id;
    private String name;
    private String email;
    private Long  ph;
    private Integer age;
    private String sex;
    private Integer height;
    private Integer weight;
    private String ftime;
    private String ttime;
    private String date;

    public Student() {
    }

    public Student(Long id, String name, String email, Long ph, Integer age, 
    		String sex, Integer height, Integer weight, String ftime, String ttime,  
    		String date)
    {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
        this.sex = sex;
        this.height = height;
        this.weight = weight;
        this.ftime = ftime;
        this.ttime = ttime;
        this.ph = ph;
        this.date = date;
    }

    public Student(String name, String email, Long  ph, Integer age, 
    		String sex, Integer height, Integer weight, String ftime, String ttime, 
    		String date) 
    {
        this.name = name;
        this.email = email;
        this.age = age;
        this.sex = sex;
        this.height = height;
        this.weight = weight;
        this.ftime = ftime;
        this.ttime = ttime;
        this.ph = ph;
        this.date = date;
    }

    public Long getPh() {
		return ph;
	}

	public void setPh(Long ph) {
		this.ph = ph;
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	public String getFtime() {
		return ftime;
	}

	public void setFtime(String ftime) {
		this.ftime = ftime;
	}

	public String getTtime() {
		return ttime;
	}

	public void setTtime(String ttime) {
		this.ttime = ttime;
	}

	public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", height=" + height +
                ", weight=" + weight +
                ", ftime=" + ftime +
                ", ttime=" + ttime +
                ", ph=" + ph +
                ", date=" + date +
                '}';
    }
}
